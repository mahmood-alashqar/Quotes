/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

//        try {
//            // create Gson instance
//            Gson gson = new Gson();
//
//            // create a reader
//            Reader reader = Files.newBufferedReader(Paths.get("C:/Users/peter/quotes/app/src/main/java/quotes/gson/recentquotes.json"));
//
//            // convert JSON array to list of quotes
//            List<Quotes> users = new Gson().fromJson(reader, new TypeToken<List<Quotes>>() {
//            }.getType());
//
//            // print all quotes
////            for(Quotes q: users){
////                System.out.println(q.getAuthor() + "\n" + q.getText());
////            }
//            int random = 0 + (int) (Math.random() * ((users.size() - 0) + 1));
//
//            // print one author and his text randomly
//            System.out.println(users.get(random).getAuthor() + " \n" + users.get(random).getText());
//
//            // close reader
//            reader.close();
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

//         Api link
//        http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en

            URL url = new URL("pi.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");
            Gson gson = new Gson();
            QuotesApi q = null;
            HttpURLConnection conn = null;
            BufferedReader read = null;
            try {

                conn = (HttpURLConnection) url.openConnection();
                read = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                q = gson.fromJson(read, QuotesApi.class);
                System.out.println("The Author Name: " + q.getQuoteAuthor());
                System.out.println("The Quote: " + q.getQuotesText());
                System.out.println("<<<<<>>>>>");

            } catch (Exception IOException) {
                System.out.println("we reach here");
//                e.printStackTrace();
//                try {

//
//            // create a reader
//            Reader reader = Files.newBufferedReader(Paths.get("C:/Users/peter/quotes/app/src/main/java/quotes/gson/recentquotes.json"));
//
//            // convert JSON array to list of quotes
//            List<Quotes> quotes = new Gson().fromJson(reader, new TypeToken<List<Quotes>>() {
//            }.getType());
//
//            // print all quotes
////            for(Quotes q: users){
////                System.out.println(q.getAuthor() + "\n" + q.getText());
////            }
//            int random = 0 + (int) (Math.random() * ((quotes.size() - 0) + 1));
//
//            // print one author and his text randomly
//            System.out.println(quotes.get(random).getAuthor() + " \n" + quotes.get(random).getText());
//
//            // close reader
//            reader.close();
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
            }
    }
}
