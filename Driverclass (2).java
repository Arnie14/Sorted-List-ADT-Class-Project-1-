DriverClass.java:

import java.util.Iterator;

public class DriverCLass

{


public static void DispalyList(SortedList<Integer>list)

{

System.out.print("Sorted List:");

for(Iterator<Integer> iterator = list.iterator();

iterator.hasNext(); )

{

System.out.print(" "+iterator.next());

}

System.out.println("\n");

}

public static void main(String[] args)

{

SortedList<Integer> values =

new SortedList<Integer>();

values.insert(80);

values.insert(20);

values.insert(10);

DispalyList(values);

System.out.println

("Removing the value 10 from the list.");

values.remove(10);

DispalyList(values);

System.out.println

("Inserting the value 50 to the list.");

values.insert(50);

System.out.println

("Inserting the value 30 to the list.");

values.insert(30);

DispalyList(values);

System.out.println("Value at the index 2 is: " +

values.retrieve(2));

System.out.println("Value at the index 10 is: "

+ values.retrieve(10)+"\n");

System.out.println("Searching the value 50: "+

values.search(50)+"\n");

DispalyList(values);

}

}