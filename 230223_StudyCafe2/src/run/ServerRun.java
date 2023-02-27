package run;

import model.dao.StudyDao;

public class ServerRun {

	public static void main(String[] args) {
		
		StudyDao studydao = new StudyDao();
		studydao.connect();

		
	}
			
}
