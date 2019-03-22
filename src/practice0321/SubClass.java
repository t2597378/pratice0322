package practice0321;

import java.net.ServerSocket;

public class SubClass {

    public static void main(String[] args) {

        /*
        SubClass subClass = new SubClass();

        try{
            subClass.firstMethod();
        }catch (Exception e){
            e.printStackTrace();
        }
        */


        int i = 10;
        int j = 0;
        int r = 0;

        System.out.println("Exception Before");

        try {
            r = i / j;
        } catch (Exception e) {
            e.printStackTrace();
            String msg = e.getMessage();
            System.out.println("Exception :" + msg);
        }

        System.out.println("Exception After");
    }

        //Exception throws 예제


    public void firstMethod() throws Exception{
        secondMethod();
    }
    public void secondMethod() throws Exception{
        thirdMethod();
    }
    public void thirdMethod() throws Exception{
        System.out.println("10/0 =" + (10/0));
    }

}
