package collection;

import java.util.ArrayList;

public class RetainAllTest {

	public static void main(String[] args) {

		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();
		arr1.add(1);
		arr1.add(2);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.add(7);
		arr1.add(8);
		arr1.add(8);

		arr2.add(11);
		arr2.add(12);
		arr2.add(13);
		arr2.add(14);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);

		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		arr1.retainAll(arr2);
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);

	}

}
