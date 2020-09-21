package app;

import controller.HotdogController;
import dto.HotdogVO;

public class HotdogApp {
	public static void main(String[] args) {
		HotdogController hotdogController = new HotdogController();

		// C 기본 핫도그목록
		System.out.println("-핫도그-");
		hotdogController.createHodog(0, "칠리핫도그", 5000);
		hotdogController.createHodog(1, "불고기핫도그", 5500);
		hotdogController.createHodog(2, "치킨핫도그", 5000);
		hotdogController.createHodog(3, "돈까스핫도그", 5000);
		hotdogController.createHodog(4, "베이컨핫도그", 5500);
		System.out.println();
		
		// C 세트메뉴
		System.out.println("-세트메뉴- (반값 이벤트)");
		hotdogController.createSetMenu(0, "칠리세트", "콜라/사이다", 6000);
		hotdogController.createSetMenu(1, "불고기세트", "콜라/사이다", 7000);
		hotdogController.createSetMenu(2, "치킨세트", "콜라/사이다", 6000);
		hotdogController.createSetMenu(3, "돈세트", "콜라/사이다", 6000);
		hotdogController.createSetMenu(4, "베이컨세트", "콜라/사이다", 7000);
		System.out.println();
				
		// C 빵목록
		System.out.println("-빵-");
		hotdogController.createBread(0, "오트 ", 800);
		hotdogController.createBread(1, "햄버거 빵", 800);
		hotdogController.createBread(2, "식빵", 800);
		hotdogController.createBread(3, "위트 ", 800);
		hotdogController.createBread(4, "플랫 브래드", 1000);
		hotdogController.createBread(5, "또띠아", 1000);
		System.out.println();

		// C 패티목록
		System.out.println("-패티-");
		hotdogController.createPatty(0, "치킨 패티", 1200);
		hotdogController.createPatty(1, "돈까스 패티 ", 1200);
		hotdogController.createPatty(2, "불고기 패티", 1500);
		hotdogController.createPatty(3, "생선튀김 패티 ", 1200);
		hotdogController.createPatty(4, "새우 패티 ", 1400);
		hotdogController.createPatty(5, "베이컨 ", 1500);
		hotdogController.createPatty(6, "헤쉬브라운 ", 1200);
		System.out.println();

		// C 토핑목록
		System.out.println("-토핑-");
		hotdogController.createTopping(0, "치즈 ", 500);
		hotdogController.createTopping(1, "피클 ", 500);
		hotdogController.createTopping(2, "할라피뇨 ", 700);
		hotdogController.createTopping(3, "토마토 ", 700);
		hotdogController.createTopping(4, "파인애플 ", 700);
		hotdogController.createTopping(5, "참치마요 ", 500);
		hotdogController.createTopping(6, "고추장 ", 500);
		hotdogController.createTopping(7, "케찹 ", 300);
		hotdogController.createTopping(8, "머스타드 ", 300);
		hotdogController.createTopping(9, "초코", 500);
		hotdogController.createTopping(10, "불닭소스", 700);
		hotdogController.createTopping(11, "민트", 1000);
		hotdogController.createTopping(12, "특제소스", 700);
		System.out.println();

		// C 음료수목록
		System.out.println("-음료수-");
		hotdogController.createDrink(0, "콜라", 1000);
		hotdogController.createDrink(1, "사이다", 1000);
		hotdogController.createDrink(2, "아이스 티", 1000);
		hotdogController.createDrink(3, "녹차", 1200);
		hotdogController.createDrink(4, "아메리카노", 1200);
		hotdogController.createDrink(5, "물", 1000);
		System.out.println();

//		// 출력 테스트
//		hotdogController.getHotdogAll();
//		hotdogController.getDrinkAll();
//		System.out.println();
//
//		// U 기본 핫도그 수정
//		HotdogVO hotdogU = new HotdogVO();
//		hotdogU.setId(1);
//		hotdogU.setHotdog("수정된 핫도그");
//		hotdogU.setPrice(5000);
//		hotdogController.putHotdog(hotdogU);
//
//		// U 음료수 수정
//		HotdogVO drinkU = new HotdogVO();
//		drinkU.setId(1);
//		drinkU.setDrink("수정된 음료수 ");
//		drinkU.setPrice(1000);
//		hotdogController.putDrink(drinkU);
//
//		// U 빵 수정
//		HotdogVO breadU = new HotdogVO();
//		breadU.setId(0);
//		breadU.setBread("수정된 빵");
//		breadU.setPrice(1000);
//
//		// U 패티 수정
//		HotdogVO pattyU = new HotdogVO();
//		pattyU.setId(0);
//		pattyU.setPatty("수정된 패티");
//		pattyU.setPrice(1000);
//		hotdogController.putPatty(pattyU);
//
//		// U 토핑 수정
//		HotdogVO toppingU = new HotdogVO();
//		toppingU.setId(0);
//		toppingU.setTopping("수정된 토핑");
//		toppingU.setPrice(1000);
//		hotdogController.putTopping(toppingU);
//
//		// R 수정후 출력 테스트
//		hotdogController.getHotdogAll();
//		hotdogController.getDrinkAll();
//		hotdogController.getBread();
//		hotdogController.getPatty();
//		hotdogController.getTopping();
//		System.out.println();
//
//		// D 기본 핫도그 삭제
//		HotdogVO hotdogD = new HotdogVO();
//		hotdogD.setId(3);
//		hotdogController.deleteHotdog(hotdogD);
//
//		// D 음료수 삭제
//		HotdogVO drinkD = new HotdogVO();
//		drinkD.setId(1);
//		hotdogController.deleteDrink(hotdogD);
//		
//		// D 빵 삭제
//		HotdogVO breadD = new HotdogVO();
//		breadD.setId(0);
//		hotdogController.deleteBread(breadD);
//
//		// D 패티 삭제
//		HotdogVO pattyD = new HotdogVO();
//		pattyD.setId(0);
//		hotdogController.deletePatty(pattyD);
//
//		// D 토핑 삭제
//		HotdogVO toppingD = new HotdogVO();
//		toppingD.setId(0);
//		hotdogController.deleteTopping(toppingD);
//
//		// R 삭제후 출력 테스트
//		hotdogController.getHotdogAll();
//		hotdogController.getDrinkAll();
//		hotdogController.getBread();
//		hotdogController.getPatty();
//		hotdogController.getTopping();
//		System.out.println();

		// 메인 앱 실행
		hotdogController.runApp();
	}
}
