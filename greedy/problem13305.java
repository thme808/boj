package boj.greedy;

import java.util.*;
import java.io.*;

public class problem13305 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(br.readLine());
        long[] prices = new long[N];
        long[] dists = new long[N - 1];
        
        int i;
		st = new StringTokenizer(br.readLine(), " ");
		for(i = 0; i < N - 1; i++) { dists[i] = Long.parseLong(st.nextToken()); }//도시간 이동거리 
		st = new StringTokenizer(br.readLine(), " ");
		for(i = 0; i < N; i++) { prices[i] = Long.parseLong(st.nextToken()); }//도시의 주유비
		
		
		long min = 0, last_sel_price = prices[0];
		for(i = 0; i + 1 < N; i++) {
			min += last_sel_price * dists[i];
			
			if(last_sel_price > prices[i + 1]) {
				last_sel_price = prices[i + 1];
			}
			//System.out.printf("last_price: %d, dist[i]: %d, min: %d \n", last_sel_price, dists[i], min);
		}
		
		System.out.println(min);
        
        bw.flush();
        br.close();
    }
}