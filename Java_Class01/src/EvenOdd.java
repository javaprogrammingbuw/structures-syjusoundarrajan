import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		//int n=0;
		int i=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value n : ");
        int n = scan.nextInt();
         
        for(i=1; i<n; i++)
        {
            if(i%2!=0)
                System.out.print(i+" ");
        }   
        System.out.println();
         
    }

		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	
}