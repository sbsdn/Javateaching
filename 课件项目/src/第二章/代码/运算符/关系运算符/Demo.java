package �ڶ���.�����.��ϵ�����;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		//�ӿ���̨������λͬѧ�ĳɼ����Ƚ����ǵĳɼ��ĸߵ�
		Scanner input = new Scanner(System.in);
		System.out.print("������һλͬѧ�ĳɼ���");
		double score1 = input.nextDouble();
		System.out.print("�����ڶ�λͬѧ�ĳɼ���");
		double score2 = input.nextDouble();
		
		//�Ƚϳɼ��ĸߵ�
		boolean rs = score1 > score2;
		System.out.println("��һ��ͬѧ�ĳɼ����ڵڶ���ͬѧ�ĳɼ���"+rs);
	}

}
