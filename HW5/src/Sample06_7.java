
class Sample06_7 
{
	public static void main(String[] args) 
	{
		Company06_7 cmp = new Company06_7();
		
		Driver06_7 drv1 = new Driver06_7(cmp);
		drv1.start();
		
		Driver06_7 drv2 = new Driver06_7(cmp);
		drv2.start();
	}
}

class Company06_7
{
	private int sum = 0;
	
	public void add(int a)
	{
		int tmp = sum;
		System.out.println("目前的合計金額是" +tmp+ "元");
		System.out.println("賺到" +a+ "元了。");
		tmp = tmp + a;
		System.out.println("合計金額" +tmp+ "元");
		sum = tmp;
	}
}

class Driver06_7 extends Thread
{
	private Company06_7 comp;
	
	public Driver06_7(Company06_7 c)
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