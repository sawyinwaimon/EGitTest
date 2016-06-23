package com.frobo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FroboTest2 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int K;
		int M;
		int N;
		int total = 0;
				
		M = scanner.nextInt();
		N = scanner.nextInt();
		K = scanner.nextInt();
		
		Map totalVotesByCandidate = new HashMap();
		
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
		List votelist = new ArrayList();
		int noOfline = 0;
		int noOfsupporter = N;
		int totalVotes = noOfsupporter/M;
		while(noOfline < K){
		int l = Integer.parseInt(scanner.next());
		if(l>=1 & l<= M){
			votelist.add(l);
			
			
		}else{
			System.out.println("invalid data range of l and exist election competition");
			break;
			
		}
		noOfline++;	
		}
		for(int i =0 ; i< votelist.size();i++){
			noOfsupporter = noOfsupporter - totalVotes;
			int k = ((int) votelist.get(i))+noOfsupporter;
			totalVotesByCandidate.put(votelist.get(i),k);
			
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
