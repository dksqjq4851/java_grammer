import java.util.*;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
//        String s1 = "abcde";
//        String answer = "";
//            if(s1.length()%2 == 0){
//                int i = s1.length()/2;
//                answer += s1.substring(i-1,i+1);
//
//            }else {
//                int i = s1.length()/2;
//                answer += s1.substring(i,i+1);
//            }
//        System.out.println(answer);

//        문자열다루기
//        String s = "123564";
//        boolean answer = true;
//        if(s.length()==4 || s.length()==6){
//            if(Pattern.matches("^[0-9]+$", s)){
//                answer = true;
//            }else {
//                answer = false;
//            }
//        }else{
//            answer = false;
//        }
//        System.out.println(answer);
//        문자열 밀기
//        String a = "hello";
//        String b = "ohell1";
//        String c = "";
//        int answer = 0;
//        StringBuilder sb1 = new StringBuilder(a);
//        if (!(a == b)) {
//            for (int i = 0; i < a.length(); i++) {
//                char d = sb1.charAt(sb1.length()-1);
//                sb1.delete(sb1.length() - 1,a.length());
//                sb1.insert(0,d);
//                answer++;
//                }
//            }
//
//        System.out.println(answer);
//        [1,5,2,6,3,7,4]

//        List<int[]> list1 = new ArrayList<>();
//        int[] array = new int[]{1,5,2,6,3,7,4};
//        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
//        int[] answer = new int[commands.length];
//
//        for(int i = 0;i<commands.length;i++){
//            int[] temp = new int[commands[i][1]-commands[i][0]+1];
//
//            for(int j=commands[i][0];j<=commands[i][1];j++){
//                temp[j-commands[i][0]] = array[j-1];
//            }
//            Arrays.sort(temp);
//            answer[i] += temp[commands[i][2]-1];
//
//        }
//        System.out.println(Arrays.toString(answer));

//        int[] numbers = {2,1,3,4,1};
//        int index = 0;
//        int[] arr1 = new int[numbers.length*numbers.length];
//        for(int i = 0; i < numbers.length-1; i++){
//            for (int j= i+1; j<numbers.length;j++){
//                arr1[index] = numbers[i] + numbers[j];
//                index++;
//            }
//        }
//        int[] arr2 = Arrays.copyOf(arr1, index);
//        Arrays.sort(arr2);
//        int[] arr3 = new int[arr2.length];
//        int index2 = 0;
//        for(int i = 0; i<arr2.length;i++){
//            if(i==arr2.length-1 || arr2[i]!=arr2[i+1]){
//                arr3[index2] = arr2[i];
//                index2++;
//            }
//        }
//        int[] answer = Arrays.copyOf(arr3, index2);
//        int[][] arr1 = {{1,2},{2,3}};
//        int[][] arr2 = {{3,4},{5,6}};
//        int[][] answer = new int[arr1.length][arr1[0].length];
//        if(arr1.length==arr2.length&&arr1[0].length==arr2[0].length){
//            for(int i =0;i<arr1.length;i++){
//                for(int j = 0;j<arr1[0].length;j++){
//                    answer[i][j] = arr1[i][j] + arr2[i][j];
//                }
//            }
//
//        }
//        System.out.println(Arrays.deepToString(answer));
//        int index = 0;
//        int n = 3;
//        int[] numlist = {4,5,6,7,8,9,10,11,12};
//        List<Integer> myList = new ArrayList<>();
//        for(int a : numlist){
//            if((a % n) == 0){
//                myList.add(a);
//            }
//        }
//
//        System.out.println(myList);
//        int[] answer = new int[myList.size()];
//        for(int i= 0; i< answer.length;i++){
//            answer[i] = myList.get(i);
//        }
//        System.out.println(Arrays.toString(answer));


//        String[] completion = {"nikola","filipa","marina","vinko"};
//        String[] participant = {"marina","vinko","nikola","vinko","filipa"};
//        String answer = "";
//        boolean same = true;
//
//
//        for(int i = 0; i <participant.length-1;i++){
//            for (int j = i+1;j< participant.length;j++ ){
//                if(participant[i].equals(j)){
//                    answer = participant[j];
//                    same = false;
//
//                }
//            }
//        }
//        System.out.println(answer);
//
//        if(same) {
//            for (int i = 0; i < participant.length; i++) {
//                int index = 0;
//                for (int j = 0; j < completion.length; j++) {
//                    if (participant[i].equals(completion[j])) {
//                        index = 1;
//                        break;
//                    }
//                }
//                if (index == 0) {
//                    answer = participant[i];
//                    break;
//                }
//            }
//            System.out.println(answer);


//        }
        String answer = "";
        String[] completion ={"stanko", "ana", "mislav"};
        String[] participant ={"mislav", "stanko", "bye", "ana"};
        Map<String ,Integer > map2 = new HashMap<>();
        for(int i = 0; i<participant.length;i++){
            map2.put(participant[i], map2.getOrDefault(participant[i], 0)+1);
        }
        for(int i = 0; i<completion.length;i++){
            map2.put(completion[i], map2.get(completion[i])-1);
        }
        for(int i = 0; i<map2.size();i++){
            if(map2.get(participant[i])==1){
                answer = participant[i];
            }else if(map2.get(participant[i])==-1){
                answer = participant[i];
            }
        }
    }
}
