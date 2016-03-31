/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.getresouceTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015年9月18日
 * @version 1.0.0
 */
public class GetResTest {

	/**
	 * 
	 */
	public GetResTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 GetResTest self = new GetResTest();
//		 self.test1();
//		 self.test2();
//		 self.test3();
		 self.test4();
	}
	
	public void test1() {
		try {
			InputStream is = this.getClass().getResourceAsStream("/aa/in.txt");
			File outfile = new File("d:\\test\\out.txt");
			OutputStream out = new FileOutputStream(outfile);
			byte[] bs = new byte[10];//1024
			int readCount = 0;
			while ((readCount = is.read(bs)) != -1) {
				out.write(bs, 0, readCount);
				System.out.println("success");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void test2() {
		try {
			InputStream is = this.getClass().getResourceAsStream("/aa/in.txt");
			BufferedInputStream bis = new BufferedInputStream(is);
			File outfile = new File("d:\\test\\out.txt");
			OutputStream out = new FileOutputStream(outfile);
			BufferedOutputStream bos = new BufferedOutputStream(out);
			byte[] bs = new byte[10];//1024
			int readCount = 0;
			while ((readCount = bis.read(bs)) != -1) {
				bos.write(bs, 0, readCount);
				System.out.println("success");
			}
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void test3() {
		try {
			File f = new File("../in.txt"); //System.getProperty("user.dir")
			f.getAbsoluteFile(); f.getAbsolutePath(); f.getCanonicalPath(); f.getName();f.getParent();f.getPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void test4() {
		try {
			File file1 = new File(".\\test1.txt");
	        File file2 = new File("D:\\workspace\\test\\test1.txt");
	        System.out.println("-----默认相对路径：取得路径不同------");
	        System.out.println(file1.getPath());
	        System.out.println(file1.getAbsolutePath());
	        System.out.println(file1.getCanonicalPath());
	        System.out.println("-----默认绝对路径:取得路径相同------");
	        System.out.println(file2.getPath());
	        System.out.println(file2.getAbsolutePath());
	        System.out.println(file2.getCanonicalPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
