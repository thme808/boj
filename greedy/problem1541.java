package boj.greedy;

import java.util.*;
import java.io.*;

public class problem1541 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
                
        int i = 0, prev = 0, result = 0;
        int tokenSize = st.countTokens();
        
        while(st.hasMoreTokens()) {        	
        	String el = st.nextToken();
        	
        	int plusSum = 0;
        	StringTokenizer numToAdd = new StringTokenizer(el, "+");
        	while(numToAdd.hasMoreTokens()) {
        		plusSum += Integer.parseInt(numToAdd.nextToken());     		
        	}
        	if(tokenSize - 1 == st.countTokens()) {
        		result = plusSum;
        	}else {
            	result -= plusSum;
        	}
        	
        	System.out.println(result);
        }
        
        System.out.println("answer: " + result);
        
        bw.flush();
        br.close();
    }
}