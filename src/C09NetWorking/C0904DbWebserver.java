package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C0904DbWebserver {
    public static void main(String[] args) throws IOException, SQLException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 시작");
        String id = "";
        while(true){
//            accept : 사용자의 연결 요청을 수락
//            socket객체 안에는 사용자의 정보(ip 등)
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while(line!=null && !line.isEmpty()){
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            if(infos.contains("?")){
                id = infos.split("=")[1];
            }
////            사용자에게 응답을 줄 메시지를 http프로토콜에 맞게 세팅
//            String reponse = "HTTP/1.1 200 Okay\r\n\r\n"+"iwandgohome";
//            플러시란 일반적으로 변경사항을 확정하는 것을 의미
            socket.getOutputStream().flush();
            String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
            String userName = "root";
            String password = "1234";
            Connection connection = DriverManager.getConnection(url, userName, password);
//        Statement객체에 쿼리를 담아 db에 전달
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from post where id="+Integer.parseInt(id));
//        rs.next()를 통해 데이터를 1 row씩 read
            int i = 0;
            String title = "";
            String contents = "";

            while(rs.next()){
               i = rs.getInt("id");
               title = rs.getString("title");
               contents = rs.getString("contents");
            }
            //            사용자에게 메시지 응답
            String reponse = "HTTP/1.1 200 Okay\r\n\r\n"+"id is "+ i+"\n" +" and title is "+ title+"\n" +" and contents is"+contents;
            socket.getOutputStream().write(reponse.getBytes(StandardCharsets.UTF_8));

            connection.close();;
            socket.close();
        }
    }
}