package Chapter01;

import java.util.Random;

public class Example06_sort {
	
	static void print(int[] a) {
		for (int i : a)
			System.out.printf("%d ", i);
	}

	// 시간복잡도 : O(l)
	static void swap(int[] a, int i, int j) {
		int t = a[j];
		a[j] = a[i];
		a[i] = t;
	}

	// 시간복잡도 : O(n^2)
	static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; ++i)
			for (int j = i + 1; j < a.length; ++j)
				if (a[i] > a[j])
					swap(a, i, j);
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(20);
		sort(a);
		print(a);
	}
}