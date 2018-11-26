public class Rabota {
    public static void main(String[] args) {
        Tsvetnik tsvetnik = new Tsvetnik(5,3,2,"tsvetnichek");
        tsvetnik.openDoor();
        System.out.println(tsvetnik.name+": Грядка1 засажена "+tsvetnik.getGryadka1());
        System.out.println(tsvetnik.name+": Грядка2 засажена "+tsvetnik.getGryadka2());
        tsvetnik.setGryadka1("Gladiolus!!");
        tsvetnik.setGryadka2("Edelweiss!!");
        tsvetnik.closeDoor();

        Parnik parnik = new Parnik(10,4,2,"parnichek");
        parnik.openDoor();
        System.out.println(parnik.name+": Грядка1 засажена "+parnik.getGryadka1());
        System.out.println(parnik.name+": Грядка2 засажена "+parnik.getGryadka2());
        parnik.setGryadka1("Ogurtsi");
        parnik.setGryadka2("Redis");
        parnik.closeDoor();

    }

}
