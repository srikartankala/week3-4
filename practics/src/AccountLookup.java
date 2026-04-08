import java.util.*;

public class AccountLookup {

    static int linearSearchFirst(String[] arr, String target) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(target)) {
                System.out.println("Linear First Index: " + i);
                System.out.println("Comparisons: " + comparisons);
                return i;
            }
        }
        System.out.println("Not Found");
        return -1;
    }

    static int linearSearchLast(String[] arr, String target) {
        int comparisons = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(target)) {
                index = i;
            }
        }
        System.out.println("Linear Last Index: " + index);
        System.out.println("Comparisons: " + comparisons);
        return index;
    }

    static int binarySearch(String[] arr, String target) {
        int l = 0, r = arr.length - 1, comparisons = 0;
        while (l <= r) {
            comparisons++;
            int m = (l + r) / 2;
            if (arr[m].equals(target)) {
                System.out.println("Binary Index: " + m);
                System.out.println("Comparisons: " + comparisons);
                return m;
            } else if (arr[m].compareTo(target) < 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        System.out.println("Not Found");
        return -1;
    }

    static int countOccurrences(String[] arr, String target) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(target)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String[] logs = {"accB","accA","accB","accC"};

        linearSearchFirst(logs, "accB");
        linearSearchLast(logs, "accB");

        Arrays.sort(logs);

        binarySearch(logs, "accB");

        int count = countOccurrences(logs, "accB");
        System.out.println("Count: " + count);
    }
}