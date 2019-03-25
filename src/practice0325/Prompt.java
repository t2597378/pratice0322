package practice0325;

import java.util.Scanner;

public class Prompt {

    public int parseDay(String week){
        if(week.equals("su")) return 0;
        else if(week.equals("mo")) return 1;
        else if(week.equals("tu")) return 2;
        else if(week.equals("we")) return 3;
        else if(week.equals("th")) return 4;
        else if(week.equals("fr")) return 5;
        else if(week.equals("sa")) return 6;
        else
            return 0;

    }

    public void runPrompt(){
        Scanner scanner = new Scanner(System.in);
        Practice1 cal = new Practice1();

        int month = 1;
        int year = 2017;
        int weekday = 0;

        while(true) {
            System.out.println("년도를 입력하세요.exit: -1");
            System.out.print("YEAR> ");
            year = scanner.nextInt();

            System.out.println("달을 입력하세요.");
            System.out.print("MONTH> ");
            month = scanner.nextInt();

            System.out.println("첫째날의 요일을 입력하세요[su, mo, tu, we, th, fr, sa].");
            String strWeekday = scanner.next();
            weekday = parseDay(strWeekday);

            if( month > 12 || month < 1){
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            cal.printCalender(year, month, weekday);

        }

        System.out.println("bye!");
        scanner.close();

    }

    public static void main(String[] args){
        //셀 실행.
        Prompt p = new Prompt();
        p.runPrompt();
    }
    /*
    public static void main(String[] args){

        //숫자를 입력받아 해당하는 월의 최대 일 수를 출력하는 것.

        String PROMPT = "cal > ";
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

    }
    */
}
