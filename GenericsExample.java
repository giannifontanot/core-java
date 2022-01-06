import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String []args ){

        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
//        stringList.add(2);

        System.out.println(stringList.get(0));

    }
}
