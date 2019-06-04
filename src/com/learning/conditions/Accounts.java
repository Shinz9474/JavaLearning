package com.learning.conditions;

public class Accounts {

	public static String itemName = "Books";
	public static void validateConditons()
	{
		try
		{
			l1:
			for(int i=0; i<10;i++)
			{
				l2:
				for(int j=0; j<9; j++)
				{
					l3:
					for(int k=0; k<9; k++)
					{
						System.out.println(i+" "+j+" "+k);
						if(i==5)
						{
							System.out.println("Broke");
							break l2;
						}
					}
				}
			}
		
			
		}
		
		catch(Exception ex)
		{
			System.out.println("Exception occured");
		}
	}
	public static void main(String[] args) 
	{
		validateConditons();
	}
}
