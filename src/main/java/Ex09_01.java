public class Ex09_01 {
    public static void main(String[] args) {

        String str = "IT CookBook, Java";
        int len;
        len = str.length();

        //length 값의 존재 여부 확인

        System.out.printf("문자열 : %s\n", str);
        System.out.printf("문자열 길이 : %d\n", len);

        if (str.length() > 0){
            System.out.println("str 변수에 값이 존재한다.");
        } else {
            System.out.println("str 변수에 값이 존재하지않는다.");
        }

    }
}
