package com.codeWay.gradeCalculator.service;

public class Calculation_service {

	private int totalMarks;
	private double averagePercentage;
	private String grade;

	public int calculateTotalMarks(int[] arr) {

		totalMarks = 0;
		for (int mark : arr) {

			totalMarks += mark;
		}

		return totalMarks;
	}

	public double calculateAverage(int[] arr) {

		int total = calculateTotalMarks(arr);

		averagePercentage = (double) total / arr.length;

		return averagePercentage;
	}

	public String calculateGrade(int[] arr) {
		double average = calculateAverage(arr);

		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		}else if (average >= 35) {
			grade = "E";
		} else {
			grade = "F";
		}

		return grade;
	}
}
