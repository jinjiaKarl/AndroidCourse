//数组的声明和初始化
package wangyashi.com;

public class Example09 {
	public static void main(String[] args) {
		double[] myList1 = new double[10];

		double[] myList = {1.9, 2.9, 3.4, 3.5};

		// 打印所有数组元素
      	for (int i = 0; i < myList.length; i++) {
        	 System.out.println(myList[i] + " ");
      	}

    	// 打印所有数组元素
     	for (double element: myList) {
         	System.out.println(element);
     	}

	}
}