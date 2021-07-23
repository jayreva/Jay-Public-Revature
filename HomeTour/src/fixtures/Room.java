package fixtures;

import game.RoomManager;

public class Room extends Fixture {	
	//private Room[] exit;

	public Room (String name, String shortDescription, String longDescription) {
		super (name, shortDescription, longDescription);
		
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		
	}
	public Room () {
	super();
	}

	
public void roomMessages(Room currentRoom) {
	if (currentRoom == RoomManager.rooms[0]) {
		System.out.println(longDescription);
		System.out.println("Smell flowers");
		System.out.println("North to the atrium");
		System.out.println("South to your car");
	} else if (currentRoom == RoomManager.rooms[1]) {
		System.out.println(longDescription);
		System.out.println("North to the atrium");
	} else if (currentRoom == RoomManager.rooms[2]) {
		System.out.println("Admire the candelabra");
		System.out.println("North to the dining room");
		System.out.println("East to the study");
		System.out.println("South to the gardens");
		System.out.println("West to the sitting room");
		System.out.println("Up the stairs to the hallway");
		System.out.println("Down the stairs to the auditorium");		
	} else if (currentRoom == RoomManager.rooms[3]) {
		System.out.println("Inspect the serving cart");
		System.out.println("North to the living room");
		System.out.println("East to the cigar room");
		System.out.println("South to the atrium");
	} else if (currentRoom == RoomManager.rooms[4]) {
		System.out.println("Search the desk");
		System.out.println("Inspect the painting");
		System.out.println("Look out the window");
		System.out.println("North to the cigar room");
		System.out.println("West to the atrium");
	} else if (currentRoom == RoomManager.rooms[5]) {
		System.out.println("Admire the fireplace");
		System.out.println("Look out the window");
		System.out.println("North to the bathroom");
		System.out.println("East to the atrium");
	} else if (currentRoom == RoomManager.rooms[6]) {
		System.out.println("Flush the toilet");
		System.out.println("North to the living room");
		System.out.println("South to the sitting room");
	} else if (currentRoom == RoomManager.rooms[7]) {
		System.out.println("Study the magazines");
		System.out.println("Look out the window");
		System.out.println("Inspect the cigar butts");
		System.out.println("North to the living room");
		System.out.println("South to the study");
		System.out.println("West to the dining room");
	} else if (currentRoom == RoomManager.rooms[8]) {
		System.out.println("Watch TV");
		System.out.println("Look out the window");
		System.out.println("East door to the cigar room");
		System.out.println("South door to the dining room");
		System.out.println("West door to the bathroom");
	} else if (currentRoom == RoomManager.rooms[9]) {
		System.out.println("North to the master bedroom");
		System.out.println("East to the library");
		System.out.println("West to the guest bedroom");
		System.out.println("Down the stairs to the atrium");
	} else if (currentRoom == RoomManager.rooms[10]) {
		System.out.println("Lay on the bed");
		System.out.println("Touch up your makeup at the vanity");
		System.out.println("Look out the window");
		System.out.println("Check in the wardrobe");
		System.out.println("South to the hallway");
		System.out.println("West to the master bathroom");
	} else if (currentRoom == RoomManager.rooms[11]) {
		System.out.println("Turn on the shower");
		System.out.println("Look out the windows");
		System.out.println("Admire yourself in the mirror");
		System.out.println("East to the master bedroom");
	} else if (currentRoom == RoomManager.rooms[12]) {
		System.out.println("Sit down with a good book");
		System.out.println("Climb the step ladder and look for oddities");
		System.out.println("Look out the windows");
		System.out.println("West to the hallway");
	} else if (currentRoom == RoomManager.rooms[13]) {
		System.out.println("Lay on the slightly worse bed");
		System.out.println("Check in the wardrobe");
		System.out.println("Look out the windows");
		System.out.println("North to the guest bathroom");
		System.out.println("East to the hallway");
	} else if (currentRoom == RoomManager.rooms[14]) {
		System.out.println("Flush the toilet");
		System.out.println("Look out the window");
		System.out.println("South to the guest bathroom");
	} else if (currentRoom == RoomManager.rooms[15]) {
		System.out.println("Take to the podium");
		System.out.println("Give a speech");
		System.out.println("Go up the stairs to the atrium");
	} else if (currentRoom == RoomManager.rooms[16]) {
		System.out.println("Examine treasure chest");
		System.out.println("Go up the stairs to the auditorium");
	}
}
//public Room getExit(String direction) {
	
//}

//public Room[] getExits( ) {
//	for (int i = 0; i <= 5; i++) {
//		if (i == 0 & exits[i] != null) {
//			System.out.println("Go North to: " + exit[0]);
//			System.out.println("Go East to: " + exit[1]);
//			System.out.println("Go South to: " + exit[2]);
//			System.out.println("Go West to: " + exit[3]);
//			System.out.println("Go Up the stairs to: " + exit[4]);
//			System.out.println("Go Down the stairs to: " + exit[5]);
//		}
//	}
//	}
}
