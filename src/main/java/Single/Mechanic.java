package Single;

public class Mechanic {
    private int mot;

    public Mechanic(){
        mot = 365;
    }

    public Mechanic(int mot){
        this.mot = mot;
    }

    public int getMot() {
        return mot;
    }

    public void setMot(int mot) {
        this.mot = mot;
    }
}
