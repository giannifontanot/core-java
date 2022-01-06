public class PassArrayToMethod3 {
    public static void main(String [] args) throws Exception {
        int[] myArray = {5,2,4,7,9,6,8};
        System.out.println("The smallest number is "+minimum(myArray));
    }

    public static int minimum(int[] myArray){
        int minValue =  myArray[0];

        for(int value:myArray){

            if( value<minValue){
                minValue = value;
            }
        }
        return minValue;
    }
}
