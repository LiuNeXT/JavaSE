

public class Demo6_ifif {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b) {
            if (a > c) {
                System.out.println(a + "是最大値");
            } else {
                System.out.println(c + "是最大値");
            }
        }else{
                if (b > c) {
                    System.out.println(b + "是最大值");
                } else {
                    System.out.println(c + "是最大値");
                }
            }
        }
    }