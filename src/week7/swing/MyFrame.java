package week7.swing;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	JTextField jTextField = null;
	
	public MyFrame() throws HeadlessException {
		super();
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		init();
		
		setVisible(true);
	}

	private void init() {
		GridLayout gridLayout = new GridLayout(1,2);
		JPanel downPanel = new JPanel();
		downPanel.setLayout(gridLayout);
		
		JButton loadB = new JButton("Load");
		JButton saveB = new JButton("Save");
		
		MyButtonListener myButtonListener = new MyButtonListener();
		loadB.addActionListener(myButtonListener);
		
		
		downPanel.add(loadB);
		downPanel.add(saveB);
		
		getContentPane().add(downPanel, BorderLayout.SOUTH);
		
		JTextArea jTextArea = new JTextArea();
		jTextField = new JTextField();
		
		getContentPane().add(jTextArea, BorderLayout.CENTER);
		getContentPane().add(jTextField, BorderLayout.NORTH);
	}
	
	private class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			jTextField.setText("Button was pressed");
		}
		
	}
	
	
}
