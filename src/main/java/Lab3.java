import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str1 = urlToString("http://erdani.com/tdpl/hamlet.txt");
        String[] wordArray = str1.trim().split("\\s+");
        int wordCount = wordArray.length;
        System.out.print(wordCount);

    }

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;
}}

