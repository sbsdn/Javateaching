package �ڶ���.�����.���������;

import org.junit.Test;

public class MathDemo {
	
	@Test
	public void test4() {
		/*
		 * �������������ͨ�������������������
		 * 1����������������ǿ������ת��
		 * 2��������������õ�λ���㣬Ч�ʱȽϸ�
		 */
		int a=10 ,c = 0;
		//c = a+c;
		c += a;
		System.out.println("c="+c);
	}
	
	@Test
	public void test3() {
		System.out.println("----ǰ�üӼ�----");
		int a = 10,b = 19999999;
		for(int i=1;i<=10;i++) {
			/*
			 * ����++��
			 * 1��������ʽ��һ����ֵ������ʽ
			 * 2����ȡ��aԭ����ֵ��10������a�Լ�
			 * 3����a����1���������������ֵ�洢��һ����ʱ������
			 */
			a = ++a;
		}
		System.out.println("a="+a+",b="+b);
	}
	
	@Test
	public void test2() {
		//ģ����
		int a = 9,b = 4;
		int rs = a % b;
		System.out.println(a+" % "+b+" = "+rs);
		System.out.println("------�������ĳ���-------");
		double drs = (double)a%b;
		System.out.println(a+" % "+b+" = "+drs);
	}
	
	@Test
	public void test1() {
		//����֮��ĳ�������
		int a = 9,b = 4;
		int rs = a / b;
		System.out.println(a+" / "+b+" = "+rs);
		System.out.println("------�������ĳ���-------");
		double drs = (double)a/b;
		System.out.println(a+" / "+b+" = "+drs);
	}
}
