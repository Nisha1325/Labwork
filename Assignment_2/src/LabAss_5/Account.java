package LabAss_5;

import java.io.Serializable;
public class Account
{
	private String name;//private Variable
	private Double Balance;
	
	public Account()  //constructor
	{
		super();
		
	}
	public String getName() //getter method
	{
		 return name;
		 
   }
	public Void setName(String name) //setter method	
	{
		this.name = name;
		return null;
	}
	public Double getBalance()//getter method
	{
		return Balance;
		
	}
	public Void setBalance(Double balance)//setter method
	{
		Balance=balance;
		return null;
		
	}


	public Void withdraw()//method
	{
		double withdrawamt=5000;
		if(Balance<withdrawamt)//if else  statement
		{
			System.out.println("Insufficeint amount");
			
		}
		else
		{
			  System.out.println("withdraw easily");
			  
		}
		Balance=Balance-withdrawamt;
		System.out.println("After withdraw:"+Balance);
		return null;
	}
	
	
	     public void deposite()//method
	     {
	    	 double depositeamt=45;
	    	 Balance=Balance+depositeamt;
	    	 System.out.println("After deposite:"+Balance);
	    	 
	     }
	
	
}

	
