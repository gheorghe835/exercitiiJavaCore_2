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
                "implementează metodele calculPerimetru() și calculAria().\n");
    }
}