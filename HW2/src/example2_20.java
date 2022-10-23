import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example2_20 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入5個人的分數");
		
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		int score[] = new int[5];
		
		for (int i = 0; i < score.length; i++)
		{
			String str = br.readLine();
			score[i] = Integer.parseInt(str);
		}
		
		for (int i = 0; i < (score.length-1); i++) 
		{
			for (int j = i+1; j <score.length; j++)
			{
				if (score[j] > score[i])
				{
					int temp = score[j];
					score[j] = score[i];
					score[i] = temp;
				}
			}
		}
		
		for (int i = 0; i <score.length; i++)
		{
			System.out.println("第" +(i+1)+ "名的分數是" +score[i]);
		}

	}
}
