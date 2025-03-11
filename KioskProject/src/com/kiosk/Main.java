package com.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<MenuItem>();

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨과 체리 페퍼가 들어간 스파이시 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

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
