package Interface;

import java.util.ArrayList;
import java.util.List;

public class StaticFinalInterface {
    public static void main(String[] args) {


        myInterface sejong = new myInterface() {
            @Override
            public void methodA() {

            }
        };
        System.out.println(sejong.my_constant);

    }
}




interface myInterface{
    // 아래 변수는 컴파일 타임에 static final이 붙는다.
    String my_constant = "20ss";

    void methodA();


}
