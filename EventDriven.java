import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class EventDriven extends JFrame {


	public static void main(String[] args) {
		
		EventDriven frame = new EventDriven();
		frame.setVisible(true);
		frame.setSize(250, 350);
		frame.setLocation(700,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("INPUT");

	}

	public EventDriven() {

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(400, 400);
		panel.setLocation(0, 0);
		panel.setVisible(true);
		add(panel);

		JTextField firstNameField = new JTextField();
		JTextField lastNameField = new JTextField();
		JTextField middleNameField = new JTextField();
		JTextField mobileNumberField = new JTextField();
		JTextField eMailField = new JTextField();
		JButton btnSubmit = new JButton("Submit");
		JButton btnClearAll = new JButton("Clear All");
		

		panel.setLayout(null);
		panel.add(firstNameField);
		panel.add(lastNameField);
		panel.add(middleNameField);
		panel.add(mobileNumberField);
		panel.add(eMailField);
		panel.add(btnSubmit);
		panel.add(btnClearAll);
		
		//Box Layout
		firstNameField.setBounds(20, 30, 190, 20);
		lastNameField.setBounds(20, 75, 190, 20);
		middleNameField.setBounds(20, 120, 190, 20);
		mobileNumberField.setBounds(20, 165, 190, 20);
		eMailField.setBounds(20, 210, 190, 20);
		btnSubmit.setBounds(25, 255, 90, 30);
		btnClearAll.setBounds(125, 255, 90, 30);

		//Label
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setBounds(75, 0, 100, 33);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setBounds(75, 45, 100, 33);
		panel.add(lblLastName);

		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMiddleName.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiddleName.setBounds(75, 90, 100, 33);
		panel.add(lblMiddleName);

		JLabel lblMobileNumber = new JLabel("Mobile Number:");
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMobileNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNumber.setBounds(75, 135, 100, 33);
		panel.add(lblMobileNumber);

		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmailAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailAddress.setBounds(75, 180, 100, 33);
		panel.add(lblEmailAddress);

		//Button ClearAll Action Listener
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNameField.setText("");
				lastNameField.setText("");
				middleNameField.setText("");
				mobileNumberField.setText("");
				eMailField.setText("");
			}
		});


		//Button Submit Action Listener and OUTPUT 

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = firstNameField.getText();
				String lastName = lastNameField.getText();
				String middleName = middleNameField.getText();
				String mobileNo = mobileNumberField.getText();
				String email = eMailField.getText();

				JFrame frame = new JFrame("OUTPUT");
				frame.setSize(350, 250);
				frame.setLocation(700,200);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);

				JPanel panel = new JPanel();
				panel.setLayout(null);
				frame.add(panel);

				JLabel firstNameField = new JLabel("First Name: \t" + firstName);
				firstNameField.setFont(new Font("Tahoma", Font.PLAIN, 13));
				firstNameField.setSize(200, 20);
				firstNameField.setLocation(20, 20);
				panel.add(firstNameField);

				JLabel lastNameField = new JLabel("Last Name: \t" + lastName);
				lastNameField.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lastNameField.setSize(200, 20);
				lastNameField.setLocation(20, 50);
				panel.add(lastNameField);

				JLabel middleNameField = new JLabel("Middle Name: \t" + middleName);
				middleNameField.setFont(new Font("Tahoma", Font.PLAIN, 13));
				middleNameField.setSize(200, 20);
				middleNameField.setLocation(20, 80);
				panel.add(middleNameField);

				JLabel mobileNumberField = new JLabel("Mobile Number \t" + mobileNo);
				mobileNumberField.setFont(new Font("Tahoma", Font.PLAIN, 13));
				mobileNumberField.setSize(200, 20);
				mobileNumberField.setLocation(20, 110);
				panel.add(mobileNumberField);

				JLabel eMailField = new JLabel("Email: \t" + email);
				eMailField.setFont(new Font("Tahoma", Font.PLAIN, 13));
				eMailField.setSize(200, 20);
				eMailField.setLocation(20, 140);
				panel.add(eMailField);
				
				JButton button = new JButton("Okay");
				button.setFont(new Font("Tahoma", Font.PLAIN, 13));
				button.setSize(70, 30);
				button.setLocation(120, 175);
				panel.add(button);

				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
					}
				});
			}
		});
	}
}
