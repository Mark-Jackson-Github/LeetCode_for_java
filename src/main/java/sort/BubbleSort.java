package sort;

/**
 * @author : mark
 * @Date : 2021/6/1 下午4:29
 */
public class BubbleSort {

    /**
     * 冒泡排序
     */
    public int[] bubbleSort(int[] arr) {
        int len = arr.length;
        //第一层循环保证每个元素都可以进行遍历一遍
        for (int i = 0; i < len; i++) {
            //内层循环就是为了保证每个第一层被选择的元素都和之后的元素进行比较
            for (int j = 0; j < len-1-i ; j++) {
                int temp;
                //发现相邻元素的前一个大于后一个，则进行位置交换。
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }
}
