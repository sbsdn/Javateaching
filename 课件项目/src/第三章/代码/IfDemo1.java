package 第三章;

import java.util.Scanner;

import org.junit.Test;

public class IfDemo1 {
	//全局变量
	Scanner input = new Scanner(System.in);
	
	@Test
	//5、嵌套的if选择结构
	public void test5() {
		System.out.print("请输入赛跑成绩：");
		double time = input.nextDouble();
		//如果成绩进入10秒，则获得决赛资格
		if(time<10) {
			//录入性别，根据性别选择参加的角色组别
			System.out.print("请输入性别：");
			String sex = input.next();
			if(sex.equals("男")) {
				System.out.println("恭喜，进入男子组决赛！");
			}else {
				System.out.println("恭喜，进入女子组决赛！");
			}
		}else {
			System.out.println("对不起，没有进入决赛！");
		}
	}
	
	@Test
	//4、成绩测评
	public void test4() {
		System.out.print("请输入张浩的Java的成绩：");
		int java = input.nextInt();
		//90及以上：优秀
		//80~90之间：优良
		//70~80之间：普通
		//60~70之间：及格
		//60以下：差
		if(java>=90) {
			System.out.println("成绩：优秀");
		}else if(java>=80) {
			System.out.println("成绩：优良");
		}else if(java>=70) {
			System.out.println("成绩：普通");
		}else if(java>=60) {
			System.out.println("成绩：及格");
		}else {
			System.out.println("成绩：差");
		}
	}
	
	@Test
	//3、if-else选择结构
	public void test3() {
		//奖励条件：java>90，否则，罚编写代码
		System.out.print("请输入张浩的Java的成绩：");
		int java = input.nextInt();
		if (java>90) {
			System.out.println("老师说，成绩优秀，奖励张浩一部IphoneX!");
		} else {
			System.out.println("成绩不够优秀，罚编写代码10遍！");
		}
	}
	
	@Test
	//2、复杂条件的if选择结构
	public void test2() {
		//奖励条件：1、java>90 && music>80  2、java==100 && music>70
		System.out.print("请输入张浩的Java的成绩：");
		int java = input.nextInt();
		System.out.print("请输入张浩的音乐的成绩：");
		int music = input.nextInt();
		if((java>90 && music>80)  || (java==100 && music>70)) {
			System.out.println("老师说，成绩优秀，奖励张浩一部IphoneX!");
		}
	}
	
	@Test
	//1、简单条件的if选择结构
	public void test1() {
		//如果成绩大于90，老师奖励一个iphoneX
		System.out.print("请输入张浩的Java的成绩：");
		int score = input.nextInt();
		if(score > 90) {
			System.out.println("老师说，成绩优秀，奖励张浩一部IphoneX!");
		}
	}
	
}
