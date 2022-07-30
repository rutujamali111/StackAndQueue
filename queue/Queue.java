package queue;

public class Queue {
	private  int front, rear, capacity;
	private  int queue[];

	Queue(int size) {
	front = rear = 0;
	capacity = size;
	queue = new int[capacity];
	}
	 void queueEnqueue(int item) {
	// check if the queue is full
		if (capacity == rear)
		{
			System.out.printf("\nQueue is full\n");
			return;
		}
		else {
			queue[rear] = item;
			rear++;
		}
		return;
	}
	
	 void queueDisplay()
		{
		int i;
		if (front == rear) 
		{
			System.out.printf("Queue is Empty\n");
			return;
		}
		for (i = front; i < rear; i++) 
		{
			System.out.printf(" %d , ", queue[i]);
		}
		return;
	}
	 
	  void queueDequeue() {
			// check if queue is empty
			if (front == rear)
			{
				System.out.printf("\nQueue is empty\n");
				return;
			}
			else
			{
				for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
	
	
			// set queue[rear] to 0
			if (rear < capacity)
			{
				queue[rear] = 0;
			}
			// decrement rear
			rear--;
			}
			return;
		}
	   void queueFront()
	  {
		  if (front == rear) 
		  {
			  System.out.printf("Queue is Empty\n");
			  return;
		  }
			  System.out.printf("\nFront Element of the queue: %d", queue[front]);
			  return;
	  }


}
