package ClassLecture;

import java.util.List;

public class C12_02_Class {
    public static void main(String[] args) {
        print("");


    print(myCalculator.sum(3,4));


// A 회사 매출
    myCalculator.sumAcc(30);
    myCalculator.sumAcc(30);
    myCalculator.sumAcc(30);
    myCalculator.sumAcc(30);

        print(myCalculator.total);



//  B회사 매출
    myCalculator.sumAcc(30);
    myCalculator.sumAcc(30);
    myCalculator.sumAcc(30);
    myCalculator.sumAcc(30);

        print(myCalculator.total);

//    객체는 복제본이다.


//      A부서의 매출
        myCalInstansce myCalA = new myCalInstansce();
        myCalA.sumAcc(30);
        myCalA.sumAcc(30);
        myCalA.sumAcc(30);
        myCalA.sumAcc(30);

        print("A 부서" + myCalA.total);


//      B부서의 매출
        myCalInstansce myCalB = new myCalInstansce();
        myCalB.sumAcc(10);
        myCalB.sumAcc(21);
        myCalB.sumAcc(30);
        myCalB.sumAcc(50);


        print("B 부서" + myCalB.total);



    } // main




    private static void print(String a) {
        System.out.println(a);
    }
    private static void print(int a) {
        System.out.println(a);
    }
}


class myCalculator{

    static int total = 0;

    static int sum(int a, int b) {
        return a+b;
    }

    static int sumAcc(int a) {
        total += a;
        return total;
    }
}


class myCalInstansce{

    int total = 0;

    int sum(int a, int b) {
        return a+b;
    }

    int sumAcc(int total) {
        this.total += total;
        return total;
    }

// this는 객체 그 자신을 의미한다.

}


























































