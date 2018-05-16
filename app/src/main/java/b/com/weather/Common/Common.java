package b.com.weather.Common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Thapliyal on 1/26/2018.
 */

public class Common {
    //Get the API_KEY by signing up on the website
    public static String API_KEY = "d7b09efc8bafdefc9c6c4fc858c3fb1e";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    public static String apiRequest(String lat, String lng) {
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    //Convert the time from unix format to HH:mm
    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date  = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    //Get a link image from OpenWeatherMap
    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
