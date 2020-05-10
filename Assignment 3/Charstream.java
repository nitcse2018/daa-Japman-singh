import java.io.*;
public class charstream {

	public static void main(String[] args) {
		File f=new File("inputfile.txt");
		try {
			FileReader r= new FileReader(f);
			FileWriter w=new FileWriter("Output1.txt");
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
