//��̳�

package wangyashi.com;

class mother {
	public static String sex;		// ��Ա����

	public void method1()			// �����Ա����1
	{
		System.out.println("ĸ�׵ķ���1!");
	}

	public void method2() 			// �����Ա����2
	{
		System.out.println("ĸ�׵ķ���2!");
	}
} 

class boy extends mother { 			// �̳�
	public void method2() 			// ��д�����Ա����,Java�з�����Ϊ�鷽��
	{
		System.out.println("���Լ��ķ���2!");
	}
}


public class Example03 {

	public static void main(String[] args) {
		boy boys = new boy();
		boy.sex = "�к�";			// ��̬�����ļ̳�
		System.out.println("�̳ж������ֶ�sex��ֵΪ��" + boy.sex);
		boys.method1();				// ���Ը���ķ���
		boys.method2();				// �Լ���д��ķ���
	}

}
