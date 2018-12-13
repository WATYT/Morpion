import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class morpion {

	private JFrame frame;
	private int i = 0;
	private String txt;
	private String txtWin;
	private int res;
	private String txtPopUp;
	private int CoupX = 0;
	private int CoupO = 0;
	private int NbCoup = 0;
	private int NbDeWinX = 0;
	private int NbDeWinO = 0;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	
	private JOptionPane jop1, jop2;
	private JButton btn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					morpion window = new morpion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public morpion() {
		initialize();
	}

	private void CroixOuRond() {
		i=i+1;;
		if((i%2) == 0) {
			if( (btn.getText() != "X") && (btn.getText() != "O") ) {
				txt = "X";
				CoupX++;
			}else {
				i=i-1;
			}
			
		}else {
			if( (btn.getText() != "X") && (btn.getText() != "O") ) {
				txt = "O";
				CoupO++;
			}else {
				i=i-1;
			}
		}
	}
	
	private int TestWin() {
		if( ((button1.getText()) == (button2.getText()))  &&  ( (button2.getText()) == (button3.getText()) ) &&  ( (button1.getText()) != (" ") ) ) {
			txtWin = "Winner : " + button1.getText();
			if(button1.getText() == "X") {
				NbCoup = CoupX;
				NbDeWinX++;
			}else {
				NbCoup = CoupO;
				NbDeWinO++;
			}
			return 1;
		}
		else if( ((button4.getText()) == (button5.getText()))  &&  ( (button5.getText()) == (button6.getText()) ) &&  ( (button4.getText()) != (" ") ) ) {
			txtWin = "Winner : " + button4.getText();
			if(button4.getText() == "X") {
				NbCoup = CoupX;
				NbDeWinX++;
			}else {
				NbCoup = CoupO;
				NbDeWinO++;
			}
			return 1;
		}
		else if( ((button7.getText()) == (button8.getText()))  &&  ( (button8.getText()) == (button9.getText()) ) &&  ( (button7.getText()) != (" ") ) ) {
			txtWin = "Winner : " + button7.getText();
			if(button7.getText() == "X") {
				NbCoup = CoupX;
				NbDeWinX++;
			}else {
				NbCoup = CoupO;
				NbDeWinO++;
			}
			return 1;
		}
		else if( ((button1.getText()) == (button4.getText()))  &&  ( (button4.getText()) == (button7.getText()) ) &&  ( (button1.getText()) != (" ") ) ) {
			txtWin = "Winner : " + button1.getText();
			if(button1.getText() == "X") {
				NbCoup = CoupX;
				NbDeWinX++;
			}else {
				NbCoup = CoupO;
				NbDeWinO++;
			}
			return 1;
		}
		else if( ((button2.getText()) == (button5.getText()))  &&  ( (button5.getText()) == (button8.getText()) ) &&  ( (button2.getText()) != (" ") ) ) {
			txtWin = "Winner : " + button2.getText();
			if(button2.getText() == "X") {
				NbCoup = CoupX;
				NbDeWinX++;
			}else {
				NbCoup = CoupO;
				NbDeWinO++;
			}
			return 1;
		}
		else if( ((button3.getText()) == (button6.getText()))  &&  ( (button6.getText()) == (button9.getText()) ) &&  ( (button3.getText()) != (" ") ) ) {
			txtWin = "Winner : " + button3.getText();
			if(button3.getText() == "X") {
				NbCoup = CoupX;
				NbDeWinX++;
			}else {
				NbCoup = CoupO;
				NbDeWinO++;
			}
			return 1;
		}
		else if( ((button1.getText()) == (button5.getText()))  &&  ( (button5.getText()) == (button9.getText()) ) &&  ( (button1.getText()) != (" ") ) ) {
			txtWin = "Winner : " + button1.getText();
			if(button1.getText() == "X") {
				NbCoup = CoupX;
				NbDeWinX++;
			}else {
				NbCoup = CoupO;
				NbDeWinO++;
			}
			return 1;
		}
		else if( ((button3.getText()) == (button5.getText()))  &&  ( (button5.getText()) == (button7.getText()) ) &&  ( (button3.getText()) != (" ") ) ) {
			txtWin = "Winner : " + button3.getText();
			if(button3.getText() == "X") {
				NbCoup = CoupX;
				NbDeWinX++;
			}else {
				NbCoup = CoupO;
				NbDeWinO++;
			}
			return 1;
		}else {
			return 0;
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow,grow][grow,grow][grow,grow]", "[grow,grow][grow,grow][grow,grow]"));
		
		button1 = new JButton(" ");
		button1.addActionListener(ActionMorpion);
		frame.getContentPane().add(button1, "cell 0 0,grow");
		
		button2 = new JButton(" ");
		button2.addActionListener(ActionMorpion);
		frame.getContentPane().add(button2, "cell 1 0,grow");
		
		button3 = new JButton(" ");
		button3.addActionListener(ActionMorpion);
		frame.getContentPane().add(button3, "cell 2 0,grow");
		
		button4 = new JButton(" ");
		button4.addActionListener(ActionMorpion);
		frame.getContentPane().add(button4, "cell 0 1,grow");
		
		button5 = new JButton(" ");
		button5.addActionListener(ActionMorpion);
		frame.getContentPane().add(button5, "cell 1 1,grow");
		
		button6 = new JButton(" ");
		button6.addActionListener(ActionMorpion);
		frame.getContentPane().add(button6, "cell 2 1,grow");
		
		button7 = new JButton(" ");
		button7.addActionListener(ActionMorpion);
		frame.getContentPane().add(button7, "cell 0 2,grow");
		
		button8 = new JButton(" ");
		button8.addActionListener(ActionMorpion);
		frame.getContentPane().add(button8, "cell 1 2,grow");
		
		button9 = new JButton(" ");
		button9.addActionListener(ActionMorpion);
		frame.getContentPane().add(button9, "cell 2 2,grow");
	}
	
	ActionListener ActionMorpion = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btn = (JButton) e.getSource();
			CroixOuRond();
			btn.setText(txt);
			res = TestWin();
			txtPopUp = txtWin + "\n\r" + "Nombre de coup : " + NbCoup + "\n\r" + "Nombre de victoire : " + "\n\r" + "- X : " + NbDeWinX + "\n\r" + "- O : " + NbDeWinO;
			if(res == 1) {
				jop1 = new JOptionPane();
				jop1.showMessageDialog(null, txtPopUp, "VICTOIRE", JOptionPane.INFORMATION_MESSAGE);
				Reset();
				
			}else if(i >=9){
				jop2 = new JOptionPane();
				jop2.showMessageDialog(null, "Il y a égalité !", "EGALITE", JOptionPane.INFORMATION_MESSAGE);
				Reset();
			}
			
		}
		
		public void Reset() {
			button1.setText(" ");
			button2.setText(" ");
			button3.setText(" ");
			button4.setText(" ");
			button5.setText(" ");
			button6.setText(" ");
			button7.setText(" ");
			button8.setText(" ");
			button9.setText(" ");
			i = 0;
			res = 0;
			CoupX = 0;
			CoupO = 0;
			NbCoup = 0;
		}
	};
		
	

}
