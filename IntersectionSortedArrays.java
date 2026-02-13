import java.util.*;

public class IntersectionSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 5, 6};

        ArrayList<Integer> result = intersection(arr1, arr2);

        System.out.println("Intersection:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;
            } 
            else if (arr1[i] > arr2[j]) {
                j++;
            } 
            else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        return list;
    }
}
