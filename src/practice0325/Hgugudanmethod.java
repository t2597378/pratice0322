package practice0325;

import java.util.Scanner;

public class Hgugudanmethod {



    public static int[] calculate(int num){
        Scanner scanner = new Scanner(System.in);


        System.out.print("몇 단을 구현할까요? : ");
        num = scanner.nextInt();

        int[] result = new int[9];

        for(int i = 0; i<result.length;i++){
            result[i] = num * (i+1);
        }
        return result;

    }
    public static void print(int[] result){
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }


}
