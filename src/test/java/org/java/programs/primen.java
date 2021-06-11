package org.java.programs;

public class primen {

	public static void main(String[] args) {
		
		int n= 25,j=2, temp=0;
		
		for (j=2;j<=10;j++)
		{
			for (int i=2;i<=j-1;i++)
			{
				
				if (j%i==0)
				{
					temp=temp+1;
				}
				
			}
			
			if (temp>=1)
			{
				System.out.println(j + " is not prime");
			}
			else
			{
				System.out.println(j+ " is prime");
			}
		}
		
		
	
		
		
		
	}

}
