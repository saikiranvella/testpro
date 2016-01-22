import java.util.Scanner;

class GroceryStoreSystem
{


	int n;
	static int k;
	Product plist[];

	
	public void addProduct()
	{

	
	Scanner sc = new Scanner(System.in);

System.out.println("\n How Many Products You want to add ?");

    	n = sc.nextInt();

	plist = new Product[n];
      
	for(int i=0;i<n;i++)

	{

		plist[i] = new Product();
	
	
	System.out.println("\n ENTER PRODUCT DETAILS :: ");
	
	System.out.println("\n PCODE  :: ");
		
		int pcode = sc.nextInt();
	
		plist[i].setPcode(pcode); 

	
	System.out.println("\n PNAME  :: ");
	
		String pname  = sc.next();
			sc.nextLine();

		plist[i].setPname(pname);

	
	
	 System.out.println("\n PRICE  :: ");

	
		double price = sc.nextDouble();

		plist[i].setPrice(price);

	System.out.println("\n ......PRODUCT DETAILS ARE ADDED...");

	
	}
	
		

	}

	public void display()

	{

System.out.println("\n...........AVAILABLE PRODUCTS ARE ........");

System.out.println("PCODE     PNAME      PRICE");
System.out.println("----------------------------");

	

	for(int i=0;i<n;i++)
	{


System.out.println(plist[i].getPcode()+"\t"+plist[i].getPname()+"\t"+plist[i].getPrice());

	}
		




	}


public void calculateBill(int pcode, int qnty)
{

k++;
double sub_amount =0.0;
double total = 0.0;

	for(int i=0;i<n;i++)
	{
		if (k==1){
		System.out.println("pcode    pName    price    qnty    sub_total\n");
		System.out.println("-----    -----    -----    ----    ---------\n");
		}

		if(plist[i].getPcode()==pcode)

		{

		    sub_amount = plist[i].getPrice()*qnty;
			total+=sub_amount;
			System.out.println(pcode+"    "+plist[i].getName()+"    "+plist[i].getPrice()+"    "+qnty+"    "+sub_amount+"\n");

	//System.out.println("\n ...DEAR CUSTOMER, YOUR TOTAL BILL AMOUNT IS :: "+total_amount);
		

		}
		

	}
	

if (k==3){
 System.out.println("your total amount is"+total);
 System.out.println(" \n .....THANK YOU, VISIT AGAIN..... ");
	
}


}







}