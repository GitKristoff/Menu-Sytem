import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuLPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton button = new JButton("Place Order");
	ImageIcon icon1 = new ImageIcon("icon1.jpg");
	JLabel label1 = new JLabel("SELECT FROM THE CATEGORIES");
	JLabel label2 = new JLabel("Drinks");
	JLabel label3 = new JLabel("Meals");
	JLabel label4 = new JLabel("Dessert");
	JLabel label5 = new JLabel("Snacks");
	JCheckBox a1, a2, a3, b1, b2, b3, c1,c2,c3, d1,d2,d3;
	JTextField Jt = new JTextField();
	int quantity;
	
	MenuLPage(){
		
		a1 = new JCheckBox("Coca Cola - 15");
		a1.setBounds(60, 110, 120, 15);
		a1.setFocusable(false);
		a1.setBackground(null);
		
		a2 = new JCheckBox("Royal - 15");
		a2.setBounds(60, 130, 120, 15);
		a2.setFocusable(false);
		a2.setBackground(null);
		
		a3 = new JCheckBox("Mineral Water - 10");
		a3.setBounds(60, 150, 130, 15);
		a3.setFocusable(false);
		a3.setBackground(null);
		
		b1 = new JCheckBox("Adobo & Rice - 50");
		b1.setBounds(240,110,140,15);
		b1.setFocusable(false);
		b1.setBackground(null);
		
		b2 = new JCheckBox("Sinigang & Rice - 50");
		b2.setBounds(240,130,140,15);
		b2.setFocusable(false);
		b2.setBackground(null);
		
		b3 = new JCheckBox("Menudo & Rice - 50");
		b3.setBounds(240,150,140,15);
		b3.setFocusable(false);
		b3.setBackground(null);
		
		c1 = new JCheckBox("Chocolate Cake - 30");
		c1.setBounds(60,220,140,15);
		c1.setFocusable(false);
		c1.setBackground(null);
		
		c2 = new JCheckBox("Ice Cream - 20");
		c2.setBounds(60,240,130,15);
		c2.setFocusable(false);
		c2.setBackground(null);
		
		c3 = new JCheckBox("Leche Flan - 50");
		c3.setBounds(60,260,130,15);
		c3.setFocusable(false);
		c3.setBackground(null);
		
		d1 = new JCheckBox("Chicharon - 10");
		d1.setBounds(240,220,130,15);
		d1.setFocusable(false);
		d1.setBackground(null);
		
		d2 = new JCheckBox("Dried Fruits - 8");
		d2.setBounds(240,240,140,15);
		d2.setFocusable(false);
		d2.setBackground(null);
		
		d3 = new JCheckBox("Turon - 6");
		d3.setBounds(240,260,130,15);
		d3.setFocusable(false);
		d3.setBackground(null);
		
		
		
		button.setBounds(100, 330, 200, 30);
		button.setFocusable(false);
		button.addActionListener(this);
	
		
		label1.setBounds(110,0,200,100);
		//label1.setFont(new Font());
		label2.setBounds(60,40,100,100);
		label3.setBounds(290,40,100,100);
		label4.setBounds(60,150,200,100);
		label5.setBounds(290,150,200,100);
		
		frame.setLocation(490,120);
		frame.setVisible(true);
		frame.setTitle("Menu");
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(icon1.getImage());
		frame.getContentPane().setBackground(new Color(255,153,153));
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(button);
		frame.add(a1);
		frame.add(a2);
		frame.add(a3);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(c1);
		frame.add(c2);
		frame.add(c3);
		frame.add(d1);
		frame.add(d2);
		frame.add(d3);
		
		//Asking quantity for Drinks:
		
		a1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(a1,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		a2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(a2,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		a2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(a2,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		a3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(a3,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});

		//Asking quantity for Meals:		
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(a1,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(a2,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(a3,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		
		//Asking quantity for Dessert:
		
		c1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(c1,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		c2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(c2,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		c3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(c3,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		
		//Asking quantity for Snacks:
		
		d1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(d1,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		d2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(d2,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		d3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = JOptionPane.showInputDialog(d3,"Enter Quantity:");
				quantity = Integer.parseInt(input);
			}
		});
		

		}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			int cocaCola = 0, royal = 0, mineralWater = 0;
			String itemName1="", itemName2="", itemName3="";
			
			int adoboRice = 0, sinigangRice = 0, menudoRice = 0;
			String itemName4="", itemName5="", itemName6="";
			
			int chocolateCake = 0, iceCream = 0, lecheFlan =0;
			String itemName7="", itemName8="", itemName9="";
			
			int chicharon = 0, driedFruits = 0, turon = 0;
			String itemName10="", itemName11="", itemName12="";
			
		//Drinks
		if(a1.isSelected()) {
			cocaCola = 15*quantity;
			itemName1 = "Coca Cola: ";
		}
		if(a2.isSelected()) {
			royal = 15*quantity;
			itemName2 = "Royal: ";
		}
		if(a3.isSelected()) {
			mineralWater = 15*quantity;
			itemName3 = "Mineral Water: ";
		}
		//Meals
		if(b1.isSelected()) {
			adoboRice = 50*quantity;
			itemName4 = "Adobo & Rice: ";
		}
		if(b2.isSelected()) {
			sinigangRice = 50*quantity;
			itemName5 = "Sinigang & Rice: ";
		}
		if(b3.isSelected()) {
			menudoRice = 50*quantity;
			itemName6 = "Menudo & Rice: ";
		}
		//Dessert			
		if(c1.isSelected()) {
			chocolateCake = 30*quantity;
			itemName7 = "Chocolate Cake: ";
		}
		if(c2.isSelected()) {
			iceCream = 20*quantity;
			itemName8 = "Ice Cream: ";
		}
		if(c3.isSelected()) {
			lecheFlan = 50*quantity;
			itemName9 = "Leche Flan: ";
		}
		//Snacks
		if(d1.isSelected()) {
			chicharon = 10*quantity;
			itemName10 = "Chicharon: ";
		}
		if(d2.isSelected()) {
			driedFruits = 8*quantity;
			itemName11 = "Dried Fruits: ";
		}
		if(d3.isSelected()) {
			turon = 6*quantity;
			itemName12 = "Turon: ";
		}
		
		double order = cocaCola + royal + mineralWater +
			   adoboRice + sinigangRice + menudoRice +
			   chocolateCake + iceCream + lecheFlan +
			   chicharon + driedFruits + turon;
		
		String responses[] = {"THANK YOU!", "CANCEL"};
		
		JOptionPane.showOptionDialog(null, "DRINKS: \n"+ "1. "+itemName1+cocaCola+"\n"+"2. "+itemName2+royal+"\n"+"3. "+itemName3+mineralWater+"\n"+
				"MEALS: \n"+"4. "+itemName4+adoboRice+"\n"+"5. "+itemName5+sinigangRice+"\n"+"6. "+itemName6+menudoRice+"\n"+ "DESSERT: \n"+
				"7. "+itemName7+chocolateCake+"\n"+"8. "+itemName8+iceCream+"\n"+"9. "+itemName9+lecheFlan+"\n"+ "SNACKS: \n" +
				"10. "+itemName10+chicharon+"\n"+"11. "+itemName11+driedFruits+"\n"+"12. "+itemName12+turon+"\n"+
				"TOTAL AMOUNT TO PAY: "+order, "ORDER RECIEPT", JOptionPane.YES_NO_OPTION, 
				JOptionPane.INFORMATION_MESSAGE,null, 
				responses, 0);
					
		}
		
	}
	
}
