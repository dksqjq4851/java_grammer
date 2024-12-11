package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
//        배열표현식1. 리티럴 방식
//        int[] intArr1 = {1,3,5,7,9};
//
////        배열표현식2. 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] =1;
//        intArr2[1] =3;
//        intArr2[2] =5;
//        intArr2[3] =7;
//        System.out.println(intArr2[4]);
//
////        참조자료형의 배열은 기본적으로 null초기화
//        String[] stArr = new String[5];
//        stArr[0] = "hello1";
//        stArr[1] = "hello2";
//        stArr[2] = "hello3";
////        아래 코드는 nullpointerexception발생
//        for(int i = 0; i<stArr.length;i++){
//            if(stArr[i].equals("hello10")){
//                System.out.println("hello10가 있습니다.");
//            }
//        }
////        배열표현식3.
//        int[] intArr3 = new int[]{1,3,5,7,9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,2,3,4,5});
//
////        배열표현식4. : 불가 -> 배열의 길이가 사전 지정되어야함
//        int[] intArr4 = new int[];
//        String[] stArr = new String[5];
//        for(int i = 0; i<stArr.length; i++){
//            stArr[i] = "";
//        }
//
//        Arrays.fill(stArr, "hello");
//        System.out.println(stArr.toString());
//
////        85, 65, 90인 int배열을 선언하고, 총합, 평균을 구하자
//        int[] intArr = new int[3];
//        intArr[0] = 85;
//        intArr[1] = 65;
//        intArr[2] = 90;
//        int sum = 0;
//        for (int i = 0; i<intArr.length; i++){
//            sum += intArr[i];
//        }
//        System.out.println(sum);
//        System.out.println(sum/intArr.length);
////        배열의 최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//
//        }
//        System.out.println(max);
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//
//        }
//        System.out.println(min);
//        배열의 자리 바꾸기
//        int[] arr = {20, 10, 30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        int[] arr2 = {10, 20, 30, 40, 50};
//        for(int i = 0; i<arr2.length-1;i++){
//            int temp1 = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp1;
//
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열뒤집기 : 새로운배열을 선언하여, arr을 뒤집을 배열 생성
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] arr2 = new int[arr.length];
//        for (int i = arr.length-1; i >= 0; i--){
//            arr2[arr.length-1-i] = arr[i];
//
//        }
//        System.out.println(Arrays.toString(arr2));

//        배열의 정렬  12 17 20 10 15
//        int[] arr = {7,12,20,10,15};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        선택정렬 알고리즘 구현
//        for(int i = 0 ; i < arr.length-1; i ++){
//            for(int j = i+1; j < arr.length; j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//
//                }
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i = 0 ; i < arr.length-1; i++){
//            int min = arr[i];
//            int minIndex = i;
//            for(int j=i+1; j<arr.length; j++){
//               if(min>arr[j]){
//                min = arr[j];
//                minIndex = j;
//            }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));

//        문자정렬
//        아스코코드(unicode)기준으로 정렬
//        String[] fruits = {"banana","apple","cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
////        내림차순 : 기본형타입은 Comparator 로 처리 불가
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        int[] arr = {5,1,2,3,6};
////        Arrays.sort(arr, Comparator.reverseOrder());
//        Arrays.sort(arr);
////        k번째수 프로그래머스
//
//
//
//
//        System.out.println(Arrays.toString(fruits));
//        String[] fruits2 = {"apple","applee","applef"};
//        숫자 조합의 합
//        모두 각기 다른 숫자의 배열이 있을때, 만들어질수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        int[] arr1 = new int[intArr.length* intArr.length];
//        int index = 0;
//        for(int i=0;i<intArr.length-1;i++){
//            for(int j = i+1;j<intArr.length;j++){
//                arr1[index] = intArr[i]+intArr[j];
//                index++;
//            }
//        }
//        int[] arr2 = new int[index];
//        for(int i = 0; i<index; i++){
//            arr2[i] = arr1[i];
//        }
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//        int index2 = 0;
//        int[] arr3 = new int[arr2.length];
//        for(int i =0; i<arr2.length-1; i++){
//            if(arr2[i]!=arr2[i+1]) {
//                arr3[index2] = arr2[i];
//                index2++;
//            }
//        }
//        arr3[index2] = arr2[arr2.length-1];
//        int[] answer =  new int[index2];
//        for(int i = 0; i<index2;i++){
//            answer[i] = arr3[i];
//        }
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(answer));
//
////        배열의복사
////        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
//        int[] answer1 = Arrays.copyOf(arr3, index2);
//        System.out.println(Arrays.toString(answer1));
//        int[] answer2 = Arrays.copyOfRange(arr3, 0, index2);

//        두 개 뽑아서 더하기
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
//        int index = 0;
//        for (int i = 0; i <arr.length;i++){
//            if(arr[i]==target){
//                index++;
//                break;
//            }
//            index++;
//
//        }
//        System.out.println(index);

//        이진검색(binary search) - 이분탐색
//        사전에 오름차순정렬이 되어 있어야 이진검색 가능
//        수 찾기
//        int[] arr = {1,3,4,8,9,15,15};
//        System.out.println(Arrays.binarySearch(arr, 18));

////        배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2);
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1, arr2));

//        2차원배열의 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 10;
//        arr[0][1] = 20;
//        arr[0][2] = 30;
//        arr[1][0] = 40;
//        arr[1][1] = 50;
//        arr[1][2] = 60;
//        int[][] arr2 = {{10,20,30},{40,50,60}};

//        가변배열 선언 후 할당
//        int[][]arr1 = new int[2][];
//        arr1[0] = new int[2];
//        arr1[1] = new int[3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[1][0] = 30;
//        arr1[1][1] = 40;
//        arr1[1][2] = 50;
////        가변배열 리터럴 방식;
//        int[][]arr2 = {{10,20},{30,40,50}};

//        [3][4]사이즈 배열 선언하고
//        1~12까지 숫자값을 각 배열에 순차적으로 할당
//        {1,2,3,4,},{5,6,7,8,}....
//        int[][]arr = new int[3][4];
//        int index = 0;
//        for (int i=0;i<arr.length;i++){
//            for(int j =0;j<arr[0].length;j++){
//                arr[i][j] = j + 1+ index;
//
//            }
//            index += arr.length+1;
//        }
        int[][]arr = new int[3][4];
        int num = 1;
        for (int i = 0; i<arr.length; i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = num;
                num++;
            }
        }




        System.out.println(Arrays.deepToString(arr));

//        행렬의 덧셈 - 프로그래머스   






    }
}
