package hwBasicHTTPServer;

import java.util.ArrayList;

public class Room {

	public ArrayList<ClientSocket> clientList;
	
	public Room(String inputName) {
		clientList = new ArrayList<ClientSocket>();
	}
	
	
}
