import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VarExercise {
System.out.println("\n\nInside hashMapDemo ...");
private static void hashMapDemo() {
		System.out.println("\n\nInside hashMapDemo ...");
 
		var map1 = new HashMap<String, Integer>();
		map1.put("David", 29);
		map1.put("Bob", 25);
		map1.put("Emma", null);		
		System.out.println(map1);
 
		// Modifying value
		map1.put("Emma", 23);
		System.out.println(map1);	
 
		System.out.println("Contains Bob? " + map1.containsKey("Bob"));
		System.out.println("Bob's age: " + map1.get("Bob"));
 
		System.out.println("Iterating using keySet ...");
		var names = map1.keySet();
		for (var name : names) {
			System.out.println("Name: " + name + ", Age: " + map1.get(name));		
                }		
 
		System.out.println("Iterating using entrySet ...");
		var mappings = map1.entrySet();
		for (var mapping : mappings) {
			System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
		}
	
		names.remove("Emma");
		System.out.println(map1);				
 
		var userProfile = new HashMap<String, Map<String, Object>>();	
	
		var profile = new HashMap<String, Object>();
		profile.put("age", 25);
		profile.put("dept", "CS");
		profile.put("city", "New York");		
 
		userProfile.put("Bob", profile);
 
		profile = new HashMap<>();
		profile.put("age", 29);
		profile.put("dept", "CS");
		profile.put("city", "New York");
 
		userProfile.put("David", profile);		
 
		System.out.println("userProfile: " + userProfile.toString());
		
 
		var profile1 = userProfile.get("Bob");
		int age = (Integer) profile1.get("age");
		System.out.println("Age: " + age);
	}
}
