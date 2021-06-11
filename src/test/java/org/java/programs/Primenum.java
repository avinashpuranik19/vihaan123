package org.java.programs;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
//avinash
		int m= 34; 
		System.out.println(m/2);
		
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
		}
		
	}


