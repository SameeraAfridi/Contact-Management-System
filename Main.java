import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Contact Management System ===");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    manager.addContact(new Contact(name, phone, email));
                    break;
                case 2:
                    manager.viewContacts();
                    break;
                case 3:
                    System.out.print("Enter Phone to search: ");
                    String searchPhone = sc.nextLine();
                    manager.searchContact(searchPhone);
                    break;
                case 4:
                    System.out.print("Enter Phone to update: ");
                    String updatePhone = sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = sc.nextLine();
                    manager.updateContact(updatePhone, newName, newEmail);
                    break;
                case 5:
                    System.out.print("Enter Phone to delete: ");
                    String deletePhone = sc.nextLine();
                    manager.deleteContact(deletePhone);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
