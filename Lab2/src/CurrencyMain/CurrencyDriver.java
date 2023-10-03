package CurrencyMain;

import java.util.Scanner;

import CurrencyService.CurrencyServiceImpl;
import CurrencyService.MergeSortServiceImpl;

public class CurrencyDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MergeSortServiceImpl mergeImpl = new MergeSortServiceImpl();
		CurrencyServiceImpl currencyImpl = new CurrencyServiceImpl();
		System.out.println("enter the size of currency denominations");
		int sizeofList = sc.nextInt();
		int[] listofNotes = new int[sizeofList];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < sizeofList; i++) {

			listofNotes[i] = sc.nextInt();

		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeImpl.sort(listofNotes, 0, listofNotes.length - 1);
		currencyImpl.currencycal(listofNotes, amount);
		sc.close();
	}
}
