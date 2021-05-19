
public class sumOfArray {
	
	
       public static void main(String[] args) {
		
	    // An array which holds 5 numbers entered by a user
		int numbers[] = {10, 11, 12, 13, 14};
		
		//Prints the result
		System.out.println("The sum of these numbers is: " + List(numbers));
		
		// An array which holds 5 numbers entered by a user
		 int nums[] = {1,2,3,4,5};
		 
		//Prints the result
		  System.out.println("The product of these numbers is: " + Array(nums));

		}

	//Finding a sum of an array
		public static int List(int numbers[]) {
			
			int sum = 0;
			//For loop to calculate the sum of an array
			for (int counter = 0; counter < numbers.length; counter++) {
				sum = sum + numbers[counter];
			}
			
			return sum;
		}
		
		//Finding a product of an array
		public static int Array(int nums[]) {
			int product = 1;
			
			for (int counter = 0; counter < nums.length; counter++) {
				product = product * nums[counter];
			}
			

			return product;
		

		}
}
