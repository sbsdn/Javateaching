package 第二章;

import java.math.BigInteger;

public class BigDecimalDemo {
	
	public static void test1() {
		long rs = 1;
		//循环1~10，循环10次
		for(int i=1;i<=1000;i++) {
			rs = rs*i;
		}
		System.out.println("1~1000的阶乘是："+rs);
	}

	public static void main(String[] args) {
		test1();
		System.out.println("------------------------");
		//使用BigInteger来存储超大的整数
		BigInteger b1 = new BigInteger("1");
		BigInteger b2 = null;
		for(int i=1;i<=1000;i++) {
			b2 = new BigInteger(String.valueOf(i));
			b1 = b1.multiply(b2);
		}
		System.out.println("长度是："+b1.toString().length());
		System.out.println("1~1000的阶乘是："+b1.toString());
	}

}
