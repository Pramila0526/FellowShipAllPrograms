import java.util.Scanner;

public class MergeLinkedList {

	static Scanner sc = new Scanner(System.in);

	public static int IntegerInput() {
		return sc.nextInt();
	}

	public Node head;
	class Node {
		int data;
		Node next;

		Node(int data) {

			this.data = data;
			next = null;
		}
	}

	public int size() {
		int size = 0;
		if (head == null) {
			return size;
		}
		Node temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public Node display() {
		if (head == null) {
			System.out.println("no elements to display");
		}
		Node temp = head;
		while (temp != null) {

			System.out.print(temp.data + "---->");
			temp = temp.next;

		}
		System.out.print("null");
		System.out.println();

		return head;
	}

	public int insert() {

		Node newnode = new Node(IntegerInput());
		Node temp = head;
		if (head == null) {
			head = newnode;
			return newnode.data;
		}

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newnode;

		return newnode.data;

	}

	public void limitInsert() {
		System.out.println("No of Elements");
		int size = IntegerInput();
		System.out.println("Enter the Elements");
		while (size > 0) {
			insert(); // no need of creating object to call the methods of the same class
			size--;
		}
	}

	public static void main(String[] args) 
	{
		MergeLinkedList ml1 = new MergeLinkedList();
		ml1.limitInsert();
		System.out.println("Eements are:");
		ml1.display();

		MergeLinkedList ml2 = new MergeLinkedList();
		ml2.limitInsert();
		System.out.println("Elements are:");
		ml2.display();

		
		Node result = null;
		Node temp1 = ml1.head;
		Node temp2 = ml2.head;
		while (temp1 != null && temp2 != null) 
		{
			ml1.head.next=temp1.next;
			ml2.head.next=temp2.next;
			
			temp1.next=ml1.head.next;


		}
		temp1 = temp1.next.next;
		temp2 = temp2.next.next;

		System.out.println(result);
	}
}
/*
Node temp, temp1;
Node first = ml1.node1;
Node  second = ml2.node2;
 
 while(ml1.node1 != null && ml2.node2 != null) 
 {
   temp = ml1.node1.next;
   ml1.node1.next = ml2.node2;
   ml1.node1 = temp;
   
   temp1 = ml2.node2.next;
   ml2.node2.next = temp1;
   ml2.node2 = temp1;
 }
 
 second = ml2.node2;

 ml1.display();*/