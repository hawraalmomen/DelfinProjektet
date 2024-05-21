import java.util.Scanner;
public class Registrering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen! Hvad er dit navn?");
        String navn = scanner.nextLine();
        System.out.println("Hej " + navn + "! Hvad kan jeg gøre for dig?");
        System.out.println("For at blive tilmeldt, så skal vi have oplysninger om dig.");
        System.out.println("Hvor gammel er du?");
        int alder = scanner.nextInt();

        scanner.nextLine();


        //Der skal besluttes, hvilket folk skal være på
        String holdIndeling;
        if (alder < 18) {
            holdIndeling = "Juniorsvømmer";
        } else {
            holdIndeling = "Seniorsvømmer";
        }
        System.out.println("Du skal være på holdet" + " " +holdIndeling);

        System.out.println("Hvilken aktivitetsform ønsker du?");
        //Beslutningen om hvilken aktivitetsformn
        String aktivitetsForm = scanner.nextLine();
        System.out.println("Hermed har vi registreret din valgte aktivitetform: " + aktivitetsForm);

        System.out.println("Hvad koster aktiviten motionist egentlig?");
        int pris = scanner.nextInt();
        System.out.println("Den koster " + pris + " kr. årligt, og da du er over 60 år gammel, så får du 25% rabat");

        System.out.println("Hvad vil du gerne betale med?");
        String betalingsForm = scanner.nextLine();
        System.out.println("Nu er din betaling gået ind " + betalingsForm + "godkendt. Rigtig god fornøjelse!");







    }
}
