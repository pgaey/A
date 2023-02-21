package homeworkrun;

import homework.Way;

public class Run_Way {

	public static void main(String[] args) {

		
		Way way = new Way();
		
		way.setTransport("ÁöÇÏÃ¶");
		way.setStartStation("¾î·æ");
		way.setEndStation("Á¾°¢");
		way.setTakeTime(70);
		way.setHowManyStops(31);
		
		
		
		String transport = way.getTransport();
		String start = way.getStartStation();
		String end = way.getEndStation();
		int takeTime = way.getTakeTime();
		int manyStation = way.getHowManyStops();
		
		
		System.out.println(way.Info());
		
		
		
		
	}

}
