package practice0321;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketClass {

    public static void main(String[] args){

        ServerSocket serverSocket = null;
        Socket socket2 = null;

        try{
            serverSocket = new ServerSocket(9000);
            System.out.println("클라이언트 맞을 준비 완료!!");

            socket2 = serverSocket.accept();
            System.out.println("클라이언트 연결!!");
            System.out.println("socket :"+socket2);

        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(socket2 !=null) socket2.close();
                if(serverSocket != null) serverSocket.close();
            }catch(IOException e){
                e.printStackTrace();
            }

        }
    }
}
