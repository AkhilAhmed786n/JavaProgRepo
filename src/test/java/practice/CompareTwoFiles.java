package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class CompareTwoFiles {

	
	@Test
	public boolean compareTwofiles() throws Throwable {
		
		File f1=new File("./javaProgProject/Data/file1.txt");
		File f2=new File("./javaProgProject/Data/file2.txt");
		
		FileReader fr1=new FileReader(f1);
		FileReader fr2=new FileReader(f2);
		
		BufferedReader reader1=new BufferedReader(fr1);
		BufferedReader reader2=new BufferedReader(fr2);
		
		String line1=null;
		String line2=null;
		
//		int flag=1;
//		
//		while ((flag==1) && ((line1=reader1.readLine())!=null) && ((line2=reader2.readLine())!=null)) 
//		{
//			if (!line1.equalsIgnoreCase(line2)) {
//				flag=0;
//			}
//		}
//		
//		System.out.println("Flag "+flag);
		
		List<String> list1=new ArrayList<String>();
		List<String> list2=new ArrayList<String>();
		
		while ((line1=reader1.readLine())!=null) {
			list1.add(line1);
		}
		
		while ((line2=reader2.readLine())!=null) {
			list2.add(line2);
		}
		
		reader1.close();
		reader2.close();
		
		return list1.equals(list2);
		
		
	}

}
