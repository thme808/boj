package boj.greedy;

import java.util.*;
import java.io.*;

public class problem1715 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> cards = new PriorityQueue<Long>();
        
        int i;
        long op_cnt = 0;
        for(i = 0; i < N; i++) {
        	cards.add(Long.parseLong(br.readLine()));
        }
        
        while(cards.size() > 1) {
        	long card1 = cards.poll();
        	long card2 = cards.poll();
        	
        	long op = card1 + card2;
        	
        	op_cnt += op;
        	

        	//System.out.printf("sol (%d, %d)", card1, card2);
        	//System.out.printf("sol op: %d \n",  op_cnt);
        	
        	cards.add(op);
        }
        
        System.out.println(op_cnt);
        
        bw.flush();
        br.close();
    }
}