package utils;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://restcountries.eu/rest/v1/alpha/de");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json;charset=UTF-8");
        try {
            Scanner scan = new Scanner(con.getInputStream());
            String jsonStr = null;
            if (scan.hasNext()) {
                jsonStr = scan.nextLine();
            }
            scan.close();
            System.out.println(jsonStr);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}