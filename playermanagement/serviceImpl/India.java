package com.yash.playermanagement.serviceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.yash.playermanagement.model.Player;
import com.yash.playermanagement.service.World;

public class India implements World {

	Scanner sc=new Scanner(System.in);
	{
		System.out.println("Enter Number of players You want to Add-");
	}
	int k=sc.nextInt();
	Player pr[]=new Player[k];
	int count=0;
	
	Player p=new Player();
	
	
	@Override
	public void addPlayer() 
	{
		
		
		 System.out.println("Add Player Details");
		
		
	
			while(true)
			{
			try
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter player's Rank Number-");
				int rankNo=sc.nextInt();
				p.setRankNo(rankNo);
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid Rank Number");
				System.out.println("Please Enter Correct Rank in Numbers");
			}
			}
			
			
			
			System.out.println("Enter Player Name here-");
			String pname=sc.next();
			while(!pname.matches("[A-Z a-z]{0,15}"))
					{
				       System.out.println("Please Enter valid name");
				       pname=sc.next();
					}
			p.setPname(pname);
			
			
			while(true)
			{
			try
			{
				Scanner sc=new Scanner(System.in);	
			
			System.out.println("Enter Age of Player");
			int age=sc.nextInt();
			p.setAge(age);
			break;
			} 
			catch(InputMismatchException e)
			{
				System.out.println("Invalid Age Number");
				System.out.println("Please Enter Correct Age in Numbers");
			}
			}
			
			
			System.out.println("Is player in Playing team or retired ?(true/false) -");
			Boolean pstatus=sc.nextBoolean();
			p.setPstatus(pstatus);
			
			System.out.println("Enter the score of player in all format-");
			System.out.println("Enter the score of player in test-");
			int test=sc.nextInt();
			p.setPscore(test);
			
			System.out.println("Enter the score of player in ODI-");
			int odi=sc.nextInt();
			p.setPscore(odi);
			
			System.out.println("Enter the score of player in t20-");
			int t20=sc.nextInt();
			p.setPscore(t20);
			
			System.out.println("Combined score of all format ");
			int pscore=test+odi+t20;
			p.setPscore(pscore);
			
			System.out.println("Score of all fomrat- "+p.getPscore());
			
			
		
			pr[count]=p;
			count++;
		}
		
	
	
	@Override
	public void viewPlayer()
	{
		if(count>0)
		{
			System.out.println("Enter Rank no.of player You want to see-");
			int g=sc.nextInt();
			
			for(int i=0;i<count;i++)
			
			{
			 if(pr[i].getRankNo()==g)
			 {
			System.out.println("Displaying All details about Player");
			
			System.out.println("Rank of the player-"+pr[i].getRankNo());
			System.out.println("Name of the player-"+pr[i].getPname());
			System.out.println("Age of the player-"+pr[i].getAge());
			 }
			} 
		}	
	}




	@Override
	public void viewScore()
	{
		if(count>0)
		{
			System.out.println("Enter Rank no. of player You want to see score-");
			int g=sc.nextInt();
			
			for(int i=0;i<count;i++)
			
			{
			 if(pr[i].getRankNo()==g)
			 {
			
			System.out.println("Displaying Player's name and scores");
			
			
			System.out.println("Name of the player-"+pr[i].getPname());
			
			
			System.out.println("Score of the player-"+pr[i].getPscore());
			 }
			} 
		}
		
		
	}

	@Override
	public void updateScore()
	{
		if(count>0)
		{
			System.out.println("Enter Rank no. player You want to update score-");
			int g=sc.nextInt();
			
			for(int i=0;i<count;i++)
			
			{
			 if(pr[i].getRankNo()==g)
			 {
			
			System.out.println("Last added Scorecard-"+pr[i].getPscore());
			
			System.out.println("New Score of Player to be added-");
			int score=sc.nextInt();
			
			int score1=pr[i].getPscore()+score;
			
			pr[i].setPscore(score1);
			
			System.out.println("Newly Added Score-"+score);
			
			System.out.println("New updated score of player-"+pr[i].getPscore());
			 }
			}
		}
		
		
	}

}

