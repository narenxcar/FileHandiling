import java.io.File;
import java.io.IOException;
public class Create {

	public static void main(String[] args) throws IOException {
		/*// TODO Auto-generated method stub
		//File f=new File("C:\\Users\\Narendran\\Desktop\\Naren");
		//if(!f.exists())f.mkdir();
		File sub=new File("C:\\Users\\Narendran\\Desktop\\ZSGS");
		if(!sub.exists())sub.mkdir();
		File details=new File("C:\\Users\\Narendran\\Desktop\\ZSGS\\ZSGS.txt");
		if(!details.exists()) details.createNewFile();
		// System.out.println(details.getName());
		
		 //canread() canwrite()  canexecute()
		 
		
		//deleting the file
		//if(del.exists()) del.delete();*/
		 //rename the file 
		//if(del.exists()) del.renameTo(details);
		 //listing all file folder
		File del=new File("C:\\Users\\Narendran\\Desktop");
		String[] s=del.list();
		for(String s1:s)System.out.println(s1);
		//listing only files folder with directory
		//File ffl=new File("C:\\Users\\Narendran\\Desktop");
		//File[] ff=ffl.listFiles();
		//for(File f:ff) {
			//System.out.println(f);
			//* list all files
			//f.ifFile()
			 //* list all folders
			//f.isDirectory()
			 // * list extension files
			 
			
		}
		
		 // listing specific extension
		/*File extensionFiles =new File("C:\\\\Users\\\\Narendran\\Desktop\\");
		File[] listFiles=extensionFiles.listFiles();
		for(File tempFile:listFiles) {
			String fileName=tempFile.getName();
			int dotIndex=fileName.lastIndexOf(".");
			String extension =fileName.substring(dotIndex+1);
			if(extension.contentEquals("pdf")) {
				System.out.print(tempFile.getName());
				System.out.println("  Size is : "+tempFile.length());
			}*/
			//System.out.println(extension);
		}
		//file with size
		//File sizeOfFile=new File("C:\\\\Users\\\\Narendran\\\\Desktop");
	//	File[] listFiles=sizeOfFile.listFiles();
		//for(File file:listFiles) {
			//System.out.println(file.length());
		//}
		
		
		//File de=new File("C:\\Users\\Narendran\\Desktop\\Nare.jpg");
		//if(!de.exists()) de.createNewFile();
	//	System.out.println((char)de.hashCode());
	}

}
