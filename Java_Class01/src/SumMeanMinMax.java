import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("a:"+a+"b:"+b+"c:"+c);
		
		//for sum
		int sum=a+b+c;
		System.out.println("ans = "+sum);
		
		//for Mean
		float Mean = sum/3;
		System.out.println("Mean1 = "+Mean);
		
		//for minimum value
		if(a<b && a<c){
			System.out.println("Min Val ist a");}
			else if(b<a && b<c){
				System.out.println("Min Val ist b");}
			else if(c<a && c<b){
			System.out.println("Min val ist c");}
			
	
	//for maximum value
	if(a>b && a>c){
		System.out.println("Max Val ist a");}
		else if(b>a && b>c){
			System.out.println("Max Val ist b");}
		else if(c>a && c>b){
		System.out.println("Max val ist c");}
		

	}

		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

