package com.techacademy;

import java.util.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class KadaiFirstController {

    //http://localhost:8080/dayofweek/指定日
    @GetMapping("/dayofweek/{yyyymmdd}")
    public String dayofweek(@PathVariable String yyyymmdd) {
        String date = yyyymmdd;
        String year = date.substring(0,4);
        String month = date.substring(4,6);
        String day = date.substring(6,8);

    // 年、月、日を整数型に変換
    int intYear = Integer.parseInt(year);
    int intMonth = Integer.parseInt(month)-1;
    System.out.println("MONTH：" + month);
    int intDay = Integer.parseInt(day);

    System.out.println("intYear：" + intYear);
    System.out.println("intMonth：" + intMonth );
    System.out.println("intDay：" + intDay);

    // Calendarインスタンスを使用して曜日を計算
    Calendar calendar = Calendar.getInstance();
    calendar.set(intYear, intMonth, intDay);


    // 曜日を取得
    int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK);

    // 曜日を文字列で取得
    String dayOfweekString = "";
    switch (dayOfweek) {
    case Calendar.SUNDAY:
        dayOfweekString = "Sunday";
        break;
    case Calendar.MONDAY:
        dayOfweekString = "Monday";
        break;
    case Calendar.TUESDAY:
        dayOfweekString = "Tuesday";
        break;
    case Calendar.WEDNESDAY:
        dayOfweekString = "Wednesday";
        break;
    case Calendar.THURSDAY:
        dayOfweekString = "Thursday";
        break;
    case Calendar.FRIDAY:
        dayOfweekString = "Friday";
        break;
    case Calendar.SATURDAY:
        dayOfweekString = "Saturday";
        break;
    }

    // 結果を返す
    return dayOfweekString;
    }

    private int Integer(int month) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果:" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果:" + res;
    }
    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果:" + res;
    }
    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果:" + res;
    }
}


