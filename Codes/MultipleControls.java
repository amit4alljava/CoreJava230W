import java.awt.Button;
import java.awt.Choice;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class MultipleControls extends JFrame {
	JRadioButton rdbtnMale = new JRadioButton("Male");
	JRadioButton rdbtnFemale = new JRadioButton("Female");
	JCheckBox chckbxSports = new JCheckBox("Sports");
	JCheckBox chckbxReading = new JCheckBox("Reading");
	JCheckBox chckbxTravel = new JCheckBox("Travel");
	private JTextField textField;
	Choice choice = new Choice();
	private String hobby="";
	private final JTextField textField_1 = new JTextField();
	public static void main(String[] args) {
		
					MultipleControls frame = new MultipleControls();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public MultipleControls() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			askToClose();
			}
		});
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 493);
		getContentPane().setLayout(null);
		
		
		rdbtnMale.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnMale.setBounds(31, 73, 109, 23);
		getContentPane().add(rdbtnMale);
		
		
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnFemale.setBounds(161, 75, 109, 23);
		getContentPane().add(rdbtnFemale);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			getGender();
			}
		});
		btnResult.setBounds(89, 200, 89, 23);
		getContentPane().add(btnResult);
		
		
		chckbxSports.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				displayHobby();
			}
		});
		chckbxSports.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxSports.setBounds(30, 22, 97, 23);
		getContentPane().add(chckbxSports);
		chckbxReading.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				displayHobby();
			}
		});
		
		
		chckbxReading.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxReading.setBounds(144, 24, 97, 23);
		getContentPane().add(chckbxReading);
		chckbxTravel.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				displayHobby();
			}
		});
		
		
		chckbxTravel.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxTravel.setBounds(266, 24, 97, 23);
		getContentPane().add(chckbxTravel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String keyChar = String.valueOf(e.getKeyChar());
				String keyCode = String.valueOf(e.getKeyCode());
				if(e.getKeyCode()==10){
					textField_1.requestFocus();
				}
				//textField_1.setText("Key Press "+keyChar+" "+keyCode);
			}
			/*@Override
			public void keyTyped(KeyEvent e) {
				String keyChar = String.valueOf(e.getKeyChar());
				String keyCode = String.valueOf(e.getKeyCode());
				
				textField_1.setText("Key Type "+keyChar+" "+keyCode);
				//textField_1.setText(String.valueOf(e.getKeyChar()));
			}*/
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(89, 121, 215, 53);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			dispCity();
			}
		});
		choice.add("Delhi");
		choice.add("Mumbai");
		choice.add("Shimla");
		choice.setBounds(309, 73, 115, 20);
		getContentPane().add(choice);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(188, 185, 215, 53);
		
		getContentPane().add(textField_1);
		
		Button button = new Button("PDF");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			showFile();
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 16));
		button.setBounds(333, 121, 70, 22);
		getContentPane().add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 288, 273, 154);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(76, 318, 246, 111);
		scrollPane.getViewport().add(textArea);
		//getContentPane().add(textArea);
	}
	private void showFile(){
		if(Desktop.isDesktopSupported()){
			try {
				Desktop.getDesktop().open(new File("C:\\Users\\arnav\\Desktop\\HTML5.pdf"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void askToClose(){
		int choice = JOptionPane.showConfirmDialog(this, "Do u want to close this window","MyFrame-2016",JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.YES_OPTION){
			this.setVisible(false);
			this.dispose();
		}
		else{
			return;
		}
	}
	private void dispCity(){
		textField.setText(choice.getSelectedItem());
	}
	private void displayHobby(){
		hobby="";
		if(chckbxSports.isSelected()){
		hobby += chckbxSports.getText() ;
		}
		if(chckbxReading.isSelected()){
			hobby += chckbxReading.getText() ;
			}
		if(chckbxTravel.isSelected()){
			hobby += chckbxTravel.getText() ;
			}
		textField.setText(hobby);
	}
	
	private void getGender(){
		if(rdbtnMale.isSelected()){
			JOptionPane.showMessageDialog(this, "Male Selected");
		}
		if(rdbtnFemale.isSelected()){
			JOptionPane.showMessageDialog(this, "Female Selected");
		}
	}
}
