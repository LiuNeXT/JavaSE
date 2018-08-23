
import java.util.Scanner;

//需求：键盘录入一个成绩，判断并输出成绩的等级。

public class Test1_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩范围在1到100之间");
		int x = sc.nextInt();

		if (x >= 90 && x <= 100) {
			System.out.println("优");
		}else if (x >= 80 && x <= 89 ) {
			System.out.println("良");
		}else if (x >= 70 && x <= 79 ) {
			System.out.println("中");
		}else if (x >= 60 && x <= 69 ) {
			System.out.println("及");
		}else if (x >= 0 && x <= 59 ) {
			System.out.println("差");
		}else {
			System.out.println("成绩录入错误");
		}
    }
}
