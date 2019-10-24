import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Lab5 {
	public static void main(String args[]) {
		Exercise2();
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
	public static void Exercise2()	{
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
}
