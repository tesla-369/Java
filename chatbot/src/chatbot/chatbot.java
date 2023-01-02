package chatbot;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class chatbot extends JFrame{
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();
	
	
	
	public chatbot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("LISAV1");
		frame.add(Chatarea);
		frame.add(chatbox);
		//for textarea
		Chatarea.setSize(500, 400);
		Chatarea.setLocation(2,0);
		
		
		//FOR TEXTFIELD
		chatbox.setSize(540, 30);
		chatbox.setLocation(2,500);
		
		chatbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String gtext = chatbox.getText().toUpperCase();
				Chatarea.append("ME ->" + gtext + "\n");
				chatbox.setText("");
				
				if(gtext.contains("HI")) {
					LISA("S̄wạs̄dī");
					}else {
						int rand = (int) (Math.random()* 3 +1);
						if (rand == 1) {
							LISA("I don't understand");
							}else if(rand == 2){
								LISA("Sorry i couldn't understand");
							}else if (rand == 3) {
								LISA("I am sorry i can't get it");
							}
						
						
					}
				}
		
		
			
		});
		
	}
		
		
		
		
		
	private void LISA(String string) {
		Chatarea.append("LISA ->" +string+ "\n");
	}
	
	public static void main (String args[]) {
		new chatbot();
		
	}
	

}
