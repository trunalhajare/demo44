package day3;

import java.util.Scanner;

public class passfail {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=s.nextInt();
	
		
		if(marks>40)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}

	}

}
