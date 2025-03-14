package com.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> Burgers = new ArrayList<MenuItem>();
        List<MenuItem> Drinks = new ArrayList<>();
        List<MenuItem> Desserts = new ArrayList<>();

        Burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        Burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨과 체리 페퍼가 들어간 스파이시 치즈버거"));
        Burgers.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        Burgers.add(new MenuItem("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu burgers = new Menu(Burgers);
        Menu drinks = new Menu(Drinks);
        Menu desserts = new Menu(Desserts);

        //Kiosk 객체를 생성
        Kiosk kiosk = new Kiosk(burgers, drinks, desserts);
        kiosk.start();
    }
}
