package practice;


public class array {
	
	public static int output1;
	
	public static void main(String[] args) {
		int [][] input = {{2,2,9},{2,2,2},{2,2,7}}; // this is to initialise the array
		theName(input); // It is calling the method
		System.out.println("result " + output1); // Prints out result 
	}
	
	public static void theName(int [][] input) { //method that was created
		int cornerSum = input[0][0] + input[0][2] + input[2][0] + input[2][2]; // this is adding the corner sum
		int centerSum = input[0][1] + input[1][0] + input[1][2] + input[2][1]; // this is adding the centre sum
		
		if(cornerSum > centerSum) { // 
			output1 = 1;
			System.out.println(output1);
		}
		else if(centerSum > cornerSum) {
			output1 = 2;
		}
		else {
			output1 = 3;
			System.out.println(output1);
		}
		
	}
}	
