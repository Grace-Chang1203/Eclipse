import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample18 
{
	public static void main(String[] args) throws IOException
	{	
		System.out.println("請輸入英文字母");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println("轉換成大寫時為" +str.toUpperCase());
		System.out.println("轉換成小寫時為" +str.toLowerCase());
	}
}

