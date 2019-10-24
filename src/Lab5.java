import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Lab5 {
	public static void main(String args[]) {
		Exercise5212();
		Exercise5223();
		Exercise533();
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
	}
}
