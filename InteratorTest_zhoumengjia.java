package ibm.com.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class InteratorTest_zhoumengjia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new ArrayList();
		collection.add("a");
		collection.add("b");
		collection.add("c");
		//������һ�������Ͳ��ܸı�
//		Iterator<String > iterator= collection.iterator();
		
		System.out.println("���Ե���������Collection��Ԫ�ط���һ");
		for(Iterator iterator =collection.iterator();iterator.hasNext();) {
		System.out.println(iterator.next());	
		}
		
		
		System.out.println("---------------");
		System.out.println("���Ե�����Collection��Ԫ�ط�����");
		Iterator iterator2=collection.iterator();
		
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}

		
		
//		while (iterator.hasNext()) {
//			String string=(String) iterator.next();
//			System.out.println(string);			
//		}
		
//		System.out.println("---------------");
//		collection.add("d");
//		Iterator<String > iterator1= collection.iterator();	
//		while (iterator1.hasNext()) {
//			String string=(String) iterator1.next();
//			System.out.println(string);	
//		}

	}

}
