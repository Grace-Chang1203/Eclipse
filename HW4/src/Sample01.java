
public class Sample01 
{
	public static void main(String[] args) 
	{
		RacingCar1 rccar1;
		rccar1 = new RacingCar1();
		
		rccar1.setCar(1234,20.5);
		
		rccar1.setCourse(5);
	}
}

class Car1 
{
	private int num;
	private double gas;
	
	public Car1() 
	{
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}

	public void setCar(int n,double g) 
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" +n+ "，汽油量設為" +g);
	}
}

class RacingCar1 extends Car1
{
	private int course;
	
	public RacingCar1() 
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c) 
	{
		System.out.println("將賽車編號設為" +c);
	}
}