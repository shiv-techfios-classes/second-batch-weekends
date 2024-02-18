package practice.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFilesHandling {

	public static void main(String[] args) {
		
		String filepath1 = "D:\\files\\test1.log";
		
		String filepath2 = "D:\\test1.txt";
		
		File f1 = new File(filepath1);
		
		File f2 = new File(filepath2);
		
		if(!f1.exists()) {
			try {
				
				f1.createNewFile();
				
			} catch (IOException e) {
				
				System.out.println("Path was not found");
				e.printStackTrace();
			}
		}
		
		if(!f2.exists()) {
			
			try {
				f2.createNewFile();
			} catch (IOException e) {
		
				e.printStackTrace();
			}
		}
		
		System.out.println("Finished with file creation successfully.");
		
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
			bw.write("------Beginning OF------");
			bw.write("this is the weekend session on core java.");
			bw.newLine();
			bw.newLine();
			bw.write("this is actually the 13th session of this batch");
			bw.newLine();
			bw.write("------EOF------");
			bw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		BufferedReader readFrom = null;
		
		try {
			
			readFrom = new BufferedReader(new FileReader(f2));
		
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		
		String line = "";
		try
			{
				while((line= readFrom.readLine()) !=null) {
				
					System.out.println(line);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
