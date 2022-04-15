package com.revature.roomservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Room {

    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int roomId;
    @Column(unique = true, nullable = false)
    private int roomNumber;
    @JoinColumn(name="areaId", referencedColumnName = "areaId", nullable = false)
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
    private Area area;

    public Room(int id, int roomNumber, Area area){
        this.roomId = id;
        this.roomNumber = roomNumber;
        this.area = area;
    }

    public Room(){}

    public int getId(){
        return this.roomId;
    }

    public void setId(int id){
        this.roomId = id;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public Area getArea(){
        return this.area;
    }

    public void setArea(Area area){
        this.area = area;
    }

    public String toString(){
        return "Id: " + this.roomId + ", room number: " + this.roomNumber + ", area: " + this.area;
    }

}
