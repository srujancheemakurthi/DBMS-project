package loginHotel;
import hotelSrujan.*;
//import HotelSrujanData.*;
import java.awt.EventQueue;
import java.awt.Image;
import java.net.URL;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class LoginHotel {

	private JFrame frame;
	private JTextField jtxtUserName;
	private JPasswordField jtxtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginHotel window = new LoginHotel();
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
	public LoginHotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.getContentPane().setForeground(SystemColor.desktop);
		frame.setBounds(100, 100, 729, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSrujanPic = new JLabel("HOTEL");
		lblSrujanPic.setBounds(-13, 0, 427, 429);
		lblSrujanPic.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSrujanPic.setBackground(new Color(255, 182, 193));
		Image img = new ImageIcon(this.getClass().getResource("/hotel.png")).getImage();
		frame.getContentPane().setLayout(null);
		lblSrujanPic.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblSrujanPic);
		
		JLabel lblHotelManagmentSystem = new JLabel("HOTEL MANAGMENT SYSTEM");
		lblHotelManagmentSystem.setBounds(414, 53, 270, 35);
		lblHotelManagmentSystem.setLabelFor(lblHotelManagmentSystem);
		lblHotelManagmentSystem.setBackground(Color.CYAN);
		lblHotelManagmentSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelManagmentSystem.setFont(new Font("Ink Free", Font.BOLD, 18));
		lblHotelManagmentSystem.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblHotelManagmentSystem);
		
		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setForeground(new Color(255, 255, 255));
		lblUserName.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 16));
		lblUserName.setBackground(Color.BLUE);
		lblUserName.setBounds(424, 160, 96, 35);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 16));
		lblPassword.setBackground(Color.BLUE);
		lblPassword.setBounds(424, 206, 96, 35);
		frame.getContentPane().add(lblPassword);
		
		jtxtUserName = new JTextField();
		jtxtUserName.setBackground(new Color(224, 255, 255));
		jtxtUserName.setBounds(534, 158, 171, 28);
		frame.getContentPane().add(jtxtUserName);
		jtxtUserName.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		Image img1 = new ImageIcon(this.getClass().getResource("/ok-icon.png")).getImage();
		btnOk.setIcon(new ImageIcon(img1));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = jtxtPassword.getText();
				String UserName = jtxtUserName.getText();
				
			if(password.contains("mohan") && UserName.contains("srujan")) 
				{
					jtxtPassword.setText(null);
					jtxtUserName.setText(null);
								
					hotelSrujan info =new hotelSrujan();
					hotelSrujan.main(null);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					jtxtPassword.setText(null);
					jtxtUserName.setText(null);
								
					
				}

				
				
			}
					}
		);
		btnOk.setBackground(new Color(255, 255, 224));
		btnOk.setForeground(new Color(0, 0, 205));
		btnOk.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnOk.setBounds(518, 269, 115, 57);
		frame.getContentPane().add(btnOk);
		
		JLabel lblAbcHotel = new JLabel("ABC HOTEL 7STAR");
		lblAbcHotel.setForeground(new Color(255, 250, 205));
		lblAbcHotel.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 18));
		lblAbcHotel.setBounds(534, 99, 171, 28);
		frame.getContentPane().add(lblAbcHotel);
		
		JLabel lblId = new JLabel("ID:12345");
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setBounds(424, 398, 53, 20);
		frame.getContentPane().add(lblId);
		
		JLabel lblSci = new JLabel("Since1996");
		lblSci.setFont(new Font("HP Simplified", Font.ITALIC, 16));
		lblSci.setForeground(new Color(255, 255, 240));
		lblSci.setBounds(619, 11, 75, 31);
		frame.getContentPane().add(lblSci);
		
		JLabel lblVisakhapatanam = new JLabel("VISAKHAPATANAM");
		lblVisakhapatanam.setForeground(new Color(250, 250, 210));
		lblVisakhapatanam.setFont(new Font("Segoe UI Historic", Font.ITALIC, 13));
		lblVisakhapatanam.setBounds(590, 367, 115, 35);
		frame.getContentPane().add(lblVisakhapatanam);
		
		JLabel label = new JLabel("530013");
		label.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 14));
		label.setForeground(new Color(255, 240, 245));
		label.setBounds(619, 393, 75, 28);
		frame.getContentPane().add(label);
		
		jtxtPassword = new JPasswordField();
		jtxtPassword.setBounds(530, 210, 175, 28);
		frame.getContentPane().add(jtxtPassword);
	}
}