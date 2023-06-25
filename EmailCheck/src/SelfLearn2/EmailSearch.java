package SelfLearn2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailSearch {
    public static void main(String[] args) {
        List<String> emailList = new ArrayList<>();
        emailList.add("john@example.com");
        emailList.add("jane@example.com");
        emailList.add("alex@example.com");
        emailList.add("sam@example.com");
        emailList.add("mary@example.com");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email ID to search: ");
        String searchEmail = scanner.nextLine();

        boolean found = searchEmail(emailList, searchEmail);

        if (found) {
            System.out.println("Email ID found in the list.");
        } else {
            System.out.println("Email ID not found in the list.");
        }
    }

    public static boolean searchEmail(List<String> emailList, String searchEmail) {
        for (String email : emailList) {
            if (email.equalsIgnoreCase(searchEmail)) {
                return true;
            }
        }
        return false;
    }
}

