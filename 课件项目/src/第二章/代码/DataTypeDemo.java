package �ڶ���;

public class DataTypeDemo {
	
	public static void test3() {
		char a1 = '֣';
		char a2 = '��';
		char a3 = '��';
		System.out.println(a1+a2+a3+"�ķ�ֵ�ǣ�"+(a1+a2+a3));
	}
	
	public static void test2() {
		int a;
		short b = 20;
		//a = b;
		//b = (short)a;
		//System.out.println("a="+a);
		char c = '��';
		a = c;
		System.out.println("a="+a);
		System.out.println("============26��Сд��ĸ��ֵ=========");
		for(int i=97;i<97+26;i++) {
			System.out.print((char)i+"  ");
		}
		System.out.println();
		System.out.println("============26����д��ĸ��ֵ=========");
		for(int i=65;i<65+26;i++) {
			System.out.print((char)i+"  ");
		}
	}

	/*
	 * ������ҵ�� �����⣺���дʵ��1~1000�Ľ׳� ����˼·�� 1��ʹ���ַ���ƴ�� 2��ʹ�� BigDecimal��
	 */
	public static void test1() {
		// ��ʾ�������͵ķ�Χ
		System.out.println("byte�ķ�Χ��" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short�ķ�Χ��" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("int�ķ�Χ��" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("long�İ�λ��" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);

		System.out.println("float�İ�λ��" + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("double�İ�λ��" + Double.MIN_VALUE + "~" + Double.MAX_VALUE);
		System.out.println("char�İ�λ��" + Character.MIN_VALUE + "~" + Character.MAX_VALUE);
	}

	
	public static void main(String[] args) {
		test1();
		//test2();
		//test3();
	}

}
