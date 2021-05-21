package com.Threadexample;

public class MultithreadDemo extends Thread {
	public void run() {
		for(int i=0;i<=4;i++)
		{
			System.out.println("1st User Thread::"+i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class Userthread2 extends Thread{
	public void run()
	{
		for(int i=10;i<=14;i++)
		{
			System.out.println("2nd User Thread::"+i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
