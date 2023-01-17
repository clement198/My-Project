import java.util.*;

public class HBS {
    // Book Method
    public static void bookInfo(LinkedList<String> custName, LinkedList<Integer> custPnum,
            LinkedList<Integer> roomNum, LinkedList<String> roomType) {

        Scanner infoInput = new Scanner(System.in);

        System.out.println("================= Booking =================\n");
        System.out.println("Customer Name : ");
        String name = infoInput.next();
        custName.add(name);

        System.out.println("Customer Phone No : ");
        int pNum = infoInput.nextInt();
        custPnum.add(pNum);

        System.out.println("Room Number : ");
        int rNum = infoInput.nextInt();
        roomNum.add(rNum);

        System.out.println("Room Type : \n1.King Size Bed\n2.Two Single Bed");
        int type = infoInput.nextInt();
        if (type == 1) {
            roomType.add("King Size Bed");
        } else if (type == 2) {
            roomType.add("Two Single Bed");
        }
        System.out.println("\n==========================================\n");

    }

    // Search Method
    public static void searchRoom(LinkedList<Integer> roomNum,
            LinkedList<String> custName, LinkedList<Integer> custPnum, LinkedList<String> roomType) {

        Scanner search = new Scanner(System.in);

        System.out.println("================= Search =================\n");
        System.out.printf("Booked Room List : Room : " + roomNum + "\n");
        System.out.println("Enter the room number to search for customer information : ");
        int room = search.nextInt();

        try {
            // Check if room is booked or available
            int custIndex = roomNum.indexOf(room);
            if (roomNum.get(custIndex) == room) {
                System.out.println("================= Room Found =================\n");
                System.out.println("Customer Name : " + custName.get(custIndex).toUpperCase());
                System.out.println("Customer Phone Number : +60 " + custPnum.get(custIndex));
                System.out.println("Room : " + roomNum.get(custIndex));
                System.out.println("Room Type : " + roomType.get(custIndex));
            }

        } catch (Exception e) {// if enter invalid room number then handle the error
            System.out.println("\nInvalid Room Number. Please Re-Enter Room Number\n");
        }
        System.out.println("\n==========================================\n");

    }

    // Delete Method
    public static void deleteRoom(LinkedList<Integer> roomNum,
            LinkedList<String> custName, LinkedList<Integer> custPnum, LinkedList<String> roomType) {

        Scanner delete = new Scanner(System.in);
        System.out.println("================= Delete =================\n");
        System.out.printf("Booked Room List : Room : " + roomNum + "\n");
        System.out.println("Enter the room number to delete the related information : ");

        int room = delete.nextInt();

        try {
            // Check if room is booked or available
            int custIndex = roomNum.indexOf(room);
            if (roomNum.get(custIndex) == room) {
                System.out.println("================= Room Found =================\n");
                System.out.println("Customer Name : " + custName.get(custIndex).toUpperCase());
                System.out.println("Customer Phone Number : +60 " + custPnum.get(custIndex));
                System.out.println("Room : " + roomNum.get(custIndex));
                System.out.println("Room Type : " + roomType.get(custIndex));

                // Ask to confirm delete
                System.out.println("Confirm Delete Information ? : Y/N");
                String choice = delete.next();
                if (choice.equalsIgnoreCase("y")) {
                    roomNum.remove(custIndex);
                    custName.remove(custIndex);
                    custPnum.remove(custIndex);
                    roomType.remove(custIndex);
                    System.out.println("New Room Book List" + roomNum);
                }
            }

        } catch (Exception e) {
            System.out.println("\nInvalid Room Number. Please Re-Enter Room Number\n");
        }

        System.out.println("\n==========================================\n");
    }

    // Sorting Method
    public static void sortRoom(LinkedList<String> custName, LinkedList<Integer> custPnum,
            LinkedList<Integer> roomNum, LinkedList<String> roomType) {

        Scanner choice = new Scanner(System.in);

        System.out.println("You wish to sort in ascending or descending order ? : \n1.Ascending\n2.Descending");
        int sortChoice = choice.nextInt();

        boolean status = true;
        if (sortChoice == 1) { // Ascending Order
            while (status) {
                status = false;
                for (int i = 0; i < roomNum.size() - 1; i++) {
                    if (roomNum.get(i) > roomNum.get(i + 1)) {
                        status = true;

                        // Sort Customer Name
                        String nameTemp = custName.get(i);
                        custName.set(i, custName.get(i + 1));
                        custName.set(i + 1, nameTemp);

                        // Sort Customer Phone number
                        int pNumTemp = custPnum.get(i);
                        custPnum.set(i, custPnum.get(i + 1));
                        custPnum.set(i + 1, pNumTemp);

                        // Sort Room Number
                        int roomTemp = roomNum.get(i);
                        roomNum.set(i, roomNum.get(i + 1));
                        roomNum.set(i + 1, roomTemp);

                        // Sort Room Type
                        String typeTemp = roomType.get(i);
                        roomType.set(i, roomType.get(i + 1));
                        roomType.set(i + 1, typeTemp);
                    }
                }
            }
        } else if (sortChoice == 2) { // Descending Order
            while (status) {
                status = false;
                for (int i = 0; i < roomNum.size() - 1; i++) {
                    if (roomNum.get(i) < roomNum.get(i + 1)) {
                        status = true;

                        // Sort Customer Name
                        String nameTemp = custName.get(i);
                        custName.set(i, custName.get(i + 1));
                        custName.set(i + 1, nameTemp);

                        // Sort Customer Phone number
                        int pNumTemp = custPnum.get(i);
                        custPnum.set(i, custPnum.get(i + 1));
                        custPnum.set(i + 1, pNumTemp);

                        // Sort Room Number
                        int roomTemp = roomNum.get(i);
                        roomNum.set(i, roomNum.get(i + 1));
                        roomNum.set(i + 1, roomTemp);

                        // Sort Room Type
                        String typeTemp = roomType.get(i);
                        roomType.set(i, roomType.get(i + 1));
                        roomType.set(i + 1, typeTemp);
                    }
                }
            }
        }
        System.out.println("Sort Success go to option 2 to display and see the result");
    }

    // Add before or After
    public static void afterB(LinkedList<String> custName, LinkedList<Integer> custPnum,
            LinkedList<Integer> roomNum, LinkedList<String> roomType) {
        Scanner userInput = new Scanner(System.in);

        System.out.println(roomNum);
        System.out.println("Enter the room number to add your info between them : ");
        int room = userInput.nextInt();
        System.out.println("Would you like to add after " + room + " or Before " + room + ":\n1.Before\n2.After");
        int choice = userInput.nextInt();

        int index = roomNum.indexOf(room);
        if (choice == 1) {
            System.out.println("Customer Name : ");
            String name = userInput.next();
            custName.add(index, name);

            System.out.println("Customer Phone No : ");
            int pNum = userInput.nextInt();
            custPnum.add(index, pNum);

            System.out.println("Room Number : ");
            int rNum = userInput.nextInt();
            roomNum.add(index, rNum);

            System.out.println("Room Type : \n1.King Size Bed\n2.Two Single Bed");
            int type = userInput.nextInt();
            if (type == 1) {
                roomType.add("King Size Bed");
            } else if (type == 2) {
                roomType.add("Two Single Bed");
            }
        } else if (choice == 2) {
            System.out.println("Customer Name : ");
            String name = userInput.next();
            custName.add(index + 1, name);

            System.out.println("Customer Phone No : ");
            int pNum = userInput.nextInt();
            custPnum.add(index + 1, pNum);

            System.out.println("Room Number : ");
            int rNum = userInput.nextInt();
            roomNum.add(index + 1, rNum);

            System.out.println("Room Type : \n1.King Size Bed\n2.Two Single Bed");
            int type = userInput.nextInt();
            if (type == 1) {
                roomType.add("King Size Bed");
            } else if (type == 2) {
                roomType.add("Two Single Bed");
            }
        }
    }

    // Display Method
    public static void displayData(LinkedList<String> custName, LinkedList<Integer> custPnum,
            LinkedList<Integer> roomNum, LinkedList<String> roomType) {
        System.out.println("================= Display =================\n");
        for (int i = 0; i < custName.size(); i++) {
            System.out.println("Customer Name : " + custName.get(i).toUpperCase());
            System.out.println("Customer Phone Number : +60 " + custPnum.get(i));
            System.out.println("Room : " + roomNum.get(i));
            System.out.println("Room Type : " + roomType.get(i) + "\n");
        }
        System.out.println("\n==========================================\n");
    }

    public static void main(String[] args) {

        LinkedList<String> custName = new LinkedList<String>();
        LinkedList<Integer> custPnum = new LinkedList<Integer>();
        LinkedList<Integer> roomNum = new LinkedList<Integer>();
        LinkedList<String> roomType = new LinkedList<String>();

        Scanner choiceInput = new Scanner(System.in);

        while (true) {

            System.out.println("========== Hotel Booking System ==========\n");
            System.out.println(
                    "Choose Your Option : \n1.Create Booking\n2.Display Booking\n3.Search Booking\n4.Delete Booking\n5.Sort\n6.Add Booking at Before or After Book \n7.Exit");
            System.out.println("\n==========================================\n");
            int choice = choiceInput.nextInt();

            if (choice == 1) {
                bookInfo(custName, custPnum, roomNum, roomType);
            }
            if (choice == 2) {
                displayData(custName, custPnum, roomNum, roomType);
            }
            if (choice == 3) {
                searchRoom(roomNum, custName, custPnum, roomType);
            }
            if (choice == 4) {
                deleteRoom(roomNum, custName, custPnum, roomType);
            }
            if (choice == 5) {
                sortRoom(custName, custPnum, roomNum, roomType);
            }
            if (choice == 6) {
                afterB(custName, custPnum, roomNum, roomType);
            }
            if (choice == 7) {
                System.exit(0);
            }
        }
    }
}