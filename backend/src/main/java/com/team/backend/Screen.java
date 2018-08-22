package com.team.backend;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Screen {

    @Id
    public ObjectId _id;
    private String screenName;
    private ArrayList seats = new ArrayList();
    private boolean seatBooked;


    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public ArrayList getSeats() {
        return seats;
    }

    public void setSeats(ArrayList seats) {
        this.seats = seats;
    }

    public boolean isSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(boolean seatBooked) {
        this.seatBooked = seatBooked;
    }
}
