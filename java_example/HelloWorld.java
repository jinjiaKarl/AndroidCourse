/**
 * 
 */
package wangyashi.com;
import java.util.*;

/**
 * @author wangyashi
 *
 */
//public class HelloWorld {
//
//	/**
//	 * @param args
//	 */
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List list = new ArrayList();
//		
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("A");
//		
//		
//		System.out.println(list);
//		
//        int []age = {1,2,3,69,36,636,459};
//        show(age);
//
//		
//	}
//	
//	public static void show(int...a){//此时这里写的就是可变参数，和数组的作用一样！
//        //把数组给打印出来！
//        System.out.println(Arrays.toString(a));
//    }
//
//}



class Stu{
    //将构造方法私有化
    private Stu(){

    }
}

public class HelloWorld {
    public static void main(String[] args) {
    	//将构造方法私有化，这个类就不能再外部被new了，如果需要这个类的实例化对象，就只能在类内部提供静态方法生产这个类的对象了。

        Stu s = new Stu();
    }
}




