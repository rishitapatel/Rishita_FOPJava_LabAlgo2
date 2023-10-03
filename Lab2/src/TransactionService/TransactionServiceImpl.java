package TransactionService;

import java.util.ArrayList;

import TransactionInterface.TransactionService;

public class TransactionServiceImpl implements TransactionService {

	@Override
	public int calculateTarget(int targetValue, ArrayList<Integer> tsList) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < tsList.size(); i++) {

			sum += tsList.get(i);
			count = i + 1;
			if (sum >= targetValue) {

				break;
			}

		}
		if (targetValue > sum) {
			return 0;
		}
		return count;
	}

}
