package cG;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;


import java.util.*;

public class FileHandling  {
	public static void main(String[] args) throws IOException {
		
		Scanner sc= new Scanner(System.in);
		FileWriter Writer= new FileWriter("file1.txt");
		String f1=sc.nextLine();
		Writer.write(f1);
//		Writer.close();
		FileWriter Writer2= new FileWriter("file2.txt");
		 String f2=sc.nextLine();
		Writer2.write(f2);
		Writer2.close();
		String f1s="";
		Scanner Reader = new Scanner(f1);
        while (Reader.hasNextLine()) {
            f1s = Reader.nextLine();
            System.out.println(f1s);
        }
        Reader.close();
        int val1=f1s.hashCode();
        String f2s="";
        Scanner Reader2 = new Scanner(f2);
        while (Reader2.hasNextLine()) {
             f2s = Reader2.nextLine();
            System.out.println(f2s);
        }
        int val2= Integer.parseInt(f2s);
        Reader2.close();
		if(val1==val2) {
			System.out.println("Hash value given in the \"File2.txt\" matches with calculated hash value of string given in \"File1.txt\".");
		}
		else
		{
			System.out.println("Hash value given in the \\\"File2.txt\\\" does not matches with calculated hash value of string given in \\\"File1.txt\\\".");
		}


	}
}