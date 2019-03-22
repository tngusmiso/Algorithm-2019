package Chapter01;

public class Example02_printAll {
	
	static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		// 현재 연결되어 있는 모든 노드의 value값 출력 
		// 시간 복잡도 : O(n)
		public void printAll() {
			System.out.printf("%d ", value);
			if( next != null) next.printAll();
		}
	}

	public static void main(String[] args) {
		Node root = null;
		for (int i = 1; i <= 10; ++i)
			root = new Node(i, root);
		root.printAll();
	}
}
