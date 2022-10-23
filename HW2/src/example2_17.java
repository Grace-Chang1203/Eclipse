
public class example2_17 
{
	public static void main(String[] args) 
	{
		int test [] = {80,60,22,50,75};
		test[10] = 75;
		
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("第" +i+ "個人的分數是" +test[i-1]+ "分");
		}
	}
}
