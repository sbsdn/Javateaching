package �ڶ���;

import java.util.Scanner;

public class InputExceptionDemo {

	public static void main(String[] args) {
		//�����쳣�Ĵ���
		Scanner input = new Scanner(System.in);
		System.out.print("�������Ա��(4λ����)��");
		int cardNo = 0;
		while(true) {
			if(input.hasNextInt()) {
				cardNo = input.nextInt();
				System.out.println("��Ļ�Ա���ǣ�"+cardNo);
				//�˳�ѭ��
				break;
			}else {
				input.next();
				System.out.println("������Ļ�Ա����������������һ��������");
				System.out.print("�������Ա��(4λ����)��");
			}
		}
	}

}
