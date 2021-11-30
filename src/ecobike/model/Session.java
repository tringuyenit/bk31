package ecobike.model;

import java.time.LocalDateTime;

public class Session {
    private short userId;
    private short bikeId;
    private LocalDateTime start;
    private LocalDateTime end;

    public Session(short userId, short bikeId) {
        this.userId = userId;
        this.bikeId = bikeId;
        this.start = LocalDateTime.now();
    }

    public void setUserId(short userId) {
        this.userId = userId;
    }

    public void setBikeId(short bikeId) {
        this.bikeId = bikeId;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }


    public short getUserId() {
        return userId;
    }

    public short getBikeId() {
        return bikeId;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }
}
