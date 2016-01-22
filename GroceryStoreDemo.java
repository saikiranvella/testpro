import java.util.Scanner;


class GroceryStoreDemo
{
public static void main(String a[])

{

Scanner sc= new Scanner(System.in);


GroceryStoreSystem gs = new GroceryStoreSystem();

	
	gs.addProduct();

	gs.display();

System.out.println(" \n.......BILLING.........\n");


System.out.println(" Enter Product Code :: ");

	
    int pcode = sc.nextInt();


System.out.println(" Enter Quantity:: ");

	
    int qnty = sc.nextInt();

	
	gs.calculateBill(pcode, qnty);
	





}


}
 