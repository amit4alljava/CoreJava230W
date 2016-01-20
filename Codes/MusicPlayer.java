import jaco.mp3.player.MP3Player;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class MusicPlayer extends JFrame {

	List list = new List();
	public static void main(String[] args) {
		
					MusicPlayer frame = new MusicPlayer();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public MusicPlayer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 362);
		getContentPane().setLayout(null);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				browseFiles();
			}
		});
		btnBrowse.setBounds(41, 45, 89, 23);
		getContentPane().add(btnBrowse);
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				playSelected();
			}
		});
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSelected();
			}
		});
		
		
		list.setBounds(36, 91, 134, 176);
		getContentPane().add(list);
	}
	private void playSelected(){
		File file = new File(list.getSelectedItem());
		if(file.exists()){
		MP3Player mp3 = new MP3Player(file);
		mp3.play();
		}
		else{
			JOptionPane.showMessageDialog(this, "Invalid Path");
		}
	}
	private void browseFiles(){
		JFileChooser chooser = new JFileChooser("E:\\UI-ClientSideProject\\Html5_Project\\WebContent");
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(this);
		
		File folder = chooser.getSelectedFile();
		//System.out.println(file.getPath());
		File files[] = folder.listFiles();
		for(File f : files){
			list.add(f.getPath());
		}
	}
	
	
	
	
	
	
	
	
	
}
