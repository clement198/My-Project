import java.util.Scanner;

public class hospital_room {

    // Room Charge Calculation Method
    public static double calCharge(String room, int days, String critUnit, String nurse, String payMethod) {

        String[] listRoom = { "Junior Suite", "Deluxe Suite", "Executive Suite", "Presidential Suite" };
        double roomPrice = 0;

        // Room Price
        if (room.equalsIgnoreCase(listRoom[0])) {
            roomPrice = 800 * days;
        } else if (room.equalsIgnoreCase(listRoom[1])) {
            roomPrice = 980 * days;
        } else if (room.equalsIgnoreCase(listRoom[2])) {
            roomPrice = 1600 * days;
        } else if (room.equalsIgnoreCase(listRoom[3])) {
            roomPrice = 3800 * days;
        } else if (room.equalsIgnoreCase(listRoom[0]) || !room.equalsIgnoreCase(listRoom[1])
                || !room.equalsIgnoreCase(listRoom[2]) || !room.equalsIgnoreCase(listRoom[3])) {
            System.out.println("Invalid Room Input. Please Re-Enter Your Room name correctly.");
            return 0;
        }

        // If patient need Crit Unit or nursery then it will add an extra charge
        if (critUnit.equalsIgnoreCase("Y") && nurse.equalsIgnoreCase("Y")) {
            roomPrice += 450 + 60;
        } else if (critUnit.equalsIgnoreCase("Y") && nurse.equalsIgnoreCase("N")) {
            roomPrice += 450;
        } else if (critUnit.equalsIgnoreCase("N") && nurse.equalsIgnoreCase("Y")) {
            roomPrice += 60;
        }

        System.out.printf("Room Name \t: %S \n", room);
        System.out.printf("Total Charge \t: RM%.2f", roomPrice);

        // If patient is pay by cash then pass the value to calDisc()Function and call
        // it
        if (payMethod.equalsIgnoreCase("-C")) {
            calDisc(roomPrice);
        } else { // else the patient is pay by credit card it will just print this line
            System.out.printf("\nDiscount \t: RM0");
            System.out.printf("\nTotal Payment \t: RM%.2f", roomPrice);
        }

        return 0.0;
    }

    // Discount Method
    public static double calDisc(double totalCharge) {

        double discount = (totalCharge * 10) / 100;
        double totalPayment = totalCharge - discount;

        System.out.printf("\nDiscount (10%%)\t: RM%.2f", (totalCharge * 10) / 100);
        System.out.printf("\nTotal Payment \t: RM%.2f", totalPayment);

        return 0.0;
    }

    // Summary Display
    public static double sumDisplay(double junior, double deluxe, double executive, double presidential) {

        String[] listRoom = { "JUNIOR SUITE", "DELUXE SUITE", "EXECUTIVE SUITE", "PRESIDENTIAL SUITE" };
        double totalSales = junior + deluxe + executive + presidential;

        System.out.printf(listRoom[0] + "\t\t: RM" + junior + "\n");
        System.out.printf(listRoom[1] + "\t\t: RM" + deluxe + "\n");
        System.out.printf(listRoom[2] + "\t\t: RM" + executive + "\n");
        System.out.printf(listRoom[3] + "\t: RM" + presidential + "\n");
        System.out.printf("Total Sales \t\t: Rm%.2f", totalSales);
        return 0.0;
    }

    public static void main(String[] args) {

        Scanner patientInput = new Scanner(System.in);

        String[] listRoom = { "Junior Suite", "Deluxe Suite", "Executive Suite", "Presidential Suite" };
        // To store total sales of each room for summary part
        double junior = 0, deluxe = 0, executive = 0, presidential = 0;

        while (true) {

            // Get User Input
            System.out.println("Patient Name : ");
            String patientName = patientInput.nextLine();

            System.out.println("Room Name : ");
            String roomName = patientInput.nextLine();

            System.out.println("Number Of Days To Stay : ");
            int stayDays = patientInput.nextInt();

            System.out.println("Critical Care(ICU/CCU/NICU)(Y/N) : ");
            patientInput.nextLine();
            String careUnit = patientInput.nextLine();

            System.out.println("Nursery(Y/N) : ");
            String nursery = patientInput.nextLine();

            System.out.println("Payment Method : \nEnter -B For Credit Card \nEnter -C For Cash");
            String paymentMethod = patientInput.nextLine();
            // End of Getting User Input

            // Display
            System.out.println("\n========== TECH HOSPITAL ==========\n");
            System.out.printf("Patient Name \t: %S \n", patientName);
            // Call Calculation Charge Method
            calCharge(roomName, stayDays, careUnit, nursery, paymentMethod);
            System.out.println("\n\n========== THANK YOU ==========\n");
            // End Of Display

            // Summary
            // Summary for Junior Room
            if (roomName.equalsIgnoreCase(listRoom[0])) {
                junior += 800 * stayDays;
                if (careUnit.equalsIgnoreCase("y")) {
                    junior += 450;
                }
                if (nursery.equalsIgnoreCase("y")) {
                    junior += 60;
                }
                if (paymentMethod.equalsIgnoreCase("-c")) {
                    junior -= (junior * 10) / 100;
                }

            }

            // Summary for Deluxe Room
            if (roomName.equalsIgnoreCase(listRoom[1])) {
                deluxe += 980 * stayDays;
                if (careUnit.equalsIgnoreCase("y")) {
                    deluxe += 450;
                }
                if (nursery.equalsIgnoreCase("y")) {
                    deluxe += 60;
                }
                if (paymentMethod.equalsIgnoreCase("-c")) {
                    deluxe -= (deluxe * 10) / 100;
                }
            }

            // Summary for Executive Room
            if (roomName.equalsIgnoreCase(listRoom[2])) {
                executive += 1600 * stayDays;
                if (careUnit.equalsIgnoreCase("y")) {
                    executive += 450;
                }
                if (nursery.equalsIgnoreCase("y")) {
                    executive += 60;
                }
                if (paymentMethod.equalsIgnoreCase("-c")) {
                    executive -= (executive * 10) / 100;
                }
            }

            // Summary for Presidential Room
            if (roomName.equalsIgnoreCase(listRoom[3])) {
                presidential += 3800 * stayDays;
                if (careUnit.equalsIgnoreCase("y")) {
                    presidential += 450;
                }
                if (nursery.equalsIgnoreCase("y")) {
                    presidential += 60;
                }
                if (paymentMethod.equalsIgnoreCase("-c")) {
                    presidential -= (presidential * 10) / 100;
                }
            }

            // Ask if user want to continue of close the program and summarize sales
            System.out.println(
                    "Do you wish to close the program and print the summary ? (Choose Y to Summarize and close the program) Y/N : ");
            String userChoose = patientInput.nextLine();
            if (userChoose.equalsIgnoreCase("y")) {
                System.out.println("\n========== TECH HOSPITAL SUMMARY ==========\n");
                // Call summary method
                sumDisplay(junior, deluxe, executive, presidential);
                System.out.println("\n\n========== END OF SUMMARY ==========\n");
                break;
            }

            // End of Summary
        }
        patientInput.close();
    }
}
