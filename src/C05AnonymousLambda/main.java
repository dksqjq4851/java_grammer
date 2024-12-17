package C05AnonymousLambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1)==Math.abs(o2)){
                    return o1-o2;
                }else{
                    return Math.abs(o1)-Math.abs(o2);
                }
            }
        });
        BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
        String input = bs.readLine();
        int max = Integer.parseInt(input);
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<max;i++){
            int num = Integer.parseInt(bs.readLine());
            if(num==0) {
                if(pq.isEmpty()){
                    sb.append(0).append("\n");
                }else sb.append(pq.poll()).append("\n");
            }else{
                pq.add(num);
            }
        }
        System.out.println(sb);
//        [4,5],[1,2],[5,0],[3,1]
//        List<int[]>myList = new ArrayList<>();
//        myList.add(new int[]{4, 5});
//        myList.add(new int[]{1, 2});
//        myList.add(new int[]{5, 0});
//        myList.add(new int[]{3, 1});
//
//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }
////        정렬조건 : 리스트안의 배열에 index 1번째 값을 기준으로 오름차순
//        myList.sort(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]-o2[0];
//            }
//        });
//        System.out.println("정령이용");
//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }
//        int[] numbers = {3, 30,34, 5, 9,1,10,1,0,0};
//        String[] arr = new String[numbers.length];
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = String.valueOf(numbers[i]);
//        }
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return  (o2 + o1).compareTo(o1 + o2);
//            }
//        });
//        for (int i = 0; i < arr.length; i++) {
//            sb.append(arr[i]);
//        }
//        String answer = String.valueOf(sb);
//        if(arr[0].equals("0")){
//            answer = "0";
//        }
//
//        System.out.println(answer);


    }

}
