package com.uic.midtermexam.poliquitmidexam;

import java.util.ArrayList;

/**
 * Created by chain on 2/24/2018.
 */

public class Event {

    String date;
    String description;
    String email;
    String eventName;
    String imageURL;
    String key;
    String numInterested;
    ArrayList<String> peopleInterested;

    public Event() {
        peopleInterested = new ArrayList<>();

    }
}
