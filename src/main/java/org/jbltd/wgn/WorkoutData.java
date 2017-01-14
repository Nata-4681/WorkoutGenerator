package org.jbltd.wgn; 

import java.util.Random; 

public class WorkoutData {

    private static final String[] BENCH_MAIN = new String[] {
	    "[8 reps @ 30%], [5 reps @ 40%], [3 reps @ 50%], [3 reps @ 60%], [3 reps @ 60%], [2 reps @ 75%]",
	    "[8 reps @ 40%], [5 reps @ 50%], [4 reps @ 60%], [3 reps @ 70%], [3 reps @ 75%], [2 reps @ 80%], [1 rep @ 85%]",
	    "[8 reps @ 40%], [5 reps @ 50%], [5 reps @ 60%], [5 reps @ 70%], [5 reps @ 75%], [5 reps @ 80%]",
	    "(Include 30 second pause in between all sets), [8 reps @ 30%], [5 reps @ 40%], [4 reps @ 50%], [3 reps @ 60%], [Repeat Sets 2-4 3x]" }; 
    private static final String[] SQUAT_MAIN = new String[] {
	    "[8 reps @ 30%], [5 reps @ 40%], [3 reps @ 50%], [3 reps @ 60%], [3 reps @ 60%], [2 reps @ 75%]",
	    "[8 reps @ 40%], [5 reps @ 50%], [4 reps @ 60%], [3 reps @ 70%], [3 reps @ 75%], [2 reps @ 80%], [1 rep @ 85%]",
	    "[8 reps @ 40%], [5 reps @ 50%], [5 reps @ 60%], [5 reps @ 70%], [5 reps @ 75%], [5 reps @ 80%]",
	    "[(Include 30 second pause in between all sets)], [8 reps @ 30%], [5 reps @ 40%], [4 reps @ 50%], [3 reps @ 60%], [Repeat Sets 2-4 3x]" }; 
    private static final String[] POWERCLEAN_MAIN = new String[] {
	    "[2x5 reps of deadlifts with 115 lbs on BAR], [2x5 reps of Shrugs with 95 lbs on BAR], [3 reps of PC @ 40%], [3 reps @ 50%], [3 reps @ 60%], [2 reps @ 75%]",
	    "[2x5 reps of deadlifts with 135 lbs on BAR], [2x5 reps of Shrugs with 115 lbs on BAR], [5 reps of PC @ 25%], [3 reps @ 40%], [3 reps @ 50%], [3 reps @ 60%],  [2 reps @ 70%], [1 rep @ 75%]",
	    "[2x5 reps of deadlifts with 155 lbs on BAR], [2x5 reps of Shrugs with 135 lbs on BAR], [5 reps of PC @ 40%], [3 reps @ 50%], [3 reps @ 60%], [2 reps @ 70%], [1 rep @ 75%], [1 rep @ 80%], [1 rep @ 90%]",
	    "(BEAR COMPLEX)], [5 SETS OF POWERCLEANxSHOULDER PRESSxBACKSQUATxSHOULDER PRESS @ 115 or 135 lbs]"};
    private static final String[] SNATCH_MAIN = new String[] {
	    "[3 front squats @ 30%], [2 OH Squats @ BAR], [5 Duckwalk Steps @ BAR], [1 @ 25%], [1 @ 35%], 1 @ 50%]",
	    "[SNATCH PROGRESSION], [1 @ 40%], 1 @ 50%], [1 @ 60%], [1 @ 70%]",
	    "[SNATCH PROGRESSION], [3 @ 40%], 2 @ 50%], [1 @ 60%], [1 @ 70%], [1 @ 90%]",
	    "[5 SETS OF PULL UPS x 2 SNATCHES @ 40%]" }; 

    private static final String[] BENCH_CIRCUITS = new String[] { 
	    "[15, 12, 9 -- Dumbell Bench]",
	    "[15, 12, 9 -- Tricep Ext.]",
	    "[21, 15, 9 -- Pushups]",
	    "[3x7 Straight Bar Curls]",
	    "[15, 12, 9 -- Dips]",
	    "[21, 15, 9 -- Shoulder Press]",
	    "[15, 12, 9 -- Dumbell Curls]",
	    "[15, 12, 9 -- Front Raise / Lat Raise]",
	    "[12, 11, 10 -- Nosebreakers (WITH SPOTTER)]",
	    "[21, 15, 9 -- Pullups]",
	    "[15, 12, 9 -- One Arm Curls]",
	    "[3 x 50 Abs (Your Choice)]" 
    }; 
    
    private static final String[] SQUAT_CIRCUITS = new String[] {
		
	    "[21, 15, 9 -- Lunges]",
	    "[21, 15, 9 -- Calf Raises]",
	    "[15, 12, 9 -- Box Jumps]",
	    "[3 x 50 Abs (Your Choice)]",
	    "[21, 15, 9 -- Goblet Squats]",
	    "[15, 12, 9 -- V-Ups]",
	    "[3 x 20 -- Body Weight Squats]"
	    
    }; 
    
    private static final String[] POWERCLEAN_CIRCUITS = new String[] {
		
	    "[21, 15, 9 -- Lunges]",
	    "[15, 12, 9 -- Box Jumps]",
	    "[3 x 50 Abs (Your Choice)]",
	    "[21, 15, 9 -- Goblet Squats]",
	    "[15, 12, 9 -- V-Ups]",
	    "[3 x 20 -- Body Weight Squats]",
	    "[3 x 10 -- Quickflips]",
	    "[3 x 10 -- 1 ARM Dumbell Powerclean]"
	    
    }; 
    
    private static final String[] SNATCH_CIRCUITS = new String[] {
		
	    "[21, 15, 9 -- Lunges]",
	    "[3 x 50 Abs (Your Choice)]",
	    "[15, 12, 9 -- V-Ups]",
	    "[3 x 20 -- Body Weight Squats]",
	    "[3 x 10 -- OH Squats]",
	    "[15, 12, 9 -- Incline Bench]",
	    "[3 x 10 -- Nosebreakers (WITH SPOTTER)]",
	    
    };

    public static String generateMain(WorkoutType type, WorkoutDifficulty difficulty) {

	switch (type) {

	case BENCH:
	    switch (difficulty) {
	    case BEGINNER:
		return BENCH_MAIN[0];

	    case NOVICE:
		return BENCH_MAIN[1];
	    case EXPERIENCED:

		return BENCH_MAIN[2];
	    case CROSSFIT:

		return BENCH_MAIN[3];
	    }
	    break;

	case SQUAT:
	    switch (difficulty) {
	    case BEGINNER:
		return SQUAT_MAIN[0];

	    case NOVICE:
		return SQUAT_MAIN[1];
	    case EXPERIENCED:

		return SQUAT_MAIN[2];
	    case CROSSFIT:

		return SQUAT_MAIN[3];
	    }
	    break; 

	case POWERCLEAN:
	    switch (difficulty) {
	    case BEGINNER:
		return POWERCLEAN_MAIN[0];

	    case NOVICE:
		return POWERCLEAN_MAIN[1];
	    case EXPERIENCED:

		return POWERCLEAN_MAIN[2];
	    case CROSSFIT:

		return POWERCLEAN_MAIN[3];
	    }
	    break;

	case SNATCH:
	    switch (difficulty) {
	    case BEGINNER:
		return SNATCH_MAIN[0];

	    case NOVICE:
		return SNATCH_MAIN[1];
	    case EXPERIENCED:

		return SNATCH_MAIN[2];
	    case CROSSFIT:

		return SNATCH_MAIN[3];
	    }
	    break; 

	}
	return "";

    }

    public static String generateCircuit(WorkoutType type) {

	switch(type) {
	case BENCH:
	    
	    StringBuilder sb = new StringBuilder(); 
	    
	    for(int i = 1;  i < 4;  i++) {
		int r = new Random().nextInt(BENCH_CIRCUITS.length - 1); 

		if(sb.toString().contains(BENCH_CIRCUITS[r]))
		    continue;
		
		sb.append(BENCH_CIRCUITS[r] + "\n"); 
	    }
	    return sb.toString();
	    
	case SQUAT:
	    
	    StringBuilder sb1 = new StringBuilder(); 
	    
	    for(int i = 1;  i < 4;  i++) {
		int r = new Random().nextInt(SQUAT_CIRCUITS.length - 1); 

		if(sb1.toString().contains(SQUAT_CIRCUITS[r]))
		    continue;
		
		sb1.append(SQUAT_CIRCUITS[r] + "\n"); 
	    }
	    return sb1.toString();
	    
	case POWERCLEAN:
	    
	    StringBuilder sb2 = new StringBuilder(); 
	    
	    for(int i = 1;  i < 4;  i++) {
		int r = new Random().nextInt(POWERCLEAN_CIRCUITS.length - 1);

		if(sb2.toString().contains(POWERCLEAN_CIRCUITS[r]))
		    continue;
		
		sb2.append(POWERCLEAN_CIRCUITS[r] + "\n"); 
	    }
	    return sb2.toString();
	    
	case SNATCH:
	    
	    StringBuilder sb3 = new StringBuilder(); 
	    
	    for(int i = 1;  i < 4;  i++) {
		int r = new Random().nextInt(SNATCH_CIRCUITS.length - 1); 

		if(sb3.toString().contains(SNATCH_CIRCUITS[r]))
		    continue; 
		
		sb3.append(SNATCH_CIRCUITS[r] + "\n"); 
	    }
	    return sb3.toString(); 
	}
	
	return "";

    }

}
