package ������;

import java.util.Scanner;

import org.junit.Test;

public class SwitchDemo {
	Scanner input = new Scanner(System.in);
	
	@Test
	public void test1() {
		System.out.print("�����뱾�α���������(123)��");
		//int mingCi = input.nextInt();
		String mingCi = input.next();
		switch (mingCi) {
		
		case "1"://��ȡ1�Ƚ�
			System.out.println("��������Ӫ1���£�");
			break;
		case "2"://�����2�Ƚ�
			System.out.println("�����ʼǱ�����һ̨��");
			break;
		case "3"://�����3�Ƚ�
			System.out.println("�����ƶ�һ��һ����");
			break;
		default://Ĭ�������case����ƥ��
			System.out.println("û�н���ǰ�����������ڽ�����");
			break;
		}
	}
}
