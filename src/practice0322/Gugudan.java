package practice0322;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){
        /*
        // 2단
        System.out.println("2단");
        System.out.println(2*1);
        System.out.println(2*2);
        System.out.println(2*3);
        System.out.println(2*4);
        System.out.println(2*5);
        System.out.println(2*6);
        System.out.println(2*7);
        System.out.println(2*8);
        System.out.println(2*9);

        System.out.println();

        //3단
        System.out.println("3단");
        System.out.println(3*1);
        System.out.println(3*2);
        System.out.println(3*3);
        System.out.println(3*4);
        System.out.println(3*5);
        System.out.println(3*6);
        System.out.println(3*7);
        System.out.println(3*8);
        System.out.println(3*9);

        System.out.println();

        */

        /*
        //4단

        int result = 4*1;

        System.out.println(result +"단");
        System.out.println(result);
        System.out.println(result * 2);
        System.out.println(result * 3);
        System.out.println(result * 4);
        System.out.println(result * 5);
        System.out.println(result * 6);
        System.out.println(result * 7);
        System.out.println(result * 8);
        System.out.println(result * 9);

        //5단
        System.out.println();

        System.out.println("5단");
        result = 5;

        System.out.println(result * 1);
        System.out.println(result * 2);
        System.out.println(result * 3);
        System.out.println(result * 4);
        System.out.println(result * 5);
        System.out.println(result * 6);
        System.out.println(result * 7);
        System.out.println(result * 8);
        System.out.println(result * 9);

        //6단

        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 단?");
        int num = scanner.nextInt();

        System.out.println(num *1);
        System.out.println(num *2);
        System.out.println(num *3);
        System.out.println(num *4);
        System.out.println(num *5);
        System.out.println(num *6);
        System.out.println(num *7);
        System.out.println(num *8);
        System.out.println(num *9);
        */


        /*
        //7단

        int num1 = 1;

        System.out.println("7단");
        while( num1 < 10){

            System.out.println(num1 * 7);
            num1++;
        }
        System.out.println();

        //7단 2
        System.out.println("7단 두번째");
        System.out.println("7단");
        for(int num2 = 1; num2 < 10; num2++){
            System.out.println(num2*7);
        }

        */

        //8단 - 값입력 및 조건문

        Scanner scanner = new Scanner(System.in);

        int num3 =1;

        System.out.println("구구단 몇 단? (2 부터 9를 입력해 보세요)");
        int sign = scanner.nextInt();

        if(sign < 2 ) {

            System.out.println("값을 잘못입력하셨습니다.");

        }else if(sign > 9){

            System.out.println("값을 잘못입력하셨습니다.");
        }else{

            while (num3 < 10) {
                System.out.println(num3 * sign);
                num3++;
            }
        }


    }
}
