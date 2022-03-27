import java.util.*;
import java.io.*;
public class Filedemo {
public static void main(String[] args) {
	//String type
	File file=new File("C:\\Users\\Narendran\\Desktop");
	String[] files=file.list();
	for(String s:files)System.out.println(s);
	File[] list=file.listFiles();
	for(File file1:list)System.out.println(file1);
	
}
}
