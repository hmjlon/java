package ch01;

import java.util.Scanner;

//문제4. 임의의 값 n이 주어지면
//예를들어 n=5이면
//   1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
//의 결과를 출력하세요.
public class Quest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Scanner.next = 스트링 / Scanner.nextInt = 정수형 / Scanner.nextdouble = 소수형
        int sum = 0;
        int data = 0;
        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
            data += sum;
        }
        System.out.println(data);
    }
}
