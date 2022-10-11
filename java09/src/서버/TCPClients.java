package 서버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {

   public static void main(String[] args) throws Exception {
      for (int i = 0; i < 100; i++) {
         Socket socket = new Socket("localhost",9200);
         System.out.println("클라이언트"+i+": 서버와 연결성공");
         
         //input 스트림을 통해 가지고와서 임시기억장치에 넣어두자 
         //스트림(1byte) --- 스트림리더(브릿지클래스) ---> 임시기억장치(2byte)
         
         BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         InputStream input = socket.getInputStream();
         InputStreamReader reader = new InputStreamReader(input);
         BufferedReader reader2 = new BufferedReader(reader);
         
         String data = buffer.readLine(); // 한줄씩 가지고 올 수 있음. (2바이트) 
         System.out.println();
         
      }

   }

}