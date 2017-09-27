package practice;

import java.util.Arrays;


public class reverse {
	public static void main(String[] args) {
		getKey(30, -15, 12);
	}
	
	public static void getKey(int input1, int input2, int input3) {
		String array[] = {input1+"", input2+"", input3+""};
		System.out.println("Initial look of the array " + Arrays.toString(array));
		int sum = 0;
		for(int i = 0;i < array.length;i++) {
			if(array[i].charAt(0) == '-') {
				array[i] = "-" + new StringBuffer(array[i].substring(1, array[i].length())).reverse().toString();
				System.out.println("This reverses the negative " + array[i]);
				sum = sum + Integer.parseInt(array[i]);
				System.out.println("Negatives are added to the sum and sum looks like " + sum);
			} else {
				array[i] = new StringBuffer(array[i]).reverse().toString();
				System.out.println("This reverses positive " + array[i]);
				sum = sum + Integer.parseInt(array[i]);
				System.out.println("Positives are added to the sum and sum looks like " + sum);
			}
			
		}
		System.out.println("Look of the array after all Integer have been reversed " + Arrays.toString(array));
		String finalResult = sum + "";
		System.out.println("Sum before reversed " + sum);
		System.out.println("Final result after reverse" + "-" + new StringBuffer(finalResult.substring(1, finalResult.length())).reverse().toString());
	}
}
