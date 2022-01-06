public class StringOperations {
    public static void main(String[] args){
        String str1 = "String functions";
        String str2 = "STRING FUNCTIONS";

        System.out.println("The String operations are:");

        System.out.println(str1.charAt(3));

        System.out.println(str1.compareTo(str2));

        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println(str1.concat(str2));

        System.out.println(str1.endsWith("ons"));

        System.out.println(str1.equals(str2));

        System.out.println(str1.hashCode());

        System.out.println(str1.lastIndexOf("unc"));

        System.out.println(str1.replace("function","JAVA"));

        System.out.println(str1.startsWith("JAVA"));

        System.out.println(str2.toLowerCase());
    }
}
