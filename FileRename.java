import java.io.*;
import java.util.*;
public class FileRename {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Narendran\\Desktop\\S_P_Narendran.txt");
		File renameFile=new File("C:\\Users\\Narendran\\Desktop\\SPN.txt");
		file.renameTo(renameFile);
	}

}
