import java.util.*;
class mint
{
	public static void main(String[] args)
	{
		System.out.println("enter the single unit ");
		Scanner input = new Scanner(System.in);
		int price = input.nextInt();
		System.out.println("Enter quantity of item");
		int quantity = input.nextInt();
		
		float discountrate = 0;
		float discamount = 0;
		float revenue = 0;
		
		if(quantity<=100)
		{
		    revenue = quantity*price;
		}
		else if(quantity>=100 && quantity<=120)
		{
		    revenue = quantity*price;
		    discountrate = 10/100;
		    discamount = revenue*discountrate;
		    revenue = revenue-discamount;
		}
	    else if(quantity>120)
	    {
	     revenue = quantity*price;
		 discountrate = 15/100;
		 discamount = revenue*discountrate;
	     revenue = revenue-discamount;   
	    }
	    else
	    {
	        System.out.println("Enter proper quantity");
	    }
	    
	   System.out.println("revenue = "+revenue);
	   System.out.println("Discount = "+discamount+"Discount rate ="+discountrate);
		
	}
}