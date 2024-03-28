package statsVisualiser.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;

import javax.swing.*;

import userManagement.Faculty;
import userManagement.NonFaculty;
import userManagement.Student;
import userManagement.User;
import userManagement.Visitor;

public class MainUINew extends JFrame {

	private static final long serialVersionUID = 1L;

	private static MainUINew instance;

	public static MainUINew getInstance() {
		if (instance == null)
			instance = new MainUINew();

		return instance;
	}

	private MainUINew() {
		// Set window title
		super("YU Library Management App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel signupPanel = createSignupPanel();
		JPanel loginPanel = createLoginPanel();

		// Add panels to the frame
		add(signupPanel, BorderLayout.NORTH);
		add(loginPanel, BorderLayout.SOUTH);

		// Center the frame on the screen
		setLocationRelativeTo(null);
	}

	private JPanel createSignupPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2));

		JLabel userIdLabel = new JLabel("ID:");
		JTextField userIdField = new JTextField();

		JLabel emailLabel = new JLabel("Email:");
		JTextField emailField = new JTextField();

		JLabel passwordLabel = new JLabel("Password:");
		JPasswordField passwordField = new JPasswordField();

		JLabel userTypeLabel = new JLabel("UserType:");
		Vector<Class<? extends User>> userTypes = new Vector<Class<? extends User>>();
		userTypes.add(Student.class);
		userTypes.add(Faculty.class);
		userTypes.add(NonFaculty.class);
		userTypes.add(Visitor.class);
		JComboBox<Class<? extends User>> userTypeList = new JComboBox<Class<? extends User>>(userTypes);

		JButton signupButton = new JButton("SignUp");

		// Add action listener to the signup button
		signupButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Handle signup logic here
				int userId = Integer.parseInt(userIdField.getText());
				String email = emailField.getText();
				String password = new String(passwordField.getPassword());
				Class<? extends User> userType = userTypeList.getItemAt(userTypeList.getSelectedIndex());
				try {
					boolean signup = User.signup(userId, email, password, userType);
					if (signup) {
						JOptionPane.showMessageDialog(null, "You have successfully signed-up");
					} else {
						JOptionPane.showMessageDialog(null, "Email in use");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// Add components to the panel
		panel.add(userIdLabel);
		panel.add(userIdField);
		panel.add(emailLabel);
		panel.add(emailField);
		panel.add(passwordLabel);
		panel.add(passwordField);
		panel.add(userTypeLabel);
		panel.add(userTypeList);
		panel.add(signupButton);

		return panel;
	}

	private JPanel createLoginPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));

		JLabel emailLabel = new JLabel("Email:");
		JTextField emailField = new JTextField();
		JLabel passwordLabel = new JLabel("Password:");
		JPasswordField passwordField = new JPasswordField();
		JButton loginButton = new JButton("Login");

		// Add action listener to the login button
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Handle signup logic here
				String email = emailField.getText();
				String password = new String(passwordField.getPassword());
				try {
					User login = User.login(email, password);
					if (login != null) {
						JOptionPane.showMessageDialog(null, "You have successfully logged-in");
					} else {
						JOptionPane.showMessageDialog(null, "Incorrect email or password, or not verified");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// Add components to the panel
		panel.add(emailLabel);
		panel.add(emailField);
		panel.add(passwordLabel);
		panel.add(passwordField);
		panel.add(loginButton);

		return panel;
	}

	public static void main(String[] args) {
		JFrame frame = MainUINew.getInstance();
		frame.setSize(900, 600);
		frame.setVisible(true);
	}
}
