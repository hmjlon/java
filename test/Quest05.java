package ch01;
//문제5. money 변수 3780원의 금액이 있습니다.
//이를 다음과 같은 결과가 나오도록 출력합니다.
//        1000원 : 3개
//남은금액 : 780원
//500원 : 1개
//남은금액 : 280원
//100원 : 2개
//남은금액 : 80원
//10원 : 8개
//남은금액 : 0원

public class Quest05 {
    public static void main(String[] args) {
        int money = 3780;
        int coin500 = money % 1000;
        int coin100 = coin500 % 500;
        int coin10 = coin100 % 100;
        System.out.println("1000원 : " + money/1000 + "개");
        System.out.println("남은금액 : " + coin500 + "원");
        System.out.println("500원 : " + coin500/500 + "개");
        System.out.println("남은금액 : " + coin100 + "원");
        System.out.println("100원 : " + coin100/100 + "개");
        System.out.println("남은금액 : " + coin10 + "원");
        System.out.println("10원 : " + coin10/10 + "개");
        System.out.println("남은금액 : " + coin10 % 10 + "원");
    }
}
