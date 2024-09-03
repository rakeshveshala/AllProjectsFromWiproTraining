package collections.queue;
import java.util.*;
public class QueueDemo {
	private Queue<String> queuedemo;
	public QueueDemo()
	{
		queuedemo=new LinkedList<>();
	}
	public void operations()
	{
		queuedemo.add("first data");
		queuedemo.offer("second data");
		queuedemo.add("Element1");
		queuedemo.add("element2");
//		System.out.println("Displaying values");
//		System.out.println(queuedemo.element());
//		System.out.println(queuedemo.peek());
//		System.out.println("Deleting data");
//		System.out.println(queuedemo.remove());
//		System.out.println(queuedemo.poll());
//		System.out.println("Value left "+queuedemo.poll());
//		queuedemo.poll();
//		queuedemo.poll();
		for(String s:queuedemo) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		QueueDemo qd=new QueueDemo();
		qd.operations();
	}
}
/*
* add()-it will give exception if you are trying
* to add more elements in fixed size queue.
*
* offer-it will not give any exception even if u try to
* add more element in fixed size queue.
* -----------------------------------------------------
*
* element and peek both can be used to display values
* but element will give exception if no element is
* there
* --------------------------------------------------
* poll and remove both can be used to remove data
* but remove will give exception if no element is there.
*/
