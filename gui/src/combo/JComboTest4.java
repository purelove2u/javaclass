package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class JComboTest4 extends JFrame {

	private JPanel contentPane;
	private JLabel label; 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest4 frame = new JComboTest4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public JComboTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 170, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Vector<ImageIcon> vector=new Vector<ImageIcon>();
		vector.add(new ImageIcon(getClass().getResource("Bird.gif")));
		vector.add(new ImageIcon(getClass().getResource("Cat.gif")));
		vector.add(new ImageIcon(getClass().getResource("Dog.gif")));
		vector.add(new ImageIcon(getClass().getResource("Rabbit.gif")));
		vector.add(new ImageIcon(getClass().getResource("Pig.gif")));		
		JComboBox<ImageIcon> combo = new JComboBox<ImageIcon>(vector);
		contentPane.add(combo,BorderLayout.CENTER);		
	}

}

