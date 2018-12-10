package 第三章;

import java.util.Random;
import java.util.Scanner;

public class LuckyCardNo {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		//2、生成一个0~9的随机数
		int randomNum = new Random().nextInt(10);
		System.out.println("作弊："+randomNum);
		//1、从控制台录入会员卡号
		System.out.print("请输入4位数的会员号：");
		int cardNo = input.nextInt();
		//3、分解卡号百位数
		int baiWei = cardNo/100%10;
		//4、中奖判断
		if(baiWei == randomNum) {
			System.out.println("恭喜中奖！");
		}else {
			System.out.println("未中奖！");
		}
		
	}

}
