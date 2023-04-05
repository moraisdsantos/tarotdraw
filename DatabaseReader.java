import java.util.List;
import java.util.Scanner;
import java.io.*;
public class DatabaseReader {


public static void readData(List<Card> cardList, File csvFile) {

    try {
        Scanner dataInput = new Scanner(csvFile);
        while (dataInput.hasNextLine()) {
            String[] content = dataInput.nextLine().split(";");
            //if (content.length != 3)
           // {
           //     System.out.println("Invalid line.");
         //       continue;
           // }
            Card cardData = new Card();
            cardData.setCardIndex(Integer.parseInt(content[0]));
            cardData.setCardName (content[1]);
            cardData.setCardDescription (content[2]);
            cardList.add(cardData);
        }

    } catch (Exception e) {
        System.out.println(e.getClass());
    }


    }
}

