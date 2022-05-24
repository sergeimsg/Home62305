public class CreditCard {
    int accnumber;
    int cardsum;


    public CreditCard ( int accnumber, int cardsum) {
        this.accnumber = accnumber;
        this.cardsum = cardsum;

    }
    void cardadding (int cardsum, int adding) {
        this.cardsum = this.cardsum + adding;

    }

    void removemoney (int cardsum, int removal) {
        this.cardsum = this.cardsum - removal;

    }

}
