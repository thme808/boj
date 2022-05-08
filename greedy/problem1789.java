package boj.greedy;

import java.util.*;
import java.io.*;

public class problem1789 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; // = new StringTokenizer(br.readLine());
        
        long N = Long.parseLong(br.readLine());
        
        long pointer = 1, sum = 0;
        while(sum <= N - pointer) {
        	//System.out.printf("pointer: %d, ", pointer);

        	sum += pointer++;
        	//System.out.printf("sum: %d \n", sum);
        }
        
        System.out.println(pointer == 1 ? 1 : pointer - 1);
        //System.out.printf("sum: %d, pointer: %d", sum, pointer);
        
        bw.flush();
        br.close();
        
//        Scanner sc=new Scanner(System.in);
//		long s=sc.nextLong();
//		long left=1;
//		long right=s;
//		long answer=0;
//		while(left<=right) {
//			long mid=(left+right)/2;
//			if(mid*(mid+1)/2<=s) {
//				answer=mid;
//				left=mid+1;
//			}else {
//				right=mid-1;
//			}
//		}
//		System.out.println(answer);

    }
}