
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("learn java");
        tasks.add("Learn Sql");
        tasks.add("learn React");
        tasks.addFirst("start traininng");
        tasks.addLast("last traininng");
        System.out.println(tasks);
        tasks.removeLast();
        tasks.removeLast();
        System.out.println("after removing "+tasks);


    }
    
}
