package algorithmPractice;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,6,7};
        int target = 6;
        int index = binarySearch(arr, target);
        System.out.println(index == -1 ? "没找到" : "index: " + index);
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
}
