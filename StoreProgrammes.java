import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class StoreProgrammes {

	private static FileWriter wr;
	
	public static void main(String[] args) {
	
		
		
		Weather W1=new Weather("NO","The most accurate reported weather","30 mins","Live","Category 3");
		Weather W2=new Weather(W1);
		Weather W3=new Weather(W2);

		
		File programmes= new File("programmelist.txt");
		
		try {
			 wr=new FileWriter(programmes);
		} catch (IOException e) {
			System.out.println("!!!Error Data Could Not Be Written!!!");
			e.printStackTrace();
		}
		
	String record="",record2="",record3="";
	
	record=W1.toString()+" "+W1.getDescription()+"\n";
	record2=W2.getSeverity()+"\n";
	record3=W3.toString()+"\n";
	
		
		try {
			wr.write(record);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wr.write(record2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wr.write(record3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
