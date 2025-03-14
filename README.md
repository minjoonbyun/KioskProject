# KioskProject
2025.3.10-3.14
IDE : IntelliJ

- Main : 시작 지점이 되는 클래스
- MenuItem
- 햄버거의 이름, 가격설명
- Kiosk: 프로그램 순서 및 흐름 제어
- Menu: MenuItem 클래스를 관리하는 클래스
  버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 `MenuItem`을 포함


  Level 1에선 단순히 Scanner로 숫자를 받으면 햄버거 메뉴를 출력시킴

  Level2는 Menuitem 클래스를 만들어서 메뉴를 넣고(add), 다시 출력함(반복문)

  Level3 에선 Kiosk 클래스를 만들어서 반복문을 옮겨주고 start함수를 만들어서 main에서 Kiosk 객체 생성을 통해 실행

  Level4 Menu 카테고리 안에 MenuItem을 카테고리별로 저장시키기 위해 Menu 클래스를 먼저 만들고,
  Main에선 List 선언, 버거메뉴에 넣어준 뒤 다시 Menu Burger에 버거메뉴들을 넣어줌.

  Level5 menuItems= menu.getMenuItems();로 수정해서 Menu클래스의 get~을 사용함
