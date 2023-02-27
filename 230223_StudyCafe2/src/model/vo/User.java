package model.vo;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private String usingtype;
	private int pucharseCount;
	private int couponCount;

	public User() {}
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.usingtype = "";
		this.pucharseCount = 0;
		this.couponCount = 0;
	}
	
	public User(String userId, String userPwd, String userName, String usingtype, int purcharseCount, int couponCount) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.usingtype = usingtype;
		this.pucharseCount = purcharseCount;
		this.couponCount = couponCount;
	}

	public int getPucharseCount() {
		return pucharseCount;
	}

	public void setPucharseCount(int pucharseCount) {
		this.pucharseCount = pucharseCount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUsingtype() {
		return usingtype;
	}

	public void setUsingtype(String usingtype) {
		this.usingtype = usingtype;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", usingtype=" + usingtype
				+ ", pucharseCount=" + pucharseCount + ", couponCount=" + couponCount + "]";
	}

	

	
}
