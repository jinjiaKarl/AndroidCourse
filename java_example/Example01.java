//��Ļ������

package wangyashi.com;

// һ��Դ�ļ���ֻ����һ��public��
class Person {
	public int age;				//���������ֶ�age����Ա����
	private String name;    	//����˽���ֶ�name,��ʱnameΪ�������,����ͨ�����з������з��� 
    
	public String getName() { 
      return name; 
    } 
    
    public void setName(String name) {   // �˴���name�Ǿֲ�����
    	this.name = name; 
    } 
    
    public void eat()      					//�����޲�����eat���� 
    { 
    	System.out.println("Person can eat"); 
    }
    
    public void eat(String s)  				//�����������eat����,ʵ�ַ������� 
    { 
    	System.out.println("Person can eat"+s); 
    }
    
    public Person()      					//�����޲ι��캯��,ע���޷���ֵ����,��������ͬ�� 
    { 
    	
    }
    
    public Person(int age, String name) 	//��дһ�����������캯��,ע���޷���ֵ����,��������ͬ�� 
    { 
    	this.age = age;     				//ǰһ��ageΪ������ֶ�,��thisָ��,��һ��ageΪ�����β� 
    	this.name = name;    				//ǰһ��nameΪ���������,��thisָ��,��Ϊ�ڱ����п�ֱ�ӷ���,��һ��nameΪ�����β�
    }
}

public class Example01 {
	public static void main(String[] args){
		Person person1 = new Person();  			//��������޲ι��캯��  
		person1.age = 20;               			//������Ĺ����ֶ�ֱ�Ӹ�ֵ  
		person1.setName("zhangsan");      			//����ʹ�ù����������ܸ���������Ը�ֵ  
		System.out.println("��һ������Ϣ,����:"+person1.getName()+"����:"+person1.age);  
		person1.eat();                  			//���ö�����޲η���  
		Person person2 = new Person(18, "lisi");	//��������вι��캯��  
		System.out.println("�ڶ�������Ϣ,����:" + person2.getName() + "����:" + person2.age);
		person2.eat(" ��ͷ");           				//���ö�����вη���  
	}
}
