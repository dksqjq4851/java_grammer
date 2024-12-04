package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
//         출력 : System.out을 통해 콘솔 출력
//        System.out.println(20);//sout단축어 사용가능
//        System.out.print("hello world");//print는 줄바꿈없는 출력
//        System.out.print("hello world");
//        입력 : System.in(키보드입력) + Scanner(입력을위한클래스)활용
        int a = 10; //10이라는 숫자를 변수명a에 할당
//        Scanner myScanner = new Scanner(System.in);//스캐너객체를 myScanner변수에 할당
////        nextLine메서드 : 입력받은 데이터를 한줄로 읽어서, String으로 리턴
//        String inputline = myScanner.nextLine();
//        System.out.println("입력사항 : " +inputline);
//        예를 들어 아래와 같은 입력값이 주어질대 처리방법
        /*
            abc
            bcd
            2   */
//        Scanner myScanner = new Scanner(System.in);
//        String inputline1 = myScanner.nextLine();
//        String inputline2 = myScanner.nextLine();
//        int count = myScanner.nextInt();
//        System.out.println("입력사항1 : " +inputline1);
//        System.out.println("입력사항2 : " +inputline2);
//        System.out.println("입력사항3 : " +count);

//        입력 : System.in + BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input =  br.readLine();
        System.out.println(input);

        String[] input2 =  br.readLine().split(" ");
        System.out.println(input2[0]);
        System.out.println(input2[1]);
        System.out.println(input2[2]);

        String input3 = br.readLine();
//        StringTokenizer를 통해 공백을 기준으로 문자열을 하나씩 잘라서 담음
        StringTokenizer st = new StringTokenizer(input3);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());










    }
}
