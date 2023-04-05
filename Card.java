public class Card {

    private String cardName = "";
    private int cardID = 0;
    private String cardDescription = "";

    public void setCardName(String newCardName){
    this.cardName = newCardName;
    }
    public String getCardName() {
        return cardName;
    }

    public void setCardIndex (int cardIndex){
        this.cardID = cardIndex;
    }
    public int getCardIndex (){
        return cardID;
    }

    public void setCardDescription (String newCardDescription){
        this.cardDescription = newCardDescription;

    }

    public String getCardDescription () {
        return cardDescription;
    }

    @Override
    public String toString() {
        return ("The card drawn is: "+ this.getCardName()+". This card represents "+ this.getCardDescription());
    }
}
