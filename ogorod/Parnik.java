public class Parnik extends Teplitsa{
    //public String name = "parnichek";
    //public parnik1 = new Teplitsa (dlina: 10, shirina: 4, vysota: 2, name: "B");

    public String gryadka1 = "Kartoha";
    public String gryadka2 = "Pomidor";

    public Parnik(int dlina, int shirina, int vysota, String name) {
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
