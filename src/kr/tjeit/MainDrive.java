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
			System.out.println("*****메뉴목록*****");
			System.out.println("1. 전화번호추가");
			System.out.println("2. 전화번호 목록 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("===============");
			System.out.println("번호를 입력하세요 : ");
			userInPut = scan.nextInt();
			if(userInPut==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(userInPut==1){
//				전화번호 추가 메뉴 코드 작성
				addPhoneNum();
			}
			else if(userInPut==2) {
				printPhoneNumList();
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}

	static void addPhoneNum(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력해주세요 : ");
		String name = scanner.nextLine();

		System.out.println("폰번을 입력해주세요 : ");
		String PhoneNum = scanner.nextLine();

		System.out.println("이름 : " + name);
		System.out.println("폰번 : " + PhoneNum);
		

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
