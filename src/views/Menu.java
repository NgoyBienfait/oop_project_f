package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;




public class Menu {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 245, 220));
		frame.setBounds(100, 100, 583, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnAction = new JMenu("Action");
		menuBar.add(mnAction);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnAction.add(mntmSave);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mnAction.add(mntmLogout);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelpContent = new JMenuItem("help content");
		mnHelp.add(mntmHelpContent);
		
		JMenuItem mntmProperties = new JMenuItem("Properties");
		mnHelp.add(mntmProperties);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 250, 205));
		panel_3.setBounds(112, 0, 445, 319);
		frame.getContentPane().add(panel_3);
		panel_3.setVisible(false);
		panel_3.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 53, 71, 28);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_3.add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(197, 53, 211, 28);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 105, 211, 28);
		textField_1.setColumns(10);
		panel_3.add(textField_1);
		
		JLabel lblLarstName = new JLabel("Sex:");
		lblLarstName.setBounds(10, 159, 71, 28);
		lblLarstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_3.add(lblLarstName);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(197, 159, 211, 28);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "I don't wanna talk", "others"}));
		panel_3.add(comboBox);
		
		JLabel label = new JLabel("Larst Name:");
		label.setBounds(10, 105, 71, 28);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_3.add(label);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 199, 211, 28);
		textField_2.setColumns(10);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(197, 14, 211, 28);
		textField_3.setColumns(10);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(197, 241, 211, 28);
		textField_4.setColumns(10);
		panel_3.add(textField_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 330, 557, 43);
		frame.getContentPane().add(panel_2);
		
		JLabel lblDateOfBirth = new JLabel("Course");
		lblDateOfBirth.setBounds(10, 199, 95, 28);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_3.add(lblDateOfBirth);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(146, 291, 77, 28);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_3.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						textField_1.getText(),
						textField_2.getText(),
						textField_3.getText(),
						textField_4.getText(),
						comboBox.getSelectedItem(),
						textField.getText(),
				});
			
if (table.getSelectedRow()==1) {
			if(table.getRowCount()==0) {
				JOptionPane.showConfirmDialog(null,"memsbership Update Confirm","System Message",JOptionPane.OK_OPTION);
			}
		}
		
		panel_3.setVisible(true);
 		panel_2.setVisible(true);
		
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(331, 280, 77, 28);
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancel.setBackground(new Color(220, 20, 60));
		panel_3.add(btnCancel);
		
		
		
		
		JLabel lblReferenceNumber = new JLabel("Reference number:");
		lblReferenceNumber.setBounds(10, 14, 125, 28);
		lblReferenceNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_3.add(lblReferenceNumber);
		
		
		
		JLabel lblRegistrationNumber = new JLabel("Registration number");
		lblRegistrationNumber.setBounds(10, 238, 125, 28);
		lblRegistrationNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_3.add(lblRegistrationNumber);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 108, 319);
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(112, 0, 445, 319);
		panel_1.setBackground(new Color(245, 222, 179));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				btnStudent.setForeground(Color.white);
				btnStudent.setBackground(Color.blue);
			}
		});
		btnStudent.setBounds(10, 11, 89, 38);
		panel.add(btnStudent);
		
		JButton btnCouse = new JButton("Couse");
		btnCouse.setBounds(10, 60, 89, 38);
		panel.add(btnCouse);
		
		JButton btnCourseUnits = new JButton("Course Units");
		btnCourseUnits.setBounds(10, 109, 89, 38);
		panel.add(btnCourseUnits);
		
		JButton btnLecturers = new JButton("Lecturers");
		btnLecturers.setBounds(10, 158, 89, 38);
		panel.add(btnLecturers);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEdit.setBackground(Color.blue);
		btnEdit.setForeground(new Color(255, 255, 255));
		btnEdit.setBounds(173, 11, 89, 38);
		panel_1.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(Color.red);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setBounds(327, 11, 89, 38);
		panel_1.add(btnDelete);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBounds(10, 11, 89, 38);
		btnAdd.setBackground(Color.green);
		panel_1.add(btnAdd);
		btnAdd .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_3.setVisible(true);
				btnEdit.setVisible(false);
				btnDelete.setVisible(false);
				btnAdd.setVisible(false);
			}
		});
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 425, 248);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"number", "First Name", "Last Name", "Sex", "Course", "Registration"
			}
		) {
			Class[] columnTypes = new Class[] {
				Double.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(79);
		table.getColumnModel().getColumn(0).setMinWidth(31);
		table.getColumnModel().getColumn(4).setPreferredWidth(63);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		scrollPane.setViewportView(table);
		
		
		JTextPane txtpnCopyrightGroupkings = new JTextPane();
		txtpnCopyrightGroupkings.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnCopyrightGroupkings.setText("Copyright group_Kings 2019");
		panel_2.add(txtpnCopyrightGroupkings);
	}

	public static void main(Object object) {
		// TODO Auto-generated method stub
		
	}
}

