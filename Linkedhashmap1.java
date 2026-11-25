
import java.util.LinkedHashMap;

public class Linkedhashmap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> Students=new LinkedHashMap<>();
        Students.put(101,"Rahul");
        Students.put(102,"priya");
        Students.put(103, "Arun");
        System.out.println(Students);
        System.out.println("Student(101)"+Students.get(101));
        Students.put(102, "senha");
        Students.remove(103);
        System.out.println("updated map"+Students);
        
    }
}
