package com.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
public static void main(String[] args) {
	//create the pool
	ExecutorService service=	Executors.newSingleThreadExecutor();
	//submit tasks for execution
	for(int i=0;i<100;i++)
	{
		service.execute(new Task());
	}
	System.out.println("Thread name :"+Thread.currentThread().getName());
}
}
class Task implements Runnable
{
	public void run() {
		System.out.println("Thread name :"+Thread.currentThread().getName());
	}
	}
