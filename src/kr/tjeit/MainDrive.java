package kr.tjeit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import kr.tjeit.datas.Person;

public class MainDrive {


	public static void main(String[] args) {
		printMenu();
	}

	static void printMenu() {
		Scanner scan = new Scanner(System.in);
		int userInPut = 0;
		while(true) {
			System.out.println("*****�޴����*****");
			System.out.println("1. ��ȭ��ȣ�߰�");
			System.out.println("2. ��ȭ��ȣ ��� ��ȸ");
			System.out.println("0. ���α׷� ����");
			System.out.println("===============");
			System.out.println("��ȣ�� �Է��ϼ��� : ");
			userInPut = scan.nextInt();
			if(userInPut==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if(userInPut==1){
//				��ȭ��ȣ �߰� �޴� �ڵ� �ۼ�
				addPhoneNum();
			}
			else if(userInPut==2) {
				printPhoneNumList();
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}

	static void addPhoneNum(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("�̸��� �Է����ּ��� : ");
		String name = scanner.nextLine();

		System.out.println("������ �Է����ּ��� : ");
		String PhoneNum = scanner.nextLine();

		System.out.println("�̸� : " + name);
		System.out.println("���� : " + PhoneNum);
		

		File f = new File("C:/temp/phonebook.csv");
		
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);



		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");

		String dateStr = sdf.format(cal.getTime());
		System.out.println(dateStr);

		bw.write(name + ","+ PhoneNum + ","+ dateStr);

	static void printPhoneNumList() {

		File file = new File("C:/temp/phonebook.csv");

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		
		
		while (true) {
			String line = br.readline();
			
			
			String[] infos = line.split(split(","));
			Person p = new Person();
			p.setName(infos[0]);
			p.setPhoneNum()
			Calendar c = Calendar. getInstaknce
			

		}

	}

}

}
