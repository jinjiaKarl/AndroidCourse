//静态与非静态变量及方法的使用
//静态变量在类所生成的实例中，只有一份拷贝

package wangyashi.com;

class Example02 {
	
	public int x; 					//非静态变量 
	public static int y; 			//静态变量
	 
	void method() { 				//非静态方法
		x = 1; 						//正确,非静态方法可以访问非静态成员 
		y = 1; 						//正确，非静态方法可以访问静态成员 
		System.out.println("实例方法访问：x="+x+" y="+y); 
	 }
	 
	static void smethod() {			//静态方法 
		 //x = 3; 					//错误，静态方法不能非静态成员
		y = 3; 						//正确，静态方法可以访问静态成员 
		System.out.println("静态方法访问：y="+y); 
	} 
	 
	public static void main(String[] args) {
		Example02 prog02 = new Example02();			//生成类的实例 
		prog02.method(); 							//非静态方法通过实例来调用 
		Example02.smethod(); 						//静态方法通过类名来调用 
	} 

}
