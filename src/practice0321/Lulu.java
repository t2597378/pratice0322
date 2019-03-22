package practice0321;

import java.io.IOException;
import java.net.Socket;
public class Lulu {

    public static void main(String[] args){

        Socket socket2 = null;

        try {
            socket2 = new Socket("localhost", 9000);
            System.out.println("서버연결~");
            System.out.println("socket :" + socket2);

        } catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(socket2 != null) socket2.close();
            }catch(IOException e){
                e.printStackTrace();
            }

        }


    }
}
