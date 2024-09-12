package nickwhite;

public class BinarySearchTest {


     int binarySearch(int[] list, int target){
        int begin =0;
        int last = list.length-1;



        while (begin<=last){
            int mid=begin + (last - begin)/2;
            if(list[mid] == target){
                System.out.println();
                System.out.println("target is found at position = "+mid);
                return mid;
            } else if (list[mid] > target) {
                last = mid - 1;
            }else {
                begin = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        int[] a={1,4,6,8,9,5};
        BinarySearchTest bst = new BinarySearchTest();
        bst.binarySearch(a, 9);
    }
}
