package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0209RecurCombiPermu {
    public static void main(String[] args) throws IOException {
//        숫자가 1,2,3,4 가 있을때
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
////        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담아서 출력
////        1,2  1,3  1,4  2,3  2,4  3,4
//        List<List<Integer>> myList2 = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for(int i = 0;i< myList.size();i++){
//            temp.add(myList.get(i));
//            for(int j = i+1;j< myList.size();j++){
//                temp.add(myList.get(j));
//                myList2.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        for (List li : myList2){
//            System.out.println(li);
//        }
//        재귀함수 호출을 통한 조합리스트 만들기
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
//        myList.add(6);
//        boolean[] visited = new boolean[myList.size()];
////        visited[0] = false;
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
////        combi(answer,temp,myList, 2, 0);
////        System.out.println(answer);
//        permu(answer,temp,myList,3, visited);
//        System.out.println(answer);
//
//
//
//
//
//    }
//
//    public static void combi(List<List<Integer>> answer,List<Integer>temp,List<Integer>myList, int count, int num){
//        if(temp.size()==count){
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int j = num ;j< myList.size();j++){
//            temp.add(myList.get(j));
//
//            combi(answer, temp, myList, count, j+1);
//            temp.remove(temp.size()-1);
//        }
//    }
//    public static void permu(List<List<Integer>> answer,List<Integer>temp,List<Integer>myList, int count, boolean[] visited){
//        if(temp.size()==count){
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int j = 0 ;j< myList.size();j++){
//            if(!visited[j]) {
//                visited[j]=true;
//                temp.add(myList.get(j));
//                permu(answer, temp, myList, count, visited);
//                temp.remove(temp.size() - 1);
//                visited[j] = false;
//            }
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] temp = br.readLine().split(" ");
            if (temp[0].equals("0")) break;
            int[] arr = new int[temp.length - 1];
            for (int i = 1; i < arr.length+1; i++) {
                arr[i - 1] = Integer.parseInt(temp[i]);
            }
            System.out.println(Arrays.toString(arr));
            combi(arr, 0, 0, new int[6]);
            System.out.println("\n");
        }
    }

        public static void combi(int[]arr, int depth, int start, int[] answer){
            if (depth == 6) {
                StringBuilder sb = new StringBuilder();
                for(int a : answer){
                    sb.append(a);
                    sb.append(" ");
                }
                sb.deleteCharAt(sb.length()-1);
                System.out.println(sb);
                return;
            }

            for (int i = start; i <arr.length; i++) {
                answer[depth] = arr[i];
                combi(arr, depth + 1, i + 1, answer);

        }
//     N과 M (1)

//    로또
    }
}
