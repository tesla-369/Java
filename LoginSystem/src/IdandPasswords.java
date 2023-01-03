import java.util.HashMap;

public class IdandPasswords {
	
	HashMap<String,String> LoginInfo = new HashMap<String, String>();
	 
	IdandPasswords(){
		
		LoginInfo.put("focus", "quantum");
		LoginInfo.put("focus1", "LULU");
		LoginInfo.put("focus2", "machinelearning");
		
	}
	
	protected HashMap getLoginInfo(){
		return LoginInfo;
				
	}

}
