import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import javax.swing.JOptionPane;

public class DummyMain {
	
	
	private static File file;
	public static void main(String[] args) throws IOException {
		try {
			File file=new File("pleasework.txt");
		      if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		Comedy C1=new Comedy("Damn Funny","NO","Half Hour","Repeat","Family Matters","Did I Do That","Jaleel White","Michelle Thomas","Adam Sandler");
		
		String record="";
		record=C1.toString();
		
		FileWriter wr=new FileWriter(file);
		
		wr.write(record);
		wr.close();
		
		
		
		
		
		
		//JOptionPane.showMessageDialog(null, MeettheMillers.getDescription(),"Its a fucking test",JOptionPane.ERROR_MESSAGE);
		}
		

		
		

	}

