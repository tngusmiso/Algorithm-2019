package Chapter01;

public class Example01_Sum {

	// 1부터 n까지의 합
	static int sum(int n){
		if (n <= 1) return 1;
		return n + sum(n - 1);
	}// 시간복잡도: O(n)

	public static void main(String[] args) {
		for (int i = 3; i <= 10; ++i)
			System.out.printf("%d %d\n", i, sum(i));
	}
}
