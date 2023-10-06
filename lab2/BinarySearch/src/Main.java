
class BinarySearch {
    public static <T extends Comparable<T>> int binarySearch(T[]arr,T ele) {

        int low=0,high=arr.length-1;
        int mid=low+((high-low)/2);

        while(low<=high) {
            int val=ele.compareTo(arr[mid]);
            if(val==0)
                return mid;
            else if(val>0) {
                low=mid+1;
            }
            else
                high=mid-1;
            mid=low+((high-low)/2);
        }
        return -1;
    }
}

public class Main{
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"A", "B", "C", "D", "E", "F"};

        int intIndex = BinarySearch.binarySearch(intArray, 4);
        int stringIndex = BinarySearch.binarySearch(stringArray, "E");

        System.out.println("Index of 4 in intArray: " + intIndex); // Output: 3
        System.out.println("Index of 'E' in stringArray: " + stringIndex); // Output: 4

    }