
class Node {
	Node next;
	int data;
}

class List {

	Node first, second;

	public void mergeTwoListAlternatively(Node node1, Node node2) {

		Node a, b;
		first = node1;
		second = node2;

		while (node1 != null && node2 != null) {
			a = node1.next;
			node1.next = node2;
			node1 = a;

			b = node2.next;
			node2.next = a;
			node2 = b;
		}
		second = node2;
	}

	public Node newNode(int key) {
		Node a = new Node();
		a.data = key;
		a.next = null;

		return a;
	}

	public Node insert(int key, Node node) {

		if (node == null)
			return newNode(key);
		else
			node.next = insert(key, node.next);

		return node;
	}

	public void display(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + "-->");
		display(node.next);

	}

}

public class Merging {
	public static void main(String[] args) {
		Node head1 = null;
		List a = new List();

		head1 = a.insert(12, head1);
		head1 = a.insert(99, head1);
		head1 = a.insert(8, head1);
		head1 = a.insert(39, head1);

		Node head2 = null;
		head2 = a.insert(5, head2);
		/*
		 * head2 = a.insert(70, head2); head2 = a.insert(10, head2); head2 =
		 * a.insert(52, head2); head2 = a.insert(53, head2); head2 = a.insert(58,
		 * head2);
		 */

		System.out.println("Elements of First List");
		a.display(head1);
		System.out.println();
		System.out.println("Elements of Second List");
		a.display(head2);
		System.out.println();

		a.mergeTwoListAlternatively(head1, head2);
		System.out.println("Merged List");
		a.display(a.first);
		a.display(a.second);
	}
}