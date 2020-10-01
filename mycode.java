import java.util.Scanner;




class hotel
{
	String hotel_name;
	String owner_name;
	int hotel_licence_no;
	String customer_name;
	String customer_adhaar_no;
	String customer_mobile_no;
	int tables;
	int rooms;
	double bill_amount;

	
	hotel()
	{
		hotel_name="Shri-Krushana";
		owner_name="prathamesh kavale";
		hotel_licence_no=123456;
		customer_name="xyz";
		customer_adhaar_no="1234_5678_9000";
		customer_mobile_no="9876543210";
		tables=10;
		rooms=10;
		bill_amount=0;
	}
	
	hotel(String hotel_name,String owner_name,int hotel_licence_no,String customer_name,String customer_adhaar_no,String customer_mobile_no)
	{
		this.hotel_name=hotel_name;
		this.owner_name=owner_name;
		this.hotel_licence_no=hotel_licence_no;
		this.customer_name=customer_name;
		this.customer_adhaar_no=customer_adhaar_no;
		this.customer_mobile_no=customer_mobile_no;
		this.tables=tables;
		this.rooms=rooms;
		this.bill_amount=bill_amount;
	}
	void display()
	{
		System.out.println("+---------------------------------------+");
		System.out.println("|the hotel name:"+hotel_name+"           |");
		System.out.println("|Owner name:"+owner_name+"           |");
		System.out.println("+---------------------------------------+");
	}
}

class add_customer extends hotel
{
	void add_customer()
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter the customer name:");
		customer_name=s1.nextLine();
		
		System.out.println("enter the adhaar card no:");
		customer_adhaar_no=s1.nextLine();
		
		System.out.println("enter the mobile no:");
		customer_mobile_no=s1.nextLine();
		
		
	}
	void customer_display()
	{
		
		System.out.println("\n");
		System.out.println("*****************************************");
		System.out.println("the customer name:"+customer_name);
		System.out.println("the adhaar card no:"+customer_adhaar_no);
		System.out.println("the mobile no:"+customer_mobile_no);
		System.out.println("*****************************************");
		System.out.println("\n");
		
	}
}


public class mycode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hotel h1=new hotel();
		add_customer a1=new add_customer();
		Scanner s4 = new Scanner(System.in);
		int main_choice=1;
		
		while(main_choice<=5)
		{
			h1.display();
			System.out.println("+---------------------------------------+");
	        System.out.println("|       HOTEL MANAGEMENT SYSTEM         |");
	        System.out.println("+---------------------------------------+");
	        System.out.println("| Options:                              |");
	        System.out.println("|        1. Add New Customer            |");
	        System.out.println("|        2. View Customer detail        |");
	        System.out.println("|        3. booking                     |");
	        System.out.println("|        4. order                       |");
	        System.out.println("|        5. Check Out(print a bill)     |");
	        System.out.println("|        6. Exit                        |");
	        System.out.println("+---------------------------------------+");
	        
	        main_choice=s4.nextInt();
	        
	        switch(main_choice)
	        {
	        	case 1:
	        	{
	        		
	        		a1.add_customer();
	        		break;
	        	}
	        	case 2:
	        	{
	        		a1.customer_display();
	        		break;
	        	}
	        	case 3:
	        	{
	        		//a1.booking();
	        		break;
	        	}
	        	case 4:
	        	{
	        		//a1.order_food();
	        		break;
	        	}
	        	case 5:
	        	{
	        		//a1.bill();
	        		break;
	        	}
	        	default:
	        	{
	        		System.out.println("invalid choice");
	        	}
	        }
	        
		}

	}

}
