import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();        

        // 3 Objekte der Klasse Student werden erzeugt
        Student st1 = new Student("Topf", "Hans", 12345);
        Student st2 = new Student("Teller", "Hannes", 12323);
        
        // Student st3 = new Student("Besteck", "Maxi", 12345); 
        Student st3 = new Student("Besteck", "Maxi", 12346);  

        // Einfuegen der Objekte in die HashMap
        // Matrikelnummer wird als Key eingetragen 
        map.put((st1.getMatrikelnummer()), st1);
        map.put((st2.getMatrikelnummer()), st2);    
        map.put((st3.getMatrikelnummer()), st3);          
        
        // Anzeige der Map mit Iterator
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        
        while(iterator.hasNext()) {
           Map.Entry entry = (Map.Entry)iterator.next();
           System.out.print("key is: "+ entry.getKey() + " & Value is: ");
           System.out.println(entry.getValue());
        }
        
        // Objekt zugreifen ueber den Key        
        Student student = map.get(12345);
        System.out.println("Student at index 12345 is: "+ student.name);               

        // Student st1 wird durch st3 ersetzt, da die 
        // Matrikelnummer schon als Schluessel vergeben ist
        map.put(12345, st3);
        
        student = map.get(12345);
        System.out.println("Student at index 12345 is: "+ student.name);  
        
        //Eintraege entfernen
        map.remove(12345);
        System.out.println("Map key and values after removal:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
         }        
        
        // anderes Beispiel
        System.out.println();
        System.out.println("2. Beispiel");        
        
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("One", 1);
        map2.put("Two", 2);
        map2.put("Three", 3);
        System.out.println(map2);     
        
        TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("2", "Punkt zwei");
		tm.put("1", "Punkt eins");
		tm.put("3", "Punkt drei");

		for (String elem : tm.keySet())
			System.out.println(elem + " - " + tm.get(elem));       
        
	}

}
