package com.kh.list.mvc.run;

import com.kh.list.mvc.view.MusicView;

// 실행클래스 : 실행
public class MusicRun {

	public static void main(String[] args) {
		
		// MVC 패턴을 적용한 음악관리 프로그램			
		// M : Model, 데이터를 담당하는 역할(model.vo : 값을 담는다, model.dao : 값을 처리한다(입력이든 출력이든)
		// V : View, 사용자가 보는 화면을 처리(입력, 출력)
		// => View가 아닌 곳에서 입/출력문 최대한 사용을 자제!!!
		// C : Controller, 사용자가 화면을 통해서 요청한 것을 받아서 처리하고 결과를 돌려주는 역할
		// V랑 C랑 왔다갔다
		
		
		new MusicView().mainMenu();
		
		
		
		
		
		
		
	}

}
