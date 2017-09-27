package practice;

import java.util.Scanner;

public class Sequence {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println(" enter length");
		int input1 = in.nextInt();
		int[] input2 = new int [input1];
		
		for (int i =0; i <input1; i++){
			System.out.print("index" + ": ");
			input2[i]= in.nextInt();//gets input
			
			
		}
		
		happy(input2);

		
	}

	public static void happy (int [] input2){	
	
		int count= 0;
		int temp = 0;

		//1 2 3 4 5
		for (int i = 0; i < input2.length; i++){
			if (input2[i] != input2.length){
				if ( input2[i]<= input2[i+1]){
					count++;
				}else {
					if (count > temp){
						temp =count;
						
					}
				} if ( temp>= count){
						System.out.println(temp);
					}else{
						System.out.println(count);
					}	
			}
			
	}
					
	}
}

		
			
			
			
		



