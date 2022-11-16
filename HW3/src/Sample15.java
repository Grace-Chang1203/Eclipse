
public class Sample15 
{
	public static void main(String[] args) 
	{
		Car15.show();
		
		Car15 car1;
		car1 = new Car15();
		car1.setCar(1234,20.5);
		
		Car15.show();
		
		Car15 car2;
		car2 = new Car15();
		car2.setCar(4567,30.5);
	}
}

class Car15
{
	private static int sum;
	private int num;
	private double gas;
	
	public Car15()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" +num+ "，汽油量設為" +gas);
	}
	
	public static void show()
	{
		System.out.println("車子總共有" +sum+ "台");
		sum++;
	}
}