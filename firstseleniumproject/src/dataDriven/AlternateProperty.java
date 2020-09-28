package dataDriven;

import java.util.ArrayList;
import java.util.HashMap;

public class AlternateProperty {

	public static void main(String[] args) {
 ArrayList<String> lst= new ArrayList<String>();
 lst.add("admin");
 lst.add("manager");
 lst.add("chrome");
 System.out.println(lst.get(1));
 //we can use array list , but index gets changed when any new data has added in middle. so can get expected data
 
 HashMap<String,String> m = new HashMap<String,String>();
 m.put("un","admin");
 m.put("pw", "manager");
 m.put("browser", "chrome");
 System.out.println(m.get("pw"));
 //we can also use hashmap in ooone class and can extend in all class.
 //same map theory is used in data driven
	}

}
