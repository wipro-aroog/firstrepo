package practice;

import java.util.Scanner;

public class gamma {
	public static void main(String[] args) {
		int input1, input2, input3;
		int alpha , gamma, beta;
		Scanner scanner = new Scanner (System.in);
		System.out.println(" Input Number gamma");
		input1= scanner.nextInt();
		System.out.println(" Input Number beta");
		input2=scanner.nextInt();
		System.out.println(" Input Number alpha");
		input3 = scanner.nextInt();
		gamma = ( input1%10);
		beta =((input2/10)%10);
		alpha = ((input2/100)%10);
		System.out.println("This is :" + " gamma "+ gamma);
		System.out.println("This is " +" betta "+ beta);
		System.out.println("This is " +" alpha "+ alpha);
		
		
		}
			
		
	}



