package org.jbltd.wgn;

public class Workout {

    public WorkoutType type;
    public WorkoutDifficulty difficulty;
    public String main;
    public String circuit1;
    public String circuit2;

    public Workout(WorkoutType type, WorkoutDifficulty difficulty, String main, String circuit1, String circuit2) {
	this.type = type;
	this.difficulty = difficulty;
	this.main = main;
	this.circuit1 = circuit1;

	if (circuit2 != null) {
	    this.circuit2 = circuit2;
	}

    }

    
    public WorkoutType getWorkoutType() {
	return type;
    }
    
    public WorkoutDifficulty getDifficulty() {
	return difficulty;
    }

    public String getMainWorkout() {
	return main;
	
    }
    
    public String getCircuit1() {
	return circuit1;
    }
    
    public String getCircuit2() {
	return circuit2;
    }
    
}
