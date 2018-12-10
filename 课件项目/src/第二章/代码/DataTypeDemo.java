package 第二章;

public class DataTypeDemo {
	
	public static void test3() {
		char a1 = '郑';
		char a2 = '真';
		char a3 = '欣';
		System.out.println(a1+a2+a3+"的分值是："+(a1+a2+a3));
	}
	
	public static void test2() {
		int a;
		short b = 20;
		//a = b;
		//b = (short)a;
		//System.out.println("a="+a);
		char c = '男';
		a = c;
		System.out.println("a="+a);
		System.out.println("============26个小写字母的值=========");
		for(int i=97;i<97+26;i++) {
			System.out.print((char)i+"  ");
		}
		System.out.println();
		System.out.println("============26个大写字母的值=========");
		for(int i=65;i<65+26;i++) {
			System.out.print((char)i+"  ");
		}
	}

	/*
	 * 课外作业： 面试题：请编写实现1~1000的阶乘 解题思路： 1、使用字符串拼接 2、使用 BigDecimal类
	 */
	public static void test1() {
		// 演示数据类型的范围
		System.out.println("byte的范围：" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short的范围：" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("int的范围：" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("long的按位：" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);

		System.out.println("float的按位：" + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("double的按位：" + Double.MIN_VALUE + "~" + Double.MAX_VALUE);
		System.out.println("char的按位：" + Character.MIN_VALUE + "~" + Character.MAX_VALUE);
	}

	
	public static void main(String[] args) {
		test1();
		//test2();
		//test3();
	}

}
