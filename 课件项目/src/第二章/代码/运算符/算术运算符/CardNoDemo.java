package �ڶ���.�����.���������;

import java.util.Scanner;

import org.junit.Test;

public class CardNoDemo {
	
	@Test
	public void test1() {
		Scanner input = new Scanner(System.in);
		//1���ӿ���̨¼��4λ�����Ļ�Ա����
		System.out.print("������4λ�Ļ�Ա���ţ�");
		int cardNo = input.nextInt();
		//2�����
		System.out.println("��Ա�����ǣ�"+cardNo);
		//3���ֽ��Ա���ŵĸ���λ��: 8394
		//A���ֽ����λ��
		int geWei = cardNo%10;
		//B���ֽ��ʮλ
		int shiWei = cardNo/10%10;
		//C���ֽ����λ
		int baiWei = cardNo/100%10;
		//D���ֽ��ǧλ
		int qianWei = cardNo/1000;
		System.out.println("ǧλ����"+qianWei+",��λ����"+baiWei+",ʮλ����"+shiWei+",��λ����"+geWei);
		System.out.println("��Ա���� "+cardNo+" �ĸ�λ��֮��Ϊ��"+(geWei+baiWei+shiWei+qianWei));
	}

}
