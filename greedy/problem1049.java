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
       
        PriorityQueue<Integer> packs = new PriorityQueue<Integer>();	 // 6개 묶음 패키지 가격
        PriorityQueue<Integer> indivs = new PriorityQueue<Integer>();	// 개당 가격
        
        strNeedToChange = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken()); 
        
        for(int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	packs.add(Integer.parseInt(st.nextToken()));	//패키지 가격 
        	indivs.add(Integer.parseInt(st.nextToken()));	//개당 가격 
        }
        
        int min = 0;
        
        int pack = packs.peek();
    	int indiv = indivs.peek();
    	min = Math.min( strNeedToChange % 6 == 0 ? pack * (strNeedToChange / 6) : pack * ( (strNeedToChange / 6) + 1 ) 
		 		, indiv * strNeedToChange);

		min = Math.min( min ,  pack * (strNeedToChange / 6) + indiv * (strNeedToChange % 6));
        
        System.out.println(min);
        
        bw.flush();
        br.close();
    }
}