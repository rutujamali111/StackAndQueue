
public class MyStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<Integer> mystack=new MyStack();
		MyNode<Integer> myFirshNode=new MyNode<>(70);
		MyNode<Integer> mySecondhNode=new MyNode<>(30);
		MyNode<Integer> myThirdNode=new MyNode<>(56);
		mystack.push(myFirshNode);
		mystack.push(mySecondhNode);
		mystack.push(myThirdNode);
		mystack.printStack();
		INode peak=mystack.peak();
		
		while(!mystack.isEmpty())
		{
			INode pop=mystack.pop();
			
		}
		
	}

}
