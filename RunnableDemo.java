package com.Threadexample;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=9;i++)
		{
			System.out.print(i+" ");
		}
	}
	
}
