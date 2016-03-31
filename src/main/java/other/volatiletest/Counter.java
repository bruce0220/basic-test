/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.volatiletest;


/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015年9月7日
 * @version 1.0.0
 */
public class Counter {
	 
//    public static int count = 0;
    public volatile static  int count = 0;
//    public volatile static  AtomicInteger count = new AtomicInteger(0);
//    public static int count = 0;
     
 
    public  static  void inc() {
//      public synchronized static  void inc() {
 
        //这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
 
        count++;
//        count.incrementAndGet();
    }
 
    public static void main(String[] args) {
 
        //同时启动1000个线程，去进行i++计算，看看实际结果
 
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    Counter.inc();
                    //System.out.println(" thread end");
                }
            }).start();
        }
 
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
        }
        //这里每次运行的值都有可能不同,可能为1000
        System.out.println();
        System.out.println("运行结果:Counter.count=" + Counter.count);
    }
}