/******************************************************************************

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter how many time u want to check the price");
		int t=sc.nextInt();
		for(int i=0; i<=t; i++)
		{
		    
		 System.out.println("Enter The type of cab");
		int n=sc.nextInt();
		System.out.println("Enter Total Distance");
		int x=sc.nextInt();
		
		if(n==1 )
		{
		    System.out.println("mini");
		   
		    if(x>3 && x <75)
		    {
		        int base=50;
		        int price=(x-3)*10+base ;
		        System.out.println("cost" + price);
		    }
		    else if(x<=3)
		    {
		        System.out.println("cost = base price =50");
		    }
		    
		    else if(x>=75)
		    {
		        int base=50;
		        int price =(x*8);
		        System.out.println("cost" + price);
		        
		    }
		}
		    
		 else if(n==2)
		   {
		      System.out.println("sedan");
		       
		        if(x>5 && x<100)
		        {
		            int base=80;
		            int price=(x-5)*12+base ;
		            System.out.println("cost" +price );
		        }
		        else if(x<=5)
		        {
		            System.out.println("cost = base price =80");
		        } 
		        
		        else if(x>=100)
		        {
		            int base=50;
		            int price =(x*10);
		            System.out.println("cost" + price);
		        }
		        
		        
		    
		  }
		  
		  else if(n==3)
		  {
		      System.out.println("sedan");
		       
		        if(x>5)
		        {
		            int base=100;
		            int price=(x-5)*15+base;
		            
		            System.out.println("cost" + price);
		        }
		        else
		        {
		            System.out.println("cost = base price =100");
		        } 
		    
		  }
		  
		}
		}
	
		
		
		
	

	
	

}
