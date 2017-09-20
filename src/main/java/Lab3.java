    import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author bwang
 *  the lab 3
 */
public class Lab3 {

    /**
     * @param args argument
     */
    public static void main(final String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter a url");
       String url = scan.nextLine();
       String str = urlToString(url);

       System.out.println("enter the word to count:");
       String word = scan.nextLine();
       String[] arr = str.trim().split("\\s+");
       int sameWord = 0;
       for(int i =0;i<arr.length;i++)
       {
           if(arr[i].toLowerCase().equals(word.toLowerCase())) {
               sameWord++;
           }
               
       }
       int wordCount = arr.length;
       //System.out.println(wordCount);
       System.out.println(sameWord);
    }

    /**
     * @param url link
     * @return string
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
    }
}
