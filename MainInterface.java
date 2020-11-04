import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainInterface {

	private static JFrame frame;
	private static JPanel panel;
	private static JLabel label;
	private static JButton button;
	private static JTextField textbox;
	private static JPasswordField sysKey;
	
	public static void main(String args[]){
		
		frame=new JFrame("This ah one Window Dawg");
		frame.setBounds(500, 300, 400, 200);
		panel=new JPanel();
		frame.add(panel);
		
		button =new JButton();
		button.setBounds(10,40,400,10);
		
		
		
		
		
		
		
		
		
		frame.setVisible(true);
		
		
		
		
	}
}
