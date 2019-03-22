package Chapter01;

public class Example03_addTail {
	static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public void printAll() {
			System.out.printf("%d ", value);
			if (next != null)
				next.printAll();
		}

		// 노드의 마지막에 새로운 노드 추가 
		// 시간 복잡도 : O(n)
		public void addTail(int value) {
			if (next == null)
				next = new Node(value, null);
			else
				next.addTail(value);
		}
	}

	public static void main(String[] args) {
		Node root = new Node(0, null);
		for (int i = 1; i <= 10; ++i)
			root.addTail(i);
		root.printAll();
	}
}
