import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard( 12345678, 1000);
        CreditCard card2 = new CreditCard(98765432, 500);
        CreditCard card3 = new CreditCard(45678912, 600);
        System.out.println("Card1 # "+card1.accnumber +"  ������� �� ����� " + card1.cardsum);
        System.out.println("Card2 # "+card1.accnumber +"  ������� �� ����� " + card2.cardsum);
        System.out.println("Card3 # "+card1.accnumber +"  ������� �� ����� " + card3.cardsum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������� ����� 1");
        int adding = scanner.nextInt();
        System.out.println("��������� ����� 2");
        int adding2 = scanner.nextInt();
        System.out.println("����� ����� ������� ����� � ����� 3?  " + " �� ����� " + card3.cardsum);
        int removal = scanner.nextInt();

        card1.cardadding (card1.cardsum, adding);
        System.out.println("������� �� ����� 1 " + card1.cardsum);
        card2.cardadding (card2.cardsum, adding2);
        System.out.println("������� �� ����� 2 " + card2.cardsum);
        card3.removemoney(card3.cardsum, removal);
        if (card3.cardsum>0) {
            System.out.println("������� �� ����� 3 " + card3.cardsum);}
        else System.out.println("������������ ������� �� �����");

    }

}
