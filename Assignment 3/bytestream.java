import java.io.*;
public class bytestream {

	public static void main(String[] args) {
		File f=new File("inputfile.txt");
		try {
			FileInputStream r= new FileInputStream(f);
			FileOutputStream w=new FileOutputStream("Output2.txt");
		    int word;
			while((word=r.read())!=-1)
				w.write(word);
			r.close();
			w.close();
			System.out.println("Contents copied succesfully.");
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}
}
