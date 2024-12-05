package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C06String {
    public static void main(String[] args) {
//        참조자료형 : 기본 자료형을 제외한 모든 자료형. 클래스 기반
//        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int a = 10;
//        Integer b = 10;
////        오토 언받싱 : WrapperClasss -> 기본자료형
//        int c = b;
////        오토박싱 : 기본자료형 -> WrapperClass 형변환
//        Integer d = a;

//        String 과 int 의 형변환
//        int a = 10;
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//
////        String -> int
//        int b = Integer.parseInt(st1);
////        배열에는 원시타입 자료형 세팅
//        int[] aarr1 = {10, 20, 30};
//
////        참조자료형에 원시자료형을 담을때는 Wrapper클래스를 써야함
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);

//
//
//
//
//        String st1 = new String("hello1");
////        리터럴 방식 허용 : 권장되는 방식(문자pool을 통해
//        String st2 = "hello1";
//        String st3 = "hello1";
////        참조자료형이므로, ==비교는 메모리 주소가 되고, 값을 비교할때에는 .equials사용
//        System.out.println(st1.equals(st2));
//        System.out.println(st2==st3);






//        char ch1 = '가';
//        char ch2 = '가';
//        System.out.println(ch1==ch2);

//        equals 중에 대소문자 무시
//
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st2.equalsIgnoreCase(st3));
//        문자열의 길이 : length()
//        String st1 = "hello1 java1 world2";
//        System.out.println(st1.length());
////        charAt : 특정 index의 문자(char)값을 리턴
////        소문자알파벳의 갯수
//        int count = 0;
//        for(int i = 0; i<st1.length();i++) {
//            if ('a' <= st1.charAt(i) && st1.charAt(i) <= 'z') {
//                count++;
//            }
//        }
//        System.out.println(count);

//        String st2 = "abcdefabaadfa";
////        a의 개수가 몇개인지 출력
//        int count = 0;
//        for (int i = 0; i < st2.length(); i++){
//            if(st2.charAt(i)=='a'){
//                count++;
//            }
//        }
//        System.out.println(count);
//
////        toCharArray() : String문자열을 char배열로 리턴
//        char[] chArr = st2.toCharArray();
//        int count1 = 0;
//        for(char ch : chArr){
//            if(ch=='a'){
//                count1++;
//            }
//        }
//        System.out.println(count1);
        String st1 = "hello java java";
//        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
        int number = st1.indexOf("java");
        System.out.println(number);

//        contains : 특정 문자열이 있는지 여부 boolean
        System.out.println(st1.contains("hello"));
        System.out.println(st1.contains("world"));






    }
}
