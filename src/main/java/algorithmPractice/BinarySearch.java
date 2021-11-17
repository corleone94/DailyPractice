package algorithmPractice;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,6,7};
        int target = 6;
        int index = binarySearch(arr, target);
        System.out.println("while："  + (index == -1 ? "没找到" : "index: " + index));
        int index2 = binarySearchRecursion(arr, 0, arr.length, target);
        System.out.println("递归："  + (index2 == -1 ? "没找到" : "index: " + index2));
    }

    private static int binarySearch(int[] arr, int target) {
        int middleIndex = arr.length/2;
        int arrLength;

        do {
            int middleNum = arr[middleIndex];
            if (middleNum == target) {
                return middleIndex;
            }
            if (middleNum > target) {
                middleIndex = middleIndex - middleIndex/2;
            }
            if (middleNum < target) {
                middleIndex = middleIndex + middleIndex/2;
            }
            arrLength = arr.length/2;
        } while (arrLength > 1);

        return -1;
    }

    private static int binarySearchRecursion(int[] arr, int start, int end, int target) {
        int middleIndex = (end + start)/2;
        int middleNum = arr[middleIndex];
        if (middleNum == target) {
            return middleIndex;
        }
        if (middleNum > target) {
            return binarySearchRecursion(arr, start, middleIndex, target);
        } else {
            return binarySearchRecursion(arr, middleIndex, end, target);
        }

    }

}
