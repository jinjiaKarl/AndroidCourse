//�ӿڻص����̬��
// ��̬��̬�ԣ�������д�ͺ�������  ��̬��̬�ԣ��ӿڳ�����
package wangyashi.com;

interface Eat 							// ����һ���ӿ�
{
	void eat();
}

class Cow implements Eat 				// ʵ�ֽӿڡ�
{
	public String name = "ţ����"; 		// �����Լ����ֶ�

	public void eat() 					// ʵ�ֽӿڣ�ע��������η���public
	{
		System.out.println("ĸţ�������");
	}
}

class Hen implements Eat 				// ʵ�ֽӿڡ�
{
	public String name = "������"; 		// �����Լ����ֶ�

	public void eat() 					// ʵ�ֽӿڣ�ע��������η���public
	{
		System.out.println("ĸ������С��");
	}
}

public class Example08 {
	public static void main(String[] args) {
		// ��̬��ʵ��,animalEat����ͬ���󣬱��ֳ���ͬ����Ϊ
		Eat animalEat = new Cow(); 		// ע����������ʵ���ķ������˴�����ĸţ
		animalEat.eat(); 				// ����ĸţ�ķ���
		// System.out.println(animalEat.name); 			//���ܷ���
		animalEat = new Hen(); 			// ע����������ʵ���ķ������˴�����ĸ��
		animalEat.eat(); 				// ����ĸ���ķ���
		// System.out.println(animalEat.name);			//���ܷ���
	}
}

