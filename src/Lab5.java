import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Lab5 {
	public static void main(String args[]) {
		Exercise5212();
		Exercise5223();
		Exercise533();
		Exercise544();
	}
	
	public static void PrintCollection(Collection<Data> c)
	{
		for (Iterator<Data> iter = c.iterator(); iter.hasNext();)
		{
			Data x = (Data)iter.next();
			x.Print();
		}
		System.out.println();
	}
	public static void Exercise5212()	{
		System.out.println("Exercise 2:");
		LinkedList<Data> array = new LinkedList<Data>();
		Data fred = new Data("Fred",21);
		Data jo = new Data("Jo",43);
		Data zoe = new Data("Zoe",37);
		Data harry = new Data("Harry", 78);
		array.add(fred);
		array.add(jo);
		array.add(zoe);
		array.add(2,harry);
		PrintCollection(array);
	}
	public static void Exercise5223() {
		System.out.println("\nExercise 3: part 1");
		ArrayList<Data> arrayA = new ArrayList<Data>();
		ArrayList<Data> arrayB = new ArrayList<Data>();
		ArrayList<Data> arrayC = new ArrayList<Data>();
		ArrayList<Data> arrayD = new ArrayList<Data>();
		Data fred = new Data("Fred",21);
		Data jo = new Data("Jo",43);
		Data zoe = new Data("Zoe",37);
		arrayA.add(fred);
		arrayA.add(jo);
		arrayA.add(zoe);
		arrayC.add(fred);
		arrayC.add(jo);
		arrayC.add(zoe);
		PrintCollection(arrayA);
		System.out.println();
		arrayB = arrayA;
		PrintCollection(arrayB);
		System.out.println();
		arrayA.remove(1); //array indexing starts at 0 not one hence why value 2 at position 1 is deleted 
		PrintCollection(arrayB); //arrayB points towards arrayA and thus when something is removed from arrayA arrayB updates
		System.out.println("\nExercise 3: part 2");
		PrintCollection(arrayC);
		System.out.println();
		arrayD = (ArrayList<Data>)arrayC.clone(); //arrayD is a complete clone and is now independent of arrayC and how its manipulated
		arrayC.remove(1);
		PrintCollection(arrayC);
		System.out.println();	
		PrintCollection(arrayD);
		System.out.println();
	}
	public static void Exercise533() {
		System.out.println("\nExercise 3: Stacks");
		Data fred = new Data("Fred",21);
		Data jo = new Data("Jo",43);
		Data zoe = new Data("Zoe",37);
		Stack<Data> stack = new Stack<Data>();
		stack.push(fred);
		stack.push(jo);
		stack.push(zoe);
		PrintCollection(stack);
		while(stack.isEmpty() == false)
		{
			stack.pop().Print(); //removes items from stack in reverse order as its a LIFO structure
		}
		System.out.println("\nSize of Stack " + stack.size());

	}
	public static void Exercise544() {
		System.out.println("\nExercise 4: Queues");
		Data fred = new Data("Fred",21);
		Data jo = new Data("Jo",43);
		Data zoe = new Data("Zoe",37);
		ArrayBlockingQueue<Data> q = new ArrayBlockingQueue<Data>(10);
		q.add(fred);
		q.add(jo);
		q.add(zoe);
		PrintCollection(q);
		while(q.isEmpty() == false)
		{
			q.poll().Print();//removes items from queue in  order as its a FIFO structure
		}	
		System.out.println("\nSize of Queue " + q.size()+ "\n");
		for(int i=0;i<20;++i) //20 causes an error as the defined size of the queue is 10 (0-9) which is why we use less than and not <=
		{
			q.offer(new Data("Test:"+String.valueOf(i),i)); // using offer will not throw an illegalStateException but instead return false when in fails to add an element in a size restricted queue
		}
		PrintCollection(q);


	}
}
