package hotelSrujan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.sql.*;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

public class hotelSrujan {

	private JFrame frame;
	private JTable table;
	private JTextField jtxtMoblie;
	private JTextField jtxtCusRef;
	private JTextField jtxtfirstName;
	private JTextField jtxtSurname;
	private JTextField jtxtAddress;
	private JTextField jtxtPostCode;
	private JTextField jtxtEmail;
	private JTextField jtxtTotal;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTax;
	
	Connection conn = null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	

	DefaultTableModel model =new DefaultTableModel();
//	private String sql;
	//private Object col[];
	/**
	 * Launch the application.
	 */
	
	
	
	
	
	
	public void updateTable() 
	{
	//	conn = HotelSrujanData.ConnectDB();
		
		
		if(conn != null) 
		{
			String sql="SELECT CusRef,firstName, Surname, Address, PostCode,Moblie ,Email, Gender, DateOfBirth ,Nationality,ProveOfId,CheckInDate,CheckOutDate,RoomType, RoomNo,RoomExtNo from HotelSrujanDB ";
			
		
		try {
			 
		//	String sql = null;
			
			pst = conn.prepareStatement(sql);
			rs= pst.executeQuery();
			
			Object[] columnData = new Object[16];
			
			
			while(rs.next())
			{
				columnData[0] =rs.getString("CusRef");
				columnData[1] =rs.getString("firstName");
				columnData[2] =rs.getString("Surname");
				columnData[3] =rs.getString("Address");
				columnData[4] =rs.getString("PostCode");
				columnData[5] =rs.getString("Moblie");
				columnData[6] =rs.getString("Email");
				columnData[7] =rs.getString("Gender");
				columnData[8] =rs.getString("DateOfBirth");
				columnData[9] =rs.getString("Nationality");
				columnData[10] =rs.getString("ProveOfId");
				columnData[11] =rs.getString("CheckInDate");
				columnData[12] =rs.getString("CheckOutDate");
				columnData[13] =rs.getString("RoomType");
				columnData[14] =rs.getString("RoomNo");
				columnData[15] =rs.getString("roomExtNo");
				
				for (Object object : columnData) {
					System.out.println(object);
					
				}
			
			
				
				model.addRow(columnData);
				
			}
			} 
	
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e+"null test");
		}
	}
	}
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelSrujan window = new hotelSrujan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 */
	public hotelSrujan() {
		initialize();
		
		
		
		
	 Object col[]  = {"CusRef","firstName" ,"Surname"," Address", "PostCode","Moblie" ,"Email"," Gender"," DateOfBirth" ,"Nationality","ProveOfID","CheckInDate","CheckOutDate","RoomType"," RoomNo","RoomExtNo"};
		
		model.setColumnIdentifiers(col);
		table.setModel(model);
		conn = HotelSrujanData.ConnectDB();
		
		
		updateTable();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(0, 0, 1470, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setForeground(new Color(224, 255, 255));
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 7));
		panel.setBounds(10, 0, 373, 678);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Moblie");
		lblNewLabel.setBounds(10, 196, 128, 26);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		jtxtMoblie = new JTextField();
		jtxtMoblie.setBounds(161, 199, 181, 26);
		panel.add(jtxtMoblie);
		jtxtMoblie.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CustomerRef");
		lblNewLabel_1.setBounds(10, 11, 128, 26);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_1);
		
		jtxtCusRef = new JTextField();
		jtxtCusRef.setBounds(161, 14, 181, 26);
		jtxtCusRef.setColumns(10);
		panel.add(jtxtCusRef);
		
		JLabel lblNewLabel_2 = new JLabel("FirstName");
		lblNewLabel_2.setBounds(10, 48, 128, 26);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_2);
		
		jtxtfirstName = new JTextField();
		jtxtfirstName.setBounds(161, 51, 181, 26);
		jtxtfirstName.setColumns(10);
		panel.add(jtxtfirstName);
		
		JLabel lblNewLabel_3 = new JLabel("Surname");
		lblNewLabel_3.setBounds(10, 85, 128, 26);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_3);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setBounds(161, 88, 181, 26);
		jtxtSurname.setColumns(10);
		panel.add(jtxtSurname);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setBounds(10, 122, 128, 26);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_4);
		
		jtxtAddress = new JTextField();
		jtxtAddress.setBounds(161, 125, 181, 26);
		jtxtAddress.setColumns(10);
		panel.add(jtxtAddress);
		
		JLabel lblNewLabel_5 = new JLabel("Post Code");
		lblNewLabel_5.setBounds(10, 159, 128, 26);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_5);
		
		jtxtPostCode = new JTextField();
		jtxtPostCode.setBounds(161, 162, 181, 26);
		jtxtPostCode.setColumns(10);
		panel.add(jtxtPostCode);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(10, 236, 128, 26);
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_6);
		
		jtxtEmail = new JTextField();
		jtxtEmail.setBounds(161, 239, 181, 26);
		jtxtEmail.setColumns(10);
		panel.add(jtxtEmail);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setBounds(10, 273, 128, 26);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("DateOfBirth");
		lblNewLabel_2_1.setBounds(10, 321, 128, 26);
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nationality");
		lblNewLabel_3_1.setBounds(10, 358, 128, 26);
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Prove of ID");
		lblNewLabel_4_1.setBounds(10, 395, 128, 28);
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("CheckInDate");
		lblNewLabel_5_1.setBounds(10, 434, 128, 26);
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_7 = new JLabel("CheckOutDate");
		lblNewLabel_7.setBounds(10, 471, 128, 26);
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6_1 = new JLabel("RoomType");
		lblNewLabel_6_1.setBounds(10, 556, 128, 26);
		lblNewLabel_6_1.setForeground(Color.BLACK);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("RoomExtNo");
		lblNewLabel_7_1.setBounds(10, 652, 128, 26);
		lblNewLabel_7_1.setForeground(Color.BLACK);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_7_1);
		
		JComboBox RoomExtNo = new JComboBox();
		RoomExtNo.setBounds(161, 650, 181, 30);
		RoomExtNo.setModel(new DefaultComboBoxModel(new String[] {"SelectExRoomNo", "1001", "1002", "1003", "1004", "1005", "1006", "1007"}));
		RoomExtNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(RoomExtNo);
		
		JComboBox RoomNo = new JComboBox();
		RoomNo.setBounds(161, 601, 181, 30);
		RoomNo.setModel(new DefaultComboBoxModel(new String[] {"SelectFRoomNo", "001", "002", "003", "004", "005", "006", "007"}));
		RoomNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(RoomNo);
		
		JComboBox RoomType = new JComboBox();
		RoomType.setBounds(161, 554, 181, 30);
		RoomType.setModel(new DefaultComboBoxModel(new String[] {"SelectRoomType", "Single", "Double", "Family"}));
		RoomType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(RoomType);
		
		JComboBox Gender = new JComboBox();
		Gender.setBounds(161, 276, 181, 30);
		Gender.setModel(new DefaultComboBoxModel(new String[] {"SelectGender", "Female", "Male"}));
		Gender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(Gender);
		
		JComboBox Prove = new JComboBox();
		Prove.setBounds(161, 394, 181, 30);
		Prove.setModel(new DefaultComboBoxModel(new String[] {"SelectProveOfId", "StudentId", "Passport", "DrivingLicence", "PilotLicence"}));
		Prove.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(Prove);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("RoomNo");
		lblNewLabel_5_1_1_1.setBounds(10, 603, 128, 26);
		lblNewLabel_5_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Meal");
		lblNewLabel_6_1_1.setBounds(10, 510, 128, 26);
		lblNewLabel_6_1_1.setForeground(Color.BLACK);
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel_6_1_1);
		
		JComboBox Meal = new JComboBox();
		Meal.setBounds(161, 508, 181, 30);
		Meal.setModel(new DefaultComboBoxModel(new String[] {"SelectMeal", "Breakfast", "Lunch", "Dinner"}));
		Meal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(Meal);
		
		JDateChooser jDateChooser1 = new JDateChooser();
		jDateChooser1.setBounds(161, 317, 181, 28);
		panel.add(jDateChooser1);
		
		JDateChooser jDateChooser2 = new JDateChooser();
		jDateChooser2.setBounds(161, 432, 181, 28);
		panel.add(jDateChooser2);
		
		JDateChooser jDateChooser3 = new JDateChooser();
		jDateChooser3.setBounds(161, 471, 181, 28);
		panel.add(jDateChooser3);
		
		JLocaleChooser localeChooser = new JLocaleChooser();
		localeChooser.setBounds(161, 358, 181, 26);
		panel.add(localeChooser);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(393, 0, 880, 426);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 880, 426);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CusRef", "firstName", "Surname", "Address", "PostCode", "Moblie ", "Email", "Gender", "DateOfBirth", "Nationality", "ProveOfID", "CheckInDate", "CheckOutDate", "RoomType", "RoomNo", "RoomExtNo"
			}
		));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBorder(new LineBorder(new Color(255, 255, 255), 7));
		panel_2.setBounds(393, 437, 880, 232);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("Total");
		lblNewLabel_6_1_2.setForeground(Color.BLACK);
		lblNewLabel_6_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6_1_2.setBounds(10, 124, 97, 47);
		panel_2.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("Sub Total");
		lblNewLabel_7_2.setForeground(Color.BLACK);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7_2.setBounds(10, 67, 97, 46);
		panel_2.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("Tax");
		lblNewLabel_5_1_2.setForeground(Color.BLACK);
		lblNewLabel_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_5_1_2.setBounds(10, 23, 128, 33);
		panel_2.add(lblNewLabel_5_1_2);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(117, 134, 181, 33);
		panel_2.add(jtxtTotal);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(117, 77, 181, 33);
		panel_2.add(jtxtSubTotal);
		
		jtxtTax = new JTextField();
		jtxtTax.setColumns(10);
		jtxtTax.setBounds(117, 28, 181, 29);
		panel_2.add(jtxtTax);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnUpdate.addActionListener(new ActionListener() {
		//	public Connection conn;

			public void actionPerformed(ActionEvent e) {
				//===============Update==========================
				
				String sql="INSERT INTO HotelSrujanDB ( CusRef , firstName , Surname , Address , PostCode , Moblie, Email , Gender, DateOfBirth , Nationality , ProveOfId , CheckInDate , CheckOutDate , RoomType , RoomNo , RoomExtNo )VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				
				
				try
				{
					//conn = null;
					pst= conn.prepareStatement(sql); 
					pst.setString(1, jtxtCusRef.getText());     
					pst.setString(2, jtxtfirstName.getText());     
					pst.setString(3, jtxtSurname.getText());     
					pst.setString(4, jtxtAddress.getText());     
					pst.setString(5, jtxtPostCode.getText());     
					pst.setString(6, jtxtMoblie.getText());     
					pst.setString(7, jtxtEmail.getText());     
					pst.setString(8, (String)Gender.getSelectedItem());     
					pst.setString(9, jDateChooser1.getDateFormatString());      
					pst.setString(10, (String)localeChooser.getSelectedItem());     
					pst.setString(11, (String)Prove.getSelectedItem()); 
					pst.setString(12, jDateChooser2.getDateFormatString());   
					pst.setString(13,(String) jDateChooser3.getDateFormatString());     
					pst.setString(14,(String) RoomType.getSelectedItem());          
					pst.setString(15,(String) RoomNo.getSelectedItem());          
					pst.setString(16,(String) RoomExtNo.getSelectedItem());     
					
					pst.execute();
					rs.close();
					pst.close();
					
					
				}
				catch(Exception ev)
				{
					JOptionPane.showMessageDialog(null, ev+"check2");
				}
				if(table.getSelectedRow() == -1) 
				{
					if((table.getRowCount() == 0))
					{
						JOptionPane.showMessageDialog(null,"Hotel data updated ", "Hotel System", JOptionPane.OK_OPTION);
														
					}
				
				}
				updateTable();
			}
		});
		btnUpdate.setBounds(338, 23, 119, 64);
		panel_2.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel mod = (DefaultTableModel) table.getModel();
				
				
				if(table.getSelectedRow() == -1) 
				{
					if((table.getSelectedRow() == 0))
					{
						JOptionPane.showMessageDialog(null,"No data to be deleted", "Hotel System", JOptionPane.OK_OPTION);
					 									
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Select row to delete", "Hotel System", JOptionPane.OK_OPTION);
					}
					
					
				}
				else
				{
					mod.removeRow(table.getSelectedRow());
					
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDelete.setBounds(516, 23, 119, 64);
		panel_2.add(btnDelete);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  double SingleRoom = 1200;
				  double DoubleRoom = 1300;
				  double FamilyRoom = 1550;
				  double oneMeal = 600;
				  double twoMeal = 700;
				  double threeMeal = 800;
				  try {
					  if(Meal.getSelectedItem().equals("Breakfast") && RoomType.getSelectedItem().equals("Single")) 
					  {
					  
						   double q = (SingleRoom + oneMeal);
						   double i= (q *0.25)/100;
						   String tax = String.format("$ %.2f",i);
						   jtxtTax.setText(tax);
						   
						   String subTotal = String.format("$ %.2f",q);
						   jtxtSubTotal.setText(subTotal);
						   
						   String Total = String.format("$ %.2f",q+1);
						   jtxtTotal.setText(Total);
						   
					  }
					  else if(Meal.getSelectedItem().equals("Breakfast") && RoomType.getSelectedItem().equals("Double")) 
					  {
						  
						   double q = (DoubleRoom + twoMeal);
						   double i= (q *0.25)/100;
						   String tax = String.format("$ %.2f",i);
						   jtxtTax.setText(tax);
						   
						   String subTotal = String.format("$ %.2f",q);
						   jtxtSubTotal.setText(subTotal);
						   
						   String Total = String.format("$ %.2f",q+1);
						   jtxtTotal.setText(Total);
						   
					  }
					  else if(Meal.getSelectedItem().equals("Breakfast") && RoomType.getSelectedItem().equals("Family")) 
					  {
						  
						   double q = (FamilyRoom + threeMeal);
						   double i= (q *0.25)/100;
						   String tax = String.format("$ %.2f",i);
						   jtxtTax.setText(tax);
						   
						   String subTotal = String.format("$ %.2f",q);
						   jtxtSubTotal.setText(subTotal);
						   
						   String Total = String.format("$ %.2f",q+1);
						   jtxtTotal.setText(Total);
						   
					  }
					  
					  //======================LUNCH=======================
					  else if(Meal.getSelectedItem().equals("Lunch") && RoomType.getSelectedItem().equals("Single")) 
					  {
					  
						   double q = (SingleRoom + oneMeal);
						   double i= (q *0.25)/100;
						   String tax = String.format("$ %.2f",i);
						   jtxtTax.setText(tax);
						   
						   String subTotal = String.format("$ %.2f",q);
						   jtxtSubTotal.setText(subTotal);
						   
						   String Total = String.format("$ %.2f",q+1);
						   jtxtTotal.setText(Total);
						   
					  }
					  else if(Meal.getSelectedItem().equals("Lunch") && RoomType.getSelectedItem().equals("Double")) 
					  {
						  
						   double q = (DoubleRoom + twoMeal);
						   double i= (q *0.25)/100;
						   String tax = String.format("$ %.2f",i);
						   jtxtTax.setText(tax);
						   
						   String subTotal = String.format("$ %.2f",q);
						   jtxtSubTotal.setText(subTotal);
						   
						   String Total = String.format("$ %.2f",q+1);
						   jtxtTotal.setText(Total);
						   
					  }
					  else if(Meal.getSelectedItem().equals("Lunch") && RoomType.getSelectedItem().equals("Family")) 
					  {
						  
						   double q = (FamilyRoom + threeMeal);
						   double i= (q *0.25)/100;
						   String tax = String.format("$ %.2f",i);
						   jtxtTax.setText(tax);
						   
						   String subTotal = String.format("$ %.2f",q);
						   jtxtSubTotal.setText(subTotal);
						   
						   String Total = String.format("$ %.2f",q+1);
						   jtxtTotal.setText(Total);
						   
					  }
					  //======================DINNER=======================
					  else if(Meal.getSelectedItem().equals("Dinner") && RoomType.getSelectedItem().equals("Single")) 
					  {
					  
						   double q = (SingleRoom + oneMeal);
						   double i= (q *0.25)/100;
						   String tax = String.format("$ %.2f",i);
						   jtxtTax.setText(tax);
						   
						   String subTotal = String.format("$ %.2f",q);
						   jtxtSubTotal.setText(subTotal);
						   
						   String Total = String.format("$ %.2f",q+1);
						   jtxtTotal.setText(Total);
						   
					  }
					  else if(Meal.getSelectedItem().equals("Dinner") && RoomType.getSelectedItem().equals("Double")) 
					  {
						  
						   double q = (DoubleRoom + twoMeal);
						   double i= (q *0.25)/100;
						   String tax = String.format("$ %.2f",i);
						   jtxtTax.setText(tax);
						   
						   String subTotal = String.format("$ %.2f",q);
						   jtxtSubTotal.setText(subTotal);
						   
						   String Total = String.format("$ %.2f",q+1);
						   jtxtTotal.setText(Total);
						   
					  }
					  else if(Meal.getSelectedItem().equals("Dinner") && RoomType.getSelectedItem().equals("Family")) 
					  {
						  
						   double q = (FamilyRoom + threeMeal);
						   double i= (q *0.25)/100;
						   String tax = String.format("$ %.2f",i);
						   jtxtTax.setText(tax);
						   
						   String subTotal = String.format("$ %.2f",q);
						   jtxtSubTotal.setText(subTotal);
						   
						   String Total = String.format("$ %.2f",q+1);
						   jtxtTotal.setText(Total);
						   
					  }
					  
					  
				  }
				  catch(Exception ev)
				  {
					  JOptionPane.showMessageDialog(null,ev);
				  }
				  
				
				
			}
			
			
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnTotal.setBounds(338, 124, 119, 64);
		panel_2.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				try 
				{
					jtxtCusRef.setText(null);
					jtxtfirstName.setText(null);
					jtxtSurname.setText(null);
					jtxtAddress.setText(null);
					jtxtPostCode.setText(null);
					jtxtMoblie.setText(null);
					jtxtEmail.setText(null);
					Gender.setSelectedIndex(0);
					jDateChooser1.setDate (null);
					jDateChooser2.setDate (null);
					jDateChooser3.setDate (null);
					
					Meal.setSelectedIndex(0);
					RoomType.setSelectedIndex(0);			
					RoomNo.setSelectedIndex(0);		
					RoomExtNo.setSelectedIndex(0);
					
					
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,e1);
				}
				
				
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReset.setBounds(516, 124, 119, 64);
		panel_2.add(btnReset);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					table.print();
					
				}
				catch(java.awt.print.PrinterException ev)
				{
					System.err.format("NO printer Found",ev.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPrint.setBounds(690, 23, 119, 64);
		panel_2.add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirn if you want to exit","Hotel System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnExit.setBounds(690, 127, 119, 64);
		panel_2.add(btnExit);}
}




	/*public String getSql() {
		return sql;
	}







	public void setSql(String sql) {
		this.sql = sql;
	}
}
*/