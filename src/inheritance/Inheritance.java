
package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        Horse horse = new Horse("Spirit", "Black", 2010);

        // Displaying information about the horse
        System.out.println("Horse Information:");
        System.out.println("Name: " + horse.getName());
        System.out.println("Color: " + horse.getColor());
        System.out.println("Birth Year: " + horse.getDataoB());
        System.out.println();

        // Creating an instance of RaceHorse
        RaceHorse raceHorse = new RaceHorse("Thunder", "Bay", 2015, 10);

        // Displaying information about the race horse
        System.out.println("Race Horse Information:");
        System.out.println("Name: " + raceHorse.getName());
        System.out.println("Color: " + raceHorse.getColor());
        System.out.println("Birth Year: " + raceHorse.getDataoB());
        System.out.println("Number of Races: " + raceHorse.getRaceN());
    }
    }
