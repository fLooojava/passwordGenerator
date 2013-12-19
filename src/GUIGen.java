

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GUIGen extends JFrame
{


	private int length;
	public GUIGen ()
	   {
		   JFrame frame = new JFrame("passwordgenerator");
	       frame.setSize(500,200);
	       frame.setLocation(300,300);
	       frame.setResizable(false);
	       frame.setLayout(new FlowLayout(FlowLayout.CENTER));
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	       JPanel panel = new JPanel();
	       JLabel lblpw = new JLabel("length of your password : ");
	       
	        final JTextField tfieldlength = new JTextField(2);
	        
	       JButton btngenpw = new JButton("generate pw");
	       btngenpw.addActionListener (new ActionListener() {
	           
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
		            System.out.println ("btn pressed");
		            String input = tfieldlength.getText();
		 	       int length = Integer.parseInt(input);
		 	       System.out.println(length);
				}
		        });

	       
	       
	      
	      
	       
	       
	       JTextArea taoutput = new JTextArea();
	       
	       
	       panel.add(lblpw);
	       panel.add(tfieldlength);
	       panel.add(btngenpw);

	       frame.add(panel);
	       frame.setVisible(true);
	   		
	       
	   }
	
	}
