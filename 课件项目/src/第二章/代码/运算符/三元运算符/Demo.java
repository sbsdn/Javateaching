package �ڶ���.�����.��Ԫ�����;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������������(1���ɹ� 0��ʧ��):");
		int i = input.nextInt();
		
		System.out.println((i==1)?"������ӳɹ���":"�������ʧ�ܣ�");
		
		//��ӿ�ע�Ϳ�ݼ���ctrl+shift+/
		//�⿪��ע�ͣ�ctrl+shift+\
		/*if(i == 1) {
			System.out.println("������ӳɹ���");
		}else {
			System.out.println("�������ʧ�ܣ�");
		}*/
	}

}
