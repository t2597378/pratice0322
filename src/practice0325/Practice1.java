package practice0325;

import java.util.Scanner;

public class Practice1 {
    private static final int[] maxDays = {31,29,31,30,31,30,31,31,30,31,30,31};

    public int getmaxDaysOfMonth(int month){
        return maxDays[month-1];
    }

    public void printSampleCalender(){

        //단순 println 실행하기
        System.out.println("일 월 화 수 목 금 토 ");
        System.out.println("-------------------- ");
        System.out.println("1  2  3  4  5  6  7 ");
        System.out.println("9  10  11 12  13  14 ");
        System.out.println("15 16 17 18 19 20 21 ");
        System.out.println("22 23 24 25 26 27 28 ");

    }

    public static void main(String[] args){

        //숫자를 입력받아 해당하는 월의 최대 일 수를 출력하는 것.

        Scanner scanner = new Scanner(System.in);
        Practice1 cal = new Practice1();

        System.out.println("반복 횟수를 입력하세요.");
        int repeat = scanner.nextInt();

        for( int i = 0; i < repeat; i++) {
            System.out.println("달을 입력하세요.");
            int month = scanner.nextInt();

            System.out.printf("해당 달의 최대 일수는 %d입니다.", cal.getmaxDaysOfMonth(month));
            System.out.println();
        }

        System.out.println("bye!");
        //cal.printSampleCalender();
        scanner.close();

        /*


        //입력받은 두 수의 합을 구한다

        int a,b;
        String num, num2;

        int result ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        num = scanner.next();

        System.out.println("두번째 숫자를 입력하세요");
        num2 = scanner.next();


        a = Integer.parseInt(num);
        b = Integer.parseInt(num2);

        result = a + b;

        System.out.printf("두 수의 합은 %d 입니다", result);
        scanner.close();
        */
    }

}
