package ตฺศýีย;

import org.junit.Test;

public class StringEqualsDemo {

	@Test
	public void test1() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		//System.out.println("s1 == s2?"+(s1==s2));
		System.out.println("s1==s3?"+(s1==s3));
	}
}
