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


}
