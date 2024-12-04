package ch01;
//문제2. 10부터 1까지의 수를 출력하세요. (단, 숫자가 3일 때는 출력하지 마세요)
//for와 do~while 문 두 문법을 사용해서 만드세요.
//public class Quest02 {
//    public static void main(String[] args) {
//        for (int i = 10; i > 0 ; i--) {
//            if(i!=3)
//            {
//                System.out.println(i);
//            }
//        }
//    }
//}

public class Quest02 {
    public static void main(String[] args) {
        int i = 10;
        do {
            if(i!=3)
            System.out.println(i);
            i--;
        }
        while (i>0);
    }
}