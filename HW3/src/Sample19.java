import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample19 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入字串");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		
		System.out.println("請輸入要檢索的文字");
		BufferedReader br2 =
				new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		char chr = str2.charAt(0);
		
		int num = str1.indexOf(chr);
		
		if(num != -1)
		{
			System.out.println(str1+ "的第" +(num+1)+ "個字就是「" +chr+ "」");
		}
		else
		{
			System.out.println(str1+ "中沒有「" +chr+ "」這個字");
		}
	}
}

