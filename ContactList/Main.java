package ContactList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int tempContactLength;

    public static void main(String[] args) {
        ContactList c = new ContactList();
        Scanner sc = new Scanner(System.in);
        int number = -1;
        while (number != 0) {
            System.out.println("danh ba cua ban: ");
            c.displayList();
            System.out.println("1. Them lien lac");
            System.out.println("2. Xoa lien lac");
            System.out.println("3. Sua lien lac");
            System.out.println("0. roi khoi danh ba");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    Contact[] tempContact = new Contact[0];
                    tempContact = Arrays.copyOf(tempContact, Main.tempContactLength + 1);
                    sc.nextLine();
                    System.out.println("nhap ten lien lac: ");
                    String tempName = sc.nextLine();
                    System.out.println("nhap so lien lac: ");
                    String tempNumber = sc.nextLine();
                    tempContact[tempContactLength] = new Contact(tempNumber, tempName);
                    c.add(tempContact[tempContactLength]);
                    tempContactLength++;
                    break;
                case 2:
                    System.out.println("1. xoa theo ten");
                    System.out.println("2. xoa theo sdt");
                    int choosing = sc.nextInt();
                    if (choosing == 1) {
                        System.out.println("Nhap ten lien lac can xoa");
                        sc.nextLine();
                        c.deleteContactByName(sc.nextLine());
                    }
                    if (choosing == 2) {
                        System.out.println("Nhap so lien lac can xoa");
                        sc.nextLine();
                        c.deleteContactByPNumber(sc.nextLine());
                    } else {
                        System.out.println("you are idiot");
                    }
                    break;
                case 3:
                    c.displayList();
                    System.out.println("nhap so thu tu lien he can sua");
                    int k = sc.nextInt();
                    c.searchById(k).display();
                    System.out.println("1. edit name");
                    System.out.println("2. edit phone number");
                    choosing = sc.nextInt();
                    if (choosing == 2) {
                        sc.nextLine();
                        c.editNumber(k - 1, sc.nextLine());
                    }
                    if (choosing == 1) {
                        sc.nextLine();
                        c.editName(k - 1, sc.nextLine());
                    }
                        break;


            }


        }

    }
}




