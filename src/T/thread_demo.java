package T;

public class thread_demo implements Runnable
{
     public String sName;
     Thread myThread;
     
     public thread_demo(String name)
     {
    	 this.sName = name;
     }

	@Override
	public void run() 
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Thread Name = "+ sName+" count "+i);
			try {
			Thread.sleep(1000);//wait for 1000 millisec= 1 sec
			} catch(Exception a) {
				System.out.println("Tread is interrepted");
			}
		}
	}
    
	public void start()
	{
		System.out.println("Thread Started "+sName);
		if(myThread == null)
		{
			myThread = new Thread(this,sName);// here this means class name
			myThread.start();  // after coming this code it 
			       // automatically start run method
		}	        
		//run();
		
	}
}

