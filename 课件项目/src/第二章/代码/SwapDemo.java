package �ڶ���;

import java.util.Scanner;

public class SwapDemo {

	public static void main(String[] args) {
		//�ӿ���̨¼���������������������
		Scanner input = new Scanner(System.in);
		//�ӿ���̨������������
		System.out.print("�������һ������");
		int num1 = input.nextInt();
		System.out.print("������ڶ�������");
		int num2 = input.nextInt();
		System.out.println("====����֮ǰ������====");
		System.out.println("num1="+num1+"��num2="+num2);
		//��������������ֵ����Ҫ�����ڵ�������ͬ���͵ı���
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("====����֮ǰ������====");
		System.out.println("num1="+num1+"��num2="+num2);
	}

}
