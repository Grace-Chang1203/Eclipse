
public class Sample03 
{
	public static void main(String[] args) 
	{
		RacingCar3 rccar1;
		rccar1 = new RacingCar3();
		
		rccar1.newShow();
	}
}

class Car3
{
	protected int num;
	protected double gas;
	
	public Car3()
	{
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
}

class RacingCar3 extends Car3
{
	private int course;
	
	public RacingCar3()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void newShow() 
	{
		System.out.println("賽車的車號是" +num);
		System.out.println("汽油量是" +gas);
		System.out.println("賽車編號是" +course);
	}
}