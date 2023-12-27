package A07_ExceptionParsing;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.ErrorManager;

public class C17_02_FileParsing {

    public static void main(String[] args) {


//    Path filePath = Paths.get("src/A07_ExceptionParsing");
    Path filePath = Paths.get("src\\A07_ExceptionParsing\\text.file.txt");


//    버퍼기능이 구현돼있고, nio 패키지에서는 non-blocking 방식 사용
//        StandardCharsets.UTF_8 기본값 getBytes
        try {
            if (Files.exists(filePath))
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            else
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.CREATE_NEW);
        } catch (IOException e) {
            e.printStackTrace();
//            ErrorManager logger = new ErrorManager();
//            logger.error("Error Occurs!!", e);

        }

//        파일읽기 : readString, readAllLines(List 형태)
        try {
            String myStr = Files.readString(filePath);
            print("readString" + myStr);

        } catch (IOException e) {  e.printStackTrace();}

        try {
            List<String> myList = Files.readAllLines(filePath);
            for (String a : myList)
                print("readString: " + a + " 선수");

        } catch (IOException e) {  e.printStackTrace();}



    } // main


    static void print(String a){System.out.println(a);}
}
