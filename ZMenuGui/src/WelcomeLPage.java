import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class WelcomeLPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton button = new JButton("Open Menu");
	ImageIcon icon = new ImageIcon("icon1.jpg");
	JLabel label1 = new JLabel("WELCOME");
	JLabel label2 = new JLabel("TO");
	JLabel label3 = new JLabel("SSU-BC CANTEEN!");
	
	WelcomeLPage(){
		
		label1.setBounds(110,70,200,100);
		label2.setBounds(180,120,200,100);
		label3.setBounds(50,160,350,100);
		
		label1.setFont(new Font("Sans Serif",0,35));
		label2.setFont(new Font("Sans Serif",0,20));
		label3.setFont(new Font("Sans Serif",0,35));
		
		button.setBounds(100, 270, 200, 30);
		button.setFocusable(false);
		button.addActionListener(this);
		
		
		frame.setLocation(490,120);
		frame.setVisible(true);
		frame.setTitle("Menu");
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(icon.getImage());
		frame.getContentPane().setBackground(new Color(153,153,255));
		
		frame.add(button);
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			frame.dispose();
			MenuLPage menuLPage = new MenuLPage();
		}
		
	}
	

}
