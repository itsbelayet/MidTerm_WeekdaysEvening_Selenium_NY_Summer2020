package datastructureDone;

import java.util.*;

public class UseMap {
	//.5 Done
	/*
	 * Demonstrate how to use Map that includes storing and retrieving elements.
	 * Add List<String> into a Map. Like,
	 * Map<String, List<string>> list = new HashMap<>();
	 * Use For Each loop and while loop with Iterator to retrieve data.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */
	//Storing Elements to Map
    public static void main(String[] args) {

        MapList();

		System.out.println("\n*** Add List into a Map ***");

		ListMap();
    }

    public static void MapList() {
        Map<String, String> stMap = new HashMap<>();
        stMap.put("USA", "NY");
        stMap.put("CANADA", "ON");
        stMap.put("INDIA", "DELHI");
        stMap.put("Australia", "perth");
        stMap.put("Algeria", "Bejaia");
        stMap.put("Bangladesh", "DHAKA");
        stMap.put("Ethiopia", "Addis Ababa");

		//Retrieving Elements:
        System.out.println("\nRetrieving Value of Bangladesh: "+stMap.get("Bangladesh"));

		System.out.println("\n*** Retrieving All value using for each loop ***");
        for (String st : stMap.keySet()) {
            System.out.println(st + " : " + stMap.get(st));
        }

		System.out.println("\n*** Retrieving All value using Iterator ***");
		Iterator it=stMap.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

//		System.out.println("\n*** Retrieving All value using while Loop ***");
//		int i=0;
//		while(i<stMap.size()){
//			System.out.println(stMap.keySet()+" : "+stMap.values());
//			i=i++;
//		}
    }

    static void ListMap() {
    	List<String> bd = new ArrayList<>();
    	bd.add("Dhaka");
    	bd.add("Faridpur");
    	bd.add("Chittagong");

    	List<String> us= new ArrayList<>();
    	us.add("New York");
    	us.add("Florida");
    	us.add("Taxes");

    	List<String> uk=new ArrayList<>();
    	uk.add("London");
    	uk.add("Scotland");
    	uk.add("Manchaster");

    	Map<String, List<String>> country=new HashMap<>();
    	country.put("Bangladesh",bd);
    	country.put("USA",us);
    	country.put("Englind",uk);

		for (Map.Entry<String, List<String>> obj : country.entrySet() ) {
			System.out.println(obj.getKey()+" : "+obj.getValue());
		}
    }
}
