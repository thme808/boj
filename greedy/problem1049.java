package boj.greedy;

import java.util.*;
import java.io.*;

public class problem1049 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int strNeedToChange	//교체가 필요한 기타줄 수 
        	,N;	// 브랜드 수 
        int[][] packs;	//패키지 구성(패키지 가격, 개당 가격)
        
        strNeedToChange = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken()); 
        packs = new int[N][2];
        
        for(int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
        	packs[i][0] = Integer.parseInt(st.nextToken());	//패키지 가격 
        	packs[i][1] = Integer.parseInt(st.nextToken());	//개당 가격 
        }
        
        // Comparator구현 
        
        
        bw.flush();
        br.close();
    }
}