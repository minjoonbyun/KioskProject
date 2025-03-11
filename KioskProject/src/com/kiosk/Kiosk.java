package com.kiosk;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
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
