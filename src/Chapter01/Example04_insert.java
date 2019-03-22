package Chapter01;

public class Example04_insert {
	
	static void print(int[] a) {
		for (int i : a)
			System.out.printf("%d ", i);
	}

	// 배열 a에 index위치에 value 값을 삽입.
	// index 뒤의 값들은 뒤로 한 칸 씩 밀고, 마지막 값은 소멸시킴 
	// 시간복잡도 : O(n)
	static void insert(int[] a, int index, int value) {
		for(int i = a.length-1; i>index; --i)
			a[i] = a[i-1];
		
		a[index] = value;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = i;
		insert(a, 5, -99);
		print(a);
	}
}
