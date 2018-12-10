package 第二章.运算符.关系运算符;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		//从控制台接收两位同学的成绩，比较他们的成绩的高低
		Scanner input = new Scanner(System.in);
		System.out.print("请数第一位同学的成绩：");
		double score1 = input.nextDouble();
		System.out.print("请数第二位同学的成绩：");
		double score2 = input.nextDouble();
		
		//比较成绩的高低
		boolean rs = score1 > score2;
		System.out.println("第一个同学的成绩高于第二个同学的成绩吗？"+rs);
	}

}
