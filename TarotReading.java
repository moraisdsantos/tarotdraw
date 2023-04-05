import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.net.URL;

public class TarotReading {

    Scanner s = new Scanner(System.in);
    List<Card> cardDatabase = new ArrayList<Card>();
    URL csvPath = this.getClass().getResource("/Tarot.csv");
    File csvFile = new File (csvPath.getPath());
    private int[] pulledCards = {0,0,0};
    private String[] positions = {"past","present","future"};
    public void getReading(){
        DatabaseReader.readData(cardDatabase, csvFile);
        System.out.println ("Ask a question and press enter to receive the guidance of the cards:");
        for (int i=0; i<3; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, (cardDatabase.size()));
            if ((randomNum != pulledCards[0]) && (randomNum !=pulledCards[1])) {
                s.nextLine();
                pulledCards[i] = randomNum;
                System.out.println("Your "+positions[i]+":");
                System.out.println(cardDatabase.get(randomNum));
            } else {
                i = i - 1;
            }
        }
    }

}
