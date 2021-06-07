package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury"),
    VENUS("Venus"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    URANUS("Uranus"),
    NEPTUNE("Neptune");


    private final String planet;
    private final String name;

    Planets(String planet, String name) {
        this.planet = planet;
        this.name=name;
    }

    public String getPlanet() {
        return planet;
    }

    public String getName() {
        return name;
    }
}