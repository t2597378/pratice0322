package practice0325;

import java.util.Scanner;

public class Gugudanmethod {

    public static int[] calculate(int num){
        int[] result = new int[9];
        Scanner times = new Scanner(System.in);

        System.out.println("구구단 몇단을 실행할까요? : ");
        num = times.nextInt();

        for(int i=0; i< result.length; i++){
            result[i] = num * (i+1);
        }
        return result;
    }
    public static void print(int[] result){

        for(int i=0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }
}
