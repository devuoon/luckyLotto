package lottery;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class weekNum {
    public static int[] ThisWeekLottoNumbers() {
        // 1. 로또 번호 6자리 배열로 저장
        int weekLotto[] = new int[6];

        // 2. 번호는 1~45
        int min = 1;
        int max = 45;

        // 3. 숫자는 랜덤
        Random ran = new Random();

        // 4. 중복 제거 및 랜덤 숫자 뽑기
        Set<Integer> ranNumbers = new HashSet<>(); 	// HashSet을 사용하여 중복을 허용하지 않는 정수형 집합 생성 
        while (ranNumbers.size() < weekLotto.length) {
            int randomNumber = ran.nextInt((max - min) + 1) + min; // random 클래스를 사용하여 난수 생성
            ranNumbers.add(randomNumber); // 생성된 난수를 randomNumber 집합에 추가 
        }

        // 5 집합 -> 배열로 값 복사
        Integer[] weekNumbersArray = ranNumbers.toArray(new Integer[0]);
        for (int i = 0; i < weekLotto.length; i++) {
            weekLotto[i] = weekNumbersArray[i].intValue(); // Integer를 int로 변환하여 복사
        }

        // 6. 정렬
        Arrays.sort(weekLotto);
        
        // 로또 번호 출력
        System.out.println("이번 주 로또 번호는 ~~~?? ");
        for (int number : weekLotto) {
            System.out.print(number + " ");
        }

        return weekLotto;
    }
}
