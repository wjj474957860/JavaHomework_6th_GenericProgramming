/*这个是print类吗，
 * 并且有一个使用泛型的print方法，
 * 为公共使用的方法，对数据进行输出
 */
package spy.genericity;

/**
 *
 * @author spy
 */
public class print {

    public static <T> void print(T[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
