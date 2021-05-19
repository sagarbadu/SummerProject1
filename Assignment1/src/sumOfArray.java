
public class sumOfArray {

	//Finding a sum of an array
		public static int List(int numbers[]) {
			
			int sum = 0;
			//For loop to calculate the sum of an array
			for (int counter = 0; counter < numbers.length; counter++) {
				sum = sum + numbers[counter];
			}
			
			return sum;
		}
}
