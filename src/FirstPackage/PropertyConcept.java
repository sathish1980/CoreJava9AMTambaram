package FirstPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/*
 * Created By :
 */

public class PropertyConcept {
	
	String filepath ="C:\\Users\\sathishkumar\\eclipse-workspace\\CoreJava9AMTambaram\\Env\\";
	String filename ="config.properties";
	
	/*
	 * 
	 */
	public void readProperty() throws IOException {
		// File F = new File(filepath+filename);
		FileInputStream  FS = new FileInputStream(filepath+filename);
		Properties P = new Properties();
		P.load(FS);
		String name = P.getProperty("name");
		System.out.println(name);
		String age1 = P.getProperty("age");
		String age2 = P.getProperty("age2");
		System.out.println(P.getProperty("age"));
		System.out.println(P.getProperty("Language"));
		P.setProperty("1","English");
		String lan = P.getProperty("1");
		System.out.println(lan);
		System.out.println(Integer.parseInt(age1)+Integer.parseInt(age2));
		FS.close(); // This is used to close the Input Stream
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyConcept P = new PropertyConcept();
		P.readProperty();
	}

}
