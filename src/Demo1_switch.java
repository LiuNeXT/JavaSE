
public class Demo1_switch {
    public static void main(String[] args) {
        String name = "Jack";
        String gender = "Man";
        //String gender = "Lady";
        switch (gender) {
            case "Man":
                System.out.println(name + "是一位" + gender + "喜欢吃饭睡觉打dota");
                break;
            case "Lady":
                System.out.println(name + "是一位" + gender + "喜欢逛街购物美容");
                break;
            default:
                System.out.println(name + "是一位" + gender + "打雌性激素维持美貌容颜");
                break;
        }
    }
}
