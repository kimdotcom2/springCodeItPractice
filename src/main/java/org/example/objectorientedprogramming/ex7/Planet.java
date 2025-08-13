package org.example.objectorientedprogramming.ex7;

public enum Planet {

    MERCURY("수성", 3.303e+23, 2.4397e6),
    VENUS("금성", 4.869e+24, 6.0518e6),
    EARTH("지구", 5.976e+24, 6.37814e6);

    private final String planetName;
    private final double mass;
    private final double radius;

    Planet(String planetName, double mass, double radius) {
        this.planetName = planetName;
        this.mass = mass;
        this.radius = radius;
    }

    public double surfaceGravity() {
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }

    @Override
    public String toString() {
        return name() + " (" + planetName + ") " + " (gravity=" + surfaceGravity() + ")";
    }

}
