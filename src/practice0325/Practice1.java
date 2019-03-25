package practice0325;

public class Practice1 {
    private static final int[] maxDays = {31,29,31,30,31,30,31,31,30,31,30,31};

    public int getmaxDaysOfMonth(int month){
        return maxDays[month-1];
    }

    public void printCalender(int year,int month){

        //단순 println 실행하기
        System.out.printf("   <<%4d년%3d월>>\n",year,month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("---------------------");

        int maxDay = getmaxDaysOfMonth(month);

        for(int i=1;i<= maxDay;i++){
            System.out.printf("%3d",i);
            if(i%7 == 0){
                System.out.println();
            }
        }

        System.out.println();


        /*
        System.out.println(" 1  2  3  4  5  6  7 ");
        System.out.println("9  10  11 12  13  14 ");
        System.out.println("15 16 17 18 19 20 21 ");
        System.out.println("22 23 24 25 26 27 28 ");
        */

    }



}