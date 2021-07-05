package datastructureDone;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
	//Done
	/*
	 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
	 * Use For Each loop and while loop with Iterator to retrieve data.
	 *
	 */
	// Add Data
	public static void main(String[] args) {
		Queue<String> vname = new LinkedList<>();
		vname.add("Mohammed");
		vname.add("Belayet");
		vname.add("Hossain");
		vname.add("Miru");

		for(String vn:vname){
			System.out.println(vn);
		}
		System.out.println(vname.peek()+"  Peek value from the Queue");
		for(String vn:vname){
			System.out.println(vn);
		}
		System.out.println(vname.remove()+"  Remove value from the Queue");
		for(String vn:vname){
			System.out.println(vn);
		}
		System.out.println(vname.poll()+"  Poll value from the Queue");

		System.out.println("\n** Retrieve Data useing for each loop ** ");
		for(String vn:vname){
			System.out.println(vn);
		}

		System.out.println("\n** Retrieve Data using Iterator while loop  ** ");
		Iterator itr=vname.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}


