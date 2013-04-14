/*这个是insert类，使用泛型，
 * 并且有一个sort方法，对泛型
 * 数据进行排序
 */
package spy.genericity;

/**
 *
 * @author spy
 */
public class insert<T> {

    public void sort(T[] a) {

        T temp;
        int j;

        for (int i = 1; i < a.length; i++) {

            temp = a[i];
            j = i - 1;

            while ((j >= 0) && (((Comparable) a[j]).compareTo(temp) > 0)) {

                a[j + 1] = a[j];
                j = j - 1;
            }

            a[j + 1] = temp;

        }
    }
}
