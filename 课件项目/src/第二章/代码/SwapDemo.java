package 第二章;

import java.util.Scanner;

public class SwapDemo {

	public static void main(String[] args) {
		//从控制台录入两个整数，交换后输出
		Scanner input = new Scanner(System.in);
		//从控制台接收两个整数
		System.out.print("请输入第一个数：");
		int num1 = input.nextInt();
		System.out.print("请输入第二个数：");
		int num2 = input.nextInt();
		System.out.println("====交换之前两个数====");
		System.out.println("num1="+num1+"，num2="+num2);
		//交换两个变量的值，需要借助于第三个相同类型的变量
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("====交换之前两个数====");
		System.out.println("num1="+num1+"，num2="+num2);
	}

}
