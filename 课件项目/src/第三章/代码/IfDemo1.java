package ������;

import java.util.Scanner;

import org.junit.Test;

public class IfDemo1 {
	//ȫ�ֱ���
	Scanner input = new Scanner(System.in);
	
	@Test
	//5��Ƕ�׵�ifѡ��ṹ
	public void test5() {
		System.out.print("���������ܳɼ���");
		double time = input.nextDouble();
		//����ɼ�����10�룬���þ����ʸ�
		if(time<10) {
			//¼���Ա𣬸����Ա�ѡ��μӵĽ�ɫ���
			System.out.print("�������Ա�");
			String sex = input.next();
			if(sex.equals("��")) {
				System.out.println("��ϲ�����������������");
			}else {
				System.out.println("��ϲ������Ů���������");
			}
		}else {
			System.out.println("�Բ���û�н��������");
		}
	}
	
	@Test
	//4���ɼ�����
	public void test4() {
		System.out.print("�������źƵ�Java�ĳɼ���");
		int java = input.nextInt();
		//90�����ϣ�����
		//80~90֮�䣺����
		//70~80֮�䣺��ͨ
		//60~70֮�䣺����
		//60���£���
		if(java>=90) {
			System.out.println("�ɼ�������");
		}else if(java>=80) {
			System.out.println("�ɼ�������");
		}else if(java>=70) {
			System.out.println("�ɼ�����ͨ");
		}else if(java>=60) {
			System.out.println("�ɼ�������");
		}else {
			System.out.println("�ɼ�����");
		}
	}
	
	@Test
	//3��if-elseѡ��ṹ
	public void test3() {
		//����������java>90�����򣬷���д����
		System.out.print("�������źƵ�Java�ĳɼ���");
		int java = input.nextInt();
		if (java>90) {
			System.out.println("��ʦ˵���ɼ����㣬�����ź�һ��IphoneX!");
		} else {
			System.out.println("�ɼ��������㣬����д����10�飡");
		}
	}
	
	@Test
	//2������������ifѡ��ṹ
	public void test2() {
		//����������1��java>90 && music>80  2��java==100 && music>70
		System.out.print("�������źƵ�Java�ĳɼ���");
		int java = input.nextInt();
		System.out.print("�������źƵ����ֵĳɼ���");
		int music = input.nextInt();
		if((java>90 && music>80)  || (java==100 && music>70)) {
			System.out.println("��ʦ˵���ɼ����㣬�����ź�һ��IphoneX!");
		}
	}
	
	@Test
	//1����������ifѡ��ṹ
	public void test1() {
		//����ɼ�����90����ʦ����һ��iphoneX
		System.out.print("�������źƵ�Java�ĳɼ���");
		int score = input.nextInt();
		if(score > 90) {
			System.out.println("��ʦ˵���ɼ����㣬�����ź�һ��IphoneX!");
		}
	}
	
}
