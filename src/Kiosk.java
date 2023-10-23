import java.util.*;

public class Kiosk {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        Scanner sc = new Scanner(System.in);

        // hamburgerList
        List<String> hamburgerList = new ArrayList<>();
        hamburgerList.add("ShackBurger");
        hamburgerList.add("SmokeShack");
        hamburgerList.add("Shroom Burger");
        hamburgerList.add("Cheeseburger");
        hamburgerList.add("Hamburger");

        System.out.println(hamburgerList.get(0));

        // custardsList
        List<String> custardsList = new ArrayList<>();
        custardsList.add("Anthracite Coffee shake");
        custardsList.add("Classic Hand-Spun Shake");
        custardsList.add("Floats");
        custardsList.add("Cup & Cones ");

        System.out.println(custardsList.get(0));

        // drinksList
        List<String> drinksList = new ArrayList<>();
        drinksList.add("Raspberry Lemonade");
        drinksList.add("Lemonade");
        drinksList.add("Fresh Brewed Iced Tea");
        drinksList.add("Fifty/Fifty");

        System.out.println(drinksList.get(0));

        // woofsList
        List<String> woofsList = new ArrayList<>();
        woofsList.add("Bag O-Bones");

        System.out.println(woofsList.get(0));

        // hamburgerPrice
        List<Double> hamburgerPrice = new ArrayList<>();
        hamburgerPrice.add(6.9);
        hamburgerPrice.add(8.9);
        hamburgerPrice.add(9.4);
        hamburgerPrice.add(6.9);
        hamburgerPrice.add(5.4);

        // custardsPrice
        List<Double> custardPrice = new ArrayList<>();
        custardPrice.add(4.5);
        custardPrice.add(4.0);
        custardPrice.add(4.0);
        custardPrice.add(3.5);

        // drinksPrice
        List<Double> drinksPrice = new ArrayList<>();
        drinksPrice.add(4.0);
        drinksPrice.add(4.0);
        drinksPrice.add(4.0);
        drinksPrice.add(3.5);

        // woofsPrice
        List<Double> woofsPrice = new ArrayList<>();
        woofsPrice.add(3.0);
        // 장바구니 담기
        List<String> basketAdd = new ArrayList<>();

        // 가격 담기
        List<Double> priceAdd = new ArrayList<>();


        // 메인 메뉴판
        String shakeShackMenuAndOrder = "SHAKESHACK BURGER 에 오신걸 환영합니다." + "\n"
                + "\"아래 메뉴판을 보시고 상품을 골라 입력해주세요.\";" + "\n"
                + "[ SHAKESHACK BURGER ]" + "\n"
                + "1. Burgers       | 앵거스 비프통살을 다져만든 버거" + "\n"
                + "2. Forzen Custard| 매장에서 신선하게 만드는 아이스크림" + "\n"
                + "3. Drinks        | 매장에서 직접 만드는 음료" + "\n"
                + "4. Woof          | 애완동물 간식" + "\n"
                + "\n"
                + "[ ORDER MENU ]" + "\n"
                + "5. Order       | 장바구니를 확인 후 주문합니다." + "\n"
                + "6. Cancel      | 진행중인 주문을 취소합니다." + "\n";

        // 버거 메뉴판
        String burgersMenu = "SHAKESHACK BURGER 에 오신걸 환영합니다." + "\n"
                + "\"아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\";" + "\n"
                + "[ Burgers BURGER ]" + "\n"
                + "1. " + hamburgerList.get(0) + "       | W " + hamburgerPrice.get(0) + " | 토마토, 양상추, 쉑소스가 토핑된 치즈버거" + "\n"
                + "2. " + hamburgerList.get(1) + "        | W " + hamburgerPrice.get(1) + " | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" + "\n"
                + "3. " + hamburgerList.get(2) + "     | W " + hamburgerPrice.get(2) + " | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거" + "\n"
                + "4. " + hamburgerList.get(3) + "      | W " + hamburgerPrice.get(3) + " | 포테인토 번과 비프패티, 치즈가 토핑된 치즈버거" + "\n"
                + "5. " + hamburgerList.get(4) + "         | W " + hamburgerPrice.get(4) + " | 비프패티를 기반으로 야채가 들어간 기본버거" + "\n";

        // 아이스크림 메뉴판
        String custardsMenu = "SHAKESHACK BURGER 에 오신걸 환영합니다." + "\n"
                + "\"아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\";" + "\n"
                + "[ Custard ]" + "\n"
                + "1. " + custardsList.get(0) + "       | W " + custardPrice.get(0) + " | 로컬 로스팅 브랜드 앤트러사이트와 협업한 기간 한정 콜라보레이션 커피 쉐이크" + "\n"
                + "2. " + custardsList.get(1) + "       | W " + custardPrice.get(0) + " | 쫀득하고 진한 커스터트가 들어간 클래식 쉐이크" + "\n"
                + "3. " + custardsList.get(2) + "                        | W  " + custardPrice.get(0) + " | 부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료" + "\n"
                + "4. " + custardsList.get(3) + "                  | W " + custardPrice.get(0) + " | 매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림" + "\n";

        // 음료 메뉴판
        String drinksMenu = "SHAKESHACK BURGER 에 오신걸 환영합니다." + "\n"
                + "\"아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\";" + "\n"
                + "[ Drinks ]" + "\n"
                + "1. " + drinksList.get(0) + "       | W " + drinksPrice.get(0) + " | 쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드" + "\n"
                + "2. " + drinksList.get(1) + "                 | W " + drinksPrice.get(0) + " | 매장에서 직접 만드는 상큼한 레몬에이드" + "\n"
                + "3. " + drinksList.get(2) + "    | W " + drinksPrice.get(0) + " | 직접 유기농 홍차를 우려낸 아이스 티" + "\n"
                + "4. " + drinksList.get(3) + "              | W " + drinksPrice.get(0) + " | 레몬에이드와 유기농 홍차를 우려낸 아이스티가 만나 탄생한 쉐이크쉑의 시그니처 음료" + "\n";

        // 사료 메뉴판
        String woofsMenu = "SHAKESHACK BURGER 에 오신걸 환영합니다." + "\n"
                + "\"아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\";" + "\n"
                + "[ Woof ]" + "\n"
                + "1. " + woofsList.get(0) + "      | " + woofsList.get(0) + " | 강아지용 비스킷 5개 세트" + "\n";

        // <<<<주문 화면>>>>>
        String orders = "아래와 같이 주문하시겠습니까";

        // Burger
        String hamburger1 = hamburgerList.get(0) + "       | W " + hamburgerPrice.get(0) + " | 토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        String hamburger2 = hamburgerList.get(1) + "        | W " + hamburgerPrice.get(1) + " | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        String hamburger3 = hamburgerList.get(2) + "     | W " + hamburgerPrice.get(2) + " | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거";
        String hamburger4 = hamburgerList.get(3) + "      | W " + hamburgerPrice.get(3) + " | 포테인토 번과 비프패티, 치즈가 토핑된 치즈버거";
        String hamburger5 = hamburgerList.get(4) + "         | W " + hamburgerPrice.get(4) + " | 비프패티를 기반으로 야채가 들어간 기본버거";

        // Custard
        String custard1 = custardsList.get(0) + " | W " + custardPrice.get(0) + " | 로컬 로스팅 브랜드 앤트러사이트와 협업한 기간 한정 콜라보레이션 커피 쉐이크";
        String custard2 = custardsList.get(1) + " | W " + custardPrice.get(1) + " | 쫀득하고 진한 커스터트가 들어간 클래식 쉐이크";
        String custard3 = custardsList.get(2) + "                  | W " + custardPrice.get(2) + " | 부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료";
        String custard4 = custardsList.get(3) + "             | W " + custardPrice.get(3) + " | 매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림";

        // Drinks
        String drink1 = drinksList.get(0) + "     | " + drinksPrice.get(0) + " | 쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드";
        String drink2 = drinksList.get(0) + "               | " + drinksPrice.get(1) + " | 매장에서 직접 만드는 상큼한 레몬에이드";
        String drink3 = drinksList.get(0) + "  | " + drinksPrice.get(2) + " | 직접 유기농 홍차를 우려낸 아이스 티";
        String drink4 = drinksList.get(0) + "            | " + drinksPrice.get(3) + " | 레몬에이드와 유기농 홍차를 우려낸 아이스티가 만나 탄생한 쉐이크쉑의 시그니처 음료";

        // Woof
        String woof1 = woofsList.get(0) + "Bag O-Bones | " + woofsPrice.get(0) + " | 강아지용 비스킷 5개 세트";

        // sout("위 메뉴를 장바구니에 추가하시겠습니까?");
        String basketAddQuestion = "위 메뉴를 장바구니에 추가하시겠습니까?";
        // sout(" 가 장바구니에 추가되었습니다.");
        String basketAddWord = " 가 장바구니에 추가되었습니다.";


        // 코드 실행 => 메인메뉴판 시작
        while (true) {
            System.out.println(shakeShackMenuAndOrder);
            int numbering = sc.nextInt();
            // 1번 입력 시 햄버거 메뉴판 이동
            if (numbering == 1) {
                System.out.println(burgersMenu);
                numbering = sc.nextInt();
                // 1번 입력 시  헴버거 종류
                if (numbering == 1) {
                    System.out.println(hamburger1);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(hamburger1);
                        priceAdd.add(hamburgerPrice.get(0));
                        System.out.println(hamburgerList.get(0) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(hamburger1);
                                priceAdd.add(hamburgerPrice.get(0));
                                System.out.println(hamburgerList.get(0) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(hamburger1);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 2) {
                    System.out.println(hamburger2);         // 2번메뉴
                    System.out.println(basketAddQuestion);  // 추가하시겠습니까?
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(hamburger2);
                        priceAdd.add(hamburgerPrice.get(1));
                        System.out.println(hamburgerList.get(1) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(hamburger2);
                                priceAdd.add(hamburgerPrice.get(1));
                                System.out.println(hamburgerList.get(1) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(hamburger2);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 3) {
                    System.out.println(hamburger3);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(hamburger3);
                        priceAdd.add(hamburgerPrice.get(2));
                        System.out.println(hamburgerList.get(2) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(hamburger3);
                                priceAdd.add(hamburgerPrice.get(2));
                                System.out.println(hamburgerList.get(2) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(hamburger3);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 4) {
                    System.out.println(hamburger4);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(hamburger4);
                        priceAdd.add(hamburgerPrice.get(3));
                        System.out.println(hamburgerList.get(3) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(hamburger4);
                                priceAdd.add(hamburgerPrice.get(3));
                                System.out.println(hamburgerList.get(3) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(hamburger4);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 5) {
                    System.out.println(hamburger5);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(hamburger5);
                        priceAdd.add(hamburgerPrice.get(4));
                        System.out.println(hamburgerList.get(4) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(hamburger5);
                                priceAdd.add(hamburgerPrice.get(4));
                                System.out.println(hamburgerList.get(4) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(hamburger5);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else {
                    System.out.println("다시 입력해주세요");
                }
                // 2번 입력 시 커스타드 메뉴
            } else if (numbering == 2) {
                System.out.println(custardsMenu);
                numbering = sc.nextInt();
                if (numbering == 1) {
                    System.out.println(custard1);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(custard1);
                        priceAdd.add(custardPrice.get(0));
                        System.out.println(custardsList.get(0) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(custard1);
                                priceAdd.add(custardPrice.get(0));
                                System.out.println(custardsList.get(0) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(custard1);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 2) {
                    System.out.println(custard2);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(custard2);
                        priceAdd.add(custardPrice.get(1));
                        System.out.println(custardsList.get(1) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(custard2);
                                priceAdd.add(custardPrice.get(1));
                                System.out.println(custardsList.get(1) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(custard2);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 3) {
                    System.out.println(custard3);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(custard3);
                        priceAdd.add(custardPrice.get(2));
                        System.out.println(custardsList.get(2) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(custard3);
                                priceAdd.add(custardPrice.get(2));
                                System.out.println(custardsList.get(2) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(custard3);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 4) {
                    System.out.println(custard4);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(custard4);
                        priceAdd.add(custardPrice.get(3));
                        System.out.println(custardsList.get(3) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(custard4);
                                priceAdd.add(custardPrice.get(3));
                                System.out.println(custardsList.get(3) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(custard4);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else {
                    System.out.println("다시 입력해주세요.");
                }
                // 3번 입력 시 음료 메뉴
            } else if (numbering == 3) {
                System.out.println(drinksMenu);
                numbering = sc.nextInt();
                if (numbering == 1) {
                    System.out.println(drink1);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(drink1);
                        priceAdd.add(drinksPrice.get(0));
                        System.out.println(drinksList.get(0) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(drink1);
                                priceAdd.add(drinksPrice.get(0));
                                System.out.println(drinksList.get(0) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(drink1);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 2) {
                    System.out.println(drink2);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(drink2);
                        priceAdd.add(drinksPrice.get(1));
                        System.out.println(drinksList.get(1) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(drink2);
                                priceAdd.add(drinksPrice.get(1));
                                System.out.println(drinksList.get(1) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(drink2);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 3) {
                    System.out.println(drink3);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(drink3);
                        priceAdd.add(drinksPrice.get(2));
                        System.out.println(drinksList.get(2) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(drink3);
                                priceAdd.add(drinksPrice.get(2));
                                System.out.println(drinksList.get(2) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(hamburger1);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else if (numbering == 4) {
                    System.out.println(drink4);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(drink4);
                        priceAdd.add(drinksPrice.get(3));
                        System.out.println(drinksList.get(3) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(drink4);
                                priceAdd.add(drinksPrice.get(3));
                                System.out.println(drinksList.get(3) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(drink4);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else {
                    System.out.println("다시 입력해주세요.");
                }
                // 4번 입력 시 사료 메뉴
            } else if (numbering == 4) {
                System.out.println(woofsMenu);
                numbering = sc.nextInt();
                if (numbering == 1) {
                    System.out.println(woof1);
                    System.out.println(basketAddQuestion);
                    System.out.println("1. 확인           2. 취소");
                    System.out.println();
                    numbering = sc.nextInt();
                    // 1번 입력 시 장바구니에 추가
                    if (numbering == 1) {
                        basketAdd.add(woof1);
                        priceAdd.add(woofsPrice.get(0));
                        System.out.println(woofsList.get(0) + "" + basketAddWord);
                        System.out.println();
                        // 2번 입력 시 상품 메뉴판으로 돌아가기
                    } else if (numbering == 2) {
                        System.out.println("취소 되었습니다. 메인 메뉴판으로 돌아갑니다.");
                        System.out.println();
                    } else {
                        while (true) {
                            if (numbering == 1) {
                                basketAdd.add(woof1);
                                priceAdd.add(woofsPrice.get(0));
                                System.out.println(woofsList.get(0) + "" + basketAddWord);
                                System.out.println();
                                break;
                            } else if (numbering == 2) {
                                System.out.println(shakeShackMenuAndOrder);
                            }
                            System.out.println("다시 입력해주세요.");
                            System.out.println(woof1);
                            System.out.println(basketAddQuestion);
                            System.out.println("1. 확인           2. 취소");
                            System.out.println();
                            numbering = sc.nextInt();
                        }
                    }
                } else {
                    System.out.println("다시 입력해주세요.");
                }
                // 5번 입력 시 장바구니 확인
            } else if (numbering == 5) {
                System.out.println(orders);
                System.out.println("[ Orders ]");
                // 장바구니에 담겨져 있는 물품 꺼내기
                for (int i = 0; i < basketAdd.size(); i++) {
                    System.out.println(basketAdd.get(i));
                }
                System.out.println();
                System.out.println("[ Total ]");
                // 가격 더해지는 값 구해야됨
                double priceAddAll = 0;
                double total = 0;
                for (int i = 0; i < priceAdd.size(); i++) {
                    priceAddAll += priceAdd.get(i);
                    total += priceAddAll;
                }
                System.out.printf("W %.1f", total);   // 소수점 한자리까지 나오게,,
                System.out.println();
                System.out.println("1. 주문           2. 메뉴판");
                numbering = sc.nextInt();
                if (numbering == 1) {
                    // 장바구니에 담겨져 있을 경우 => 주문완료
                    // 장바구니에 담겨져 있지 않을 경우 => 메인 메뉴판으로 이동
                    // 다른 번호 입력시 => 다시 입력
                    if (!basketAdd.isEmpty()) {
                        System.out.println("주문이 완료되었습니다!");
                        basketAdd.remove("");
                        System.out.println();
                        for (int i = 0; i < 1 + i; i++) {
                            System.out.println("대기번호는 [ " + ++i + " ] 입니다."); // 1번만 계속 나오네..
                            break;
                        }
                        // Thread sleep을 이용하여 3초 후 메인 메뉴판 이동
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println();
                    } else if (basketAdd.isEmpty()) {
                        System.out.println("장바구니에 메뉴가 없습니다. 다시 선택해주세요.");
                        System.out.println();
                    } else {
                        System.out.println("다시 입력해주세요.");
                        // 메세지 이후 주문 화면으로 돌아가야되는데 메인메뉴로 돌아간다..
                    }
                } else if (numbering == 2) {
                    // 주문 메뉴판
                } else {
                    System.out.println("다시 입력해주세요.");
                }
                // 6번 입력 시 취소
            } else if (numbering == 6) {
                System.out.println("진행하던 주문을 취소하시겠습니까?");
                System.out.println("1. 확인           2. 취소");
                numbering = sc.nextInt();
                if (numbering == 1 && !basketAdd.isEmpty() && !priceAdd.isEmpty()) {
                    basketAdd.remove("");
                    priceAdd.remove("");
                    System.out.println("진행하던 주문이 취소되었습니다.");
                    System.out.println();
                    }
                } else {
                    System.out.println("주문내역이 없습니다.");
                    }
                }
            }
        }


