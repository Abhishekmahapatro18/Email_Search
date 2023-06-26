package SelfLearn2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailSearch {
    public static void main(String[] args) {
        List<String> emailList = new ArrayList<>();
        emailList.add("abhishek@gmail.com");
        emailList.add("vickey@gmail.com");
        emailList.add("abhishek@gmail.com");
        emailList.add("mahapatro@gmail.com");
        emailList.add("india@gmail.com");

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

