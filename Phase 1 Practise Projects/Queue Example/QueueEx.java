import java.util.LinkedList;
import java.util.Queue;

public class QueueEx

{
	public static void main(String[] args)
{
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Mumbai");
		locationsQueue.add("Pune");
		locationsQueue.add("Banglore");
		locationsQueue.add("Chennai");
		locationsQueue.add("Delhi");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());

            }

}