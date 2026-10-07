
import java.util.*;

public class UrlShortener {

    static HashMap<String, String> map = new HashMap<>();
    static int count = 1;

    static String shorten(String url) {
        String shortUrl = "url" + count++;
        map.put(shortUrl, url);
        return shortUrl;
    }

    static String getOriginal(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = sc.nextLine();
        String shortUrl = shorten(url);

        System.out.println(shortUrl);

        String input = sc.nextLine();
        System.out.println(getOriginal(input));
    }
}
