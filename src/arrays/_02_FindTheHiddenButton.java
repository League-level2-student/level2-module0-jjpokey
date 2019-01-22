/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton j [];
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String a = JOptionPane.showInputDialog("Enter a positive number");
		int b = Integer.parseInt(a);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		j = new JButton[b];
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		for(int c = 0; c < b; c++) {
			j[c] = new JButton();
			j[c].addActionListener(this);
			panel.add(j[c]);
		}
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(Frame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Find the hidden button!");
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		Random rand = new Random();
		hiddenButton = rand.nextInt(b);
		//14. Set the text of the JButton located at hiddenButton the read "ME"
j[hiddenButton].setText("Me");
		//15. Use Thread.sleep(100);
try {
	Thread.sleep(100);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		//    Surround it with a try/catch
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		j[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(e.getSource() == j[hiddenButton] ) {
			JOptionPane.showMessageDialog(null, "you win!");
		}
		else {
			System.out.println("try again");
		}
		//18. else tell them to try again
	}
}
