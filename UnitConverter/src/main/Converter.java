package main;

import java.util.Scanner;

	public class Converter {
		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			int menuSelection = 0;


			while (menuSelection != 4) {
				String inch = "inch";
				String lengthSelection, lengthOSelection, volSelection, volOSelection;
				String timeSelection, timeOSelection;
				double length, volume, time;
				System.out.println("Please type in a menu selction and hit Enter.");
				
				
				System.out.println("1: Length conversions");
				System.out.println("2: Volume conversions");
				System.out.println("3: Time conversions");
				System.out.println("4: Quit");
				menuSelection = scanner.nextInt();
				scanner.nextLine();
				System.out.println("You have entered: " + menuSelection);
				if (menuSelection == 1) {
					System.out.println("Type length input units: ");
					System.out.println("inch\tfoot\tyard\tmile\tmillimeter\tcentimeter\tmeter\tkilometer");
					lengthSelection = scanner.nextLine();
					//System.out.println(lengthSelection);
					System.out.println("Enter length value");
					length = scanner.nextDouble();
					scanner.nextLine();
					System.out.println("Type length output units: ");
					System.out.println("inch\tfoot\tyard\tmile\tmillimeter\tcentimeter\tmeter\tkilometer");
					lengthOSelection = scanner.nextLine();
					if (lengthSelection.equals("inch") ) {
						if (lengthOSelection.equals("inch")) {
							System.out.println(length + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("foot")) {
							System.out.println(length/12 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("yard")) {
							System.out.println(length/36 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("mile")) {
							System.out.println(length/63_360 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("millimeter")) {
							System.out.println(length*25.4 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("centimeter")) {
							System.out.println(length*2.54 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("meter")) {
							System.out.println(length*0.0254 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("kilometer")) {
							System.out.println(length*0.0000254 + " " + lengthOSelection + "\n");
						}
					} else if (lengthSelection.equals("foot")) {
						if (lengthOSelection.equals("inch")) {
							System.out.println(length*12 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("foot")) {
							System.out.println(length + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("yard")) {
							System.out.println(length/3 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("mile")) {
							System.out.println(length/5_280 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("millimeter")) {
							System.out.println(length*304.8 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("centimeter")) {
							System.out.println(length*30.48 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("meter")) {
							System.out.println(length*0.3048 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("kilometer")) {
							System.out.println(length*0.0003048 + " " + lengthOSelection + "\n");
						}
					} else if (lengthSelection.equals("yard")) {
						if (lengthOSelection.equals("inch")) {
							System.out.println(length*36 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("foot")) {
							System.out.println(length*3 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("yard")) {
							System.out.println(length + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("mile")) {
							System.out.println(length/1_760 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("millimeter")) {
							System.out.println(length*914.4 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("centimeter")) {
							System.out.println(length*91.44 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("meter")) {
							System.out.println(length*0.9144 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("kilometer")) {
							System.out.println(length*0.0009144 + " " + lengthOSelection + "\n");
						}
					} else if (lengthSelection.equals("mile")) {
						if (lengthOSelection.equals("inch")) {
							System.out.println(length*63_360 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("foot")) {
							System.out.println(length*5_280 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("yard")) {
							System.out.println(length*1_760 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("mile")) {
							System.out.println(length + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("millimeter")) {
							System.out.println(length*1_609_340 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("centimeter")) {
							System.out.println(length*160_934 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("meter")) {
							System.out.println(length*1609.34 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("kilometer")) {
							System.out.println(length*1.60934 + " " + lengthOSelection + "\n");
						}	
					} else if (lengthSelection.equals("millimeter")) {
						if (lengthOSelection.equals("inch")) {
							System.out.println(length/25.4 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("foot")) {
							System.out.println(length/304.8 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("yard")) {
							System.out.println(length/914.4 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("mile")) {
							System.out.println(length/1_609_340 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("millimeter")) {
							System.out.println(length + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("centimeter")) {
							System.out.println(length/10 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("meter")) {
							System.out.println(length/1000 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("kilometer")) {
							System.out.println(length/1_000_000 + " " + lengthOSelection + "\n");
						}	
					} else if (lengthSelection.equals("centimeter")) {
						if (lengthOSelection.equals("inch")) {
							System.out.println(length/2.54 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("foot")) {
							System.out.println(length/30.48 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("yard")) {
							System.out.println(length/91.44 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("mile")) {
							System.out.println(length/160_934 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("millimeter")) {
							System.out.println(length*10 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("centimeter")) {
							System.out.println(length + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("meter")) {
							System.out.println(length/100 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("kilometer")) {
							System.out.println(length/100_000 + " " + lengthOSelection + "\n");
						}	
					} else if (lengthSelection.equals("meter")) {
						if (lengthOSelection.equals("inch")) {
							System.out.println(length/0.0254 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("foot")) {
							System.out.println(length/0.3048 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("yard")) {
							System.out.println(length/0.9144 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("mile")) {
							System.out.println(length/1_609.34 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("millimeter")) {
							System.out.println(length*1000 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("centimeter")) {
							System.out.println(length*100 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("meter")) {
							System.out.println(length + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("kilometer")) {
							System.out.println(length/1000 + " " + lengthOSelection + "\n");
						}	
					} else if (lengthSelection.equals("kilometer")) {
						if (lengthOSelection.equals("inch")) {
							System.out.println(length*39_370.1 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("foot")) {
							System.out.println(length*3_280.84 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("yard")) {
							System.out.println(length*1_093.61 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("mile")) {
							System.out.println(length*0.621371 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("millimeter")) {
							System.out.println(length*1_000_000 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("centimeter")) {
							System.out.println(length*100_000 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("meter")) {
							System.out.println(length*1000 + " " + lengthOSelection + "\n");
						} else if (lengthOSelection.equals("kilometer")) {
							System.out.println(length + " " + lengthOSelection + "\n");
						}	
					} else {
						System.out.println("Not a valid input unit");
					}
				} else if (menuSelection == 2) {
					System.out.println("Type volume input units: ");
					System.out.println("tsp\ttbsp\tcup\tgallon\tcubic feet\tmilliliter\tliter");
					volSelection = scanner.nextLine();
					//System.out.println(lengthSelection);
					System.out.println("Enter volume value");
					volume = scanner.nextDouble();
					scanner.nextLine();
					System.out.println("Type volume output units: ");
					System.out.println("tsp\ttbsp\tcup\tpint\tgallon\tcubic feet\tmilliliter\tliter");
					volOSelection = scanner.nextLine();
					if (volSelection.equals("tsp")) {
						if (volOSelection.equals("tsp")) {
							System.out.println(volume + " " + volOSelection + "\n");
						} else if (volOSelection.equals("tbs")) {
							System.out.println(volume/3 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cup")) {
							System.out.println(volume/48.692 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("pint")) {
							System.out.println(volume/96 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("gallon")) {
							System.out.println(volume/768 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cubic feet")) {
							System.out.println(volume/5745.04 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("milliliter")) {
							System.out.println(volume*4.92892 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("liter")) {
							System.out.println(volume/202.884 + " " + volOSelection + "\n");
						}
					} else if (volSelection.equals("tbsp")) {
						if (volOSelection.equals("tsp")) {
							System.out.println(volume*3 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("tbs")) {
							System.out.println(volume + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cup")) {
							System.out.println(volume/16.2307 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("pint")) {
							System.out.println(volume/32 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("gallon")) {
							System.out.println(volume/256 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cubic feet")) {
							System.out.println(volume/1915.01 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("milliliter")) {
							System.out.println(volume*14.7868 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("liter")) {
							System.out.println(volume/67.628 + " " + volOSelection + "\n");
						}	
					} else if (volSelection.equals("cup")) {
						if (volOSelection.equals("tsp")) {
							System.out.println(volume*48.6922 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("tbs")) {
							System.out.println(volume*16.2307 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cup")) {
							System.out.println(volume + " " + volOSelection + "\n");
						} else if (volOSelection.equals("pint")) {
							System.out.println(volume/1.972 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("gallon")) {
							System.out.println(volume/15.7725 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cubic feet")) {
							System.out.println(volume/117.987 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("milliliter")) {
							System.out.println(volume*240 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("liter")) {
							System.out.println(volume/4.16667 + " " + volOSelection + "\n");
						} 
					} else if (volSelection.equals("pint"))	{
						if (volOSelection.equals("tsp")) {
							System.out.println(volume*96 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("tbs")) {
							System.out.println(volume*32 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cup")) {
							System.out.println(volume*1.972 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("pint")) {
							System.out.println(volume + " " + volOSelection + "\n");
						} else if (volOSelection.equals("gallon")) {
							System.out.println(volume/8 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cubic feet")) {
							System.out.println(volume/59.844 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("milliliter")) {
							System.out.println(volume*473.176 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("liter")) {
							System.out.println(volume/2.11338 + " " + volOSelection + "\n");
						} 
					} else if (volSelection.equals("gallon")) {
						if (volOSelection.equals("tsp")) {
							System.out.println(volume*768 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("tbs")) {
							System.out.println(volume*256 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cup")) {
							System.out.println(volume*15.7725 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("pint")) {
							System.out.println(volume*8 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("gallon")) {
							System.out.println(volume + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cubic feet")) {
							System.out.println(volume/7.48052 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("milliliter")) {
							System.out.println(volume*3785.41 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("liter")) {
							System.out.println(volume/3.78541 + " " + volOSelection + "\n");
						}
					} else if (volSelection.equals("cubic feet")) {
						if (volOSelection.equals("tsp")) {
							System.out.println(volume*5745.04 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("tbs")) {
							System.out.println(volume*1915.01 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cup")) {
							System.out.println(volume*117.987 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("pint")) {
							System.out.println(volume*59.8442 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("gallon")) {
							System.out.println(volume*7.481 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cubic feet")) {
							System.out.println(volume + " " + volOSelection + "\n");
						} else if (volOSelection.equals("milliliter")) {
							System.out.println(volume*28_316.8 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("liter")) {
							System.out.println(volume*28.3168 + " " + volOSelection + "\n");
						} 
					} else if (volSelection.equals("milliliter")) {
						if (volOSelection.equals("tsp")) {
							System.out.println(volume/4.92892 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("tbs")) {
							System.out.println(volume/14.7868 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cup")) {
							System.out.println(volume/240 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("pint")) {
							System.out.println(volume/473.176 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("gallon")) {
							System.out.println(volume/3_785.41 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cubic feet")) {
							System.out.println(volume/28_316.8 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("milliliter")) {
							System.out.println(volume + " " + volOSelection + "\n");
						} else if (volOSelection.equals("liter")) {
							System.out.println(volume/1000 + " " + volOSelection + "\n");
						} 
					} else if (volSelection.equals("liter")) {
						if (volOSelection.equals("tsp")) {
							System.out.println(volume*202.884 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("tbs")) {
							System.out.println(volume*67.628 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cup")) {
							System.out.println(volume*4.16667 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("pint")) {
							System.out.println(volume*2.11338 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("gallon")) {
							System.out.println(volume/3.78541 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("cubic feet")) {
							System.out.println(volume/28.317 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("milliliter")) {
							System.out.println(volume*1000 + " " + volOSelection + "\n");
						} else if (volOSelection.equals("liter")) {
							System.out.println(volume + " " + volOSelection + "\n");
						} 
					} else
						System.out.println("Not a valid input unit");
						} else if (menuSelection == 3) {
							System.out.println("Type time input units: ");
							System.out.println("seconds\tminutes\thours\tdays\tyears");
							timeSelection = scanner.nextLine();
							//System.out.println(lengthSelection);
							System.out.println("Enter time value");
							time = scanner.nextDouble();
							scanner.nextLine();
							System.out.println("Type time output units: ");
							System.out.println("seconds\tminutes\thours\tdays\tyears");
							timeOSelection = scanner.nextLine();
							if (timeSelection.equals("seconds")) {
								if (timeOSelection.equals("seconds")) {
									System.out.println(time + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("minutes")) {
									System.out.println(time/60.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("hours")) {
									System.out.println(time/3_600.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("days")) {
									System.out.println(time/86_400.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("years")) {
									System.out.println(time/31_536_000.0 + " " + timeOSelection + "\n");
								}
							} else if (timeSelection.equals("minutes")) {
								if (timeOSelection.equals("seconds")) {
									System.out.println(time*60.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("minutes")) {
									System.out.println(time + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("hours")) {
									System.out.println(time/60.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("days")) {
									System.out.println(time/1_440.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("years")) {
									System.out.println(time/525_600.0 + " " + timeOSelection + "\n");
								}	
							} else if (timeSelection.equals("hours")) {
								if (timeOSelection.equals("seconds")) {
									System.out.println(time*3_600 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("minutes")) {
									System.out.println(time*60.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("hours")) {
									System.out.println(time + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("days")) {
									System.out.println(time/24.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("years")) {
									System.out.println(time/365.0 + " " + timeOSelection + "\n");
								}
							} else if (timeSelection.equals("days")) {
								if (timeOSelection.equals("seconds")) {
									System.out.println(time*86_400.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("minutes")) {
									System.out.println(time*1_440 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("hours")) {
									System.out.println(time*24.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("days")) {
									System.out.println(time + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("years")) {
									System.out.println(time/365.0 + " " + timeOSelection + "\n");
								}
							} else if (timeSelection.equals("years")) {
								if (timeOSelection.equals("seconds")) {
									System.out.println(time*31_536_000.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("minutes")) {
									System.out.println(time*525_600.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("hours")) {
									System.out.println(time*8_760.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("days")) {
									System.out.println(time/365.0 + " " + timeOSelection + "\n");
								} else if (timeOSelection.equals("years")) {
									System.out.println(time + " " + timeOSelection + "\n");
								}
							} else
								System.out.println("Not a valid input unit");
				} else if (menuSelection == 4) {
					break;
				} else
					System.out.println("Please enter a number 1-4");
			}
		scanner.close();
		}
	}