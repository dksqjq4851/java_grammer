import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        int[] array = new int[]{1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];

        for(int i = 0;i<commands.length;i++){
            int[] temp = new int[commands[i][1]-commands[i][0]+1];

            for(int j=commands[i][0];j<=commands[i][1];j++){
                temp[j-commands[i][0]] = array[j-1];
            }
            Arrays.sort(temp);
            answer[i] += temp[commands[i][2]-1];

        }
        System.out.println(Arrays.toString(answer));
    }
}
