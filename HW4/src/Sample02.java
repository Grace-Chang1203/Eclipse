
public class Sample02 
{
	public static void main(String[] args) 
	{
		RacingCar2 rccar1 = new RacingCar2(1234,20.5,5);
	}
}

class Car2
{
	private int num;
	private double gas;
	
	public Car2() 
	{
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	
	public Car2(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" +n+ "，汽油量為" +g+ "的車子");
	}
}

class RacingCar2 extends Car2
{
	private int course;
	
	public RacingCar2()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public RacingCar2(int n,double g,int c)
	{
		super(n,g);
		course = c;
		System.out.println("生產了編號為" +c+ "的賽車");
	}
}