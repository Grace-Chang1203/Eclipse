
public class example2_19 
{
	public static void main(String[] args) 
	{
		int score[] = {80,60,22,50,75};
		
		for (int i = 0; i < score.length; i++)
		{
			System.out.println("第" +(i+1)+ "個人的分數是" +score[i]+ "分");
		}
		
		System.out.println("考試人數為" +score.length+ "人");
	}
}
