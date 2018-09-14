//接口及其实现

package wangyashi.com;

interface Iinterface 				// 定义一个接口
{
	int i = 10; 					// 定义的变量为fianal类型；public static final；
	void method(); 					// 声明接口方法，但不能有方法体{} public abstract；
}


public class Example06 implements Iinterface{
	public void method() 			// 接口的方法在此必须被重写，注意访问修饰符为public
	{	
		System.out.println("接口实现成功！！！");
	}

	public static void main(String[] args) {
		Example06 prog06 = new Example06();
		// prog06.i=10; 			//不能修改ｉ的值，为final类型
		prog06.method();
	}
}
