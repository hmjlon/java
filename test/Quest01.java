package ch01;
//문제1 : 1부터 10까지의 수를출력 (단, 숫자가 6일때는 출력X)
// for , while 문 두 문법을 사용해서 출력
//public class Quest01 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10 ; i++)
//        {
//            if(i != 6)
//            {
//                System.out.println(i);
//            }
//        }
//    }
//}

public class Quest01 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10)
        {
            if(i!=6) {
                System.out.println(i);
            }
            i++;
            //continue;
        }
    }
}