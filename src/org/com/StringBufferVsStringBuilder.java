package org.com;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
   System.out.println("StringBuffer vs StringBuilder:\n" +
		              "StringBuffer is thread-safe (synchronized) and slower, \n" +
		              "while StringBuilder is not thread-safe (not synchronized) but faster.\n " +
		              "StringBuffer is preferable in multithreaded environments, \n" +
		              "whereas StringBuilder is ideal for single-threaded scenarios. \n" +
		              "Both classes share the same API, \n" +
		              "but StringBuffer is older and StringBuilder was introduced in Java 5. \n" +
		              "StringBuffer incurs a performance overhead due to synchronization,\n " +
		              "and is less commonly used in modern Java programs.\n " +
		              "StringBuilder is more frequently used when thread safety is not a concern, \n" +
		              "especially in performance-critical applications.");
		    


	}

}
