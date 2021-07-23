package game;

import java.util.Scanner;
//import fixtures.Room;
//import fixtures.objects;
//import fixtures.Fixture;

import fixtures.Room;

public class Main {
	public static void main(String[] args) {
		boolean shower = false;
		//RoomManager roomManager = new RoomManager();
		init();
		//System.out.println(longDescription + roomMessages);
		
		int i = 0;
		while ( i != -1) {
			String line = null;
			if (parseComm(collectInput()).equalsIgnoreCase("go")) {
				if (RoomManager.currentRoom == RoomManager.rooms[0]) {
					if (parseTarg(line).equalsIgnoreCase("south")) {
						RoomManager.currentRoom = RoomManager.rooms[1];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[2];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[1]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[0];
						break;
					} else System.out.println("Enter a valid command please"); 
				} else if (RoomManager.currentRoom == RoomManager.rooms[2]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[3];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("east")) {
						RoomManager.currentRoom = RoomManager.rooms[4];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("south")) {
						RoomManager.currentRoom = RoomManager.rooms[0];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("west")) {
						RoomManager.currentRoom = RoomManager.rooms[5];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("up")) {
						RoomManager.currentRoom = RoomManager.rooms[9];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("down")) {
						RoomManager.currentRoom = RoomManager.rooms[15];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[3]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[8];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("east")) {
						RoomManager.currentRoom = RoomManager.rooms[7];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("south")) {
						RoomManager.currentRoom = RoomManager.rooms[2];
						break;
					} else System.out.println("Enter a valid command please"); 
				} else if (RoomManager.currentRoom == RoomManager.rooms[4]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[7];
						break;
					}  else if (parseTarg(line).equalsIgnoreCase("west")) {
						RoomManager.currentRoom = RoomManager.rooms[2];
						break;
					} else System.out.println("Enter a valid command please"); 
				} else if (RoomManager.currentRoom == RoomManager.rooms[5]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[6];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("east")) {
						RoomManager.currentRoom = RoomManager.rooms[2];
						break;
					} else System.out.println("Enter a valid command please"); 
				} else if (RoomManager.currentRoom == RoomManager.rooms[6]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[8];
						break;
					}  else if (parseTarg(line).equalsIgnoreCase("south")) {
						RoomManager.currentRoom = RoomManager.rooms[5];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[7]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[8];
						break;
					}  else if (parseTarg(line).equalsIgnoreCase("south")) {
						RoomManager.currentRoom = RoomManager.rooms[4];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("west")) {
						RoomManager.currentRoom = RoomManager.rooms[3];
						break;
					} else System.out.println("Enter a valid command please"); 
				} else if (RoomManager.currentRoom == RoomManager.rooms[8]) {
					if (parseTarg(line).equalsIgnoreCase("east")) {
						RoomManager.currentRoom = RoomManager.rooms[7];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("south")) {
						RoomManager.currentRoom = RoomManager.rooms[3];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("west")) {
						RoomManager.currentRoom = RoomManager.rooms[6];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[9]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[10];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("east")) {
						RoomManager.currentRoom = RoomManager.rooms[12];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("west")) {
						RoomManager.currentRoom = RoomManager.rooms[13];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("down")) {
						RoomManager.currentRoom = RoomManager.rooms[2];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[10]) {
					if (parseTarg(line).equalsIgnoreCase("south")) {
						RoomManager.currentRoom = RoomManager.rooms[9];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("west")) {
						RoomManager.currentRoom = RoomManager.rooms[11];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[11]) {
					if (parseTarg(line).equalsIgnoreCase("east")) {
						RoomManager.currentRoom = RoomManager.rooms[10];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[12]) {
					if (parseTarg(line).equalsIgnoreCase("west")) {
						RoomManager.currentRoom = RoomManager.rooms[9];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[13]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						RoomManager.currentRoom = RoomManager.rooms[14];
						break;
					} else if (parseTarg(line).equalsIgnoreCase("east")) {
						RoomManager.currentRoom = RoomManager.rooms[9];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[14]) {
					if (parseTarg(line).equalsIgnoreCase("south")) {
						RoomManager.currentRoom = RoomManager.rooms[13];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[15]) {
					if (parseTarg(line).equalsIgnoreCase("down")) {
						RoomManager.currentRoom = RoomManager.rooms[16];
						break;
					} else System.out.println("Enter a valid command please");
				} else if (RoomManager.currentRoom == RoomManager.rooms[16]) {
					if (parseTarg(line).equalsIgnoreCase("north")) {
						System.out.println("The trapdoor has closed, looks like you're stuck here...");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("east")) {
						System.out.println("The trapdoor has closed, looks like you're stuck here...");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("south")) {
						System.out.println("The trapdoor has closed, looks like you're stuck here...");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("west")) {
						System.out.println("The trapdoor has closed, looks like you're stuck here...");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("up")) {
						System.out.println("The trapdoor has closed, looks like you're stuck here...");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("down")) {
						System.out.println("The trapdoor has closed, looks like you're stuck here...");
						break;
					} else System.out.println("Enter a valid command please");
				}
			} else if (parseComm(collectInput()).equalsIgnoreCase("interact")) {
				if (RoomManager.currentRoom == RoomManager.rooms[0]) {
					if (parseTarg(line).equalsIgnoreCase("flowers")) {
						System.out.println("These tulips smell pretty good but you should get inside,"
								+ " it's raining!");
						break;
					} else System.out.println("Enter a valid command please");
						break;
					}
				} else if (RoomManager.currentRoom == RoomManager.rooms[1]) {
					if (parseTarg(line).equalsIgnoreCase("car")) {
						System.out.println("Off you go, back to safety, wondering what could have been.");
						System.exit(0);
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[2]) {
					if (parseTarg(line).equalsIgnoreCase("candelabra")) {
						System.out.println("Situated on the candelabra are 15 lit candles and 5 unlit.");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[3]) {
					if (parseTarg(line).equalsIgnoreCase("serving cart")) {
						System.out.println("This cart is empty. Not even a crumb.");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[4]) {
					if (parseTarg(line).equalsIgnoreCase("desk")) {
						System.out.println("This desk is covered with papers in a different language,"
								+ " interesting...");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("painting")) {
						System.out.println("This painting is of Fernando Cortez, legendary conquistador."
								+ " He is standing next to a treasure chest and surrounded by forest.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("window")) {
						System.out.println("It is a dark and stormy night...");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[5]) {
					 if (parseTarg(line).equalsIgnoreCase("fireplace")) {
							System.out.println("The fireplace is ashy, etched into this soot is the "
									+ "number 1519");
							break;
					 } else if (parseTarg(line).equalsIgnoreCase("window")) {
							System.out.println("It is a dark and stormy night...");
							break;
					 } else break;			 
				} else if (RoomManager.currentRoom == RoomManager.rooms[6]) {
					if (parseTarg(line).equalsIgnoreCase("toilet")) {
						System.out.println("You flush the toilet");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[7]) {
					if (parseTarg(line).equalsIgnoreCase("magazines")) {
						System.out.println("Now is not the time for reading Golf Digest.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("cigar butts")) {
						System.out.println("A couple finished cigars all with the same type, Outlaw 700.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("window")) {
						System.out.println("It is a dark and stormy night...");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[8]) {
					if (parseTarg(line).equalsIgnoreCase("tv")) {
						System.out.println("Pawn Stars is on.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("window")) {
						System.out.println("It is a dark and stormy night...");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[10]) {
					if (parseTarg(line).equalsIgnoreCase("bed")) {
						System.out.println("Perhaps the comfiest bed youve ever experienced,"
								+ " you catch yourself just before you nod off.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("vanity")) {
						System.out.println("Damn you look good.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("window")) {
						System.out.println("It is a dark and stormy night...");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("wardrobe")) {
						System.out.println("You open the wardrobe to find a lion inside; no time "
								+ "for that now.");
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[11]) {
					if (parseTarg(line).equalsIgnoreCase("shower")) {
						if(!shower) {
							System.out.println("The room starts steaming up");
							shower = !shower;
						} else {
							System.out.println("The room quickly unsteams");
							shower = !shower;
						}
						break;
					} else if (parseTarg(line).equalsIgnoreCase("mirror")) {
						if (shower) {
							System.out.println("The mirror has fogged up which has revealed the number"
									+ " 22 in smudges.");
							break;
						} else System.out.println("It's you.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("window")) {
						System.out.println("It is a dark and stormy night...");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[12]) {
					if (parseTarg(line).equalsIgnoreCase("book")) {
						System.out.println("I’m Emily Elizabeth, and I have a dog.\r\n"
								+ "My dog is a big red dog.\r\n"
								+ "Other kids I know have dogs, too. Some are big dogs.\r\n"
								+ "And some are red dogs.\r\n"
								+ "But I have the biggest, reddest dog on our street.\r\n"
								+ "This is my dog-Clifford.\r\n"
								+ "We have fun together. We play games.\r\n"
								+ "I throw a stick, and he brings it back to me.\r\n"
								+ "He makes mistakes sometimes.\r\n"
								+ "We play hide-and-seek.\r\n"
								+ "I’m a good hide-and-seek player.\r\n"
								+ "I can find Clifford, no matter where he hides.\r\n"
								+ "We play camping out, and I don’t need a tent.\r\n"
								+ "He can do tricks, too.\r\n"
								+ "He can sit up and beg.\r\n"
								+ "Oh, I know he’s not perfect.\r\n"
								+ "He has some bad habits.\r\n"
								+ "He runs after cars. He catches some of them.\r\n"
								+ "He runs after cats, too. We don’t go to the zoo anymore.\r\n"
								+ "He digs up flowers.\r\n"
								+ "Clifford loves to chew shoes.\r\n"
								+ "It’s not easy to keep Clifford.\r\n"
								+ "He eats and drinks a lot.\r\n"
								+ "His house was a problem, too.\r\n"
								+ "But he’s a very good watch dog.\r\n"
								+ "The bad boys don’t come around anymore.\r\n"
								+ "One day I gave Clifford a bath.\r\n"
								+ "And I combed his hair, and took him to the dog show.\r\n"
								+ "I’d like to say Clifford won first prize.\r\n"
								+ "But he didn’t.\r\n"
								+ "I don’t care.\r\n"
								+ "You can keep all your small dogs.\r\n"
								+ "You can keep all your black, white, brown, and spotted dogs.\r\n"
								+ "I’ll keep Clifford….Wouldn’t you?");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("ladder")) {
						System.out.println("You come to a shelf with bookends shaped like a double X.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("window")) {
						System.out.println("It is a dark and stormy night...");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[13]) {
					if (parseTarg(line).equalsIgnoreCase("bed")) {
						System.out.println("This bed is just ok.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("wardrobe")) {
						System.out.println("You take a peek inside the wardrobe and see a frosty witch,"
								+ " no time for that now.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("window")) {
						System.out.println("It is a dark and stormy night...");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[14]) {
					if (parseTarg(line).equalsIgnoreCase("toilet")) {
						System.out.println("You flush the toilet.");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("window")) {
						System.out.println("It is a dark and stormy night...");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[15]) {
					if (parseTarg(line).equalsIgnoreCase("podium")) {
						System.out.println("You notice an out of place iPad on the podium."
								+ " It is asking for the passcode with an index of [gardens,atrium,"
								+ "diningroom,sittingroom,cigarroom,masterbathroom,library]."
								+ " Goosebumps...");
						break;
					} else if (parseTarg(line).equalsIgnoreCase("speech")) {
						System.out.println("Blood alone moves the wheels of history! Have you "
								+ "ever asked yourselves in an hour of meditation, which "
								+ "everyone finds during the day,how long we have been striving"
								+ " for greatness? Not only the years we've been at war, the war"
								+ " of work, but from the moment as a child when we realized that"
								+ " the world could be conquered. It has been a lifetime struggle."
								+ " A never-ending fight. I say to you, and you will understand "
								+ "that it is a privilege to fight! We are warriors! Salesmen of "
								+ "north-eastern Pennsylvania, I ask you once more: Rise and be "
								+ "worthy of this historical hour! No revolution is worth anything "
								+ "if it cannot defend itself! Some people will tell you salesman is "
								+ "a bad word. They'll conjure up images of used car dealers and door"
								+ " to door charlatans. This is our duty: to change their perception. "
								+ "I say salesmen... and women of the world unite! We must never acquiesce"
								+ " for it is together, TOGETHER, THAT WE PREVAIL! We must never cede "
								+ "control of the motherland!");
						break;
					} else System.out.println("Enter a valid command please");
						break;
				} else if (RoomManager.currentRoom == RoomManager.rooms[16]) {
					if (parseComm(line).equalsIgnoreCase("treasure chest")) {
						System.out.println("You have more money than you know what to do with"
								+ ", unfortunately you don't have anything to spend it on stuck down"
								+ " here. :(. Good job though!");
						i--;
						break;
					} else {
						System.out.println("What are you thinking, go for the treasure!");
						break;
					}
				}
		} else if (parseComm(collectInput()).equalsIgnoreCase("write")) {
			write.write();	
		}else if (parseComm(collectInput()).equalsIgnoreCase("read")) {
			Player.read();

			
			
			
			
		}
		
		//public String target = parseTarg(collectInput());
		//public String command = parseComm(collectInput());
//		if (parseComm(collectInput()).equals("interact")) {
//			objectsMessage(RoomManager.currentRoom);
//		} else if (parseComm(collectInput()).equals("go")) {
//			
//		}
	}
	
	private static String collectInput() {
		Scanner input = new Scanner (System.in);
		String line = input.nextLine();
		input.close();
		return line;
	}
		
	private static String parseComm(String line) {
		String[] split = line.split(" ");
		String command = split[0];
		//String target = split[1];
		return command;
	}
	
	private static String parseTarg(String line) {
		String[] split = line.split(" ");
		//String command = split[0];
		String target = split[1];
		return target;
	}

//	public static void objectsMessages(Room currentRoom, String target) {
//		if (currentRoom == RoomManager.rooms[0]) {
//			if (= equalsIgnoreCase(target));
//			System.out.println(longDescription);
//			System.out.println("These flowers smell pretty good but you should get inside, it's raining!");
//		} else if (currentRoom == RoomManager.rooms[1]) {
//			System.out.println(longDescription);
//		} else if (currentRoom == RoomManager.rooms[2]) {
//			System.out.println("Admire the chandelier");
//			System.out.println("North to the dining room");
//			System.out.println("East to the study");
//			System.out.println("South to the gardens");
//			System.out.println("West to the sitting room");
//			System.out.println("Up the stairs to the hallway");
//			System.out.println("Down the stairs to the auditorium");		
//		} else if (currentRoom == RoomManager.rooms[3]) {
//			System.out.println("Inspect the serving cart");
//			System.out.println("North to the living room");
//			System.out.println("East to the cigar room");
//			System.out.println("South to the atrium");
//		} else if (currentRoom == RoomManager.rooms[4]) {
//			System.out.println("Search the desk");
//			System.out.println("Inspect the painting");
//			System.out.println("Look out the window");
//			System.out.println("North to the cigar room");
//			System.out.println("West to the atrium");
//		} else if (currentRoom == RoomManager.rooms[5]) {
//			System.out.println("Admire the fireplace");
//			System.out.println("Look out the window");
//			System.out.println("North to the bathroom");
//			System.out.println("East to the atrium");
//		} else if (currentRoom == RoomManager.rooms[6]) {
//			System.out.println("Flush the toilet");
//			System.out.println("North to the living room");
//			System.out.println("South to the sitting room");
//		} else if (currentRoom == RoomManager.rooms[7]) {
//			System.out.println("Study the magazines");
//			System.out.println("Look out the window");
//			System.out.println("Inspect the cigar butts");
//			System.out.println("North to the living room");
//			System.out.println("South to the study");
//			System.out.println("West to the dining room");
//		} else if (currentRoom == RoomManager.rooms[8]) {
//			System.out.println("Watch TV");
//			System.out.println("Look out the window");
//			System.out.println("East door to the cigar room");
//			System.out.println("South door to the dining room");
//			System.out.println("West door to the bathroom");
//		} else if (currentRoom == RoomManager.rooms[9]) {
//			System.out.println("North to the master bedroom");
//			System.out.println("East to the library");
//			System.out.println("West to the guest bedroom");
//			System.out.println("Down the stairs to the atrium");
//		} else if (currentRoom == RoomManager.rooms[10]) {
//			System.out.println("Lay on the bed");
//			System.out.println("Touch up your makeup at the vanity");
//			System.out.println("Look out the window");
//			System.out.println("Check in the wardrobe");
//			System.out.println("South to the hallway");
//			System.out.println("West to the master bathroom");
//		} else if (currentRoom == RoomManager.rooms[11]) {
//			System.out.println("Turn on the shower");
//			System.out.println("Look out the windows");
//			System.out.println("Admire yourself in the mirror");
//			System.out.println("East to the master bedroom");
//		} else if (currentRoom == RoomManager.rooms[12]) {
//			System.out.println("Sit down with a good book");
//			System.out.println("Climb the step ladder and look for oddities");
//			System.out.println("West to the hallway");
//		} else if (currentRoom == RoomManager.rooms[13]) {
//			System.out.println("Lay on the slightly worse bed");
//			System.out.println("Check in the wardrobe");
//			System.out.println("Look out the windows");
//			System.out.println("North to the guest bathroom");
//			System.out.println("East to the hallway");
//		} else if (currentRoom == RoomManager.rooms[14]) {
//			System.out.println("Flush the toilet");
//			System.out.println("Look out the window");
//			System.out.println("South to the guest bathroom");
//		} else if (currentRoom == RoomManager.rooms[15]) {
//			System.out.println("Take to the podium");
//			System.out.println("Give a speech");
//			System.out.println("Go up the stairs to the atrium");
//		} else if (currentRoom == RoomManager.rooms[16]) {
//			if (target == treasure chest) {
//				System.out.println("Congratulations, you're rich!");
//				
//			}
//			System.out.println("Go up the stairs to the auditorium");
//		}
	
//	public class write {
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter your next notepad entry:");
//		notepad.append(scan.nextLine());
//		scan.close();
//		System.out.println("Your new notepad looks like: " + notepad);
//	}
	
//	public void read {
//		System.out.println(Main.notepad);
//	}
//	public class RoomManager {
//		static public Room[] rooms = new Room[17];
//		public static Room currentRoom;
//		//static public Room currentRoom() {
//			return null;
//		

//			return null;
//		}
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
	public class RoomManager {
		static public Room[] rooms = new Room[17];
		public static Room currentRoom;
		//static public Room currentRoom() {
			return null;
		
	
			return null;
		}
	}
		
}
