
class Sample06_1 
{
	public static void main(String[] args) 
	{
		Car06_1 car1 = new Car06_1("1號車");
		car1.start();
		
		for(int i = 0;i < 5;i++)
		{
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car06_1 extends Thread
{
	private String name;
	
	public Car06_1(String nm)
	{
		name = nm;
	}
	
	public void run()
	{
		for(int i = 0;i < 5;i++)
		{
			System.out.println("正在進行" +name+ "的處理工作");
		}
	}
}