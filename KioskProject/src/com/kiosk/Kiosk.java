package com.kiosk;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Kiosk {
    private Menu burgers;
    private Menu drinks;
    private Menu desserts;
    private Scanner sc = new Scanner(System.in);
    int a;

    public Kiosk(Menu burgers, Menu drinks,Menu desserts) {
        this.burgers = burgers;
        this.drinks = drinks;
        this.desserts = desserts;
    }

    public void start() {
        while (true) {
            System.out.println("\n[ MAIN MENU ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int MenuChoice = sc.nextInt();

            if (MenuChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (MenuChoice) {
                case 1:
                    displayMenu(burgers);
                    break;
                case 2:
                    displayMenu(drinks);
                    break;
                case 3:
                    displayMenu(desserts);
                    break;
            }

            if(a == 0){
                break;
            }
        }
    }

    private void displayMenu(Menu menu) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems = menu.getMenuItems();
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i =0; i<menuItems.size();i++) {
                System.out.println((i+1)+". "+ menuItems.get(i).getName()+"| W"+ menuItems.get(i).getPrice() +"|"+ menuItems.get(i).getDescription());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println("메뉴를 선택하세요: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                a=0;
                break;
            }
            else if (choice >= 1 && choice <= menuItems.size()) {
                System.out.println("선택한 메뉴:" +(choice)+". "+ menuItems.get(choice-1).getName()+"| W"+ menuItems.get(choice-1).getPrice() +"|"+ menuItems.get(choice-1).getDescription());
            }
            else {
                System.out.println("유효하지 않은 입력입니다.");
            }
        }


    }
}
