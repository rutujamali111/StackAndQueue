package queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue que=new Queue(5);
		que.queueEnqueue(1);
		que.queueEnqueue(2);
		que.queueEnqueue(3);
		que.queueEnqueue(4);
		que.queueEnqueue(5);
		que.queueDisplay();
		

	}

}
