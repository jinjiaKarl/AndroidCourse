//��ķ������η�

package wangyashi.com;

class program1 {
	public int a; 				// ���ó�Ա
	protected int b; 			// ������Ա���������༰ͬһ����������Է���
	int c; 						// �Ѻó�Ա default��ͬһ���е�����Է���
	private int d; 				// ˽�г�Ա��ֻ�ܱ��Լ����ʺ��޸�

	public void method1() {
		a = 1; 					// �ڲ����ʹ��ó�Ա����ȷ
		b = 1; 					// �ڲ����ʱ�����Ա����ȷ
		c = 1; 					// �ڲ������Ѻó�Ա����ȷ
		d = 1; 					// �ڲ�����˽�г�Ա����ȷ
		System.out.println("a=" + a + ",b=" + b + ",c=" + c + ",d=" + d);
	}
}

class program2 {
	public void method2() {
		program1 prog1 = new program1();
		prog1.a = 2;			
		prog1.b=2;			
		prog1.c = 2; 			//��ȷ����ͬһ�������ﶼ���Է���
		// prog1.d = 2; 		//����ֻ������������ڲ�����
		System.out.println("��һ�����з��ʹ��г�Աa=" + prog1.a + ",�Ѻó�Աc=" + prog1.c);
	}
}

class program3 extends program1 {
	public void method3() {
		b = 4; 					// ��ȷ��������Ա���������ļ̳��������
		System.out.println("������Է����ܱ�����Աb=" + b);
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
