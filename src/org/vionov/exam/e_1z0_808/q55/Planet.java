package org.vionov.exam.e_1z0_808.q55;

public class Planet {
    public String name;
    public int moons;

    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    public static void main(String[] args) {
        Planet[] planets = {
                new Planet("Mercury", 0),
                new Planet("Venus", 0),
                new Planet("Earth", 1),
                new Planet("Mars", 2),
        };

        System.out.println(planets);
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);
    }
}
