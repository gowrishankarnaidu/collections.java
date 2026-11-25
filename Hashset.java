
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> courses=new HashSet<>();
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
