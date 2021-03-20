package controller;

/*
 * Factory
 * ::
 * Action을 만드는 공장 (공장 하나만 있으면 되니까 singletone으로 만들어 놓으면 된다 )
 */
public class ActionFactory{
	
	//1.
	private static ActionFactory factory = new ActionFactory();  // 볼펜을 만들 때 쓸 공장 1개를 유일 무이하게 만들어 놓는다 
	
	//2.
	private ActionFactory(){
		
	}
	
	public static ActionFactory getInstance() {
		return factory;
	}
	
	// action 을 생성하는 기능
	public Action createAction(String command) {   // Command 값에 따라서 서로다른 action 을 만든다
		Action action = null;
		if(command.equals("INSERT")) {
			action = new AddAction();        //  command 에 맞게 공장에서 action 을 생성한다 _ AddAction()  그 후  action 부모 타입으로 생성해서 넘긴다
		}else if(command.equals("DELETE")) {
			action = new DeleteAction();
		}else if(command.equals("UPDATE")) {
			action = new UpdateAction();
		}
		return action;
	}
}
