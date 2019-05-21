import java.util.*; 
public class AbstractListProgram {
	public static void main(String[] args) {
		AbstractList<String> list = new LinkedList<String>(); 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("10"); 
        list.add("20"); 
        System.out.println("AbstractList:" + list); 
	}
}
