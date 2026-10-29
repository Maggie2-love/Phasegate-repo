
import java.util.Scanner;

public class MainParkingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        boolean[] parkingSlots = new boolean[20];

        int mainMenuChoice = 0;

        while (mainMenuChoice != 5) {

            String mainMenu = """

            ===== MINI PARKING LOT =====
            1. Park car in next available slot
            2. Park car in a specific slot
            3. Remove car from a slot
            4. Display parking status
            5. Exit
            """;

            System.out.println(mainMenu);
            System.out.print("Enter your choice: ");

            mainMenuChoice = input.nextInt();

            switch (mainMenuChoice) {

                case 1: {
                   
                    int nextSlot = -1;

                    for (int index = 0; index < parkingSlots.length; index++) {

                        if (!parkingSlots[index]) {
                            parkingSlots[index] = true;
                            nextSlot = index + 1;
                            break;
                        }
                    }

                    if (nextSlot != -1) {
                        System.out.println("Car parked in slot " + nextSlot);
                    } else {
                        System.out.println("Parking lot is full.");
                    }

                   
                    System.out.println("\n===== PARKING STATUS =====");

                    for (int index = 0; index < parkingSlots.length; index++) {
                        if (parkingSlots[index]) {
                            System.out.println("Slot " + (index + 1) + ": Occupied");
                        } else {
                            System.out.println("Slot " + (index + 1) + ": Empty");
                        }
                    }

                    break;
                }

                case 2: {
                   
                    System.out.print("Enter slot number (1-20): ");
                    int slot = input.nextInt();

                    if (slot < 1 || slot > 20) {
                        System.out.println("Invalid slot number.");
                    } else if (parkingSlots[slot - 1]) {
                        System.out.println("Slot " + slot + " is already occupied.");
                    } else {
                        parkingSlots[slot - 1] = true;
                        System.out.println("Car parked in slot " + slot);
                    }

                   
                    System.out.println("\n===== PARKING STATUS =====");

                    for (int index = 0; index < parkingSlots.length; index++) {
                        if (parkingSlots[index]) {
                            System.out.println("Slot " + (index + 1) + ": Occupied");
                        } else {
                            System.out.println("Slot " + (index + 1) + ": Empty");
                        }
                    }

                    break;
                }

                case 3: {
                   
                    System.out.print("Enter slot number to leave (1-20): ");
                    int leaveSlot = input.nextInt();

                    if (leaveSlot < 1 || leaveSlot > 20) {
                        System.out.println("Invalid slot number.");
                    } else if (!parkingSlots[leaveSlot - 1]) {
                        System.out.println("Slot " + leaveSlot + " is already empty.");
                    } else {
                        parkingSlots[leaveSlot - 1] = false;
                        System.out.println("Car removed from slot successfully.");
                    }

                   
                    System.out.println("\n===== PARKING STATUS =====");

                    for (int index = 0; index < parkingSlots.length; index++) {
                        if (parkingSlots[index]) {
                            System.out.println("Slot " + (index + 1) + ": Occupied");
                        } else {
                            System.out.println("Slot " + (index + 1) + ": Empty");
                        }
                    }

                    break;
                }

                case 4: {
                   
                    System.out.println("\n===== PARKING STATUS =====");

                    for (int index = 0; index < parkingSlots.length; index++) {
                        if (parkingSlots[index]) {
                            System.out.println("Slot " + (index + 1) + ": Occupied");
                        } else {
                            System.out.println("Slot " + (index + 1) + ": Empty");
                        }
                    }

                    break;
                }

                case 5:
                    System.out.println("Thank you. Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose 1-5.");
                    break;
            }
        }

       
    }
}

