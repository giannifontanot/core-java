public class StringHeapTest {
    public static void main(String[] args) {
        String str1 = "uno";
        String str2 = new String("uno");
        String str3 = "uno";


        //Compare same value
        System.out.println(str1.equals(str2));
        //Compare same address
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
