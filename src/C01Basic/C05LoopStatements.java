package C01Basic;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//        int a = 0;
//        while (a<10){
//            System.out.println("hello world");
//            a = a+1;
//        }
//
////        2~10까지 출력되는 while문 예제
//        int b = 2;
//        while (b<11){
//            System.out.println(b);
//            b++;
//        }

//        입력한 숫자의 구구단 단수 출력
//        3 X 1 = 3
//        3 X 2 = 6
//        3 X 3 = 9

//        while(true){
//            System.out.println("계산할 구구단 단수를 입력하세요");
//            Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();
//            int a = 1;
//            while(a < 10){
//                System.out.println(num + " X " + a + " = " + num*a);
//                a++;
//            }
//        }
//
//        도어락키예제 -> 반복되는 도어라킥 예제
//        int b = 0;
//        while(true){
//
//            System.out.println("비밀번호를 입력하세요");
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if(answer == input){
//            System.out.println("문이 열렸습니다.");
////            break키워드는 가장 가까이에 있는 반복문을 종료
//            break;
//        }else{
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
//        b++;
//            System.out.println("비밀번호를" + b + "회 잘못입력하였습니다. ");
//        if(b>4){
//            System.out.println("비밀번호" + b + "회 잘못입력하여 도어락이 잠깁니다.");
//            break;
//        }
//        }
//        do while : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do{
//            System.out.println(a);
//        }
//        while(a<10);

//        for문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
//        int b = 2;
//        while(b<11){
//            System.out.println(b);
//            b++;
//        }
//        for(int a=2; a<11; a++){
//            System.out.println(a);
//
//
//        }

//        for문을 사용했던 변수명을 for문 끝난이후 다음 라인에서 재선언이 가능

//        1~10중에 홀수만 출력하기
//        for(int a= 1; a<11 ; a++){
//            if(a%2 == 0){
//
//            }else{
//                System.out.println(a);
//            }
//        }
//        1~20까지 수 중에 짝수를 모두 더한값
//        int b = 0;
//        for(int a = 1; a < 21; a++){
//            if(a%2 == 0){
//                b = b + a;
//            }
//        }
//        System.out.println(b);

//        두수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int max = 0;
//        for(int i = 1; i <= b; i++){
//            int c = a%i;
//            int d = b%i;
//            if (c==0 && d == 0 & c==d) {
//                max = i;
//            }
//        }
//        System.out.println(max);
//       소수구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는수
//        사용자가 입력한 숫자 n이 소수인지 아닌지 판별
//        System.out.println("소수인지 판별할 숫자를 입력하세요.");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = 0;
////        for(int i = 2;i < a; i++ ){
////            if(a%i==0){
////                b = a;
////            }
////        }
////        if(a == 1){
////            System.out.println("입력하신 값은 소수가 아닙니다.");
////        }else if(b==0){
////            System.out.println("입력하신 값은 소수입니다..");
////        }else{
////            System.out.println("입력하신값은 소수가 아닙니다.");
////        }
//
//        for(int i = 1; i<= a; i++){
//            if(a%i==0) {
//                b++;
//            }
//        }
//        if(b==1){
//            System.out.println("입력하신 값은 1이며 소수가 아닙니다.");
//        }else if(b==2){
//            System.out.println("입력하신 값은 소수입니다..");
//        }else{
//            System.out.println("입력하신값은 소수가 아닙니다.");
//        }
        // 강사님의 풀이
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean answer = false;
//        for (int i = 2; i <input; i++){
//            if(input % i == 0){
//                answer = true;
//
//            }
//        }
//        if (answer==true){
//            System.out.println("소수가아닙니다.");
//        }else{
//            System.out.println("소수입니다.");
//        }

//         contiue : 반복문의 조건식으로 이동
//        continue를 활용하여 홀수만 출력
//        for(int i = 1; i<11; i++){
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }

//        배열과 enchanced for문(향상된 for문- for each문)\
//        int[] arr = {1,3,5,7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
////        일반 for문으로 배열 접근
//        for (int i = 0; i < 4 ;i++){
//            System.out.println(arr[i]);
//        }
////        향상된 for문으로 배열 접근 : a에 arr의 값이 하나씩 담기고, 값의 갯수만큼 반복횟수가 결정
//        for(int a : arr){
//            System.out.println(a);
//        }
//
////        일반for문을 통해 arr의 저장된 값 변경
//        for (int i = 0; i < 4 ;i++){
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr));
////        향상된 for문을 arr값 변경 시도
//
//        for (int a : arr){
//            a +=  100;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(num>1){
//            int abc = 20;
//            num=20;
//        }
//        abc = 30; //if문 중괄호 밖에서는 abc변수의 존재를 모름.
//        System.out.println(num);
//        다중반복문
//        2~9단까지 출력
//        for (int i = 2; i < 10 ; i++){
//            System.out.println(i + "단입니다.");
//            for(int j = 1; j <10 ; j++){
//                System.out.println(i + " X " + j + " = " + (i*j));
//            }
//        }
//
////        라벨문 : 반복문에 이름을 붙이는것.
//
//        for(int i = 0; i <5 ; i++){
//            for(int j = 0 ; j<5;j++){
//                System.out.println("hello world");
//            if (j==2){
//                break;
//            }
//            }
//        }

//        int[][] arr = {{1,2,3},{4,5, 11},{7,8,9},{10,11,12}};
////        숫자 8을 찾아서 2,1에 있다고 출력
////        숫자 11을 찾되, 가장 먼저 찾아지는 11의 위치만 출력
//        loop1:
//        for (int i = 0; i < 4; i ++){
//            loop2:
//            for (int j = 0; j <3 ; j++){
//                if(arr[i][j]==11){
//                    System.out.println("숫자 11 은" + i + ", " + j + "에 있습니다.");
//
//                    break loop1;
//                }
//            }
//        }






//        100~200까지 수 중에서 소수인 수를 출력
//        int a = 0;
//        for(int i = 100; i < 201 ; i ++){
//            a = 0;
//            for(int j = 1; j*j<=i;j++){
//                if(i%j==0){
//                    a++;
//                }
//
//            }
//            if (a==1){
//                System.out.println(i);
//
//            }
//        }
        //강사님 풀이
//        for(int input = 100; input<=200 ; input++){
//            boolean answer = false;
//            for (int i = 2; i*i <= input; i++){
//                if(input % i == 0){
//                    answer = true;
//                    break;
//                }
//            }
//            if(!answer){
//                System.out.println(input);
//            }
//        }



    }
}
