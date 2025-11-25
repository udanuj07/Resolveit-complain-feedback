package project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== ResolveIt Complaint System ===");

        while(true) {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            int ch = sc.nextInt();

            if(ch == 1) {
                System.out.print("Username: ");
                String u = sc.next();
                System.out.print("Password: ");
                String p = sc.next();
                UserService.register(u,p);
            }
            else if(ch == 2) {
                System.out.print("Username: ");
                String u = sc.next();
                System.out.print("Password: ");
                String p = sc.next();

                User user = UserService.login(u,p);

                if(user == null) {
                    System.out.println("Login failed!");
                } else {
                    if(user.role.equals("user")) userMenu(user);
                    else adminMenu();
                }
            }
            else break;
        }
    }

    static void userMenu(User user) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\nUser Menu:");
            System.out.println("1. Submit Complaint\n2. Logout");
            int ch = sc.nextInt();

            if(ch == 1) {
                System.out.print("Category: ");
                String cat = sc.next();
                System.out.print("Description: ");
                String desc = sc.next();
                ComplaintService.submitComplaint(user.userId, cat, desc);
            } else return;
        }
    }

    static void adminMenu() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. View All Complaints\n2. Update Complaint Status\n3. Logout");
            int ch = sc.nextInt();

            if(ch == 1) ComplaintService.viewAll();
            else if(ch == 2) {
                System.out.print("Complaint ID: ");
                int id = sc.nextInt();
                System.out.print("New Status (Pending/In Progress/Resolved): ");
                String status = sc.next();
                ComplaintService.updateStatus(id, status);
            } else return;
        }
    }
}

