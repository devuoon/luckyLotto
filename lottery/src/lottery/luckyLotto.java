package lottery;

import java.util.Scanner;

public class luckyLotto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("★☆★☆★☆★☆★☆★☆★행운 복권☆★☆★☆★☆★☆★☆★☆★");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("1 또는 2를 입력 후 엔터(Enter)를 입력하세요.");
        System.out.println("1. 이번 주 당첨 번호 | 2. 랜덤 번호 뽑기");

        int answer = 0;
        answer = sc.nextInt();

        if (answer == 1) {
            // 'weekNum' 클래스의 메서드 호출
            weekNum.ThisWeekLottoNumbers();
          
        } else if (answer == 2) {
            // 랜덤 번호 뽑기 코드 작성
        	
        } else {
            System.out.println("잘못된 입력입니다. 1 또는 2를 입력하세요.");
        }

        sc.close(); // Scanner 사용 후 닫기
    }
}
