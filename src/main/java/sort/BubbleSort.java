package sort;

/**
 * @author : mark
 * @Date : 2021/6/1 下午4:29
 */
public class BubbleSort {

    /**
     * 冒泡排序
     */
    public static void main(String[] args) {

        int[] arr = {2,3,1,6,7,4,10,9,8};
        int[] sort = bubbleSort(arr);
        System.out.printf(sort.toString());

    }

    private static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {        // 相邻元素两两对比
                    int temp = arr[j+1];        // 元素交换
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
