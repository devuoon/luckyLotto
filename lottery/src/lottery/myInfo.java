package lottery;

import java.util.Scanner;

public class myInfo {
    public static void myInfoInput() {
        // 정보를 저장할 문자열 생성
        String myInfo = "";

        // 사용자로부터 정보 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("구매 할 로또 수량: ");
        int quantity = sc.nextInt();

        // 입력 받은 정보를 문자열로 합쳐서 myInfo에 저장
        myInfo = name + " - " + quantity;

        // myInfo 출력 (테스트용)
        //System.out.println("현재 myInfo 내용: " + myInfo);
    }
}
