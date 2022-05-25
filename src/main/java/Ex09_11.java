import java.util.Scanner;

public class Ex09_11 {
    public static void main(String[] args) { // public은 모든 자바 파일에서 실행할 수 있다.
        Scanner s = new Scanner(System.in);

        int coffee;
        int ret;

        System.out.printf("어떤 커피 드릴까요? (1:보통 2:설탕 3:블랙) ");

        coffee = s.nextInt();

        CoffeeMachine cm = new CoffeeMachine(); // CoffeeMachine 클래스 파일에 있는 값을 가져옴
        cm.coffee_machine(coffee);

        System.out.printf("손님~ 커피 여기 있습니다.\n");
    }

}
