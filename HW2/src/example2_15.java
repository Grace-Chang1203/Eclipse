
public class example2_15
{
	public static void main(String[] args) 
	{
		int score[] ;
		score = new int [5];
		
		score[0]=80;
		score[1]=60;
		score[2]=22;
		score[3]=50;
		score[4]=75;
		
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("第" +i+ "個人的分數是" +score[i-1]+ "分");
		}
	}
}
