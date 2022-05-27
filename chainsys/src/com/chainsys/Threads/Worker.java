package com.chainsys.Threads;

public class Worker {
		public int amount = 0;
		public void run()
		{
			callme();
		}

		public synchronized void callme() {
			long currentthreadid = Thread.currentThread().getId();
			amount=0;
			System.out.println("Inside Callme thread ID " + currentthreadid);
			//Local variable
			try {
				for (int i = 0; i < 5; i++) {
					amount += i;
					System.out.println(currentthreadid + "  " + amount);
					Thread.sleep(1000);
				}
			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}