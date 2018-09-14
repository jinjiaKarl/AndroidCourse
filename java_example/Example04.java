//类的访问修饰符

package wangyashi.com;

class program1 {
	public int a; 				// 公用成员
	protected int b; 			// 保护成员，自身、子类及同一个包中类可以访问
	int c; 						// 友好成员 default，同一包中的类可以访问
	private int d; 				// 私有成员，只能被自己访问和修改

	public void method1() {
		a = 1; 					// 内部访问公用成员，正确
		b = 1; 					// 内部访问保护成员，正确
		c = 1; 					// 内部访问友好成员，正确
		d = 1; 					// 内部访问私有成员，正确
		System.out.println("a=" + a + ",b=" + b + ",c=" + c + ",d=" + d);
	}
}

class program2 {
	public void method2() {
		program1 prog1 = new program1();
		prog1.a = 2;			
		prog1.b=2;			
		prog1.c = 2; 			//正确，在同一个程序集里都可以访问
		// prog1.d = 2; 		//错误，只能在它的类的内部访问
		System.out.println("另一个类中访问公有成员a=" + prog1.a + ",友好成员c=" + prog1.c);
	}
}

class program3 extends program1 {
	public void method3() {
		b = 4; 					// 正确，保护成员可以在它的继承类里访问
		System.out.println("子类可以访问受保护成员b=" + b);
	}
}


class Example04 {
	public static void main(String[] args) {
		program1 prog1 = new program1();
		prog1.method1();
		program2 prog2 = new program2();
		prog2.method2();
		program3 prog3 = new program3();
		prog3.method3();
	}
}
