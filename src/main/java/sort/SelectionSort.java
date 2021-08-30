package sort;

/**
 * @author : mark
 * @Date : 2021/6/1 下午4:39
 * 工作原理：首先在未排序的序列中寻找最大(小)的元素，存放到排序序列的起始位置，然后，再从未排序的序列中寻找最大(小)的元素，
 * 然后放到已经排好序的序列末尾。依次类推，直到排序完成。----总结一句话就是选择最数后存放到已经拍好的数组末尾。
 */
public class SelectionSort {

    /**
     * 选择排序
     */

    public int[] selection(int[] arr) {

        int len = arr.length;
        int temp;
        for (int i = 0; i < len -1; i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < len; j++) {
                //寻找最小的数
                if (arr[i] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
        return arr;
    }
}
