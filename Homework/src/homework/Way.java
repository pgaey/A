package homework;

public class Way {
	
	// 교통수단, 출발지점, 도착지점, 걸리는 시간, 몇 정거장
	
	// [ 필드부 ] 
	private String transport;
	private String startStation;
	private String endStation;
	private int takeTime;
	private int howManyStops;
	
	
	// [생성자부] 
	
	
	// [메소드부] 
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
		return "학원에 오기 위해 " + startStation + "역에서 "  + transport + "을 타고 " + endStation 
				+ "역까지 갑니다. 걸리는 시간은 약 " + takeTime + "분이고 정거장 수는 " + howManyStops + "개입니다.";
	}
	
	
	
	
	
	
	
}
