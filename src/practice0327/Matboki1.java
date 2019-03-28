package practice0327;

import java.util.Scanner;

public class Matboki1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //예제1
        /*System.out.print("n 의 값을 적어주세요 : ");
        int n = scanner.nextInt();
        n = n * 2;
        System.out.println("n 의 두배 값은 : " +n + " 입니당");
        */

        //예제2

        /*System.out.print("첫번째 임의 수 : ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 임의 수 : ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;

        System.out.println("두  수의 합은 : " +result );
        */

        /*
        //예제3


        System.out.print("첫번째 임의 수 : ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 임의 수 : ");
        int num2 = scanner.nextInt();
        double result = num1 + num2;
        System.out.println("두 수의 합 : " + (int)result);
        result = num1 - num2;
        System.out.println("두 수의 차 : " + (int)result);
        result = num1 * num2;
        System.out.println("두 수의 곱 : " + (int)result);
        result = num1 / num2;
        System.out.println("두 수의 나눈값 : " + (double)result);
        */

        //예제4
        /*

        System.out.println("첫번째 임의의 수 : ");
        int num1 = scanner.nextInt();
        System.out.println("두번째 임의의 수 : ");
        int num2 = scanner.nextInt();

        System.out.println("연산방법은 ? 0 = 덧셈 /이외의 수 = 뺄셈");
        int op = scanner.nextInt();

        if(op == 0){
            System.out.println("두 수의 합은 : "+ (num1+num2) );
        }else{
            System.out.println("두 수의 차는 : " + (num1 - num2));
        }
        */

        //예제5

        /*

        System.out.print("숫자를 입력하시오 : ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.printf("%d 는 짝수 입니다.",num);
        }else{
            System.out.printf("%d 는 홀수 입니다.",num);
        }
        */

        //예제6

        System.out.println("n 부터 100까지 더하는 프로그램!");
        System.out.print("n 을 몇으로 설정할까요? : ");
        int n = scanner.nextInt();
        int sum =0;


        while(n<100){

            sum = sum + n;

            n++;

        }

        System.out.println(sum);


    }
}
