package practice.week05;

public class Q39 {

    // Test the equality of two arrays

    public static void EqualityOfTwoArrays(int[] arr1,int[] arr2) {
        boolean equalOrNot = true;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] != arr2[i]) { // we have checked same index if they are not equal means arrays are not equal
                    equalOrNot = false;
                }
            }
        } else { // else means here ==>> if they do not have the same length
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("Two Arrays are equal");
        } else {
            System.out.println("Two Arrays are not equal");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,5} ;
        int[] arr2 = {2,5,6} ;

        EqualityOfTwoArrays(arr1,arr2);
    }
}
