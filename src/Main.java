import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Concatenare de stringuri\n" +
                "Creează un program java care folosește StringBuilder pentru a concatena o " +
                "listă de cuvinte (de exemplu, \"Bună\", \"ziua\", \"lume!\"). \n" +
                "•\tFolosește un ciclu pentru a adăuga fiecare cuvânt la StringBuilder.\n" +
                "•\tAfișează rezultatul concatenării.");
        List<String> words = Arrays.asList("  Buna ","ziua ","lume!");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words ) {
            stringBuilder.append(word).append("");
        }
        System.out.println("\n  Rezultatul concatinarii:: " + stringBuilder.toString());
        System.out.println("\n#######################################################\n");
        System.out.println("Exercițiul 2: Verificarea unui palindrom\n" +
                "Creează un program care verifică dacă un cuvânt este palindrom (adică, " +
                "se citește la fel și de la stânga la dreapta și invers).\n" +
                "•\tFolosește StringBuffer pentru a crea reversul unui cuvânt.\n" +
                "•\tCompară cuvântul original cu reversul și afișează un mesaj corespunzător.");

        System.out.print(" \n Introduceti un cuvint:: ");
        String original = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(original);
        String reverse = stringBuffer.reverse().toString();

        if(original.equalsIgnoreCase(reverse)){
            System.out.println("  Cuvintul:: " + original + ":: este un polindrom.");
        }
        else {
            System.out.println("  Cuvintul:: " + original + ":: nu este un polindrom.");
        }

        System.out.println("\n#######################################################\n");
        System.out.println("Exercițiul 3: Modificarea unui text\n" +
                "Creează un program care folosește String pentru a înlocui toate aparițiile " +
                "unui cuvânt într-o propoziție.\n" +
                "•\tExemplu: înlocuiește cuvântul \"lume\" cu \"univers\".\n" +
                "•\tAfișează propoziția modificată.");

        String sentence  = "Salutare, lume minunata!";
        String word1 = "lume";
        String word2 = "univers";

        String modifiedSentence = sentence.replace(word1,word2);

        System.out.println("  \n    Propozitia initiala:: " + sentence);
        System.out.println("  Propozitia modificata:: " + modifiedSentence);


        System.out.println("\n#######################################################\n");


        System.out.println("Exercițiul 4: Inserare și ștergere de caractere\n" +
                "Creează un program care folosește StringBuilder pentru a insera și șterge " +
                "caractere într-un șir de caractere:\n" +
                "•\tAdaugă un caracter la începutul șirului.\n" +
                "•\tȘterge un caracter din mijlocul șirului.\n" +
                "•\tAfișează rezultatul final.");

        StringBuilder stringBuilder1 = new StringBuilder("SQL");
        System.out.println("  Cuvintul original:: " + stringBuilder1);
        stringBuilder1.insert(0,"My");
        System.out.println("  Cuvintul dupa modificare:: " + stringBuilder1);
        int middleIndex = stringBuilder1.length()/2;
        stringBuilder1.deleteCharAt(middleIndex);
        System.out.println("  Cuvintul dupa stergere:: " + stringBuilder1);
    }
}