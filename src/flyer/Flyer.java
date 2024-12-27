package flyer;

public interface Flyer {
    void flyer();
    default void description(){
        System.out.println("  Acest obiect poate zbura.");
    }
}
