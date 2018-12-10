package 第四章;

import java.util.Scanner;

import org.junit.Test;

public class WhileDemo {
	
	Scanner input = new Scanner(System.in);
	
	@Test
	public void test3() {
		//录入星期
		String week = null;
		while(week == null) {
			System.out.print("请输入星期几(1234567)：");
			week = input.next();
			switch (week) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				break;
			default://输入错误
				System.out.println("输入错误，请重新输入！");
				week = null;
				break;
			}
		}
		System.out.println("输入的星期是："+week);
		//录入气温
		
	}
	
	@Test
	public void test2() {
		/*
		 * 老师每天检查张浩的学习任务是否合格，如果不合格，则继续进行
		 * 老师给张浩安排的每天的学习任务为：上午阅读教材，学习理论部
		 * 分，下午上机编程，掌握代码部分
		 */
		//1、接收检查结果
		System.out.print("学习是否合格？(y/n)");
		String isPass = input.next();
		//2、循环条件判断，如果不合格：不等于"y"
		while(!"y".equalsIgnoreCase(isPass)) {
			//3、进行循环操作
			System.out.println("继续学习：");
			System.out.println("上午学习理论，下午上机编程！");
			//4、改变循环条件
			System.out.print("学习是否合格？(y/n)");
			isPass = input.next();
		}
		System.out.println("终于通过了！");
	}
	
	@Test
	public void test1() {
		//从控制台接收要打印的试卷的数量
		System.out.print("请输入要打印的试卷的分数：");
		int count = input.nextInt();
		//定义循环变量
		int i = 1;
		while(i<=count) {
			System.out.println("打印第"+i+"份试卷.");
			//改变循环变量：将打印的份数加1
			i++;
		}
	}
}
