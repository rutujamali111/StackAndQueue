
public class MyStack<K>
{
	
	private final MyLinkedList<K> myLinkedList;
	public MyStack()
	{
		myLinkedList=new MyLinkedList<>();
	}
	public void push(INode<K> myFirshNode)
	{
		myLinkedList.add(myFirshNode);
	}
	public void printStack() {
		// TODO Auto-generated method stub
		myLinkedList.PrintMyNodes();
		
	}
	public INode peak() {
		// TODO Auto-generated method stub
		return myLinkedList.head;
	}
	public boolean isEmpty()
	{
		if(myLinkedList.head==null)
			return true;
		else
			return false;
	}
	public INode pop() {
		// TODO Auto-generated method stub
		return myLinkedList.pop();
	}
	
	
}
