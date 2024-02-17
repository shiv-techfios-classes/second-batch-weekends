import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFileWriter {

	public static void main(String[] args) {
		
		String path = "D:\\files\\git-push-create.txt";
		
		Path p = Paths.get(path);
		
		File f = new File(path);
		
		readFrom(f);

		}

	static void writeTo(File file) {
		System.out.println("//////////////////started writing");
		BufferedWriter buffWrite  = null;
		try {
			
			buffWrite =  new BufferedWriter(new FileWriter(file));
			
			buffWrite.write("Simba");
			buffWrite.newLine();
			
			buffWrite.write("taken care by Pumba");
			
		} catch (IOException e) {
	
			e.printStackTrace();
		} finally {
			
			try {
				buffWrite.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("//////////////////////////Finished writing");


	}
	
	static void readFrom(File file) {
		System.out.println("//////////////////started reading\n\n");
		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new FileReader(file));
			
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		
		String line = null;
		
		try {
			while((line =br.readLine()) != null) {
				
				System.out.println(line);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("//////////////////////Ended reading file.");
	}
}
