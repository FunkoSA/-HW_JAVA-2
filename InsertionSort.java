package JAVA.HW2_Java;

public class InsertionSort {
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
            System.out.printf("%d-ая итерация сортировки:\n", i);
            printArray(arr);
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 30, 65, 3, 10, 1, 25, 34, 15, 16, 15};
        System.out.println("Исходный массив для сортировки:");
        printArray(arr);
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
        System.out.println("\nМассив, полученный поле сортировки:");
		printArray(arr);
	}
};


