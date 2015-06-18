/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package downloadallfilesfromwebpage;


import java.io.FileOutputStream;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Download all files from webpage using jsoup
 * @author Fabien
 */
public class DownloadAllFilesFromWebpage {

    public static void main(String[] args) throws IOException {
        // The URL
        String url = "http://www.phys.uni-sofia.bg/~tank/JAVA/Lectures/";
        print("Fetching %s...", url);

        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a[href]");
        

        print("\nLinks: (%d)", links.size());
        for (Element link : links) {
            if(link.attr("abs:href").endsWith("doc")){
                System.out.println(link.attr("abs:href"));
                saveFileFromWeb(link.attr("abs:href"));
            }
           // print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
        }
    }

    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else
            return s;
    }
    
    private static void saveFileFromWeb(String webPage) throws MalformedURLException, IOException {
        // This code is from
        // http://stackoverflow.com/questions/921262/how-to-download-and-save-a-file-from-internet-using-java
        URL website = new URL(webPage);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        String fileName = getFileNameFromURL(webPage);
        String path = "C:\\Users\\Fabien\\Documents\\NetBeansProjects\\DownloadAllFilesFromWebpage\\Downloads\\";
        FileOutputStream fos = new FileOutputStream(path+fileName);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }

    private static String getFileNameFromURL(String webPage) {
        String name = "";
        for (int i = webPage.length() - 1; i >= 0; i--) {
            if(webPage.charAt(i) == '/'){
                return name;
            }
            name = webPage.charAt(i) + name;
        }
        return name;
    }
    
}
