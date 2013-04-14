/*这个是select类，使用泛型，
 * 并且有一个sort方法，对泛型
 * 数据进行排序
 */
package spy.genericity;

/**
 *
 * @author spy
 */
public class select<T> {

    public void sort(T[] a) {
        T temp;
        int k;
        int j;
        for (int i = 0; i < a.length - 1; i++) {

            k = i;

            for (j = i + 1; j < a.length; j++) {
                if (((Comparable) a[j]).compareTo(a[k]) < 0) {
                    k = j;
                }

            }

            if (k != i) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}
