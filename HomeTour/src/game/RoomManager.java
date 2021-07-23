package game;

//import fixtures.Room;
//import game.Player;

public class RoomManager {
	static public Room[] rooms = new Room[17];
	public static Room currentRoom;
	//static public Room currentRoom() {
		return null;
	

//		return null;
//	}
	//static int[] mapIndex = mapIndex [15];
	public static void init() {
		Room gardens = new Room ("The Gardens", "gardens in front of the mansion", 
				"The gardens in front of an ominous looking mansion, "
				+ "illuminated by lightning and pelted by rain. "
				+ "You are questioning why you came here in the first place.");
		rooms[0] = gardens;
		Room currentRoom = rooms[0];
		Room outTheGates = new Room ("You Left", "out the gates", "You left the mansion, I get it, "
				+ "I was intimidated too. Your car is parked here on the street if you're ready"
				+ " to leave.");
		rooms[1] = outTheGates;
		Room atrium = new Room ("The Atrium", "a lofty entrance to a huge mansion",
				"Your options are endless in this "
				+ "large room with doors to the east, west, and north. "
				+ "There are also grand staircases leading up and down. A magnificent candelabra "
				+ "hangs in the center of the room from an iron chain.");
		rooms[2] = atrium;
		Room diningRoom = new Room ("The Dining Room", "a long room between and under the stairs",
				"An expansive room with a long table"
				+ " stretching from end to end. You count twenty chairs on each side, "
				+ "and an empty dining cart in the nearby corner. Many large windows "
				+ "show the pounding rain on the north side of the room.");
		rooms[3] = diningRoom;
		Room study = new Room ("Study", "a room filled with desks and shelves",
				"an intricately decorated room full of books on bookshelves, "
				+ "richely carved captains desk neatly cluttered with sheafs and stacks of paper."
				+ " The painting above the ergonomic office chair stands out to you...");
		rooms[4] = study;
		Room sittingRoom = new Room ("Sitting Room", "a room designed for sitting", "A room littered with "
				+ "chairs and lined around the outside with sofas and recliners. A fireplace with dying "
				+ "embers sits on the west wall.");
		rooms[5] = sittingRoom;
		Room bathroom1 = new Room ("Downstairs Bathroom", "a basic ol' bathroom", "Here is the bathroom"
				+ " noticably missing a door to the dining room, this is a place of culture.");
		rooms[6] = bathroom1;
		Room cigarRoom = new Room ("Cigar Room", "a smokey room", "A room touched by black soot"
				+ " lining the walls. Several recliners and puffy chairs surround a table with several ash "
				+ "trays and magazines. A small serving tray sits in the corner. The room smells "
				+ " of stale smoke.");
		rooms[7] = cigarRoom;
		Room livingRoom = new Room ("Living Room", "a room with a TV from floor to ceiling", "A room"
				+ " with a poofy sofa facing a wall sized TV and a knee high stone table, with a window "
				+ "behind.");
		rooms[8] = livingRoom;
		Room hallway = new Room ("Hallway", "a long stretch of hallway", "A long hallway from the top "
				+ "of the stairs to the back of the house alternating between doors and ornate paintings.");
		rooms[9] = hallway;
		Room masterBedroom = new Room ("Master Bedroom", "a bedroom with a vaulted ceiling", "A beautiful"
				+ " bedroom with a four-poster bed with a vanity in the corner, wardrobe opposite and "
				+ "bookshelf next. A ceiling fan hangs above a loveseat at the foot of the bedwindows cover "
				+ "the west wall.");
		rooms[10] = masterBedroom;
		Room masterBathroom = new Room ("Master Bathroom", "a marble strewn bathroom with gold trimm"
				+ "ings", "A richely decorated bathroom with a two headed shower-bathtub. A two-sink"
				+ " counter is void of toiletries.");
		rooms[11] = masterBathroom;
		Room library = new Room ("Library", "a book infected room", "Bookshelves line the walls in this "
				+ "massive room with tables and comfy chairs filling the center. A few step ladders lean"
				+ " against the shelves.");
		rooms[12] = library;
		Room guestBedroom = new Room ("Guest Bedroom", "a nice quaint bedroom", "A room with a slightly"
				+ " smaller bed and slightly less intricate. There is a large wardrobe on the side "
				+ "opposite windows.");
		rooms[13] = guestBedroom;
		Room guestBathroom = new Room ("Guest Bathroom", "a nice quaint bathroom", "A bathroom slightly "
				+ "worse than the master. It has a large shower and a single sink with a large counter.");
		rooms[14] = guestBathroom;
		Room auditorium = new Room ("Auditorium", "a large room with many seats and a stage", 
				"This auditorium is covered with rowed seats and a podium on the stage. Kinda weird"
				+ " place for an auditorium");
		rooms[15] = auditorium;
		Room secretRoom = new Room ("Secret Room", "what could this be?", "A secret room with a treasure"
				+ " chest full of gold doubloons! Now you remember why you came here today.");
		rooms[16] = secretRoom;
	
	}
	
	
}
}
