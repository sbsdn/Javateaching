package ������;

import java.util.Random;
import java.util.Scanner;

public class LuckyCardNo {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		//2������һ��0~9�������
		int randomNum = new Random().nextInt(10);
		System.out.println("���ף�"+randomNum);
		//1���ӿ���̨¼���Ա����
		System.out.print("������4λ���Ļ�Ա�ţ�");
		int cardNo = input.nextInt();
		//3���ֽ⿨�Ű�λ��
		int baiWei = cardNo/100%10;
		//4���н��ж�
		if(baiWei == randomNum) {
			System.out.println("��ϲ�н���");
		}else {
			System.out.println("δ�н���");
		}
		
	}

}
