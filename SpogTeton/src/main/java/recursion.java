import java.util.HashMap;

import org.testng.mustache.Value;

public class recursion {

	
	public static void main(String[] args) {
		

		HashMap<String, Object> values = new HashMap<String, Object>();
		HashMap<String, Object> values2 = new HashMap<String, Object>();
		
		values.put("1", "ajay");
		values.put("2", "rakesh");
		values.put("3", "akhil");
		values.put("4", "ram");
		values.put("5", "john");
		values.put("6", "max");
		
		values.forEach((k,v)->
		
		values2.put(k, v));
		
	System.out.println("values 2 : "+values2);
	
	}
		
	}
