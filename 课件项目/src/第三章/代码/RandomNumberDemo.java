package 第三章;

import java.util.Random;

import org.junit.Test;

public class RandomNumberDemo {
	
	@Test
	//2、使用java.util.Random工具类生成伪随机数
	public void test2() {
		//创建随机数生成器
		Random random = new Random();
		//调用生成器的方法，根据种子来生成随机数
		for(int i=0;i<10000;i++) {
			int num = random.nextInt(3)+1;
			System.out.println(num);
		}	
	}

	@Test
	//1、使用数学类来生产随机数
	public void test1() {
		//Math.random()会产生一个 大于等于0 并且 小于1 的浮点数
		for(int i=0;i<1;i++) {
			double num = Math.random();
			System.out.println(num);
		}
		System.out.println("----生成123----");
		for(int i=0;i<100;i++) {
			int num = (int)(Math.random()*3)+1;
			System.out.println(num);
		}
	}
}
