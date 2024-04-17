package advance.dev;

import java.util.Scanner;

public class MainApp {
	// Phương thức input() nhập danh sách sinh viên từ bàn phím
	public static Student[] input() {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[10];

		System.out.println("Nhập thông tin cho 10 sinh viên:");

		for (int i = 0; i < 10; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();

			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Địa chỉ: ");
			String address = scanner.nextLine();

			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();

			System.out.print("Điểm trung bình: ");
			double averageScore = scanner.nextDouble();
			scanner.nextLine(); //

			students[i] = new Student(name, age, address, phoneNumber, averageScore);
		}

		return students;
	}

	// Phương thức print() in ra danh sách sinh viên
	public static void print(Student[] students) {
		System.out.println("Danh sách sinh viên:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Thông tin sinh viên thứ " + (i + 1) + ":");
			System.out.println("Tên: " + students[i].name);
			System.out.println("Tuổi: " + students[i].age);
			System.out.println("Địa chỉ: " + students[i].address);
			System.out.println("Số điện thoại: " + students[i].phoneNumber);
			System.out.println("Điểm trung bình: " + students[i].averageScore);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Student[] students = input();
		print(students);
	}
}
