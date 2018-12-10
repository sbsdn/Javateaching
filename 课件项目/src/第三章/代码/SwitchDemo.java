package 第三章;

import java.util.Scanner;

import org.junit.Test;

public class SwitchDemo {
	Scanner input = new Scanner(System.in);
	
	@Test
	public void test1() {
		System.out.print("请输入本次比赛的名称(123)：");
		//int mingCi = input.nextInt();
		String mingCi = input.next();
		switch (mingCi) {
		
		case "1"://获取1等奖
			System.out.println("奖励夏令营1个月！");
			break;
		case "2"://获得了2等奖
			System.out.println("奖励笔记本电脑一台！");
			break;
		case "3"://获得了3等奖
			System.out.println("奖励移动一盘一个！");
			break;
		default://默认上面的case都不匹配
			System.out.println("没有进入前三名，不给于奖励！");
			break;
		}
	}
}
