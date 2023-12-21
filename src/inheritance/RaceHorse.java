
package inheritance;

public class RaceHorse extends Horse{
    int raceN;
    public RaceHorse(String name, String color, int dataoB,int raceN) {
        super(name, color, dataoB);
        this.raceN=raceN;
    }

    public int getRaceN() {
        return raceN;
    }

    public void setRaceN(int raceN) {
        this.raceN = raceN;
    }
}
