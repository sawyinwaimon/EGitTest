package com.frobo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FroboTest {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int K;
		int M;
		int N;
		int total = 0;
		
		M = scanner.nextInt();
		N = scanner.nextInt();
		K = scanner.nextInt();
		
		if(M<1 | M>100){
			System.out.println("Please enter M again");
			M = scanner.nextInt();
		}
		
		if(N<1 | N>100){
			System.out.println("Please enter N again");
			N = scanner.nextInt();
		}
		
		
		if(K <1  | K > 100){
			System.out.println("Please enter K again");
			K = scanner.nextInt();
		}
		List<Integer> voters = new ArrayList<Integer>();
		int noOfline = 0;
		while(noOfline < K){
		int l = Integer.parseInt(scanner.next());
		if(l>=1 & l<= M){
			if(total>=K){
				if(!voters.contains(l)){
				voters.add(l);
				}
			}
			if(total<K){
			total += l;
			}
		}else{
			System.out.println("invalid data range of l and exist election competition");
			break;
			
		}
		noOfline++;	
		}
		if(voters.size()>0){
		Collections.sort(voters);
		for(int i = 0;i<voters.size();i++){
			System.out.println(voters.get(i));
		}
		}else{
			System.out.println("no candidate get vote");
		}
	}

}
