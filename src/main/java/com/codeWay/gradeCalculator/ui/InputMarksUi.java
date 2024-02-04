package com.codeWay.gradeCalculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.codeWay.gradeCalculator.service.Calculation_service;

public class InputMarksUi extends JFrame implements ActionListener {

	public InputMarksUi() {
		// TODO Auto-generated constructor stub
		initComponents();

	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		lblSubject1 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		tfSub1 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		tfSub2 = new javax.swing.JTextField();
		lblSubject2 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		lblSubject3 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		tfSub3 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();
		tfSub4 = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		lblSubject4 = new javax.swing.JLabel();
		tfSub5 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		lblSubject5 = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		btnSubmit = new javax.swing.JButton();
		btnClear = new javax.swing.JButton();
		btnClear.addActionListener(this);
		btnSubmit.addActionListener(this);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setBackground(new java.awt.Color(255, 255, 255));
		jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18));
		jLabel1.setForeground(new java.awt.Color(0, 0, 255));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Grade Calculator");

		jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14));
		jLabel4.setForeground(new java.awt.Color(51, 51, 255));
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel4.setText("Total Marks");

		lblSubject1.setFont(new java.awt.Font("Arial", 1, 14));
		lblSubject1.setText("Marathi");

		jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setText("1");

		jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14));
		jLabel2.setForeground(new java.awt.Color(51, 51, 255));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Sr.No.");

		jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14));
		jLabel3.setForeground(new java.awt.Color(51, 51, 255));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("Subject");

		jTextField1.setEditable(false);
		jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField1.setText("100");

		tfSub1.setFont(new java.awt.Font("Segoe UI", 1, 14));
		tfSub1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14));
		jLabel5.setForeground(new java.awt.Color(51, 51, 255));
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setText("Marks Obtained");

		jTextField3.setEditable(false);
		jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField3.setText("100");

		tfSub2.setFont(new java.awt.Font("Segoe UI", 1, 14));
		tfSub2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		lblSubject2.setFont(new java.awt.Font("Arial", 1, 14));
		lblSubject2.setText("English");

		jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("2");

		lblSubject3.setFont(new java.awt.Font("Arial", 1, 14));
		lblSubject3.setText("Mathematics");

		jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("3");

		tfSub3.setFont(new java.awt.Font("Segoe UI", 1, 14));
		tfSub3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jTextField6.setEditable(false);
		jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField6.setText("100");

		jTextField7.setEditable(false);
		jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField7.setText("50");

		tfSub4.setFont(new java.awt.Font("Segoe UI", 1, 14));
		tfSub4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("4");

		lblSubject4.setFont(new java.awt.Font("Arial", 1, 14));
		lblSubject4.setText("Science 1");

		tfSub5.setFont(new java.awt.Font("Segoe UI", 1, 14));
		tfSub5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel10.setText("5");

		lblSubject5.setFont(new java.awt.Font("Arial", 1, 14));
		lblSubject5.setText("Science 2");

		jTextField10.setEditable(false);
		jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 14));
		jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField10.setText("50");

		btnSubmit.setBackground(new java.awt.Color(51, 255, 51));
		btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14));
		btnSubmit.setText("Submit");

		btnClear.setBackground(new java.awt.Color(204, 204, 204));
		btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12));
		btnClear.setText("Clear");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(26, 26, 26).addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(20, 20, 20))
				.addGroup(layout.createSequentialGroup().addGap(78, 78, 78).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(27, 27, 27).addComponent(jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE, 104,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(27, 27, 27).addComponent(lblSubject1,
														javax.swing.GroupLayout.PREFERRED_SIZE, 159,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(27, 27, 27).addComponent(lblSubject2,
														javax.swing.GroupLayout.PREFERRED_SIZE, 159,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(27, 27, 27).addComponent(lblSubject3,
														javax.swing.GroupLayout.PREFERRED_SIZE, 159,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(27, 27, 27).addComponent(lblSubject4,
														javax.swing.GroupLayout.PREFERRED_SIZE, 159,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(27, 27, 27).addComponent(lblSubject5,
														javax.swing.GroupLayout.PREFERRED_SIZE, 159,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup().addGap(17, 17, 17).addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE))))))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel5)
								.addGroup(layout.createSequentialGroup().addGap(24, 24, 24)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(tfSub1, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tfSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tfSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tfSub4, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tfSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(78, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblSubject5, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tfSub1, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tfSub2, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tfSub3, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tfSub4, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(21, 21, 21)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tfSub5, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		new InputMarksUi().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnClear) {

			int ch = JOptionPane.showConfirmDialog(null, "Confirm you want to clear ?");

			if (ch == 0) {
				tfSub1.setText("");
				tfSub2.setText("");
				tfSub3.setText("");
				tfSub4.setText("");
				tfSub5.setText("");
			}
		}
		if (e.getSource() == btnSubmit) {

			if (tfSub1.getText() == "" || tfSub2.getText() == "" || tfSub3.getText() == "" || tfSub4.getText() == ""
					|| tfSub5.getText() == "") {
				JOptionPane.showMessageDialog(null, "Please fill all the subject marks");
			} else {

				int Subject1Marks = Integer.parseInt(tfSub1.getText());
				int Subject2Marks = Integer.parseInt(tfSub2.getText());
				int Subject3Marks = Integer.parseInt(tfSub3.getText());
				int Subject4Marks = Integer.parseInt(tfSub4.getText());
				int Subject5Marks = Integer.parseInt(tfSub5.getText());

				int[] allMarks = { Subject1Marks, Subject2Marks, Subject3Marks, Subject4Marks + Subject5Marks };

				Calculation_service cs = new Calculation_service();

				int totalMarks = cs.calculateTotalMarks(allMarks);

				double averageMarks = cs.calculateAverage(allMarks);

				String gradeget = cs.calculateGrade(allMarks);

				this.dispose();
				new ResultUi(totalMarks, averageMarks, gradeget).setVisible(true);
			}
		}

	}

	private javax.swing.JButton btnClear;
	private javax.swing.JButton btnSubmit;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JLabel lblSubject1;
	private javax.swing.JLabel lblSubject2;
	private javax.swing.JLabel lblSubject3;
	private javax.swing.JLabel lblSubject4;
	private javax.swing.JLabel lblSubject5;
	private javax.swing.JTextField tfSub1;
	private javax.swing.JTextField tfSub2;
	private javax.swing.JTextField tfSub3;
	private javax.swing.JTextField tfSub4;
	private javax.swing.JTextField tfSub5;

}
