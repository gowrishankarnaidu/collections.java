
import java.util.TreeSet;

public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<String> courses=new TreeSet<>();
        courses.add("java");
        courses.add("python");
        courses.add("react");
        courses.add("java");

        System.out.println(courses);
        System.out.println("contian java:" + courses.contains("java"));
        courses.remove("python");
        System.out.println("After removal"+courses);
    }
    
}
