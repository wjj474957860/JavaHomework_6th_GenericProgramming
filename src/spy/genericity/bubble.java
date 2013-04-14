/*这个是bubble类，使用泛型，
 * 并且有一个sort方法，对泛型
 * 数据进行排序
 */
package spy.genericity;

//import sun.misc.Compare;
/**
 *
 * @author spy
 */
public class bubble<T> {

    public void sort(T[] a) {

        T t;

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (((Comparable) a[i]).compareTo(a[j]) > 0) {

                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}
