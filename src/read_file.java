

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.URL; 

public class read_file  {
	private ArrayList<String> file_content = new ArrayList<String>();
	
	public read_file() throws FileNotFoundException{
	File file =  new File("test.txt"); 
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(file); 
		  
	while (sc.hasNextLine()) {
		//System.out.println(sc.nextLine()); 
		file_content.add(sc.nextLine());
		
	}
}
	
public ArrayList<String> getdata()
{
	return file_content;
	
}

}
