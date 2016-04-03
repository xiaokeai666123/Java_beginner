package cn.itcast_01;
/*
 * public int hashCode(): 返回该对象哈希码值
 * 
 *
 */
public class StudentTest{
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		
		Student s3 = s1;
		System.out.println(s3.hashCode());
		System.out.println("-------");
		
		Student s = new Student();
		Class c = s.getClass();
		String str = c.getName();
		System.out.println(str);  //cn.itcast_01.Student
		
		//链式编程
		String str2 = s.getClass().getName();
		System.out.println(str2);
	}
}
