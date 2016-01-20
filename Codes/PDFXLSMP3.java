import jaco.mp3.player.MP3Player;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;


public class PDFXLSMP3 extends JFrame {

		public static void main(String[] args) {
					PDFXLSMP3 frame = new PDFXLSMP3();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public PDFXLSMP3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnPdf = new JButton("PDF");
		btnPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			openFile("NodeJS.pdf");
			}
		});
		btnPdf.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPdf.setBounds(25, 133, 89, 23);
		getContentPane().add(btnPdf);
		
		JButton btnXls = new JButton("PPT");
		btnXls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile("NodeJS.pptx");
			}
		});
		btnXls.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnXls.setBounds(138, 133, 89, 23);
		getContentPane().add(btnXls);
		
		JButton btnMp = new JButton("MP3");
		btnMp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				play();
				//openFile("Zindagi.mp3");
			}
		});
		btnMp.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMp.setBounds(252, 133, 89, 23);
		getContentPane().add(btnMp);
	}
	private void openFile(String fileName){
		if (Desktop.isDesktopSupported()) {
            try {
                File myFile 
                = new File( "C:\\Users\\arnav\\Desktop\\"+fileName);
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
            	ex.printStackTrace();
                // no application registered for PDFs
            }
        }
	}
	private void play(){
		// http://jacomp3player.sourceforge.net/download.html
		MP3Player player = new MP3Player(new File("C:\\Users\\arnav\\Desktop\\Zindagi.mp3"));
		player.play();	
		
	}
}
