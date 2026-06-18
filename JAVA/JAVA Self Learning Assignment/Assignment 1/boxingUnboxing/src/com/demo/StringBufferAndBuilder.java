//Que 4. Implement String , StringBuffer , StringBuilder

package com.demo;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // 1. String (Immutable)
        String str = "Hello";
        str = str.concat(" World"); // creates new object
        System.out.println("String: " + str);

        // 2. StringBuffer (Mutable, Thread-safe)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // modifies same object
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        System.out.println("StringBuffer: " + sb);

        // 3. StringBuilder (Mutable, Not thread-safe, Faster)
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        sb1.insert(5, " Java");
        sb1.replace(0, 5, "Hi");
        System.out.println("StringBuilder: " + sb1);
	}

}
