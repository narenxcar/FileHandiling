import java.io.*;
public class FileStream {

	public static void main(String[] args) {
		try {//Make sure using exception handling 
			//pass file directory as string
			FileOutputStream file=new FileOutputStream("C:\\Users\\Narendran\\Desktop\\write.txt",true);
			int i=65;//ASCII value that save in file 'A'
			file.write(i);//passing ASCII value to file
			String s="hello";// Basically FileInputStream not support string  
			byte[] b=s.getBytes();//Typecasting to pass string into byte array
			file.write(b);// That array address is pass to file
			file.write('A');
			file.flush();// flush method is use to push the value to file
			file.close();//Make sure close method is given else it cause data leak
			FileWriter writeFile=new FileWriter("C:\\Users\\Narendran\\Desktop\\Naren.txt",true);
				writeFile.write("Hello narendran");
				
				writeFile.flush();
				writeFile.close();
				FileWriter writeFile1=new FileWriter("C:\\Users\\Narendran\\Desktop\\Naren.txt",true);
				writeFile1.write("  Hello narendran");
				writeFile1.flush();
				
				FileReader readFile =new FileReader("C:\\Users\\Narendran\\Desktop\\Naren.txt");
				//i=0;
			//	while((i=readFile.read())!=-1){    
		      //      System.out.print((char)i); 
				//}
				BufferedWriter bufferWriter=new BufferedWriter(writeFile1);
				bufferWriter.newLine();
				bufferWriter.write("First language is tamil");
				bufferWriter.newLine();
				bufferWriter.write("Second language is english");
				bufferWriter.flush();
				bufferWriter.close();
				
			writeFile1.close();
				BufferedReader bufferReader=new BufferedReader(readFile);
				String string=bufferReader.readLine();
				while(string != null) {
					System.out.println(string);
					string=bufferReader.readLine();
				}
			
	}catch(Exception e){System.out.println(e);}  
	}

}
