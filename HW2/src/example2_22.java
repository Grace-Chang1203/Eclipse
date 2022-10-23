
public class example2_22 
{
	public static void main(String[] args) 
	{
		int score[][] = {{80,60,22,50,75},{90,55,68,72,0}};

		for (int i = 0; i < score[1].length; i++) 
		{
			System.out.println("第" +(i+1)+ "個人的國語分數是" +score[0][i]+ "分");
			System.out.println("第" +(i+1)+ "個人的數學分數是" +score[1][i]+ "分");
		}
	}
}
