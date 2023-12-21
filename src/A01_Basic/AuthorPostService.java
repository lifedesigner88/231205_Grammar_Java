package A01_Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorPostService {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        List<Author> auList = new ArrayList<>();
        List<Post> poList = new ArrayList<>();

        while (true) {
            print(""); print("");
            print("----------------------------------");
            print("-- 이용하실 서비스 번호를 눌러주세요 --"); print("");
            print("     1. 회원 등록");
            print("     2. 회원 목록 조회");
            print("     3. 회원 상세 조회(email)");
            print("     4. 게시글 작성");
            print("     5. 게시글 목록 조회");
            print("     6. 게시글 작성자 조회(Post_id)");
            print("     종료 : exit");

            String select = myScan.nextLine(); if(select.equals("exit")) break;

            switch (select){
                case "1" :          // 회원 등록
                    print("");
                    print("******* 회원가입 정보를 입력해주세요 *******");
                    print("이름:"); String name = myScan.nextLine();
                    print("이메일:"); String email = myScan.nextLine();
                    print("비밀번호:");String password = myScan.nextLine();
                    new Author(name,email,password,auList);break;


                case "2" :          // 회원목록 조회
                    print("");
                    print("******* 현재 회원 메일리스트입니다.. *******"); print("");
                    for(Author a : auList)
                        print("     " + a.getId() +". " + a.getName()+ ": " + a.getEmail()); break;


                case "3" :          // 이메일로 회원 상세 정보 및 작성 글 수와 글 모두 조회
                    print("");
                    print("******* 상세조회 희망 이메일을 입력하세요.. *******");
                    while(true) {
                        print("Your email:"); String emailForSerch = myScan.nextLine();

                        Author temp = null;
                        for (Author a : auList)
                            if (a.getEmail().equals(emailForSerch)) {temp = a; break;}
                        if (temp == null) {print("없는 이메일 입니다. 다시 입력해주세요"); continue;}
                        print(temp.getName() + "회원님의 작성글수는 : " + temp.postedSize() + "개이고.");
                        print("이메일 주소는: " + temp.getEmail()
                                + "     비밀번호는: " + temp.getPassword() + " 입니다.");
                        for(Post a : temp.getAuPoList())
                            print("Post_id:" + a.getId() + "  제목:" + a.getTitle()); break;} break;


                case "4" :          // 게시글 작성
                    print("");
                    print("******* 글을 작성해주세요. *******");
                    print("뒤로가기: 1");
                    while(true) {
                        print("e메일입력:");String emailId = myScan.nextLine();
                        if(emailId.equals("1")) break;

                        Author auTemp = null;
                        for (Author a : auList)
                            if (a.getEmail().equals(emailId)) {auTemp = a; break;}
                        if (auTemp == null) {print("없는 이메일 입니다. 다시 입력해주세요"); continue;}

                        print("제목:"); String title = myScan.nextLine();
                        print("내용:"); String contents = myScan.nextLine();
                        new Post(auTemp,title,contents,poList); break;} break;


                case "5" :      // 게시글 목록 조회
                    print("");
                    print("******* 현재 작성된 게시글 목록입니다.*******"); print("");
                    for (Post a : poList)
                        print("     Post_id:" + a.getId() + "  제목:" + a.getTitle()); break;


                case "6" :      // 게시글 아이디로 작성자, 이메일 조회
                    print("");
                    print("******* 작성자 조회 (Post_id)입력하세요.. *******"); print("");
                    print("뒤로가기: 1");

                    while(true) {
                        print("Post_id:"); Long Post_id = Long.parseLong(myScan.nextLine());
                        if(Post_id.equals(1L)) break;

                        Post poTemp = null;
                        for (Post a : poList)
                            if (a.getId().equals(Post_id)) poTemp = a;
                        if (poTemp == null) {print("존재하지 않는 게시글 입니다."); continue;}

                        print(  "제목:" + poTemp.getTitle()
                                + "  작성자:" + poTemp.getAuthor_id().getName()
                                + "  이메일:" + poTemp.getAuthor_id().getEmail()); break;} break;

                default :
                    print("잘못 입력하셨습니다");
            }
        }
    }
    static void print(String a) {System.out.println(a);}
}




/// 내부 클래스


class Author{                       // 회원정보

    private final Long id;
    private final String name;
    private final String email;
    private final String password;
    private final List<Post> auPoList;
    static Long static_id = 0L;

    Author( String name, String email, String passwrod, List<Author> auList){

        this.id = static_id++;
        this.name = name;
        this.email = email;
        this.password = passwrod;
        this.auPoList = new ArrayList<>();
        auList.add(this);
        printAuthor();}

    void printAuthor(){
        print("");
        print(  "*** 회원가입 완료!" +
                " >> 아이디:" + id +
                "   이름:" + name +
                "   메일:" + email +
                "   비밀번호:" + password +
                " 입니다.");}

    Long getId() {return id;}
    String getName() {return name;}
    String getEmail() {return email;}
    String getPassword() {return password;}
    List<Post> getAuPoList() {return auPoList;}
    int postedSize(){return auPoList.size();}
    void addPostList(Post PoList){this.auPoList.add(PoList);}
    void print(String a){System.out.println(a);}

}



class Post{                         // 작성자 정보

    private final Long id;
    private final Author author_id;
    private final String title;
    private final String contents;
    static Long static_id = 0L;

    Post(Author author_id, String title, String contents, List<Post> poList) {

        this.id = static_id++;
        this.author_id = author_id;
        this.title = title;
        this.contents = contents;
        author_id.addPostList(this);
        poList.add(this);
        this.printAuthor();}

    void printAuthor(){
        print("");
        print(  "*** 게시글 작성 완료!" +
                " >> 아이디:" + id +
                "   작성자:" + author_id.getName() +
                "   제목:" + title +
                "   내용은:" + contents +
                " 입니다.");}

    Long getId() {return id;}
    String getTitle() {return title;}
    String getContents() {return contents;}
    Author getAuthor_id() {return author_id;}
    void print(String a){System.out.println(a);}

}
