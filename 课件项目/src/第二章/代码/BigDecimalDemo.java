package �ڶ���;

import java.math.BigInteger;

public class BigDecimalDemo {
	
	public static void test1() {
		long rs = 1;
		//ѭ��1~10��ѭ��10��
		for(int i=1;i<=1000;i++) {
			rs = rs*i;
		}
		System.out.println("1~1000�Ľ׳��ǣ�"+rs);
	}

	public static void main(String[] args) {
		test1();
		System.out.println("------------------------");
		//ʹ��BigInteger���洢���������
		BigInteger b1 = new BigInteger("1");
		BigInteger b2 = null;
		for(int i=1;i<=1000;i++) {
			b2 = new BigInteger(String.valueOf(i));
			b1 = b1.multiply(b2);
		}
		System.out.println("�����ǣ�"+b1.toString().length());
		System.out.println("1~1000�Ľ׳��ǣ�"+b1.toString());
	}

}
