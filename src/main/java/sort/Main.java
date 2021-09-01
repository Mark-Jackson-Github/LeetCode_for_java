package sort;


/**
 * @author : mark
 * @Date : 2021/8/26 上午8:55
 * 排序算法的主方法。
 */
public class Main {

    public static void main(String[] args) {
        //未排序前的数组
        int[] arr = {2,4,1,8,3,9,7,6,5};
        Comparable[] Unarr = {2,4,1,8,3,9,7,6,5};

        //方法调用
        //BubbleSort bubbleSort = new BubbleSort();
        //SelectionSort selectionSort = new SelectionSort();
        //QuickSort quickSort = new QuickSort();
        InsertSort insertSort = new InsertSort();

        //方法实现
        //冒泡排序
        //int[] sortArr = bubbleSort.bubbleSort(arr);
        //快速排序
        //int[] sortArr = quickSort.quick(arr,0,arr.length-1);
        //选择排序
        //int[] sortArr = selectionSort.selection(arr);
        //插入排序
        Comparable[] sortarr = insertSort.insertSort(Unarr);

        //输出排序验证
        /*for (int i = 0; i < sortArr.length; i++) {
            System.out.print(arr[i]);
        }*/

        for (int i = 0; i < sortarr.length; i++) {
            System.out.printf(sortarr[i].toString());
        }

    }
}
