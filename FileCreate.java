import java.io.*;
public class FileCreate {

	public static void main(String[] args) throws IOException {
		//create object for file class and pass directory 
		File createFolder=new File("C:\\Users\\Narendran\\Desktop\\ZSGS");
		//check there is folder or not if not create new folder as name
		if(!createFolder.exists())createFolder.mkdir();
		//check there is file existing or not if not create
		File createFile=new File("C:\\Users\\Narendran\\Desktop\\ZSGS\\ZSGS-jan.txt");
		if(!createFile.exists())createFile.createNewFile();
		//delete file using delete method
		File deleteFile=new File("C:\\Users\\Narendran\\Desktop\\ZSGS\\ZSGS-jan.txt");
		if(deleteFile.exists())deleteFile.delete();
	}

}
