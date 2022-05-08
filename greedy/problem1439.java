package boj.greedy;

import java.util.*;
import java.io.*;

public class problem1439 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        
        String str = br.readLine().trim();
        
        String regExp = "[1]+";
        
        int cnt_1 = 0, cnt_0 = 0;
        while(str.contains("1")) {        	
        	str = str.replaceFirst(regExp, " ");
        	cnt_1++;
        }
        
        st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            st.nextToken();
            cnt_0++;
        }
        
        str = str.trim();
        cnt_0 = str.length() == 0 ? 0 : str.split(" ").length;
        System.out.println(Math.min(cnt_1, cnt_0));
       // System.out.printf("cnt_0: %d, cnt_test: %d", cnt_0, cnt_test);
        
        bw.flush();
        br.close();
    }
}