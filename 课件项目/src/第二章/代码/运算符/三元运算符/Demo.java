package 第二章.运算符.三元运算符;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入操作结果(1、成功 0、失败):");
		int i = input.nextInt();
		
		System.out.println((i==1)?"数据添加成功！":"数据添加失败！");
		
		//添加块注释快捷键：ctrl+shift+/
		//解开块注释：ctrl+shift+\
		/*if(i == 1) {
			System.out.println("数据添加成功！");
		}else {
			System.out.println("数据添加失败！");
		}*/
	}

}
