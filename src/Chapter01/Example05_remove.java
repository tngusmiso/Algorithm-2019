package Chapter01;

public class Example05_remove {

	static void print(int[] a) {
		for (int i : a)
			System.out.printf("%d ", i);
	}

	
	// 배열 a의 index위치의 값을 지우고, 그 뒤의 값들은 한칸씩 앞으로 당김
	// 맨 뒤의 요소는 0으로 채움
	// 시간 복잡도 : O(n)
	static void remove(int[] a, int index) {
		for(int i = index; i<a.length-1; i++)
			a[i] = a[i+1];
			
		a[a.length-1] = 0;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = i;
		remove(a, 5);
		print(a);
	}
}
