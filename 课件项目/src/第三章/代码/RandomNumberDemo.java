package ������;

import java.util.Random;

import org.junit.Test;

public class RandomNumberDemo {
	
	@Test
	//2��ʹ��java.util.Random����������α�����
	public void test2() {
		//���������������
		Random random = new Random();
		//�����������ķ������������������������
		for(int i=0;i<10000;i++) {
			int num = random.nextInt(3)+1;
			System.out.println(num);
		}	
	}

	@Test
	//1��ʹ����ѧ�������������
	public void test1() {
		//Math.random()�����һ�� ���ڵ���0 ���� С��1 �ĸ�����
		for(int i=0;i<1;i++) {
			double num = Math.random();
			System.out.println(num);
		}
		System.out.println("----����123----");
		for(int i=0;i<100;i++) {
			int num = (int)(Math.random()*3)+1;
			System.out.println(num);
		}
	}
}
