package lottery;

import java.util.Scanner;

public class luckyLotto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // ASCII 아트 출력
            Ascii.printAsciiArt();

            System.out.println("인생한방! 행운 로또입니다. 로또를 구매하시겠습니까? (숫자 1 또는 2를 입력한 후 엔터를 입력하세요)");
            System.out.println("1. 행운 로또 구매 | 2. 종료");

            int answer1 = sc.nextInt();

            if (answer1 == 1) {
                // 'myInfo' 클래스의 메서드 호출
                myInfo.myInfoInput();

                System.out.println("번호 선택 방법: 1. 자동 | 2. 수동");
                int answer2 = sc.nextInt();

                if (answer2 == 1) {
                    // 'myNum' 클래스의 메서드 호출
                    myNum.myLottoNumbers();
                } else if(answer2 == 2) {
                	
                }

            } else if (answer1 == 2) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1 또는 2를 입력하세요.");
                continue; // 잘못된 입력일 경우 반복문 처음으로 이동
            }
            
            System.out.println("이번 주 로또 추첨 결과 입니다.");
            weekNum.ThisWeekLottoNumbers();

            //System.out.println("다시 번호를 입력하시겠습니까? (1. 계속 | 2. 종료)");
            //int continueAnswer = sc.nextInt();

            //if (continueAnswer != 1) {
            //    break; // 2를 입력하면 반복문 종료
            //}
        }

        sc.close(); // Scanner 사용 후 닫기
    }
}
