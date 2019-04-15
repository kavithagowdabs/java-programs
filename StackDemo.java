class Stack
{
	int stackArr[];
	int stackSize;
	int tos = -1;
	
	Stack(int stackSize){
		this.stackSize  = stackSize;
		stackArr  = new int[stackSize];		
	}
	public void push(int data){
		stackArr[++tos] = data;
		
	}
	public int pop(){
		return stackArr[tos--];
		
	}
}
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(3);
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}

}
