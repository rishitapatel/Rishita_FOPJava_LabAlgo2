package CurrencyService;

public class MergeSortServiceImpl {

	public void merge(int[] listofNotes, int left, int mid, int right) {
		int size1 = mid - left + 1;
		int size2 = right - mid;

		int leftArray[] = new int[size1];
		int rightArray[] = new int[size2];

		for (int i = 0; i < size1; ++i)
			leftArray[i] = listofNotes[left + i];
		for (int j = 0; j < size2; ++j)
			rightArray[j] = listofNotes[mid + 1 + j];

		int i = 0, j = 0;

		int k = left;
		while (i < size1 && j < size2) {

			if (leftArray[i] >= rightArray[j]) {
				listofNotes[k] = leftArray[i];
				i++;
			} else {
				listofNotes[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < size1) {
			listofNotes[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < size2) {
			listofNotes[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sort(int[] notes, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			merge(notes, left, mid, right);
		}
	}
}
