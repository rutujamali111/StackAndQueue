public class MyLinkedList<K> {
	 INode head;
	 INode tail;

	public MyLinkedList() {
		// TODO Auto-generated constructor stub
		this.head=null;
		this.tail=null;
	}

	public void add(INode newNode)
	{
		// TODO Auto-generated method stub
		if(this.tail==null)
			this.tail=newNode;
		if(this.head==null)
			this.head=newNode;
		else
		{
			INode tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}		
		
	}
	public void append(INode myNode)
	{
		if(this.head==null)
		{
			this.head=myNode;
		}
		if(this.tail==null)
		{
			this.tail=myNode;
		}
		else
		{
			this.tail.setNext(myNode);
			this.tail=myNode;
		}
	}
	public void insert(INode myNode,INode newNode)
	{
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public void PrintMyNodes()
	{
		StringBuffer myNodes=new StringBuffer("My nodes: ");
		INode tempNode=head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
				tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	public INode pop()
	{
		INode tempNode=this.head;
		this.head=head.getNext();
		return tempNode;
	}
	public INode popLast()
	{
		INode tempNode=this.head;
		while(tempNode.getNext()!=this.tail)
		{
			tempNode=tempNode.getNext();
		}
		INode deletedNode=tempNode.getNext();
		tempNode.setNext(null);
		this.tail=tempNode;
		return deletedNode;
		
	}

	public void search(int i) {
		MyNode<Integer> Node=new MyNode<>(i);
		INode tempNode=this.head;
		int index=1;
		while(tempNode.getNext()!=null)
		{
			if(tempNode.getKey()==Node.getKey())
			{
				System.out.println("Node found at position: "+index);
				break;
			}
			tempNode=tempNode.getNext();
			index++;
		}
		if(tempNode.getNext()==null)
			System.out.println("node does not exist.");
		
	}
	public void searchInsert(INode myNode,INode newNode)
	{
		INode temp=this.head;
		while(temp.getNext()!=null)
		{
			if(temp==myNode)
			{
				insert(temp, newNode);
				break;
			}
			temp=temp.getNext();
		}
		if(temp.getNext()==null)
			append(newNode);
		
	}
	public void delete(INode myNode)
	{
		INode temp=this.head;
		INode denode;
		while(temp.getNext()!=null)
		{
			if(temp.getNext()==myNode)
			{
				denode=temp.getNext();
				temp.setNext(denode.getNext());
				break;
			}
			temp=temp.getNext();
			
		}
		
	}
	public int size()
	{
		int count=0;
		INode tempNode=this.head;
		while(tempNode.getNext()!=null)
		{
			count++;
		}
		return count;
	}
	
	

}
