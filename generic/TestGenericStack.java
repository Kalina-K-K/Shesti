package generic;

public class TestGenericStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
		System.out.println(stack1.peek());
		
		GenericStack<Integer> stack2 = new GenericStack<>();
		stack2.push(1); // autoboxing 1 to new Integer(1)
		stack2.push(2);
		stack2.push(3);
	}
	
//	stack1.push("Berlin");

}
