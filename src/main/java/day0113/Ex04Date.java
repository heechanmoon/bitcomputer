package day0113;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04Date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        DateFormat df = new SimpleDateFormat("yyMMdd");
        df.setLenient(false);
        String temp = "230196";
        try {
            d = df.parse(temp);
            System.out.println(d);
        }catch (Exception e){
            System.out.println("해당 스트링은 date로 변환 못해서 현재 날짜로 date가 설정되었습니다.");
            d = new Date();
            System.out.println(d);
        }
    }
}
