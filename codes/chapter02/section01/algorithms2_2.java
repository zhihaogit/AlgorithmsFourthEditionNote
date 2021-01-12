package codes.chapter02.section01;

/**
 * 算法 2.2 插入排序
 * insertion sort
 */
public class algorithms2_2 extends Example {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            // 从右向左找到较小的值，进行交换
            // 将 a[i]插入到 a[i - 1]、a[i - 2]、a[i - 3]...之中
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
