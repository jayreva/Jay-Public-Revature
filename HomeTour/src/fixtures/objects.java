package fixtures;

import game.RoomManager;

public class objects extends Fixture{
	public objects (String name, String shortDescription) {
		super (name, shortDescription);
		this.name = name;
		this.shortDescription = shortDescription;
	
	//this.target = game.Main.target;
	}
	}

//public static void objectsMessages(Room currentRoom) {
//	if (currentRoom == RoomManager.rooms[0]) {
//		if (game.Main.equalsIgnoreCase(target));
//		System.out.println(longDescription);
//		System.out.println("These flowers smell pretty good but you should get inside, it's raining!");
//	} else if (currentRoom == RoomManager.rooms[1]) {
//		System.out.println("Off you go, back to safety, wondering what could have been.");
//	} else if (currentRoom == RoomManager.rooms[2]) {
//		System.out.println("Situated on the candelabra are 15 lit candles and 5 unlit.");		
//	} else if (currentRoom == RoomManager.rooms[3]) {
//		System.out.println("This cart is empty. Not even a crumb.");
//	} else if (currentRoom == RoomManager.rooms[4]) {
//		System.out.println("This desk is covered with papers in a different language,"
//		+ " interesting...");
//		System.out.println("This painting is of Fernando Cortez, legendary conquistador."
//		+ " He is standing next to a treasure chest and surrounded by forest.");
//		System.out.println("It is a dark and stormy night...");
//	} else if (currentRoom == RoomManager.rooms[5]) {
//		System.out.println("The fireplace is ashy, etched into this soot is the "
//		+ "number 1519");
//		System.out.println("It is a dark and stormy night...");
//	} else if (currentRoom == RoomManager.rooms[6]) {
//		System.out.println("You flush the toilet");
//	} else if (currentRoom == RoomManager.rooms[7]) {
//		System.out.println("Now is not the time for reading Golf Digest.");
//		System.out.println("It is a dark and stormy night...");
//		System.out.println("A couple finished cigars all with the same type, Outlaw 700.");
//	} else if (currentRoom == RoomManager.rooms[8]) {
//		System.out.println("Pawn Stars is on.");
//		System.out.println("It is a dark and stormy night...");
//	} else if (currentRoom == RoomManager.rooms[10]) {
//		System.out.println("Perhaps the comfiest bed youve ever experienced,"
//		+ " you catch yourself just before you nod off.");
//		System.out.println("Damn you look good.");
//		System.out.println("It is a dark and stormy night...");
//		System.out.println("You open the wardrobe to find a lion inside; no time "
//		+ "for that now.");
//	} else if (currentRoom == RoomManager.rooms[11]) {
//		System.out.println("Turn on the shower");
//		System.out.println("Look out the windows");
//		System.out.println("Admire yourself in the mirror");
//	} else if (currentRoom == RoomManager.rooms[12]) {
//		System.out.println("I’m Emily Elizabeth, and I have a dog.\r\n"
//+ "My dog is a big red dog.\r\n"
//+ "Other kids I know have dogs, too. Some are big dogs.\r\n"
//+ "And some are red dogs.\r\n"
//+ "But I have the biggest, reddest dog on our street.\r\n"
//+ "This is my dog-Clifford.\r\n"
//+ "We have fun together. We play games.\r\n"
//+ "I throw a stick, and he brings it back to me.\r\n"
//+ "He makes mistakes sometimes.\r\n"
//+ "We play hide-and-seek.\r\n"
//+ "I’m a good hide-and-seek player.\r\n"
//+ "I can find Clifford, no matter where he hides.\r\n"
//+ "We play camping out, and I don’t need a tent.\r\n"
//+ "He can do tricks, too.\r\n"
//+ "He can sit up and beg.\r\n"
//+ "Oh, I know he’s not perfect.\r\n"
//+ "He has some bad habits.\r\n"
//+ "He runs after cars. He catches some of them.\r\n"
//+ "He runs after cats, too. We don’t go to the zoo anymore.\r\n"
//+ "He digs up flowers.\r\n"
//+ "Clifford loves to chew shoes.\r\n"
//+ "It’s not easy to keep Clifford.\r\n"
//+ "He eats and drinks a lot.\r\n"
//+ "His house was a problem, too.\r\n"
//+ "But he’s a very good watch dog.\r\n"
//+ "The bad boys don’t come around anymore.\r\n"
//+ "One day I gave Clifford a bath.\r\n"
//+ "And I combed his hair, and took him to the dog show.\r\n"
//+ "I’d like to say Clifford won first prize.\r\n"
//+ "But he didn’t.\r\n"
//+ "I don’t care.\r\n"
//+ "You can keep all your small dogs.\r\n"
//+ "You can keep all your black, white, brown, and spotted dogs.\r\n"
//+ "I’ll keep Clifford….Wouldn’t you?");
//		System.out.println("You come to a shelf with bookends shaped like a double X.");
//	} else if (currentRoom == RoomManager.rooms[13]) {
//		System.out.println("This bed is just ok.");
//		System.out.println("You take a peek inside the wardrobe and see a frosty witch,"
//		+ " no time for that now.");
//		System.out.println("It is a dark and stormy night...");
//	} else if (currentRoom == RoomManager.rooms[14]) {
//		System.out.println("You flush the toilet.");
//		System.out.println("It is a dark and stormy night...");
//	} else if (currentRoom == RoomManager.rooms[15]) {
//		System.out.println("You notice an out of place iPad on the podium."
//		+ " It is asking for the passcode with an index of [gardens,atrium,"
//		+ "diningroom,sittingroom,cigarroom,masterbathroom,library]."
//		+ " Goosebumps...");
//		System.out.println("Blood alone moves the wheels of history! Have you "
//		+ "ever asked yourselves in an hour of meditation, which "
//		+ "everyone finds during the day,how long we have been striving"
//		+ " for greatness? Not only the years we've been at war, the war"
//		+ " of work, but from the moment as a child when we realized that"
//		+ " the world could be conquered. It has been a lifetime struggle."
//		+ " A never-ending fight. I say to you, and you will understand "
//		+ "that it is a privilege to fight! We are warriors! Salesmen of "
//		+ "north-eastern Pennsylvania, I ask you once more: Rise and be "
//		+ "worthy of this historical hour! No revolution is worth anything "
//		+ "if it cannot defend itself! Some people will tell you salesman is "
//		+ "a bad word. They'll conjure up images of used car dealers and door"
//		+ " to door charlatans. This is our duty: to change their perception. "
//		+ "I say salesmen... and women of the world unite! We must never acquiesce"
//		+ " for it is together, TOGETHER, THAT WE PREVAIL! We must never cede "
//		+ "control of the motherland!");
//	} else if (currentRoom == RoomManager.rooms[16]) {
//		System.out.println("You have more money than you know what to do with"
//		+ ", unfortunately you don't have anything to spend it on stuck down"
//		+ " here. :(. Good job though!");
//		System.out.println("Go up the stairs to the auditorium");
//	}

