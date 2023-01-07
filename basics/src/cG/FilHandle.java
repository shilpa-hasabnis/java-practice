package cG;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FilHandle {

	public static void main(String[] args)throws IOException {
		try {
			File myObj1 = new File("file4.txt");
			File myObj2 = new File("file3.txt");
			if (myObj1.createNewFile()) {
				System.out.println("File created: " + myObj1.getName());
			} else {
				System.out.println("File already exists.");
			}
			if (myObj2.createNewFile()) {
				System.out.println("File created: " + myObj2.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		try {
			FileWriter myWriter1 = new FileWriter("file1.txt");
			myWriter1.write("I like to work in Java Technology.");
			myWriter1.close();

			FileWriter myWriter2 = new FileWriter("file2.txt");
			myWriter2.write("2034315171");
			myWriter2.close();

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		try {
			File myObj1 = new File("file1.txt");
			Scanner myReader1 = new Scanner(myObj1);
			String data1 = null;
			while (myReader1.hasNextLine()) {
				data1= myReader1.nextLine();
				System.out.println(data1);
			}
			int D1= data1.hashCode();
			File myObj2 = new File("file2.txt");
			Scanner myReader2 = new Scanner(myObj2);
			String data2 = null;
			while (myReader2.hasNextLine()) {
				data2 = myReader2.nextLine();
				System.out.println(data2);
			}
			//==============================
			int D2 = Integer.parseInt(data2);
			//==============================
			if(D1 == D2)
			{
				System.out.println("Hash value given in the \"File2.txt\" matches with calculated hash value of string given in \"File1.txt\".");
			}
			else
			{
				System.out.println("Hash value given in the \\\"File2.txt\\\" does not matches with calculated hash value of string given in \\\"File1.txt\\\".");
			}

			myReader1.close();
			myReader2.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		//	    ==================================================================================


	}
}