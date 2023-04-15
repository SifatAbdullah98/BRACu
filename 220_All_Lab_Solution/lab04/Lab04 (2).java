package Lab04;

public class Lab04 {

	public static void main(String[] args) {

		System.out.println(factorial(5));
		System.out.println(fibonacci(6));
		int[] a = { 10, 20, 30, 40, 50, 60 };
		print_array(a, 0);
		System.out.println(binary(8));
		System.out.println(power_of(5, 4));
		Node linked_list = linked_list();
		System.out.println(add_all_element(linked_list));
		print_reverse(linked_list);
	}

	public static Node linked_list() {
		Node head = null;
		for (int i = 10; i > 0; i--) {
			head = new Node(i, head);
		}
		return head;
	}

	public static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void print_array(int[] a, int i) {
		if (i < a.length) {
			System.out.println(a[i]);
			print_array(a, i + 1);
		}
	}

	public static String binary(int dec) {
		if (dec == 0)
			return "";
		return binary(dec / 2) + dec % 2;
	}

	public static int power_of(int n, int m) {
		if (m == 0)
			return 1;
		return n * power_of(n, m - 1);
	}

	public static int add_all_element(Node head) {
		if (head.next == null)
			return head.element;
		return head.element + add_all_element(head.next);
	}

	public static void print_reverse(Node head) {
		if (head != null) {
			print_reverse(head.next);
			System.out.println(head.element);
		}
	}
}

class Node {
	Node next;
	int element;

	public Node(int e, Node n) {
		element = e;
		next = n;
	}
}
