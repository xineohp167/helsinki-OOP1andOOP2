/*
 * This program downlaod a file from web and saves it on the local disk
 */

package downloadandsavefile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Download a file from the web and save it on the local disk
 * @author Fabien
 */
public class DownloadAndSaveFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // The URL of the file
        String webPage = "http://www.phys.uni-sofia.bg/~tank/JAVA/Lectures/JAVA1.doc";
        System.out.println(getFileNameFromURL(webPage));
        saveFileFromWeb(webPage);
    }

    private static void saveFileFromWeb(String webPage) throws MalformedURLException, IOException {
        // This code is from
        // http://stackoverflow.com/questions/921262/how-to-download-and-save-a-file-from-internet-using-java
        URL website = new URL(webPage);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        String fileName = getFileNameFromURL(webPage);
        String path = "C:\\Users\\Fabien\\Documents\\NetBeansProjects\\DownloadAndSaveFile\\Downloads\\";
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
