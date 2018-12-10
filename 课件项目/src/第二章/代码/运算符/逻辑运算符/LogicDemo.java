package 第二章.运算符.逻辑运算符;

import org.junit.Test;

public class LogicDemo {
	
	@Test
	public void test2() {
		//短路逻辑与运算：当前仅当 && 运算符两边的表达式都为true的时候这个表达式为true
		int a = 10, b = 10;
		if(a++>10 && b++>10) {
			System.out.println("满足条件了，你入选了！");
		}else {
			System.out.println("对不起，先天条件差了那么一点点，继续努力吧！");
		}
		System.out.println("a="+a+",b="+b);
	}
	
	@Test
	public void test1() {
		//逻辑与运算：当前仅当 & 运算符两边的表达式都为true的时候这个表达式为true
		int a = 10, b = 10;
		if(a++>10 & b++>10) {
			System.out.println("满足条件了，你入选了！");
		}else {
			System.out.println("对不起，先天条件差了那么一点点，继续努力吧！");
		}
		System.out.println("a="+a+",b="+b);
	}
}
