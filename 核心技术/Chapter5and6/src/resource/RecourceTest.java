package resource;
import java.io.*;
import java.net.*;
import java.nio.charset.*;
import javax.swing.*;
public class RecourceTest {
    public static void main(String[] args) throws IOException{
        Class cl = RecourceTest.class;
        URL aboutURL = cl.getResource("about.gif");
        var icon = new ImageIcon(aboutURL);

        InputStream stream = cl.getResourceAsStream("data/about.txt");
        var about = new String(stream.readAllBytes(),"UTF-8");

        InputStream stream2 = cl.getResourceAsStream("/corejava/title.txt");
        var title = new String(stream2.readAllBytes(),StandardCharsets.UTF_8).trim();

        JOptionPane.showMessageDialog(null,about,title,JOptionPane.INFORMATION_MESSAGE,icon);
    }

}
