package dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HotdogVO {
	private int id; // �ֵ��� ������ȣ
	private String hotdog; // �ֵ���
	private String bread; // ��
	private String patty; // ��Ƽ
	private String topping; // ����
	private String drink; // �����
	private int price; // ����
	private LocalDateTime localDateTime;// �ð�
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

	// �ð�
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
		return "�ֵ��� �� [�ֹ���ȣ=" + id + ", hotdog: " + hotdog + ", ����: " + price + "��" + "]";
	}

	public String addBread() {
		return "�ֵ��� �� [�ֹ���ȣ=" + id + ", Bread: " + bread + ", ����: " + price + "��" + "]";
	}

	public String addPatty() {
		return "�ֵ��� �� [�ֹ���ȣ=" + id + ", Patty: " + patty + ", ����: " + price + "��" + "]";
	}

	public String addTopping() {
		return "�ֵ��� �� [�ֹ���ȣ=" + id + ", Topping: " + topping + ", ����: " + price + "��" + "]";
	}

	public String addDrink() {
		return "�ֵ��� �� [�ֹ���ȣ=" + id + ", Drink: " + drink + ", ����: " + price + "��" + "]";
	}
	
	public String addSetMenu() {
		return "�ֵ��� �� [�ֹ���ȣ=" + id + ", hotdog: " + hotdog + ", Drink: "+ drink +", ����: " + price/2 + "��" + "]"+" �ݰ� �̺�Ʈ ������ ";
	}
}
