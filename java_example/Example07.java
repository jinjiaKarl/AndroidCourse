//��������ӿڻ�ϱ��

package wangyashi.com;

interface myInterface 					// ����һ���ӿ�
{
	void method1();
}

abstract class abstractClass			// ����һ��������
{
	public abstract void method2(); 	// ��abstract
}

class shixianlei extends abstractClass implements myInterface 			// �̳г����࣬ʵ�ֽӿڡ�
{
	public String st; 					// �����Լ����ֶ�

	public void method1() 				// ʵ�ֽӿڣ�ע��������η���public
	{
		System.out.println("�ӿڷ����Ѽ�publicʵ��");
	}

	public void method2()				// ʵ�ֳ��󷽷�
	{
		System.out.println("�����෽����ʵ��");
	}

} 

public class Example07 {
	public static void main(String[] args) {
		shixianlei sxl = new shixianlei();
		sxl.st = "ʵ������ֶ�";
		System.out.println(sxl.st);
		sxl.method1();					// ʵ�ֵĽӿڷ�������
		sxl.method2();					// ʵ�ֵĳ�����ķ�������
	}
}
