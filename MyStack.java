
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
	
	
}
