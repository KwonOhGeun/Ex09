public class Ex09_04 {
    public static void main(String[] args) {
        String str = "Java를 공부하는 중, Java는 재밌어요.^^";

        System.out.println("문자열 ==> " +str);

        System.out.print("제일 처음 나오는 Java위치 ==> ");
        System.out.println(str.indexOf("Java"));
        System.out.print("마지막에 나오는 Java 위치 ==>");
        System.out.println(str.lastIndexOf("Java"));
        //Access_log 새므
        /*
        String log = "111.222.33.44 -- [11/Jun/2012:22:12:32 + 0900] \get /w/custom/jmnote20120121"

                if (log.startsWith("111.222")){
                    int ipLastpos = log.indexOf(" ");
        System.out.println("ipLaspos : " + ipLastpos);
        System.out.println("IP : " + log.substring(0,ipLastpos);
         */
    }
}

