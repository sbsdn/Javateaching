package �ڶ���.�����.�߼������;

import org.junit.Test;

public class LogicDemo {
	
	@Test
	public void test2() {
		//��·�߼������㣺��ǰ���� && ��������ߵı��ʽ��Ϊtrue��ʱ��������ʽΪtrue
		int a = 10, b = 10;
		if(a++>10 && b++>10) {
			System.out.println("���������ˣ�����ѡ�ˣ�");
		}else {
			System.out.println("�Բ�����������������ôһ��㣬����Ŭ���ɣ�");
		}
		System.out.println("a="+a+",b="+b);
	}
	
	@Test
	public void test1() {
		//�߼������㣺��ǰ���� & ��������ߵı��ʽ��Ϊtrue��ʱ��������ʽΪtrue
		int a = 10, b = 10;
		if(a++>10 & b++>10) {
			System.out.println("���������ˣ�����ѡ�ˣ�");
		}else {
			System.out.println("�Բ�����������������ôһ��㣬����Ŭ���ɣ�");
		}
		System.out.println("a="+a+",b="+b);
	}
}
