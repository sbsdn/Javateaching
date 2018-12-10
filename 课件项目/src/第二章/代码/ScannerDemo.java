package 第二章;

import java.util.Scanner;

import org.junit.Test;

public class ScannerDemo {
	
	// 3、从控制台录入boolean
	@Test
	public void test4() {
	// 1、导包：Scanner
	// 2、创建扫描对象
	Scanner input = new Scanner(System.in);
	// 3、调用对象的录入字符串的方法：next()
	System.out.print("请输入您是否已经注册：");
	boolean isReg = input.nextBoolean();
	System.out.println("您是否注册：" + isReg);
	}

	// 3、从控制台录入浮点数
	@Test
	public void test3() {
		// 1、导包：Scanner
		// 2、创建扫描对象
		Scanner input = new Scanner(System.in);
		// 3、调用对象的录入字符串的方法：next()
		System.out.print("请输入您的成绩：");
		double score = input.nextDouble();
		System.out.println("您的分数是：" + score);
	}

	// 2、从控制台录入整数
	@Test
	public void test2() {
		// 1、导包：Scanner
		// 2、创建扫描对象
		Scanner input = new Scanner(System.in);
		// 3、调用对象的录入字符串的方法：next()
		System.out.print("请输入您的年龄：");
		int age = input.nextInt();
		System.out.println("您的年龄是：" + age);
	}

	// 1、从控制台录入字符串
	@Test
	public void test1() {
		// 1、导包：Scanner
		// 2、创建扫描对象
		Scanner input = new Scanner(System.in);
		// 3、调用对象的录入字符串的方法：next()
		System.out.print("请输入您的姓名：");
		String name = input.next();
		System.out.println("您的姓名是：" + name);
	}
}
