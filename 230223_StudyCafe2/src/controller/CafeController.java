package controller;

import java.util.ArrayList;

import model.vo.User;

public class CafeController {
	
	ArrayList<User> userList = new ArrayList();
	
	{
		userList.add(new User("latent32", "a", "전태영"));
	}
	
	public int insertUser(String userId, String userPwd, String userName) {
		
		int possible = 0;
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUserId().equals(userId))
			{
				return 1;
			} 
		}
		if(possible == 0) {
			userList.add(new User(userId, userPwd, userName));
		}
		return possible;
	}
	
	public int loginUser(String userId, String userPwd) {
		int sucess = 0;
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUserId().equals(userId))
			{
				if(userList.get(i).getUserPwd().equals(userPwd))
				{
					sucess = 1;
				}
			}
		}
		return sucess;
	}
	
	public void ticketbuy(String userId, int ticketNum) {
		
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUserId().equals(userId)) {
				switch(ticketNum) {
				case 1 : userList.get(i).setUsingtype("1개월권"); break;
				case 2 : userList.get(i).setUsingtype("3개월권"); break;
				case 3 : userList.get(i).setUsingtype("6개월권"); break;
				case 4 : userList.get(i).setUsingtype("1시간권"); break;
				case 5 : userList.get(i).setUsingtype("3시간권"); break;
				case 6 : userList.get(i).setUsingtype("12시간권"); break;
					
				}
			}
			userList.get(i).setPucharseCount(userList.get(i).getPucharseCount() + 1);
			if(userList.get(i).getPucharseCount() % 5 == 0) {
				System.out.println("5회 이용으로 쿠폰이 발급되었습니다.");
				userList.get(i).setCouponCount(userList.get(i).getCouponCount() + 1);
			}
		}
	}
	public void ticketuse(String userId) {
		
		
		
		
		
		
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUserId().equals(userId)) {
				userList.get(i).setUsingtype(null);
			}
		}
	}
	public void moveseat(String userId) {
	
	}
	public void deleteseat(String userId) {
	
	}
	public void menuorder(String userId) {
		System.out.println("\n" + userId + "님 커피나왔습니다 ~ \n");
	}
	
	public ArrayList<User> viewuser() {
		return userList;
	}
	

}
