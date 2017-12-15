package com.etbr3.mhmdlogan.etbr3;

/**
 * Created by MhmdLoGaN on 14/12/2017.
 */

public class Etbr3 {
    private int id;
    private String name;
    private String number;
    private byte[] image;

    public Etbr3(int id, String name, String number, byte[] image) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
