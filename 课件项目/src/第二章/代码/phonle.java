package �ڶ���;

import java.util.Scanner;

import org.junit.Test;

public class phonle {
	@Test
	public void test(){
		int phonle;
		//������̨����һ��7λ��������
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��7λ���ĵ绰����");
		phonle =input.nextInt();
		int gewei=phonle%10;
		int shiwei=phonle/10%10;
		int baiwei=phonle/100%10;
		int qianwei=phonle/1000%10;
		int wanwei=phonle/10000%10;
		int shiWwei=phonle/100000%10;
		int baiWwei=phonle%1000000;
		System.out.println(gewei+"-"+shiWwei+"-"+baiwei+"-"+qianwei+"-"+wanwei+"-"+shiWwei+"-"+baiWwei);
		System.out.print("�齱�����");
		if (baiwei==8) {
			System.out.println("����һ�Ƚ���");
		}else if (shiWwei==8) {
			System.out.println("���˶��Ƚ���");
		}else if (wanwei==8) {
			System.out.println("�������Ƚ���");
		}else if (qianwei==8) {
			System.out.println("�����ĵȽ���");
		}else if (baiwei==8) {
			System.out.println("������Ƚ���");
		}else if (shiwei==8) {
			System.out.println("�������Ƚ���");
		}else if (gewei==8) {
			System.out.println("�����ߵȽ���");
		}else {
			System.out.println("��û�н���");
		}
	}
}
