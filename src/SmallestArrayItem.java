import java.util.Scanner;
public class SmallestArrayItem {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int array1[] = new int[5];
		int array2[] = new int[5];
		
		System.out.println("Please enter 5 values for array 1");
		
		for(int i = 0; i < array1.length; i++) {
			int userInput = keyboard.nextInt();
			array1[i] = userInput;
		}
		
		System.out.println("Please enter 5 values for array 2");
		
		for(int i = 0; i < array2.length; i++) {
			int userInput = keyboard.nextInt();
			array2[i] = userInput;
		}
		
		int minIdx = -1;
		for(int i = 0; i < array1.length; i++) 
		{
		    for(int j = 0; j < array2.length; j++) 
		    {
		        if(array1[i] == array2[j] && (minIdx < 0 || array1[i] < array1[minIdx]))
		        {
		            minIdx = i;
		        }
		    }
		}

		if(minIdx < 0)
		    System.out.println("There is no smallest matching integer!");
		else
		    System.out.println("The Smallest match in the array is : " + array1[minIdx]);
	
	}
}
