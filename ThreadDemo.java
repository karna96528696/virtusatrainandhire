package com.Threadexample;

public class ThreadDemo extends Thread{
	public void run() {
		for(int i=0;i<=4;i++)
		{
			System.out.println(i+" ");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//System.out.println(getName());
		
	}

}
class ThreadMain
{
	public static void main(String[] args)
	{
		ThreadDemo t=new ThreadDemo();
		
		System.out.println(t.getName());
		t.setName("Threaddemo");
		System.out.println(t.getName());
		t.setPriority(1);
		System.out.println(t.getPriority());
		t.start();
		
	}
}
