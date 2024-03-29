package agh.cs.worldSimulation.map;

import agh.cs.worldSimulation.data.Vector2d;
import agh.cs.worldSimulation.elements.animal.Animal;
import agh.cs.worldSimulation.engine.AnimalEngine;
import agh.cs.worldSimulation.engine.GrassEngine;

import java.util.LinkedList;

/**
 * The interface responsible for interacting with the map of the world.
 * Assumes that Vector2d and MoveDirection classes are defined.
 */

public interface IWorldMap {        // Left to extend the model with additional map types
    /**
     * Indicate if any object can move to the given position.
     *
     * @param position
     *            The position checked for the movement possibility.
     * @return True if the object can move to that position.
     */
    boolean canMoveTo(Vector2d position);

    /**
     * Place a animal on the map.
     *
     * @param animal
     *            The animal to place on the map.
     * @return True if the animal was placed. The animal cannot be placed if the map is already occupied.
     */
    boolean place(Animal animal);

        /**
         * Return true if given position on the map is occupied. Should not be
         * confused with canMove since there might be empty positions where the animal
         * cannot move.
         *
         * @param position
         *            Position to check.
         * @return True if the position is occupied.
         */
    boolean isOccupied(Vector2d position);

    /**
     * Return an object at a given position.
     *
     * @param position
     *            The position of the object.
     * @return Object or null if the position is not occupied.
     */
    Object objectAt(Vector2d position);

    Object toString(IWorldMap map);

    void addDailyGrass();

    void animalDied(Animal animal);

    LinkedList<Animal> getAnimalsList();

    LinkedList<Animal> getDeadAnimalsList();

    Vector2d upperRight();

    Vector2d lowerLeft();

    int getEnergyFrom(Vector2d position);

    boolean isInStep(Vector2d position);

    Vector2d getMapSize();

    LinkedList<Vector2d> getEmptyJunglePositions();

    LinkedList<Vector2d> getEmptyStepPositions();

    Vector2d mapWrap(Animal animal, Vector2d position);

    void reproduce(Vector2d position);

    int getGrassMapSize();

    GrassEngine getGrassEngine();

    AnimalEngine getAnimalEngine();
}
