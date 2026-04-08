import java.util.*;

public class RiskThresholdLookup {

    static int linearSearch(int[] arr, int target) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == target) {
                System.out.println("Linear Found at index: " + i);
                System.out.println("Comparisons: " + comparisons);
                return i;
            }
        }
        System.out.println("Linear Not Found");
        System.out.println("Comparisons: " + comparisons);
        return -1;
    }

    static int findFloor(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int floor = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] <= target) {
                floor = arr[m];
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return floor;
    }

    static int findCeil(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int ceil = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] >= target) {
                ceil = arr[m];
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ceil;
    }

    static int findInsertionPoint(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    public static void main(String[] args) {

        int[] risks = {10, 25, 50, 100};
        int target = 30;

        linearSearch(risks, target);

        int floor = findFloor(risks, target);
        int ceil = findCeil(risks, target);
        int pos = findInsertionPoint(risks, target);

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceil);
        System.out.println("Insertion Index: " + pos);
    }
}