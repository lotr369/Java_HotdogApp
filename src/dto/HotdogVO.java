package dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HotdogVO {
	private int id; // 핫도그 관리번호
	private String hotdog; // 핫도그
	private String bread; // 빵
	private String patty; // 패티
	private String topping; // 토핑
	private String drink; // 음료수
	private int price; // 가격
	private LocalDateTime localDateTime;// 시간
	private String localDateFormat;

	public String getHotdog() {
		return hotdog;
	}

	public void setHotdog(String hotdog) {
		this.hotdog = hotdog;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getPatty() {
		return patty;
	}

	public void setPatty(String patty) {
		this.patty = patty;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 시간
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
		setLocalDateFormat();
	}

	public String getLocalDateFormat() {
		return localDateFormat;
	}

	public void setLocalDateFormat() {
		this.localDateFormat =
		this.localDateTime.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	@Override
	public String toString() {
		return "핫도그 앱 [주문번호=" + id + ", hotdog: " + hotdog + ", 가격: " + price + "원" + "]";
	}

	public String addBread() {
		return "핫도그 앱 [주문번호=" + id + ", Bread: " + bread + ", 가격: " + price + "원" + "]";
	}

	public String addPatty() {
		return "핫도그 앱 [주문번호=" + id + ", Patty: " + patty + ", 가격: " + price + "원" + "]";
	}

	public String addTopping() {
		return "핫도그 앱 [주문번호=" + id + ", Topping: " + topping + ", 가격: " + price + "원" + "]";
	}

	public String addDrink() {
		return "핫도그 앱 [주문번호=" + id + ", Drink: " + drink + ", 가격: " + price + "원" + "]";
	}
	
	public String addSetMenu() {
		return "핫도그 앱 [주문번호=" + id + ", hotdog: " + hotdog + ", Drink: "+ drink +", 가격: " + price/2 + "원" + "]"+" 반값 이벤트 진행중 ";
	}
}
