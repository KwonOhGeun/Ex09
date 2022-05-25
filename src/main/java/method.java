public class method {
    public static int sum (int i1, int i2){
        //반환 타입 Void = return이 없는 경우 // 다른 반환 타입 = return값이 필요하다.
        //함수명의 sum

        int sum = 0; //변수명의 sum

        for(int i = i1; i<= i2; i++)
            sum += i;

        return sum;

    }
}
