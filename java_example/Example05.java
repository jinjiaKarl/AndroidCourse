//抽象类及其实现

package wangyashi.com;

abstract class personClass 				// 抽象类
{
	public String sex;					// 变量。

	public abstract void method(); 		// 抽象方法。

	public void say(){           		// 普通方法
		System.out.println("hello,world");
	}
}

//继承抽象类的类，要求抽象类中的抽象方法要被实例化 

class man extends personClass 			// 以抽象类为模块的类
{
	public void method()				// 抽象方法的实例化
	{
		System.out.println("继承抽象类的方法被实现化了");
	}
}

public class Example05 {
	public static void main(String[] args) {
		man boys = new man();			// 产生一个对象
		boys.sex = "male";				// 给对象一个初值
		boys.say();
		System.out.println(boys.sex);
		boys.method();					// 调用man类中的方法

		personClass girl = new man();
		girl.sex = "girl";
		System.out.println(girl.sex);
	}

}
