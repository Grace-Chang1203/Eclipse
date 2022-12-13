
class Sample06_8 
{
	public static void main(String[] args) 
	{
		Company06_8 cmp = new Company06_8();
		
		Driver06_8 drv1 = new Driver06_8(cmp);
		drv1.start();
		
		Driver06_8 drv2 = new Driver06_8(cmp);
		drv2.start();
	}
}

class Company06_8
{
	private int sum = 0;
	
	public synchronized void add(int a)
	{
		int tmp = sum;
		System.out.println("目前的合計金額是" +tmp+ "元");
		System.out.println("賺到" +a+ "元了。");
		tmp = tmp + a;
		System.out.println("合計金額" +tmp+ "元");
		sum = tmp;
	}
}

class Driver06_8 extends Thread
{
	private Company06_8 comp;
	
	public Driver06_8(Company06_8 c)
	{
		comp = c;
	}
	
	public void run()
	{
		for(int i = 0;i < 3;i++)
		{
			comp.add(50);
		}
	}
}