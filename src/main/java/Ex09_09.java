
public class Ex09_09 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = new String("Java Programming"); // str1, str2과 글씨는 같은데 메모리 공간이 다르다.

        System.out.println("원 문자열1 : [" + str1 + "]");
        System.out.println("원 문자열2 : [" + str2 + "]");
        System.out.println("원 문자열3 : [" + str3 + "]");

        System.out.println("문자열1 == 문자열2 결과 :\t" + (str1 == str2));
        System.out.println("문자열1.equals(문자열2) 결과 : " + str1.equals(str2));

        System.out.println("문자열1 == 문자열3 결과 :\t" + (str1 == str3)); // 메모리공간이 달라서 false
        System.out.println("문자열1.equals(문자열3) 결과 : " + str1.equals(str3)); //순수하게 값만 비교
        //String 에서의 값 비교 equals()사용

        System.out.println("문자열1과 문자열2가 다른지 비교 compareTo 안쓰고, 이렇게 함 : " + !str1.equals(str2));

    }
}