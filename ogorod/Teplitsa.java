public class Teplitsa {
    int dlina;
    int shirina;
    int vysota;
    String name;

    public Teplitsa(int dlina, int shirina, int vysota, String name) {
        this.dlina = dlina;
        this.shirina = shirina;
        this.vysota = vysota;
        this.name = name;
    }

    void closeDoor(){
        System.out.println(this.name+": Door is closed");
    }

    void openDoor(){
        System.out.println(this.name+": Door is opened");
    }

}
