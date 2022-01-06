public class PassArrayToMethod2 {
    public static void main(String[] args) throws Exception {
        int[] myArray = {6, 24, 5, 4, 99};
        int smallest = minimum(myArray);
        System.out.println("The smallest number is " + smallest);
    }

    public static int minimum(int[] myArray) {
        int smallest = 0;
        int minVal = myArray[0];
        for (int value : myArray) {
            if (minVal > value) {
                minVal = value;
            }
            smallest = minVal;
        }
        return smallest;
    }
}
