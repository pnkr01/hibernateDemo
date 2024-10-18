package com.fil.model;

import javax.persistence.*;

@Entity
public class Parking {
    @SequenceGenerator(name="parking_seq",allocationSize = 0,initialValue = 1001)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="parking_seq" )
    private int id;
    @Column(nullable = false)
    private int parkingId;
    @Column(nullable = false)
    private int floorId;
    private int slot;
    @OneToOne
    @JoinColumn(name = "empid")
    private Employee employee;

    public Parking(int id, int parkingId, int floorId, int slot) {
        this.id = id;
        this.parkingId = parkingId;
        this.floorId = floorId;
        this.slot = slot;
    }

    public Parking() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParkingId() {
        return parkingId;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "id=" + id +
                ", parkingId=" + parkingId +
                ", floorId=" + floorId +
                ", slot=" + slot +
                '}';
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
