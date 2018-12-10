package 第二章.运算符.算术运算符;

import java.util.Scanner;

import org.junit.Test;

public class CardNoDemo {
	
	@Test
	public void test1() {
		Scanner input = new Scanner(System.in);
		//1、从控制台录入4位整数的会员卡号
		System.out.print("请输入4位的会员卡号：");
		int cardNo = input.nextInt();
		//2、输出
		System.out.println("会员卡号是："+cardNo);
		//3、分解会员卡号的各个位数: 8394
		//A、分解出个位数
		int geWei = cardNo%10;
		//B、分解出十位
		int shiWei = cardNo/10%10;
		//C、分解出百位
		int baiWei = cardNo/100%10;
		//D、分解出千位
		int qianWei = cardNo/1000;
		System.out.println("千位数："+qianWei+",百位数："+baiWei+",十位数："+shiWei+",个位数："+geWei);
		System.out.println("会员卡号 "+cardNo+" 的各位数之和为："+(geWei+baiWei+shiWei+qianWei));
	}

}
