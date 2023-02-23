package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Traveling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;
	private JTextField txtThankyou;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traveling window = new Traveling();
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
	public Traveling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 102));
		frame.setBounds(0, 0, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 102));
		panel.setBounds(206, 0, 323, 53);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("E-Ticket Systems ");
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(204, 0, 0));
		lblNewLabel.setFont(new Font("Bodoni MT", Font.BOLD, 35));
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(61, 89, 116, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard ");
		rdbtnStandard.setBackground(Color.ORANGE);
		rdbtnStandard.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnStandard.setBounds(0, 131, 86, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy ");
		rdbtnEconomy.setBackground(Color.YELLOW);
		rdbtnEconomy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnEconomy.setBounds(0, 157, 86, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setBackground(Color.GREEN);
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnFirstClass.setBounds(0, 184, 86, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket ");
		rdbtnSingleTicket.setBackground(Color.GREEN);
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnSingleTicket.setBounds(101, 131, 109, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setBackground(Color.ORANGE);
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnReturnTicket.setBounds(101, 157, 109, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBackground(Color.CYAN);
		rdbtnAdult.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnAdult.setBounds(219, 131, 60, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBackground(Color.PINK);
		rdbtnChild.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnChild.setBounds(219, 157, 60, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GREEN);
		separator.setBounds(10, 116, 246, 8);
		frame.getContentPane().add(separator);
		
		JComboBox combDestination = new JComboBox();
		combDestination.setBackground(Color.LIGHT_GRAY);
		combDestination.setFont(new Font("Tahoma", Font.PLAIN, 12));
		combDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Dhaka", "Khulna", "Sylhet", "Chittagong", "Rajshahi"}));
		combDestination.setBounds(124, 184, 143, 22);
		frame.getContentPane().add(combDestination);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.GREEN);
		separator_1.setBounds(10, 223, 253, 8);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax:");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTax.setBounds(10, 242, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub-Total:");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSubTotal.setBounds(10, 278, 60, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTotal.setBounds(10, 315, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtTax.setBackground(Color.LIGHT_GRAY);
		txtTax.setBounds(91, 242, 86, 20);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubTotal.setBackground(Color.LIGHT_GRAY);
		txtSubTotal.setBounds(91, 275, 86, 20);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setBackground(Color.LIGHT_GRAY);
		txtTotal.setBounds(91, 312, 86, 20);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.GREEN);
		separator_2.setBounds(0, 348, 269, 8);
		frame.getContentPane().add(separator_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTotal.setBackground(Color.YELLOW);
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double tax = 9.50;
				double MilesK8 = 3500.78;
				double MilesK12 = 3700.10;
				double MilesK20 = 4000.23;
				double MilesK30= 4200.98;
				double totalCost, eco = 1000.85, fClass = 1500.60;
				/*
				 * 
				 * 
				 *
				 *
				//*********Initialize the contents of Standard Class for every destination*******
				 * 
				 * 
				 */
				
				if((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK8+totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8*2)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK8*2);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK8-18);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK8+totalCost-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8*2)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",(MilesK8-18)*2);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost-18)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				if((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK12);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK12+totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12*2)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK12*2);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK12-18);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK12+totalCost-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12*2)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",(MilesK12-18)*2);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost-18)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				
				else if((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK20);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK20+totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20*2)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK20*2);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK20+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK20-18);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK20+totalCost-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20*2)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",(MilesK20-18)*2);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK20+totalCost-18)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK30);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK30+totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30*2)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK30*2);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK30+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK30-18);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK30+totalCost-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30*2)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",(MilesK30-18)*2);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK30+totalCost-18)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				/*
				 * 
				 * 
				 *
				 *
				//*********Initialize the contents of Economy Class Ticket for every destination*******
				 * 
				 * 
				 */
				
				if((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK8+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost)+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8*2+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK8*2+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost)*2+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK8-18+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost-18)+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8*2+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",(MilesK8-18)*2+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost-18)*2+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				if((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK12+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost)+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12*2+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK12*2+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost)*2+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK12-18+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost-18)+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12*2+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",(MilesK12-18)*2+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost-18)*2+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				
				else if((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK20+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK20+totalCost+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20*2+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK20*2+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK20+totalCost)*2+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK20-18+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK20+totalCost-18+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20*2+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",((MilesK20-18)*2)+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",((MilesK20+totalCost-18)*2)+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK30+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK30+totalCost+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30*2+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK30*2+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",((MilesK30+totalCost)*2)+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK30-18+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK30+totalCost-18+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30*2+eco)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",((MilesK30-18)*2)+eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",((MilesK30+totalCost-18)*2)+eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				/*
				 * 
				 * 
				 *
				 *
				//*********Initialize the contents of First Class Ticket for every destination*******
				 * 
				 * 
				 */
				
				if((rdbtnFirstClass.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK8+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost)+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8*2+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK8*2+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost)*2+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK8-18+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost-18)+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Khulna"))
				{
					totalCost = (tax*MilesK8*2+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",(MilesK8-18)*2+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK8+totalCost-18)*2+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK12+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost)+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12*2+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK12*2+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost)*2+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK12-18+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost-18)+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Chittagong"))
				{
					totalCost = (tax*MilesK12*2+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",(MilesK12-18)*2+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK12+totalCost-18)*2+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				
				else if((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK20+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK20+totalCost+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20*2+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK20*2+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",(MilesK20+totalCost)*2+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK20-18+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK20+totalCost-18+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Rajshahi"))
				{
					totalCost = (tax*MilesK20*2+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",((MilesK20-18)*2)+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",((MilesK20+totalCost-18)*2)+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK30+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK30+totalCost+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnAdult.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30*2+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK30*2+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",((MilesK30+totalCost)*2)+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("RETURN");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
	
					
				}
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",MilesK30-18+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",MilesK30+totalCost-18+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("One Way");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected()) && (rdbtnChild.isSelected())&& combDestination.getSelectedItem().equals("Sylhet"))
				{
					totalCost = (tax*MilesK30*2+fClass)/100;
					String sTax = String.format("৳%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("৳%.2f",((MilesK30-18)*2)+fClass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("৳%.2f",((MilesK30+totalCost-18)*2)+fClass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("First Class");
					txtTicket.setText("RETURN");
					txtAdult.setText("NIL");
					txtChild.setText("ONE");
	
					
				}
				
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Initialize code for Checking result field
				
				//*******Time**********
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime  = new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				
				//*************Date*****************
				
				SimpleDateFormat tDate  = new SimpleDateFormat("dd-MM-yyyy");
				txtDate.setText(tDate.format(timer.getTime()));
				
				//************From************
				
				txtFrom.setText("Dhaka");
				txtTo.setText((String) combDestination.getSelectedItem()+" *");
				
				//*******Random Number generator*******
				
				int num1;
				String q1 = "";
				num1 = 1325+ (int)(Math.random()*4238);
				q1+= num1+1325;
				txtTicketNo.setText(q1);
				
				//********Route******
				
				txtRoute.setText("Sky");
				txtThankyou.setText("Thank You");
				
				
			}
		});
		btnTotal.setToolTipText("Total cost of Ticket");
		btnTotal.setBounds(8, 382, 78, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(102, 255, 51));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setToolTipText("Reset System ");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * 
				 * 
				 * 
				 *
				//Initialize code for RESET button
				 * 
				 * 
				 * 
				 */
				
				
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				combDestination.setSelectedItem("Destination");
				txtClass.setText(null);
				txtTicket.setText(null);
				txtAdult.setText(null);
				txtChild.setText(null);
				txtFrom.setText(null);
				txtTo.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtTicketNo.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
			}
		});
		btnReset.setBounds(99, 382, 78, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.CYAN);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setToolTipText("Exit System ");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Initialize code for exit button
				
				JFrame frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Do you want to exit?","Traveling Ticket Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(190, 382, 78, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(307, 184, 10, -60);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.GREEN);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(307, 116, 10, 289);
		frame.getContentPane().add(separator_4);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblClass.setBounds(384, 94, 46, 14);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTicket.setBounds(479, 94, 66, 14);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAdult.setBounds(577, 94, 46, 14);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblChild.setBounds(676, 94, 46, 14);
		frame.getContentPane().add(lblChild);
		
		txtClass = new JTextField();
		txtClass.setHorizontalAlignment(SwingConstants.CENTER);
		txtClass.setBackground(Color.YELLOW);
		txtClass.setBounds(363, 116, 86, 20);
		frame.getContentPane().add(txtClass);
		txtClass.setColumns(10);
		
		txtTicket = new JTextField();
		txtTicket.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicket.setBackground(Color.PINK);
		txtTicket.setBounds(459, 116, 86, 20);
		frame.getContentPane().add(txtTicket);
		txtTicket.setColumns(10);
		
		txtAdult = new JTextField();
		txtAdult.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdult.setBackground(Color.CYAN);
		txtAdult.setBounds(558, 116, 86, 20);
		frame.getContentPane().add(txtAdult);
		txtAdult.setColumns(10);
		
		txtChild = new JTextField();
		txtChild.setHorizontalAlignment(SwingConstants.CENTER);
		txtChild.setBackground(Color.GREEN);
		txtChild.setBounds(664, 116, 86, 20);
		frame.getContentPane().add(txtChild);
		txtChild.setColumns(10);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFrom.setBounds(338, 166, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTo.setBounds(338, 210, 46, 14);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDate.setBounds(338, 259, 46, 14);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTime.setBounds(338, 315, 46, 14);
		frame.getContentPane().add(lblTime);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(Color.GREEN);
		separator_5.setBounds(353, 146, 428, 8);
		frame.getContentPane().add(separator_5);
		
		txtFrom = new JTextField();
		txtFrom.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrom.setBounds(410, 163, 86, 20);
		frame.getContentPane().add(txtFrom);
		txtFrom.setColumns(10);
		
		txtTo = new JTextField();
		txtTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTo.setBounds(410, 207, 86, 20);
		frame.getContentPane().add(txtTo);
		txtTo.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtDate.setBounds(410, 256, 86, 20);
		frame.getContentPane().add(txtDate);
		txtDate.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setBounds(410, 312, 86, 20);
		frame.getContentPane().add(txtTime);
		txtTime.setColumns(10);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(544, 152, 1, 2);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(Color.GREEN);
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(550, 150, 10, 182);
		frame.getContentPane().add(separator_7);
		
		JLabel lblTicketNo = new JLabel("Ticket No:");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTicketNo.setBounds(585, 166, 78, 14);
		frame.getContentPane().add(lblTicketNo);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicketNo.setBounds(577, 185, 86, 20);
		frame.getContentPane().add(txtTicketNo);
		txtTicketNo.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(598, 223, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrice.setBounds(577, 242, 86, 20);
		frame.getContentPane().add(txtPrice);
		txtPrice.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route:");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRoute.setBounds(598, 288, 65, 14);
		frame.getContentPane().add(lblRoute);
		
		txtRoute = new JTextField();
		txtRoute.setHorizontalAlignment(SwingConstants.CENTER);
		txtRoute.setBounds(577, 309, 86, 20);
		frame.getContentPane().add(txtRoute);
		txtRoute.setColumns(10);
		
		txtThankyou = new JTextField();
		txtThankyou.setHorizontalAlignment(SwingConstants.CENTER);
		txtThankyou.setFont(new Font("Bodoni MT Black", Font.BOLD, 22));
		txtThankyou.setBackground(Color.LIGHT_GRAY);
		txtThankyou.setBounds(467, 372, 177, 33);
		frame.getContentPane().add(txtThankyou);
		txtThankyou.setColumns(10);
	}
}
