package boj.greedy;

import java.util.*;
import java.io.*;

public class problem1744 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int i = 0;
        while(i < N) {
        	arr[i] = Integer.parseInt(br.readLine());    	
        	i++;
        }
        
        Arrays.sort(arr);
        
        int pointer = N - 1;
        int maxIdx = 0;
        long result = 0;
        
        // 0보다 큰 수에 대한 처리 
        while(true) {
        	if(pointer <= maxIdx) {
        		break;
        	}//0 혹은, 음수이면 종료 
        	else if(arr[pointer] <= 0) {
        		break;
        	}

        	if(arr[pointer - 1] > 1) {
        		result += arr[pointer] * arr[pointer - 1];
        		pointer -= 2;
        	}else {
        		result += arr[pointer];
        		pointer -= 1;		
        	}

            
        }

        // 0, 음수에 대한 처리 
        maxIdx = pointer;
        pointer = 0;
        while(true) {
        	if(pointer == maxIdx) {
        		result += arr[maxIdx];
        		break;
        	}else if(pointer > maxIdx) break;

        	result += arr[pointer] * arr[pointer + 1];
        	pointer += 2;
        }

        System.out.println(result);
        
        bw.flush();
        br.close();
    }
}