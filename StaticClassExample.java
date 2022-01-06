public class StaticClassExample {

    static int total = 0;
    StaticClassExample(int value) {
        total =+ value;
    }


    public static void main(String[] args) throws Exception {
        // update the value of the static variable
        StaticClassExample sce1 = new StaticClassExample(1);
        System.out.println("StaticClassExample.total: " +StaticClassExample.total);
        StaticClassExample sce2 = new StaticClassExample(2);
        System.out.println("StaticClassExample.total: " +StaticClassExample.total);
        StaticClassExample sce3= new StaticClassExample(3);
        System.out.println("StaticClassExample.total: " +StaticClassExample.total);
        // print the value of the static variable
        System.out.println("StaticClassExample.total: " +StaticClassExample.total);
    }
}
