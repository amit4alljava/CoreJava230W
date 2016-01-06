import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class GameSplashScreen extends JWindow {
	int currentProgress = 1;
	int colorCode = 1;
	JLabel lblGame = new JLabel("GAME-2016");
	boolean isVisible = false;
	Timer timer;
	JProgressBar progressBar = new JProgressBar();
	private Icon icon = new ImageIcon(GameSplashScreen.class.getResource("giphy.gif"));
	public static void main(String[] args) {
		
					GameSplashScreen frame = new GameSplashScreen();
					frame.setVisible(true);
				
		
	}

	/**
	 * Create the frame.
	 */
	public GameSplashScreen() {
		getContentPane().setBackground(Color.CYAN);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 549);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(31, 32, 601, 311);
		getContentPane().add(lblNewLabel);
		
		
		progressBar.setForeground(Color.MAGENTA);
		progressBar.setStringPainted(true);
		progressBar.setBounds(21, 433, 580, 50);
		getContentPane().add(progressBar);
		
		
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGame.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGame.setBounds(170, 354, 254, 68);
		getContentPane().add(lblGame);
		doProgress();
		
	}
	private void doProgress(){
		timer = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblGame.setVisible(isVisible);
				isVisible=!isVisible;
				if(isVisible){
				switch(colorCode){
				case 1:
					lblGame.setForeground(Color.RED);
					break;
				case 2:
					lblGame.setForeground(Color.GREEN);
					break;	
				case 3:
					lblGame.setForeground(Color.BLUE);
					break;	
				case 4:
					lblGame.setForeground(Color.MAGENTA);
					break;	
				}
				if(colorCode<5){
					colorCode++;
				}
				else
				{
					colorCode=1;
				}
				}
				if(currentProgress<100){
				progressBar.setValue(currentProgress);
				currentProgress++;
				}
				else
				{
					timer.stop();
					MainScreen mainScreen = new MainScreen();
					mainScreen.setVisible(true);
					GameSplashScreen.this.setVisible(false);
					GameSplashScreen.this.dispose();
				}
				
			}
		});
		timer.start();
	}
	
}
