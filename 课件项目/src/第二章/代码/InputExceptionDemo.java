package 第二章;

import java.util.Scanner;

public class InputExceptionDemo {

	public static void main(String[] args) {
		//输入异常的处理
		Scanner input = new Scanner(System.in);
		System.out.print("请输入会员号(4位整数)：");
		int cardNo = 0;
		while(true) {
			if(input.hasNextInt()) {
				cardNo = input.nextInt();
				System.out.println("你的会员号是："+cardNo);
				//退出循环
				break;
			}else {
				input.next();
				System.out.println("你输入的会员号有误，请重新输入一个整数！");
				System.out.print("请输入会员号(4位整数)：");
			}
		}
	}

}
