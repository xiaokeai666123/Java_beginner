package cn.itcast_02;

/*
 * 字符串特点：一旦被赋值，就不能被改变
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println("s: "+s); //helloworld
	}
}
