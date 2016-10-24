package com.example.nero.tourguideap;

/**
 * Created by Nero on 17/10/2016.
 */

public class LocationIdData {

    private String location; private String description;
    public static final LocationIdData[] workouts = { new LocationIdData("The Limb Loosener",
            "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups5 \nHandstand push-ups\n" +
                    "10 1-legged squats\n" +
                    "15 Pull-ups"), new LocationIdData("Core Agony",
            "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups5 \nHandstand push-ups\n" +
                    "10 1-legged squats\n" +
                    "15 Pull-ups"), new LocationIdData("The Wimp Special",
            "5 Pull-ups\n10 Push-ups\n15 Squats"), new LocationIdData("Strength and Length",
            "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups5 \nHandstand push-ups\n" +
                    "10 1-legged squats\n" +
                    "15 Pull-ups")
    };
    //Each Workout has a name and description
    private LocationIdData(String name, String description) {
        this.location = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return location;
    }
    public String toString() {
        return this.location;
    }
}

