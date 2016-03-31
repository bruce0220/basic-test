/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.volatiletest;


/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015��9��7��
 * @version 1.0.0
 */
public class Counter {
	 
//    public static int count = 0;
    public volatile static  int count = 0;
//    public volatile static  AtomicInteger count = new AtomicInteger(0);
//    public static int count = 0;
     
 
    public  static  void inc() {
//      public synchronized static  void inc() {
 
        //�����ӳ�1���룬ʹ�ý������
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
 
        count++;
//        count.incrementAndGet();
    }
 
    public static void main(String[] args) {
 
        //ͬʱ����1000���̣߳�ȥ����i++���㣬����ʵ�ʽ��
 
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
        //����ÿ�����е�ֵ���п��ܲ�ͬ,����Ϊ1000
        System.out.println();
        System.out.println("���н��:Counter.count=" + Counter.count);
    }
}