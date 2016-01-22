
class MainProg {
	
	int l,b;
	public void set(int l1, int b1)
	{
		l= l1;
		b= b1;
	}
	public void show()
	{
		System.out.println("L: "+l);
		System.out.println("B: "+b);
	}
}
	public class Rect
	{
		public static void main (String[]args)
		{
			MainProg rob = new MainProg();
			rob.l = 10;
			rob.b = 20;
			rob.set(10,20);
			rob.show();
			int f;
		}
	}

