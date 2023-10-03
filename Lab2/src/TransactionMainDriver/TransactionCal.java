package TransactionMainDriver;

import java.util.ArrayList;
import java.util.Scanner;

import TransactionService.TransactionServiceImpl;

public class TransactionCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TransactionServiceImpl ts = new TransactionServiceImpl();
		System.out.println("enter the size of transaction array");
		int sizeofList = sc.nextInt();
		
		System.out.println("Enter the values of the array");
		ArrayList<Integer> listofTrans = new ArrayList<Integer>();
		for(int i=0;i<sizeofList;i++) {
			listofTrans.add(sc.nextInt());
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		
		int noofTarget=sc.nextInt();
		
		for(int i=0;i<noofTarget;i++) {
			
			
			System.out.println("enter the value of the target");
			
			int targetValue=sc.nextInt();
				int targetResult =ts.calculateTarget(targetValue,listofTrans );
				if( targetResult>0){
				System.out.println("Target Achevied after " +targetResult + " Transactions");
				}
				else {
					System.out.println("Given target is not achieved");
				}
				
				System.out.println();
			}
		
		sc.close();
	}

}
