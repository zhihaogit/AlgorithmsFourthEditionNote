package codes.chapter02.section01;

/**
 * 算法 2.3 希尔排序
 * 使数组中任意间隔为 h的元素都是有序的
 */
public class algorithms2_3 extends Example {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            System.out.println("h: " + h);
            for (int i = h; i < N; i++) {
                System.out.println("i: " + i);
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    System.out.println("j: " + j);
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
            show(a);
        }
    }

    private static Comparable[] a = new Comparable[16];
    static {
        a[0] = 'S';
        a[1] = 'H';
        a[2] = 'E';
        a[3] = 'L';
        a[4] = 'L';
        a[5] = 'S';
        a[6] = 'O';
        a[7] = 'R';
        a[8] = 'T';
        a[9] = 'E';
        a[10] = 'X';
        a[11] = 'A';
        a[12] = 'M';
        a[13] = 'P';
        a[14] = 'L';
        a[15] = 'E';

        sort(a);
    }
}