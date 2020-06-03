package T;

public class entry {

	public static void main(String[] args) {
		thread_demo thread1= new thread_demo("Thread one");
		thread_demo thread2= new thread_demo("Thread two");
		
		thread1.start();// start the thread and come out
		thread2.start();
		//what is multi threading?
		//what is thread?
		// how do you implement it?
		//what is deadlock?
		//Deadlock -->concept called --> Lock
		// Dead lock is a condition where 2 or more threads are blocked forever waiting for each other
		// solution is you have to implement thread properly -->Developer
		
		//String   --> Immutable -->thread safe,slow
		String s1 = "ABC";
		String s2 = new String("ABC");
		
		//StringBuffer --> Mutable,Thread safe, slow but faster than string--> inside thread
		StringBuffer sb1 = new StringBuffer("ABC");
		
		//sb1.--> lots of options used by developer
		//StringBuilder--> Mutable, not thread safe, Fast-->outside thread
		StringBuilder sb2 = new StringBuilder("ABC");
	}

}
