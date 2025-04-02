package koschei.models;


public class Egg6 {
    //Cвязь через констурктор
    //Убираем @Component т.к. Bean Egg создается в AppConfig
    private Needle7 needle;

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }
    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
