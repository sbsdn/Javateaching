package ������;

import java.util.Scanner;

import org.junit.Test;

public class WhileDemo {
	
	Scanner input = new Scanner(System.in);
	
	@Test
	public void test3() {
		//¼������
		String week = null;
		while(week == null) {
			System.out.print("���������ڼ�(1234567)��");
			week = input.next();
			switch (week) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				break;
			default://�������
				System.out.println("����������������룡");
				week = null;
				break;
			}
		}
		System.out.println("����������ǣ�"+week);
		//¼������
		
	}
	
	@Test
	public void test2() {
		/*
		 * ��ʦÿ�����źƵ�ѧϰ�����Ƿ�ϸ�������ϸ����������
		 * ��ʦ���źư��ŵ�ÿ���ѧϰ����Ϊ�������Ķ��̲ģ�ѧϰ���۲�
		 * �֣������ϻ���̣����մ��벿��
		 */
		//1�����ռ����
		System.out.print("ѧϰ�Ƿ�ϸ�(y/n)");
		String isPass = input.next();
		//2��ѭ�������жϣ�������ϸ񣺲�����"y"
		while(!"y".equalsIgnoreCase(isPass)) {
			//3������ѭ������
			System.out.println("����ѧϰ��");
			System.out.println("����ѧϰ���ۣ������ϻ���̣�");
			//4���ı�ѭ������
			System.out.print("ѧϰ�Ƿ�ϸ�(y/n)");
			isPass = input.next();
		}
		System.out.println("����ͨ���ˣ�");
	}
	
	@Test
	public void test1() {
		//�ӿ���̨����Ҫ��ӡ���Ծ������
		System.out.print("������Ҫ��ӡ���Ծ�ķ�����");
		int count = input.nextInt();
		//����ѭ������
		int i = 1;
		while(i<=count) {
			System.out.println("��ӡ��"+i+"���Ծ�.");
			//�ı�ѭ������������ӡ�ķ�����1
			i++;
		}
	}
}
