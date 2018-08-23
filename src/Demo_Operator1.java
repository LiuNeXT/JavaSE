

public class Demo_Operator1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println( a < b & b > c);  //逻辑与 & 并且and 遇false则false
        System.out.println( a < b | b > c);  //逻辑或 或or 遇true则true
        System.out.println( a < b ^ b > c );  //逻辑异或 ^ 两边相同为false,两边不同为true

        System.out.println(!true);  //逻辑非！
        System.out.println(!!true);
    }
}
