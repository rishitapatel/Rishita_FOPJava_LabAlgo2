package CurrencyService;

import CurrencyInterface.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {

	@Override
	public void currencycal(int[] listofNotes, int amount) {
		int[] noteCounter = new int[listofNotes.length];

		try {
			for (int i = 0; i < listofNotes.length; i++) {
				if (amount >= listofNotes[i]) {
					noteCounter[i] = amount / listofNotes[i]; // 10, 0, 1, 0
					amount = amount - noteCounter[i] * listofNotes[i]; // 0

					if (amount == 0)
						break;
				}
			}
			if (amount > 0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < listofNotes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(listofNotes[i] + ":" + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	}
}
