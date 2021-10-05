package Model;

import java.time.LocalDate;

public class Invoice {
    private LocalDate checkin;
    private LocalDate checkout;
    private String userId;
    private String roomId;
    private String id;

    public Invoice() {
    }

    public Invoice(LocalDate checkin, LocalDate checkout, String userId, String roomId, String id) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.userId = userId;
        this.roomId = roomId;
        this.id = id;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "checkin=" + checkin +
                ", checkout=" + checkout +
                ", userId='" + userId + '\'' +
                ", roomId='" + roomId + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
