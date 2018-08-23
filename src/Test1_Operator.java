
/*
 * A:案例演示
 * 比较两个整数是否相同
 * B:案例演示
 * 获取三个整数中的最大值
 */
public class Test1_Operator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        boolean z = (x == y) ? true : false;
        System.out.println("z = " + z);

        int a = 10;
        int b = 20;
        int c = 30;
        int temp = (a > b) ? a : b;
        int max = (temp > c) ? temp : c;
        System.out.println("max = "  + max);
    }
}
