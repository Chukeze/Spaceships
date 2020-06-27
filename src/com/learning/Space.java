package com.learning;

public class Space {//composition
    Asteroid asteroid;
    Spaceship spaceship;

    public Space(){//set color

    }
    public Asteroid getAsteroid(){
        return asteroid;
    }

    public void setAsteroid(Asteroid asteroid) {
        this.asteroid = asteroid;
    }

    public Spaceship getSpaceship(){
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }
}
