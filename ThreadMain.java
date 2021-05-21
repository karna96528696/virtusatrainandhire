package com.Threadexample;

public class ThreadMain {
		public static void main(String[] args)
		{
			MultithreadDemo t1=new MultithreadDemo();
			Userthread2 t2=new Userthread2();
			t1.start();
			t2.start();
		}
}
