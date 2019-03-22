package practice0322;

public class Gugudanbaeyeol {
    public static void main(String[] args){

        int[] result = new int[9];

        System.out.println("result.length :" + result.length);

        System.out.println();

        for(int i=0; i < result.length;i++){
            result[i]= 2*(i+1);
        }

        for(int i=0;i<result.length;i++){

            System.out.println(result[i]);
            
        }

    }
}
