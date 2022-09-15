package com.yash.playermanagement.client;

import java.util.Scanner;

import com.yash.playermanagement.service.World;
import com.yash.playermanagement.serviceImpl.India;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		World b=new India();
		
		
		while(true)
		{
			System.out.println(" ");
			System.out.println("Enter 1 to Add_Player- ");
			System.out.println("Enter 2 to View the Players- ");
			System.out.println("Enter 3 to View Score-");
			System.out.println("Enter 4 to Update Score-");
			System.out.println("Enter 5 for exit");
			System.out.println("\n");
			
			System.out.println("Enter Input Here-");
			int n=sc.nextInt();
			
			switch(n)
			{
			case 1: b.addPlayer();
			break;
			
			case 2: b.viewPlayer();
			break;
			
			case 3: b.viewScore();
			break;
			
			case 4: b.updateScore();
			break;
			
			case 5: System.exit(n);
			}	
	}
}
}
		

