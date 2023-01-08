import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		//GamePanel panel = new GamePanel();  
		//this.add(panel);
		this.add(new GamePanel());  //Above two line is same as this line.
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); //this function take JFrame and fits is around all the components that we add to the frame.
		this.setVisible(true);
		this.setLocationRelativeTo(null);//window appear middle of our computer screen
		}
	}
