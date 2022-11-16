
public class Sample04 
{
	public static void main(String[] args) 
	{
		Car4 car1;
		car1 = new Car4();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}
}

class Car4
{
	int num;
	double gas;
	
	void show() 
	{
		System.out.println("car1車號是" +num);
		System.out.println("car1汽油量是" +gas);
	}
}
