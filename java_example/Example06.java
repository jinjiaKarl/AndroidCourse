//�ӿڼ���ʵ��

package wangyashi.com;

interface Iinterface 				// ����һ���ӿ�
{
	int i = 10; 					// ����ı���Ϊfianal���ͣ�public static final��
	void method(); 					// �����ӿڷ������������з�����{} public abstract��
}


public class Example06 implements Iinterface{
	public void method() 			// �ӿڵķ����ڴ˱��뱻��д��ע��������η�Ϊpublic
	{	
		System.out.println("�ӿ�ʵ�ֳɹ�������");
	}

	public static void main(String[] args) {
		Example06 prog06 = new Example06();
		// prog06.i=10; 			//�����޸ģ��ֵ��Ϊfinal����
		prog06.method();
	}
}
