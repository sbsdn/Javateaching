package �ڶ���;

import java.util.Scanner;

import org.junit.Test;

public class ScannerDemo {
	
	// 3���ӿ���̨¼��boolean
	@Test
	public void test4() {
	// 1��������Scanner
	// 2������ɨ�����
	Scanner input = new Scanner(System.in);
	// 3�����ö����¼���ַ����ķ�����next()
	System.out.print("���������Ƿ��Ѿ�ע�᣺");
	boolean isReg = input.nextBoolean();
	System.out.println("���Ƿ�ע�᣺" + isReg);
	}

	// 3���ӿ���̨¼�븡����
	@Test
	public void test3() {
		// 1��������Scanner
		// 2������ɨ�����
		Scanner input = new Scanner(System.in);
		// 3�����ö����¼���ַ����ķ�����next()
		System.out.print("���������ĳɼ���");
		double score = input.nextDouble();
		System.out.println("���ķ����ǣ�" + score);
	}

	// 2���ӿ���̨¼������
	@Test
	public void test2() {
		// 1��������Scanner
		// 2������ɨ�����
		Scanner input = new Scanner(System.in);
		// 3�����ö����¼���ַ����ķ�����next()
		System.out.print("�������������䣺");
		int age = input.nextInt();
		System.out.println("���������ǣ�" + age);
	}

	// 1���ӿ���̨¼���ַ���
	@Test
	public void test1() {
		// 1��������Scanner
		// 2������ɨ�����
		Scanner input = new Scanner(System.in);
		// 3�����ö����¼���ַ����ķ�����next()
		System.out.print("����������������");
		String name = input.next();
		System.out.println("���������ǣ�" + name);
	}
}
