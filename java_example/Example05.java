//�����༰��ʵ��

package wangyashi.com;

abstract class personClass 				// ������
{
	public String sex;					// ������

	public abstract void method(); 		// ���󷽷���

	public void say(){           		// ��ͨ����
		System.out.println("hello,world");
	}
}

//�̳г�������࣬Ҫ��������еĳ��󷽷�Ҫ��ʵ���� 

class man extends personClass 			// �Գ�����Ϊģ�����
{
	public void method()				// ���󷽷���ʵ����
	{
		System.out.println("�̳г�����ķ�����ʵ�ֻ���");
	}
}

public class Example05 {
	public static void main(String[] args) {
		man boys = new man();			// ����һ������
		boys.sex = "male";				// ������һ����ֵ
		boys.say();
		System.out.println(boys.sex);
		boys.method();					// ����man���еķ���

		personClass girl = new man();
		girl.sex = "girl";
		System.out.println(girl.sex);
	}

}
