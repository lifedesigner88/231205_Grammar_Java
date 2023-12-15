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
            print("     4. 회원 상세 조회(id)");
            print("     5. 게시글 상세조회(id)");
            String select = myScan.nextLine();


            Author author1 = new Author("세종","lide@naver.com","12313");
            Author author2 = new Author("종균","good@google.com","12341");
            Author author3 = new Author("종현","koim@gmail.com","44442");
            Author author4 = new Author("도훈","123@outlook.kr","14123123");

            auList.add(author1);
            auList.add(author2);
            auList.add(author3);
            auList.add(author4);

            Post post1 = new Post(0L,"동해물과","백두산이 마르고 닳도록");
            Post post2 = new Post(1L,"하느님이","보우 하사 우리나라 만세 입니다.");
            Post post3 = new Post(2L,"무궁화","삼천리 화려강산 대한사람");
            Post post4 = new Post(3L,"대한으로","길아보전하세 룰루루룰");

            poList.add(post1);
            poList.add(post2);
            poList.add(post3);
            poList.add(post4);



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
                    print("작성자 아이디:"); Long author_id = (long) myScan.nextInt();
                    print("이메일:"); String title = myScan.nextLine();
                    print("비밀번호:");String contents = myScan.nextLine();

                    Post post = new Post(author_id,title,contents);
                    poList.add(post);
                    post.printAuthor();
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
                    print("******* 상세조회 희망 아이디(id)입력하세요.. *******"); print("");
                    print("id:"); Long authorId = Long.parseLong(myScan.nextLine());

                    Author temp = null;
                    for(Author a : auList)
                        if (a.getId() == authorId)
                            print("     "   + a.getName() + ": "
                                            + a.getEmail());

                    int count = 0;
                    for(Post a : poList)
                        if (a.getAuthor_id() == authorId)
                            count++;
                    print("     회원님의 작성글수는 : "+ count + "개입니다.");
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

    private Long id;
    private String name;
    private String email;
    private String password;

    Author( String name, String email, String passwrod){

        this.id = static_id++;
        this.name = name;
        this.email = email;
        this.password = passwrod;}

    void printAuthor(){
        print("");
        print(  "*** 회원가입 완료!" +
                " >> 아이디:" + id +
                "   이름:" + name +
                "   메일:" + email +
                "   비밀번호:" + password +
                " 입니다.");
    }

    void print(String a){System.out.println(a);}
    public Long getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
}



class Post{
    static Long static_id = 0L;

    private Long id ;
    private String title;
    private String contents;
    private Author author;

    Post(Author author, String title, String contents) {

        this.id = static_id++;
        this.author = author;
        this.title = title;
        this.contents = contents;}

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
