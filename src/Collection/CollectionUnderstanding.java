package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

//System.out.println(arrayoflist.size());

//for (Object object : arrayoflist) {
//	//System.out.println(arrayoflist.indexOf(object));
//	System.out.println(object);
//}
/*
 * ArrayList arrayoflist = new ArrayList();
		arrayoflist.add("Sunny");
		arrayoflist.add(2);
		arrayoflist.add(3);
		arrayoflist.add(4);
		arrayoflist.add(4, 8);
		arrayoflist.remove(0);
		arrayoflist.set(0, "Shivender");
		arrayoflist.set(2, "Sunny");
		arrayoflist.add(4, 9);
		Iterator<Object> iterator = arrayoflist.iterator();
		while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//		for (int i = 0; i < arrayoflist.size(); i++) {
//			System.out.println(arrayoflist.get(i));
//		}

 */
public class CollectionUnderstanding {

	public static void main(String[] args) {

		// ArrayList set = new ArrayList();
		SortedSet set = new TreeSet();
		//TreeSet set = new TreeSet();
		
		set.add(06);
		set.add(01);
		set.add(05);
		set.add(09);
		Iterator<Object> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
