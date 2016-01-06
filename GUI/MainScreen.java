import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainScreen extends JFrame {

	
	public static void main(String[] args) {
		
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 438);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGamers = new JMenu("Gamers");
		menuBar.add(mnGamers);
		
		JMenuItem mntmTictactoe = new JMenuItem("TicTacToe");
		mntmTictactoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Demo2 obj = new Demo2();
				obj.setVisible(true);
			}
		});
		mnGamers.add(mntmTictactoe);
		
		JMenuItem mntmLogoQuiz = new JMenuItem("Logo Quiz");
		mnGamers.add(mntmLogoQuiz);
		mnGamers.addSeparator();
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnGamers.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAboutus = new JMenuItem("AboutUs");
		mnHelp.add(mntmAboutus);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
}
