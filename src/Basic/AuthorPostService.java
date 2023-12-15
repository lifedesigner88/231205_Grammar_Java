package Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthorPostService {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        ArrayList<Author> auList = new ArrayList<>();
        ArrayList<Post> poList = new ArrayList<>();


        while (true) {
            print(""); print("");
            print("-- 이용하실 서비스 번호를 눌러주세요 --"); print("");
            print("     1. 회원가입");
            print("     2. 게시글 작성");
            print("     3. 회원 목록 조회");
            print("     4. 회원 상세 조회(email)");
            print("     5. 게시글 작성자 조회(id)");
            String select = myScan.nextLine();

            switch (select){

                case "1" :
                    print("");
                    print("******* 회원가입 정보를 입력해주세요 *******");
                    print("이름:"); String name = myScan.nextLine();
                    print("이메일:"); String email = myScan.nextLine();
                    print("비밀번호:");String password = myScan.nextLine();

                    Author author = new Author(name,email,password);
                    auList.add(author);
                    author.printAuthor();
                    break;

                case "2" :
                    print("");
                    print("******* 글을 작성해주세요. *******");
                    print("뒤로가기는 1번");

                    Author auTemp = null;

                    while(true) {
                        print("e메일입력:");
                        email = myScan.nextLine();

                        if(email.equals("1"))
                            break ;

                        else
                            for (Author a : auList)
                                if (a.getEmail().equals(email))
                                    auTemp = a;

                        if (auTemp == null) {
                            print("없는 이메일 입니다. 다시 입력해주세요");
                            continue;}


                        print("제목:"); String title = myScan.nextLine();
                        print("내용:");String contents = myScan.nextLine();

                        Post post = new Post(auTemp,title,contents);
                        poList.add(post);
                        post.printAuthor();
                        break;

                    }

                    break;


                case "3" :

                    print("");
                    print("******* 현재 회원 메일리스트입니다.. *******"); print("");

                    for(Author a : auList) {
                        print("     " + a.getId() +". "
                                    + a.getName()+ ": "
                                    + a.getEmail());}
                    break;


                case "4" :

                    print("");
                    print("******* 상세조회 희망 이메일을 입력하세요.. *******"); print("");
                    print("Your email:"); String emailForSerch = myScan.nextLine();

                    Author temp = null;

                    while(true) {
                        for (Author a : auList)
                            if (a.getEmail().equals(emailForSerch))
                                temp = a;

                        if (temp == null) {
                            print("없는 이메일 입니다. 다시 입력해주세요");
                            continue;
                        }

                        print(temp.getName() + "회원님의 작성글수는 : " + temp.postedSize() + "개이고.");
                        print("이메일 주소는: " + temp.getEmail()
                                + "     비밀번호는: " + temp.getPassword() + " 입니다.");
                        break;

                    }
                    break;


                case "5" :

                    print("");
                    print("******* 상세조회 희망 아이디(id)입력하세요.. *******"); print("");




                default :
                    print("잘못 입력하셨습니다");


            }






        }
    }

    static void print(String a) {System.out.println(a);}
}

// 회원가입
// 게시글 작성
// 회원 목록 조회 (id) : 회원들 이메일을 출력
// 회원 상세 조회 : 회원 명, 회원이메일, 회원작성 글수
// 게시글 상세조회 : 제목, 작성자, 이메일



class Author{
    static Long static_id = 0L;

    private final Long id;
    private final String name;
    private final String email;
    private final String password;
    private final ArrayList<Post> poList;

    Author( String name, String email, String passwrod){

        this.id = static_id++;
        this.name = name;
        this.email = email;
        this.password = passwrod;
        this.poList = new ArrayList<>();}

    void printAuthor(){
        print("");
        print(  "*** 회원가입 완료!" +
                " >> 아이디:" + id +
                "   이름:" + name +
                "   메일:" + email +
                "   비밀번호:" + password +
                " 입니다.");
    }

    int postedSize(){return poList.size();}
    void addPostList(Post PoList){this.poList.add(PoList);}
    void print(String a){System.out.println(a);}
    public Long getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
}



class Post{
    static Long static_id = 0L;

    private final Long id;
    private final Author author;
    private final String title;
    private final String contents;

    Post(Author author, String title, String contents) {

        this.id = static_id++;
        this.author = author;
        this.title = title;
        this.contents = contents;
        author.addPostList(this);}

    void printAuthor(){
        print("");
        print(  "*** 게시글 작성 완료!" +
                " >> 아이디:" + id +
                "   작성자:" + author.getName() +
                "   제목:" + title +
                "   내용은:" + contents +
                " 입니다.");
    }

    void print(String a){System.out.println(a);}
    public Long getId() {return id;}
    public String getTitle() {return title;}
    public String getContents() {return contents;}
    public Author getAuthor_id() {return author;}
}
