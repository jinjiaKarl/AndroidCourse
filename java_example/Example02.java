//��̬��Ǿ�̬������������ʹ��
//��̬�������������ɵ�ʵ���У�ֻ��һ�ݿ���

package wangyashi.com;

class Example02 {
	
	public int x; 					//�Ǿ�̬���� 
	public static int y; 			//��̬����
	 
	void method() { 				//�Ǿ�̬����
		x = 1; 						//��ȷ,�Ǿ�̬�������Է��ʷǾ�̬��Ա 
		y = 1; 						//��ȷ���Ǿ�̬�������Է��ʾ�̬��Ա 
		System.out.println("ʵ���������ʣ�x="+x+" y="+y); 
	 }
	 
	static void smethod() {			//��̬���� 
		 //x = 3; 					//���󣬾�̬�������ܷǾ�̬��Ա
		y = 3; 						//��ȷ����̬�������Է��ʾ�̬��Ա 
		System.out.println("��̬�������ʣ�y="+y); 
	} 
	 
	public static void main(String[] args) {
		Example02 prog02 = new Example02();			//�������ʵ�� 
		prog02.method(); 							//�Ǿ�̬����ͨ��ʵ�������� 
		Example02.smethod(); 						//��̬����ͨ������������ 
	} 

}
