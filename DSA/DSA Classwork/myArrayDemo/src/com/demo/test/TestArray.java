package com.demo.test;
import java.util.stream.IntStream;

import com.demo.arrays.*;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray ob = new MyArray();
		System.out.println(ob.getCapacity());
		
		ob.add(4);
		ob.add(5);
		System.out.println(ob);
		ob.add(8,1);
		ob.add(9,1);
		System.out.println(ob);
		System.out.println("pos of 9 is " + ob.searchByValue(9));
		ob.add(3);
		ob.add(5);
		System.out.println(ob);
		ob.deleteByValue(5);
		System.out.println("After deleting 5 " + ob);
		ob.deleteByPosition(3);
		System.out.println("After deleting 3 " + ob);
		int[] arr1=ob.exchangeIndexValue();
		IntStream.of(arr1).forEach(e->System.out.println(e));
	}

}
