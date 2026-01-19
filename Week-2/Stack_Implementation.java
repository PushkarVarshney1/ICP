package Week2;
import java.util.*;

public class Stack_Implementation {
	private int[] arr ;
	private int top;
	public  Stack_Implementation(int n) {
		arr = new int[n];
		top = -1; // index for the top
	}
	public void push(int val) {
		if(top == arr.length - 1) {
			System.out.println("Stack OverFlow");
		}
		arr[++top] = val;
	}
	
	public void pop() {
		if(top == -1)
		System.out.println("Stack is Empty");
		else {
			System.out.println(arr[top--]);
			
		}
	}
	public boolean isEmpty() {
		if(top == -1)return true;
		return false;
	}
	public void peek() {
		if(top == -1)
			System.out.println("Stack is Empty");
		else
		System.out.println(arr[top]);
	}
	public void Display() {
		
		for(int i =0 ; i<= top; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Stack_Implementation st = new Stack_Implementation(size);
		st.push(10);
		st.push(9);
		st.push(8);
		st.push(7);
		st.push(6);
		st.push(5);
		st.push(4);
		
		st.peek(); // Peek
		System.out.println(st.isEmpty()); // Is empty
		
		st.push(3);
		st.push(2);
		st.push(1);
		
		st.Display();
	}

}
