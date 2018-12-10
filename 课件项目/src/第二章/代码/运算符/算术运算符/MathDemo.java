package 第二章.运算符.算术运算符;

import org.junit.Test;

public class MathDemo {
	
	@Test
	public void test4() {
		/*
		 * 复合运算符与普通的算术运算符有区别吗？
		 * 1、复合运算符会进行强制类型转换
		 * 2、复合运算符采用的位运算，效率比较高
		 */
		int a=10 ,c = 0;
		//c = a+c;
		c += a;
		System.out.println("c="+c);
	}
	
	@Test
	public void test3() {
		System.out.println("----前置加加----");
		int a = 10,b = 19999999;
		for(int i=1;i<=10;i++) {
			/*
			 * 后置++：
			 * 1、这个表达式是一个赋值运算表达式
			 * 2、先取出a原来的值：10，赋给a自己
			 * 3、将a自增1，但是这个自增的值存储在一个临时变量中
			 */
			a = ++a;
		}
		System.out.println("a="+a+",b="+b);
	}
	
	@Test
	public void test2() {
		//模运算
		int a = 9,b = 4;
		int rs = a % b;
		System.out.println(a+" % "+b+" = "+rs);
		System.out.println("------浮点数的除法-------");
		double drs = (double)a%b;
		System.out.println(a+" % "+b+" = "+drs);
	}
	
	@Test
	public void test1() {
		//整数之间的除法运算
		int a = 9,b = 4;
		int rs = a / b;
		System.out.println(a+" / "+b+" = "+rs);
		System.out.println("------浮点数的除法-------");
		double drs = (double)a/b;
		System.out.println(a+" / "+b+" = "+drs);
	}
}
