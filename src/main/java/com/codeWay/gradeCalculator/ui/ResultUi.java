package com.codeWay.gradeCalculator.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ResultUi extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int totalMarks;
	double averageMarks;
	String g;

	public ResultUi(int totalMarks, double averageMarks, String g) {

		this.totalMarks = totalMarks;
		this.averageMarks = averageMarks;
		this.g = g;

		initComponents();
		onLoadPage();

	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		lblParty1 = new javax.swing.JLabel();
		lblTotalMarks = new javax.swing.JLabel();
		lblAvgPercentage = new javax.swing.JLabel();
		lblParty4 = new javax.swing.JLabel();
		lblParty5 = new javax.swing.JLabel();
		lblGrade = new javax.swing.JLabel();
		btnBack = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setBackground(new java.awt.Color(255, 255, 255));
		jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(0, 0, 255));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Your Result");

		lblParty1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lblParty1.setText("Total Marks");

		lblTotalMarks.setBackground(new java.awt.Color(255, 255, 255));
		lblTotalMarks.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
		lblTotalMarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblTotalMarks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		lblTotalMarks.setText(String.valueOf(totalMarks));

		lblAvgPercentage.setBackground(new java.awt.Color(255, 255, 255));
		lblAvgPercentage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
		lblAvgPercentage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblAvgPercentage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		lblAvgPercentage.setText(String.valueOf(averageMarks));

		lblParty4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lblParty4.setText("Average percentage");

		lblParty5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lblParty5.setText("Grade");

		lblGrade.setBackground(new java.awt.Color(255, 255, 255));
		lblGrade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
		lblGrade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		lblGrade.setText(g);

		btnBack.setBackground(new java.awt.Color(204, 204, 204));
		btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		btnBack.setText("Back");
		btnBack.addActionListener(this);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(70, 70, 70)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										layout.createSequentialGroup()
												.addComponent(lblParty1, javax.swing.GroupLayout.PREFERRED_SIZE, 159,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(lblTotalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										layout.createSequentialGroup()
												.addComponent(lblParty4, javax.swing.GroupLayout.PREFERRED_SIZE, 159,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(lblAvgPercentage, javax.swing.GroupLayout.PREFERRED_SIZE,
														99, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										layout.createSequentialGroup()
												.addComponent(lblParty5, javax.swing.GroupLayout.PREFERRED_SIZE, 159,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(lblGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(70, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup()
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(96, 96, 96))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup()
												.addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(145, 145, 145)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(39, 39, 39)
				.addComponent(
						jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(34, 34, 34)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblParty1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTotalMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(34, 34, 34)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblParty4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAvgPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(34, 34, 34)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblParty5, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(37, 37, 37).addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(27, 27, 27)));

		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new ResultUi(0, 0, "A").setVisible(true);
	}

	public void onLoadPage() {
		// TODO Auto-generated method stub

		String grade = lblGrade.getText().trim();

		if (grade.equals("A")) {
			lblGrade.setForeground(new java.awt.Color(0, 255, 0));
		}
		if (grade.equals("F")) {
			lblGrade.setForeground(new java.awt.Color(255, 0, 0));
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == btnBack) {

			this.dispose();
			new InputMarksUi().setVisible(true);
		}

	}

	private javax.swing.JButton btnBack;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel lblAvgPercentage;
	private javax.swing.JLabel lblGrade;
	private javax.swing.JLabel lblParty1;
	private javax.swing.JLabel lblParty4;
	private javax.swing.JLabel lblParty5;
	private javax.swing.JLabel lblTotalMarks;

}
