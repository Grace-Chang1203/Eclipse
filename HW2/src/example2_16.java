import java.lang.reflect.Array;

public class example2_16 
{
	public static void main(String[] args) 
	{
		int array[] = (int[])Array.newInstance(int.class,3);
		
		Array.set(array, 0, 123);
		Array.set(array, 1, 456);
		Array.set(array, 2, 789);
		
		for (int i = 0; i <= 2; i++)
		{
			System.out.println("intArray[" +i+ "] = " +array[i]);
		}
	}
}
