public class PassArrayToMethod {

    public static void main(String[] args) {
        int[] myArray = {93, 3, 9, 2,34,33,2,6,9,1};
        minimum(myArray);

    }

    public static void minimum(int[] myArray) {
        int minValue = myArray[0];

        for (int value : myArray) {
            if (minValue > value) {
                 minValue = value;
                System.out.println("The value is :" + value);
            }
        }
    }


}
