package homework;

public class Way {
	
	// �������, �������, ��������, �ɸ��� �ð�, �� ������
	
	// [ �ʵ�� ] 
	private String transport;
	private String startStation;
	private String endStation;
	private int takeTime;
	private int howManyStops;
	
	
	// [�����ں�] 
	
	
	// [�޼ҵ��] 
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}
	public void setTakeTime(int takeTime) {
		this.takeTime = takeTime;
	}
	public void setHowManyStops(int howManyStops) {
		this.howManyStops = howManyStops;
	}
	
	
	
	public String getTransport() {
		return transport;
	}
	public String getStartStation() {
		return startStation;
	}
	public String getEndStation() {
		return endStation;
	}
	public int getTakeTime() {
		return takeTime;
	}
	public int getHowManyStops() {
		return howManyStops;
	}
	
	
	
	
	
	public String Info() {
		return "�п��� ���� ���� " + startStation + "������ "  + transport + "�� Ÿ�� " + endStation 
				+ "������ ���ϴ�. �ɸ��� �ð��� �� " + takeTime + "���̰� ������ ���� " + howManyStops + "���Դϴ�.";
	}
	
	
	
	
	
	
	
}
