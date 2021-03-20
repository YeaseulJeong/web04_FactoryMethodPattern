package controller;
/*
 * Component
 * ::
 */

public class AddAction implements Action{

	@Override
	public String execute() {
		/*
		 * 1. FORM 값 받아서
		 * 2. DAO 리턴 받고
		 * 3. 비즈니스 로직 호출
		 * 4. 리턴값 바인딩
		 * 5. 네이게이션
		 */
		return "add_result.jsp";
	}
	
}
