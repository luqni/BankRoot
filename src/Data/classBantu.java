package Data;
//import java.beans.Customizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Bisnis.Account;
import Data.classBantu;

public class classBantu {
private static int counter = 0;
	
	private static Map<Integer, Account> mapData = null;
	private static classBantu instance = null;
	
	private static Map<Integer, Account> getMapData(){
		if(mapData == null) {
			mapData = new HashMap<>();
		}
		return mapData;
	}
	public List<Account> getAllData(){
		return new ArrayList<>(getMapData().values());				
	}
	public static classBantu getInstance() {
		if(instance == null) {
			instance = new classBantu();
		}
		return instance;
	}
	public void delete(int id) {
		if(getMapData().containsKey(id)) {
			getMapData().remove(id);
		}
	}
}
