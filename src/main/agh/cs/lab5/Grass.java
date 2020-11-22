package agh.cs.lab5;

public class Grass {
    private final Vector2d position;

    Grass(Vector2d position){
        this.position = position;
    }

    public Vector2d getPosition(){
        return this.position;
    }

    public String toString(){
        return "*";
    }
}
