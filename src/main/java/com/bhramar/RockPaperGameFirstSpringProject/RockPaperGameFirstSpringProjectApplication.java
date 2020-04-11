package com.bhramar.RockPaperGameFirstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;

@SpringBootApplication
public class RockPaperGameFirstSpringProjectApplication {
		
		private String personChoice;
		
		static int p1Score;
		static int p2Score;
		static int p3Score;
		static int p4Score;
		static int Draw;

		public void inputNumber(int numberIs)
		{
			if(numberIs == 0)
				personChoice = "Rock";

			if(numberIs == 1)
				personChoice = "Paper";

			if(numberIs == 2)
				personChoice = "Scissors";
		}

		public static void main(String[] args) {
		SpringApplication.run(RockPaperGameFirstSpringProjectApplication.class, args);

		RockPaperGameFirstSpringProjectApplication person1 = new RockPaperGameFirstSpringProjectApplication();
		RockPaperGameFirstSpringProjectApplication person2 = new RockPaperGameFirstSpringProjectApplication();
		RockPaperGameFirstSpringProjectApplication person3 = new RockPaperGameFirstSpringProjectApplication();
		RockPaperGameFirstSpringProjectApplication person4 = new RockPaperGameFirstSpringProjectApplication();
			
			Random ran = new Random();
			int upperBound = 3;
			int ranNo1 = 0;
			int ranNo2 = 0;
			int ranNo3 = 0;
			int ranNo4 = 0;

			int round=0;
			while(round<50)
			{
			ranNo1 = ran.nextInt(upperBound);
			person1.inputNumber(ranNo1);	
			ranNo2 = ran.nextInt(upperBound);
			person2.inputNumber(ranNo2);	
			ranNo3 = ran.nextInt(upperBound);
			person3.inputNumber(ranNo3);
			ranNo4 = ran.nextInt(upperBound);
			person4.inputNumber(ranNo4);

			System.out.println("Players 1 Input is : "+person1.personChoice);
			System.out.println("Players 2 Input is : "+person2.personChoice);
			System.out.println("Players 3 Input is : "+person3.personChoice);
			System.out.println("Players 4 Input is : "+person4.personChoice);
			
			getResult(person1.personChoice,person2.personChoice,person3.personChoice,person4.personChoice);
			
			System.out.println("Score after round " +(round+1)+" is "+p1Score+" "+p2Score+" "+p3Score+" "+p4Score+" and Draws "+Draw);
			round++;
			}
			System.out.println("Final score after "+round+" rounds is "+p1Score+" "+p2Score+" "+p3Score+" "+p4Score);
		}


		public static void getResult(String personA, String personB,String personC,String personD)
		{
			if((personA == personB) && (personB == personC) && (personC == personD))
					Draw++;

			else
			{
				//Checking for A
				if(personA == "Rock")
				{
					if(personB == "Scissors")
						p1Score++;
					if(personC == "Scissors")
						p1Score++;
					if(personD == "Scissors")
						p1Score++;
				}	
					
				if(personA == "Paper")
				{
					if(personB == "Rock")
						p1Score++;
					if(personC == "Rock")
						p1Score++;
					if(personD == "Rock")
						p1Score++;
				}		

				if(personA == "Scissors")
				{
					if(personB == "Paper")
						p1Score++;
					if(personC == "Paper")
						p1Score++;
					if(personD == "Paper")
						p1Score++;
				}		

				//Checking for B
				if(personB == "Rock")
				{
					if(personA == "Scissors")
						p2Score++;
					if(personC == "Scissors")
						p2Score++;
					if(personD == "Scissors")
						p2Score++;
				}	
					
				if(personB == "Paper")
				{
					if(personA == "Rock")
						p2Score++;
					if(personC == "Rock")
						p2Score++;
					if(personD == "Rock")
						p2Score++;
				}		

				if(personB == "Scissors")
				{
					if(personA == "Paper")
						p2Score++;
					if(personC == "Paper")
						p2Score++;
					if(personD == "Paper")
						p2Score++;
				}

				//Checking for C
				if(personC == "Rock")
				{
					if(personB == "Scissors")
						p3Score++;
					if(personA == "Scissors")
						p3Score++;
					if(personD == "Scissors")
						p3Score++;
				}	
					
				if(personC == "Paper")
				{
					if(personB == "Rock")
						p3Score++;
					if(personA == "Rock")
						p3Score++;
					if(personD == "Rock")
						p3Score++;
				}		

				if(personC == "Scissors")
				{
					if(personB == "Paper")
						p3Score++;
					if(personA == "Paper")
						p3Score++;
					if(personD == "Paper")
						p3Score++;
				}

				//Checking for D
				if(personD == "Rock")
				{
					if(personB == "Scissors")
						p4Score++;
					if(personC == "Scissors")
						p4Score++;
					if(personA == "Scissors")
						p4Score++;
				}	
					
				if(personD == "Paper")
				{
					if(personB == "Rock")
						p4Score++;
					if(personC == "Rock")
						p4Score++;
					if(personA == "Rock")
						p4Score++;
				}		

				if(personD == "Scissors")
				{
					if(personB == "Paper")
						p4Score++;
					if(personC == "Paper")
						p4Score++;
					if(personA == "Paper")
						p4Score++;
				}
			}
		}
	}
