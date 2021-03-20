package client;

import controller.Action;
import controller.ActionFactory;

public class DispatcherMainTest {

	public static void main(String[] args) {
		String command = "INSERT";     // 원래는 화면/웹에서 받는 경우를 형상화 
		
		//1.
		ActionFactory factory = ActionFactory.getInstance();   // Singletone으로 정의된 factory를 받아와서  
		Action action = factory.createAction(command);     // command  값에 알맞는  component 를 공장에서 생성하도록 하고 ex) AddAction() 이 아니라 부모 타입 Action으로 리턴
		
		//2.
		String path = action.execute();     // 이때 Action 을 구현한 AddAction의 exeucte ()가 실행된다 
		
		System.out.println("결과페이지"+path+"로 이동합니다");
		

	}

}
