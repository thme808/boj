package boj.greedy;

import java.util.*;
import java.io.*;

public class problem2217 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(br.readLine());
        int[] lopes = new int[N];
        
        int i, max = 0;
        for(i = 0; i < N; i++) {
        	lopes[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(lopes);
        
        for(i = 0; i < N; i++) {
        	//System.out.printf("(%d * %d)", lopes[0], (N - i));
        	int w = lopes[i] * (N - i);
        	if(w > max) {
        		max = w;
        	}
        }
        System.out.println(max);
        
        bw.flush();
        br.close();
    }
}