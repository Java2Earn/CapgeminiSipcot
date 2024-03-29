package com.Threads;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ThreadPool2 {
public static void main(String[] args) {
	//for scheduling tasks

	ScheduledExecutorService service=	Executors.newScheduledThreadPool(1);
	//task to run after 10 second delay
	//service.schedule(new Task2(),10,TimeUnit.SECONDS);
	//task to run repeatedly for every 10 seconds
	//service.scheduleAtFixedRate(new Task2(),15,10,TimeUnit.SECONDS);
	//intial delay,long period
	//task to run repeatedly for every 10 seconds 
	//after previous task completes
	service.scheduleWithFixedDelay(new Task2(),15,10,TimeUnit.SECONDS);
	}}
class Task2 implements Runnable
{
	public void run() {
		Date date=new Date();
		System.out.println(Thread.currentThread().getName()+"  "+new SimpleDateFormat("HH:mm:ss").format(date));
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
