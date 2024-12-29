package tascuri;

public class Printer {
    public static void main(String[] args) {
        System.out.println(
                "Exercițiul 1: Ierarhie de vehicule\n" +
                "Creează o ierarhie de clase pentru vehicule:\n" +
                "•\tCreează o interfață Vehicul care definește metoda accelereaza().\n" +
                "•\tCreează o clasă abstractă Masina care implementează interfața Vehicul și " +
                "conține metoda concretă oprire().\n" +
                "•\tCreează clasele MasinaElectrica și MasinaCuMotor care moștenesc " +
                "Masina și implementează metoda accelereaza().\n" +
                "•\tÎn metoda main, creează obiecte de tipul MasinaElectrica și MasinaCuMotor, " +
                "și apelează metodele lor.\n" +
                "Exercițiul 2: Modelarea formelor geometrice\n" +
                "Creează o aplicație care modelează forme geometrice:\n" +
                "•\tCreează o interfață Forma care conține metodele calculPerimetru() și " +
                "calculAria().\n" +
                "•\tCreează o clasă abstractă FormaGeometrica care implementează Forma și " +
                "definește o metodă descriere() care returnează o descriere a formei.\n" +
                "•\tCreează clasele Cerc și Patrat care moștenesc FormaGeometrica și " +
                "implementează metodele calculPerimetru() și calculAria().\n" +
                "Exercițiul 3: Ierarhie de animale\n" +
                "Creează o ierarhie de animale:\n" +
                "•\tCreează o interfață Animal care definește metodele faceSunet() și doarme().\n" +
                "•\tCreează o clasă abstractă Mammifer care implementează interfața Animal și conține o metodă concretă alaptare().\n" +
                "•\tCreează clasele Caine și Pisica care moștenesc Mammifer și implementează metoda faceSunet().\n" +
                "•\tÎn metoda main, creează obiecte de tipul Caine și Pisica și apelează metodele lor.\n" +
                "Exercițiul 4: Dispozitive electronice\n" +
                "Creează o aplicație care modelează dispozitive electronice:\n" +
                "•\tCreează o interfață Dispozitiv care conține metodele pornire() și oprire().\n" +
                "•\tCreează o clasă abstractă DispozitivMobil care implementează interfața Dispozitiv și conține o metodă concretă setStatus().\n" +
                "•\tCreează clasele Telefon și Tableta care moștenesc DispozitivMobil și implementează metoda pornire().\n" +
                "•\tÎn metoda main, creează obiecte de tipul Telefon și Tableta, pornește-le și oprește-le\n" +
                "Exercițiul 5: Concatenare de stringuri\n" +
                "Creează un program care folosește StringBuilder pentru a concatena o listă de cuvinte (de exemplu, \"Bună\", \"ziua\", \"lume!\").\n" +
                "•\tFolosește un ciclu pentru a adăuga fiecare cuvânt la StringBuilder.\n" +
                "•\tAfișează rezultatul concatenării.\n" +
                "Exercițiul 6: Verificarea unui palindrom\n" +
                "Creează un program care verifică dacă un cuvânt este palindrom (adică, se citește la fel și de la stânga la dreapta și invers).\n" +
                "•\tFolosește StringBuffer pentru a crea reversul unui cuvânt.\n" +
                "•\tCompară cuvântul original cu reversul și afișează un mesaj corespunzător.\n" +
                "Exercițiul 7: Modificarea unui text\n" +
                "Creează un program care folosește String pentru a înlocui toate aparițiile unui cuvânt într-o propoziție.\n" +
                "•\tExemplu: înlocuiește cuvântul \"lume\" cu \"univers\".\n" +
                "•\tAfișează propoziția modificată.\n" +
                "Exercițiul 8: Inserare și ștergere de caractere\n" +
                "Creează un program care folosește StringBuilder pentru a insera și șterge caractere într-un șir de caractere:\n" +
                "•\tAdaugă un caracter la începutul șirului.\n" +
                "•\tȘterge un caracter din mijlocul șirului.\n" +
                "•\tAfișează rezultatul final.\n");
    }
}
