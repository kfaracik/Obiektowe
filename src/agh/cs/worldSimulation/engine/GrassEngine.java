package agh.cs.worldSimulation.engine;

import agh.cs.worldSimulation.data.Vector2d;
import agh.cs.worldSimulation.elements.plant.Grass;
import agh.cs.worldSimulation.map.IWorldMap;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.HashMap;

public class GrassEngine{
    private final HashMap<Vector2d, Grass> grassPositionMap = new HashMap<>();
    private final int plantEnergy;
    private final IWorldMap map;


    public GrassEngine(int plantEnergy, IWorldMap map) {
        this.plantEnergy = plantEnergy;
        this.map = map;
    }

    public HashMap<Vector2d, Grass> getGrassMap() {
        return this.grassPositionMap;
    }

    public void placeGrass(int numberOfGrassToPlace) {
        placeGrassInStep(numberOfGrassToPlace/2);

        if(numberOfGrassToPlace % 2 == 0)
            placeGrassInJungle(numberOfGrassToPlace/2);
        else
            placeGrassInJungle(numberOfGrassToPlace/2 + 1);
    }

    public void placeGrassInJungle(int numberOfGrassToPlace) {
        LinkedList<Vector2d> emptyPositions = map.getEmptyJunglePositions();
        int randomId;

        if (emptyPositions.isEmpty())
            return;

        for(int i=0; i<numberOfGrassToPlace; i++) {
            randomId = randomNumberBetween(0, emptyPositions.size() - 1);
            addGrass(new Grass(emptyPositions.get(randomId), this.plantEnergy));
            emptyPositions.remove(randomId);
        }
    }

    private void placeGrassInStep(int numberOfGrassToPlace) {
        LinkedList<Vector2d> emptyPositions = map.getEmptyStepPositions();
        int randomId;

        if (emptyPositions.isEmpty())
            return;

        for(int i=0; i<numberOfGrassToPlace; i++) {
            randomId = randomNumberBetween(0, emptyPositions.size() - 1);
            addGrass(new Grass(emptyPositions.get(randomId), this.plantEnergy));
            emptyPositions.remove(randomId);
        }
    }

    public void addGrass(Grass newGrass) {
        grassPositionMap.put(newGrass.getPosition(), newGrass);
    }

    private int randomNumberBetween(int min, int max) {
        SecureRandom generator = new SecureRandom();
        return generator.nextInt(max - min + 1) + min;
    }

    public int getEnergyFrom(Vector2d position) {
        int grassEnergy = 0;
        if(map.objectAt(position) instanceof Grass) {
            grassEnergy = grassPositionMap.get(position).getEnergy();
            grassPositionMap.remove(position);
        }

        return grassEnergy;
    }
}