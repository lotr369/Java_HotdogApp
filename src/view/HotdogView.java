package view;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import dto.HotdogVO;

public class HotdogView { // C , R
	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random();
	private String[] strArr = new String[50]; //구매정보 저장
	private int stored = 0;
	private String name = null;
	private int idNum = 0;
	private String[] strArr1 = new String[50]; //리뷰정보 저장
	private int stored1 = 0;
	private String ID = null;
	private String review = null;

	// Main menu
	public int getMenu() {
		System.out.println("맛있는 핫도그배달 앱입니다.");
		System.out.println("0) 종료");
		System.out.println("1) 주문하기");
		System.out.print("메뉴 입력 : ");
		int choice = -1;
		try {
			choice = scanner.nextInt();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			scanner.nextLine();
			System.out.println("범위내 숫자를 입력해주세요.");
		}
		return choice;
	}

	// Menu2
	public int getMenu2() {
		System.out.println();
		System.out.println("맛있는 핫도그주문 메뉴화면입니다.");
		System.out.println("0) 돌아가기 ");
		System.out.println("1) 기본메뉴 ");
		System.out.println("2) 세트메뉴(할인 이벤트)");
		System.out.println("3) 오늘의 추천메뉴 (Random 토핑) ");
		System.out.println("4) 핫도그 토핑 직접 고르기 (준비중인 서비스입니다.)");
		System.out.println("5) 구매정보 확인(장바구니)");
		System.out.println("6) 리뷰작성 ");
		System.out.println("7) 리뷰보기");
		System.out.print("메뉴 입력 : ");
		int choice2 = -1;
		try {
			choice2 = scanner.nextInt();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			scanner.nextLine();
			System.out.println("범위내 숫자를 입력해주세요.");
		}
		return choice2;
	}
	
	// 주문정보 입력
	public void getString() {
		stored = putStr(scanner, strArr, stored, name, idNum);
	}

	// 주문정보 출력
	public void outString() {
		outStr(strArr, stored, idNum, name);
	}

	// 주문정보 저장
	public static int putStr(Scanner scanner, String[] strArr, int stored, String name, int idNum) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setLocalDateTime(LocalDateTime.now());
		System.out.println("이름과 주문번호를 입력해주세요.");
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.println("주문번호를 입력해주세요.");
		System.out.print("주문번호: ");
		idNum = scanner.nextInt();
		scanner.nextLine();
		System.out.print("배달 주소 입력 : ");
		String str1 = scanner.nextLine();
		strArr[stored++] = name + "님의 " + " 주문번호:" + idNum;
		strArr[stored++] = "주소:" + str1 + '\n';
		System.out.println("배달지역이 저장되었습니다.[" + LocalDateTime.now() + "]");
		System.out.println("주문해 주셔서 감사합니다.");
		return stored;
	}

	// 장바구니 출력
	public static void outStr(String[] strArr, int stored, int idNum, String name) {
		if (stored != 0) {
			for (int i = 0; i < stored; i++) {
				System.out.println(strArr[i]);
			}
		} else {
			System.out.println("저장된 정보가 없습니다.");
		}
	}
	
	//리뷰 저장
	public void getReview() {
		stored1 = putReview(scanner, strArr1, stored1, ID, review);
	}

	// 리뷰저장 출력
	public void outReview() {
		outID(strArr1, stored1, review, ID);
	}

	//리뷰 작성
	public static int putReview(Scanner scanner, String[] strArr1, int stored1, String ID, String review) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setLocalDateTime(LocalDateTime.now());
		System.out.println("ID를 입력해주세요.");
		System.out.print("ID : ");
		ID = scanner.nextLine();
		System.out.println("리뷰를 입력해주세요.");
		System.out.print("리뷰: ");
		review = scanner.nextLine();
		System.out.print("별점: ");
		String str2 = scanner.nextLine();
		strArr1[stored1++] = ID + "님의 " + " 리뷰:" + review;
		strArr1[stored1++] = "별점:" + str2 + '\n';
		System.out.println("리뷰가 저장되었습니다. [" + LocalDateTime.now() + "]");
		System.out.println("감사합니다..");
		return stored1;
	}

	// 리뷰 출력
		public static void outID(String[] strArr1, int stored1, String review, String ID) {
			if (stored1 != 0) {
				for (int i = 0; i < stored1; i++) {
					System.out.println(strArr1[i] +" "+ LocalDateTime.now());
				}
			} else {
				System.out.println("저장된 리뷰가 없습니다."+"[" + LocalDateTime.now() + "]");				
				}
			}

	// C 기본 핫도그
	public void createHotdog(List<HotdogVO> hotdogSet, int id, String hotdog, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setHotdog(hotdog);
		hotdogVO.setPrice(price);
		hotdogSet.add(hotdogVO);
		System.out.println(hotdogVO.toString());
	}
	
	// C 세트 메뉴
	public void createSetMenu(List<HotdogVO> setMenu, int id, String hotdogSet, String drink, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setHotdog(hotdogSet);
		hotdogVO.setDrink(drink);
		hotdogVO.setPrice(price);
		setMenu.add(hotdogVO);
		System.out.println(hotdogVO.addSetMenu());
	}

	// C 빵
	public void createBread(List<HotdogVO> breadList, int id, String bread, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setBread(bread);
		hotdogVO.setPrice(price);
		breadList.add(hotdogVO);
		System.out.println(hotdogVO.addBread());
	}

	// C 패티
	public void createPatty(List<HotdogVO> pattyList, int id, String patty, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setPatty(patty);
		hotdogVO.setPrice(price);
		pattyList.add(hotdogVO);
		System.out.println(hotdogVO.addPatty());
	}

	// C 토핑
	public void createTopping(List<HotdogVO> toppingList, int id, String topping, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setTopping(topping);
		hotdogVO.setPrice(price);
		toppingList.add(hotdogVO);
		System.out.println(hotdogVO.addTopping());
	}

	// C 음료수
	public void createDrink(List<HotdogVO> drinkList, int id, String drink, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setDrink(drink);
		hotdogVO.setPrice(price);
		drinkList.add(hotdogVO);
		System.out.println(hotdogVO.addDrink());
	}

	// R 핫도그
	public void getHotdogAll(List<HotdogVO> hotdogSet) {
		Iterator<HotdogVO> itr = hotdogSet.iterator();
		while (itr.hasNext()) {
			HotdogVO hotdogVO = itr.next();
			System.out.println(hotdogVO.toString());
		}
	}
	
	//R 세트메뉴
	public void getSetMenuAll(List<HotdogVO> setMenu) {
		Iterator<HotdogVO> itr = setMenu.iterator();
		while (itr.hasNext()) {
			HotdogVO hotdogVO = itr.next();
			System.out.println(hotdogVO.addSetMenu());
		}
	}

	// R 음료수
	public void getDrinkAll(List<HotdogVO> drinkList) {
		Iterator<HotdogVO> itr = drinkList.iterator();
		while (itr.hasNext()) {
			HotdogVO hotdogVO = itr.next();
			System.out.println(hotdogVO.addDrink());
		}
	}

	// R 랜덤 빵
	public void getBread(List<HotdogVO> breadList) {
		int randomIndex = random.nextInt(breadList.size());
		HotdogVO hotdogVO = breadList.get(randomIndex);
		System.out.println(hotdogVO.addBread());
	}

	// R 랜덤 패티
	public void getPatty(List<HotdogVO> pattyList) {
		int randomIndex = random.nextInt(pattyList.size());
		HotdogVO hotdogVO = pattyList.get(randomIndex);
		System.out.println(hotdogVO.addPatty());
	}

	// R 랜덤 토핑
	public void getTopping(List<HotdogVO> toppingList) {
		int randomIndex = random.nextInt(toppingList.size());
		HotdogVO hotdogVO = toppingList.get(randomIndex);
		System.out.println(hotdogVO.addTopping());
	}

	// R 랜덤 음료수
	public void getDrink(List<HotdogVO> drinkList) {
		int randomIndex = random.nextInt(drinkList.size());
		HotdogVO hotdogVO = drinkList.get(randomIndex);
		System.out.println(hotdogVO.addDrink());
	}
}