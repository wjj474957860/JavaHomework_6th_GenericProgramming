/*主程序的入口，可以由用户选择排序的算法
 * 以及选择排序的数据类型，然后进行对已经存在的
 * 数据进行排序，并把数据在排序前与排序后打印出来
 * 作者：吴建杰
 * 学号：20102100035
 */
package 吴建杰第六次作业;

import spy.genericity.bubble;
import java.util.Scanner;
import spy.genericity.insert;
import spy.genericity.print;
import spy.genericity.select;

/**
 *
 * @author spy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] a = {2, 5, 6, 8, 4, 7};
        Double[] b = {2.3, 5.6, 1.8, 9.4};
        Character[] c = {'c', 'b', 'e', 'a'};

        Scanner scan = new Scanner(System.in);
        System.out.print("请选择排序算法的序号:1.Bubble  2.Insert  3.Select [0为退出]:  ");
        int choice = scan.nextInt();

        while (choice != 0) {

            System.out.print("请选择数据类型的序号:1.int  2.double  3.char :  ");
            int type = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("冒泡排序前数据为：");
                    switch (type) {
                        case 1:
                            bubble<Integer> b1 = new bubble<Integer>();

                            print.print(a);
                            System.out.println();
                            b1.sort(a);
                            System.out.print("冒泡排序后数据为：");
                            print.print(a);
                            System.out.println();
                            break;
                        case 2:
                            bubble<Double> b2 = new bubble<Double>();
                            print.print(b);
                            System.out.println();
                            b2.sort(b);
                            System.out.print("冒泡排序后数据为：");
                            print.print(b);
                            System.out.println();
                            break;
                        case 3:
                            bubble<Character> b3 = new bubble<Character>();
                            print.print(c);
                            System.out.println();
                            b3.sort(c);
                            System.out.print("冒泡排序后数据为：");
                            print.print(c);
                            System.out.println();

                    }
                    break;
                case 2:
                    System.out.print("插入排序前数据为：");
                    switch (type) {
                        case 1:
                            insert<Integer> b1 = new insert<Integer>();
                            print.print(a);
                            System.out.println();
                            b1.sort(a);
                            System.out.print("插入排序后数据为：");
                            print.print(a);
                            System.out.println();
                            break;
                        case 2:
                            insert<Double> b2 = new insert<Double>();
                            print.print(b);
                            System.out.println();
                            b2.sort(b);
                            System.out.print("插入排序后数据为：");
                            print.print(b);
                            System.out.println();
                            break;
                        case 3:
                            insert<Character> b3 = new insert<Character>();
                            print.print(c);
                            System.out.println();
                            b3.sort(c);
                            System.out.print("插入排序后数据为：");
                            print.print(c);
                            System.out.println();

                    }
                    break;
                case 3:
                    System.out.print("选择排序前数据为：");
                    switch (type) {
                        case 1:
                            select<Integer> b1 = new select<Integer>();
                            print.print(a);
                            System.out.println();
                            b1.sort(a);
                            System.out.print("选择排序后数据为：");
                            print.print(a);
                            System.out.println();
                            break;
                        case 2:
                            select<Double> b2 = new select<Double>();
                            print.print(b);
                            System.out.println();
                            b2.sort(b);
                            System.out.print("选择排序后数据为：");
                            print.print(b);
                            System.out.println();
                            break;
                        case 3:
                            select<Character> b3 = new select<Character>();
                            print.print(c);
                            System.out.println();
                            b3.sort(c);
                            System.out.print("选择排序后数据为：");
                            print.print(c);
                            System.out.println();

                    }
                    break;

            }
            System.out.print("请选择排序算法的序号:1.Bubble  2.Insert  3.Select [0为退出]:  ");
            choice = scan.nextInt();

        }
    }
}
