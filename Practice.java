package practice;

import java.util.Scanner;



public class Practice {

	public static void main (String[] args){
		//System.out.println("Hello Nivey");

		// Practice Questions

		Scanner scanner = new Scanner (System.in);

		//				System.out.println( " Enter 2 Numbers");
		//				int a= scanner.nextInt();
		//				int b= scanner.nextInt();
		//				System.out.println("The sum of "+ a +" "+ "and" +"  "+ b +" "+"is"+" "+(a+b));


		// **QUESTION 1 **
		//				System.out.println(args[0]);
		//				System.out.println(args[1]);

		//		//*** QUESTION 2 ***
		//				if (args[0]==args[1]){
		//					System.out.println(args[0]+ args[1]);
		//				}else{
		//					System.out.println("This does not match, Please retype again");
		//				}

		// ** QUESTION 3 **
		//		String a = args [0];
		//		String b = args [1];
		//		StringBuffer rev = new StringBuffer(b);
		//		rev.reverse();
		//	System.out.print("This is: "+ a+ " "+ rev);


		// **QUESTION 4 **
		//		System.out.println(" Enter 2 numbers");
		//		int a = scanner.nextInt();
		//		int b = scanner.nextInt();
		//		System.out.println("The sum of"+ " " + a + " +"+ " " + b +" "+ "is ="+ " "+ (a+b ));


		// ** QUESTION 5**
		//		System.out.println("Type in any number");
		//		int a = scanner.nextByte();
		//		
		//		if( a <-1){
		//			System.out.println(" This is a negative number");
		//		}
		//		if ( a == 0) {
		//			System.out.println(" This is zero");
		//		}
		//		if ( a > 0){
		//			System.out.println("This is positive");
		//		}

		// ** QUESTION 6**
		//		System.out.println("Type two numbers");
		//		int a = scanner.nextInt();
		//		int b = scanner.nextInt();
		//		if (a<b){
		//			for ( int i = a;i<b;i++){
		//				if (i%2==0){
		//					System.out.println("Even Numbers are"+ i);
		//				}
		//			}
		//		}else{
		//			if (b<a){
		//				for( int j = b; j<b; j++){
		//					if (j%2== 0){
		//						System.out.println("Even Numbers are"+ j);
		//					}
		//				}
		//			}
		//		}


		// ** Question 7 **
		
		//		System.out.println("Enter two numbers");
		//		int flag,temp;
		//		int num1 = scanner.nextInt();
		//		int num2 = scanner.nextInt();
		//		if (num1>num2){
		//			temp=num1;
		//			num1=num2;
		//			num2= temp;
		//					
		//		}
		//		
		//		System.out.println("Prime numbers between" + num1 + "and" + num2);
		//		while(num1< num2){
		//			flag=0;
		//			for(int i = 2; i<num1/2; i++){
		//				if(num1%i==0){
		//					flag = 1;
		//					break;
		//					
		//					//Flag is another way of saying boolean
		//					
		//				}
		//			}
		//			if (flag==0)
		//				System.out.println(num1);
		//			num1++;
		//		}
	
		// ******* QUESTION 8 *********
		//		String female , male ;
		//
		//		System.out.println("Please type in your gender=");
		//		String gender = scanner.next();
		//		System.out.println("Please type in your age=");
		//		int age = scanner.nextInt();
		//
		//		if (gender.equals("Female")){
		//
		//			if (age >= 1 && age <= 58){
		//				System.out.println("8.2%");
		//			} else if (age >= 59 && age<= 120){
		//				System.out.println("8.3%");
		//			}
		//		}
		//
		//
		//
		//
		//		if(gender.endsWith("Male")){
		//			if (age >= 1 && age <=60){
		//				System.out.println("9.2%");
		//			} else if (age >= 61 && age <= 120){
		//				System.out.println("8.3%");
		//			}
		//		}
		//		
		// ***** QUESTION 9 *****
		int month; // Declaring the variable
		System.out.println("Select the number for a month"); // Printing what needs to be inputted
		month = scanner.nextInt(13)+1; // allowing the user to input numbers
		switch (month){
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("mar");
			break;
		case 4:
			System.out.println("apr");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("jul");
			break;
		case 8:
			System.out.println("aug");
			break;
		case 9:
			System.out.println("sept");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;

		default:
			System.out.println("Sorry you have inputted not valid");
			System.out.println("Try Again");
			break;

		}




	}
}

