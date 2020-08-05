package OOP.Encapsulation.Ex1;

public class Encapsulation {

    /*
    Encapsulations:
    --> We can hide direct access to data by using "Private" Accsess Modifier
    -- We can access private data by using getter(read only) and setter(write only)

    Why we use Encapsulation?
     *     -Increased security of data
     *     -Better control of class attributes and methods
     *     -Flexible: the programmer can change one part of the code without affecting other parts

     */

}

class ourPlanet {

    private String nameOfOurPlanet = "Earth";

    public int getDaysInOurPlanet() {
        return daysInOurPlanet;
    }

    public void setDaysInOurPlanet(int daysInOurPlanet) {
        this.daysInOurPlanet = daysInOurPlanet;
    }

    public String getNaturalSatellite() {
        return naturalSatellite;
    }

    public void setNaturalSatellite(String naturalSatellite) {
        this.naturalSatellite = naturalSatellite;
    }

    private int daysInOurPlanet = 365;
    private String naturalSatellite = "Moon";

    public String getNameOfOurPlanet() {
        return nameOfOurPlanet;
    }

    public void setNameOfOurPlanet(String nameOfOurPlanet) {
        this.nameOfOurPlanet = nameOfOurPlanet;
    }

}


class Mars {
    public static void main(String[] args) {
        ourPlanet our = new ourPlanet();

        System.out.println("My Planet before using setter method --> " + our.getNameOfOurPlanet());
        System.out.println("My Planet before using setter method --> " + our.getDaysInOurPlanet());
        System.out.println("My Planet before using setter method --> " + our.getNaturalSatellite());

        our.setNameOfOurPlanet("Mars");
        our.setDaysInOurPlanet(687);
        our.setNaturalSatellite("Phobos, Deimos");

        System.out.println("My Planet after using setter method --> " + our.getNameOfOurPlanet());
        System.out.println("My Planet after using setter method --> " + our.getDaysInOurPlanet());
        System.out.println("My Planet after using setter method --> " + our.getNaturalSatellite());
    }
}