
public class example2_18 
{
	public static void main(String[] args) 
	{
		int score[] = {80,60,22,50,75};
		
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("第" +i+ "個人的分數是" +score[i-1]+ "分");
		}
	}
}
