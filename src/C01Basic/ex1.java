package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.PriorityQueue;
import java.util.Queue;

public class ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<count;i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                if(pq.isEmpty()){
                    sb.append(0);
                    sb.append("\n");
                }else {
                    sb.append(pq.poll());
                    sb.append("\n");
                }
            }else{
                pq.add(temp);
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
