package boj.greedy;

import java.util.*;
import java.io.*;

public class problem4796 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        
        int L, P, V, dayCnt = 0, idx = 1;
        do {
        	st = new StringTokenizer(br.readLine());
        	L = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            
            if(L <= 0) {
            	break;
            }
            dayCnt = (L * (V / P)) + Math.min(V % P, L);
            System.out.printf("Case %d: %d\n", idx++, dayCnt);
        }while(true);
        
        bw.flush();
        br.close();
    }
}