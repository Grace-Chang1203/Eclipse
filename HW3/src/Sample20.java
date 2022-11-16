import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample20 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入字串");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		
		System.out.println("請輸入要新增的字串");
		BufferedReader br2 =
				new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println("在「" +str1+ "」後新增「" +str2+ "」的話，就會變成「" +sb+ "」。");

	}
}
