package com.chillyfacts.com;

import java.io.PrintWriter;

public class My_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input_file="C:\\Users\\Leah Adongo\\Downloads\\20200120_162149-1.jpg";
		 String output_file="C:\\Users\\Leah Adongo\\Downloads\\bcert";
		 String tesseract_install_path="C:\\Program Files (x86)\\Tesseract-OCR\\tesseract.exe";
		 String[] command =
		    {
		        "cmd",
		    };
		    Process p;
		 try {
		 p = Runtime.getRuntime().exec(command);
		        new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
		        new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
		        PrintWriter stdin = new PrintWriter(p.getOutputStream());
		        stdin.println("\""+tesseract_install_path+"\" \""+input_file+"\" \""+output_file+"\" -l eng");
		        stdin.close();
		        p.waitFor();
		        System.out.println();
		        System.out.println();
		        System.out.println();
		        System.out.println();
		        System.out.println(Read_File.read_a_file(output_file+".txt"));
		    } catch (Exception e) {
		 e.printStackTrace();
		    }
	}

}
