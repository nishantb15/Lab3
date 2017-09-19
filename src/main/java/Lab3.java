import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
    }



public static String urlToString(final String url) {
    String prince = "prince";
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;
}
}