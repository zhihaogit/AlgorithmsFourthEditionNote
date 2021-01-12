package codes.chapter02.section01;

/**
 * 算法 2.1 选择排序
 * selection sort
 */
public class algorithms2_1 extends Example {
    public static void sort(Comparable[] a) {
        // 将 a[]按升序排列
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // 从左到右找到较小的值，进行交换
            // 将 a[i]和 a[i+1..N]中最小的元素索引
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
                exch(a, i, min);
            }
        }
    }
}
