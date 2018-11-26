public class Tsvetnik extends Teplitsa {
    /* public tsvetnic1 = new Teplitsa (dlina: 4, shirina: 3, vysota: 2, name: "A"); */
    //public String name = "tsvetnichek";
    private String gryadka1 = "tulps";
    private String gryadka2 = "roses";

    public Tsvetnik(int dlina, int shirina, int vysota, String name) {
        super(dlina, shirina, vysota, name);
    }

    String getGryadka1(){
        return this.gryadka1;
    }
    String getGryadka2(){
        return this.gryadka2;
    }

    void setGryadka1(String newGname){
        this.gryadka1 = newGname;
        System.out.println("Вы посадили в грядку1 "+this.gryadka1);
    }
    void setGryadka2(String newGname){
        this.gryadka2 = newGname;
        System.out.println("Вы посадили в грядку2 "+this.gryadka2);
    }

}
