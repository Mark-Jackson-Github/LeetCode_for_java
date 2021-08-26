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

        //方法调用
        SelectionSort selectionSort = new SelectionSort();
        int[] sortArr = selectionSort.selection(arr);

        //输出排序验证
        System.out.printf(arr.toString());

    }
}
