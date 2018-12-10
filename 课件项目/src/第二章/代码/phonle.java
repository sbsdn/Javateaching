package 第二章;

import java.util.Scanner;

import org.junit.Test;

public class phonle {
	@Test
	public void test(){
		int phonle;
		//从输入台输入一个7位数的整数
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个7位数的电话号码");
		phonle =input.nextInt();
		int gewei=phonle%10;
		int shiwei=phonle/10%10;
		int baiwei=phonle/100%10;
		int qianwei=phonle/1000%10;
		int wanwei=phonle/10000%10;
		int shiWwei=phonle/100000%10;
		int baiWwei=phonle%1000000;
		System.out.println(gewei+"-"+shiWwei+"-"+baiwei+"-"+qianwei+"-"+wanwei+"-"+shiWwei+"-"+baiWwei);
		System.out.print("抽奖结果：");
		if (baiwei==8) {
			System.out.println("中了一等奖！");
		}else if (shiWwei==8) {
			System.out.println("中了二等奖！");
		}else if (wanwei==8) {
			System.out.println("中了三等奖！");
		}else if (qianwei==8) {
			System.out.println("中了四等奖！");
		}else if (baiwei==8) {
			System.out.println("中了五等奖！");
		}else if (shiwei==8) {
			System.out.println("中了六等奖！");
		}else if (gewei==8) {
			System.out.println("中了七等奖！");
		}else {
			System.out.println("你没中奖！");
		}
	}
}
