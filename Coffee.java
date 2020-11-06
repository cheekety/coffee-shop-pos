import java.util.Scanner;

    public class Coffee
    {
    	//fields
    	private static int item;
    	private static double price;
    	private static int menuNo;
    	private static Scanner keyboard;


    	public static void main(String[] args) {

    		// 3 nested if's allows for 3 additional orders
    		service();

    		if (menuNo > 0 && price > 1.95)
    			service();

    		if (menuNo > 0 && price > 3.95)
    			service();

    		if (menuNo > 0 && price > 5.95)
    			service();

			display();

    	} //end main

    	public static void display()
		{
    		//rounded to fix a strange addition problem
    		price = price * 100;
			long roundedPrice = Math.round(price);
			price = roundedPrice / 100.0;

			//prints total purchases and price
    		System.out.println("Number of purchases " + item + "."
    					+ "\nYour total is RM" + price + "." );
		} //end display

    		public static double service()
    		{
    			// displays menu
    				System.out.println("Jivin’ Java CoffeeShop");
    				System.out.println("MENU");
    				System.out.println("(1) American RM4.99");
    				System.out.println("(2) Espresso RM8.50");
    				System.out.println("(3) Latte RM8.15");

    			//displays choices and asks for input
    				keyboard = new Scanner(System.in);

    				System.out.println("Please place your order. "
    						+ "\nEnter \n1 for American, "
    						+ "\n2 for Espresso, "
    						+ "\n3 for Latte "
    						+ "\nor "
    						+ "\n0 to complete and total your order.");

    				menuNo = keyboard.nextInt();

    			// determines what happens with given selection
    				if(menuNo == 1)
    				{
    					item += 1;
    					price +=4.99;
    					return 4.99;
    				}
    				else
    					if(menuNo == 2)
    					{
    						item += 1;
    						price += 8.50;
    						return 8.50;
    					}
    				else
    					if(menuNo == 3)
    					{
    						item += 1;
    						price += 8.15;
    						return 8.15;
    					}
    				else
    					return 0;

    	} //end service
    } //end class