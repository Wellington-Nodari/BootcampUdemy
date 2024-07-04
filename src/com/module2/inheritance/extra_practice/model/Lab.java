package com.module2.inheritance.extra_practice.model;

import java.util.ArrayList;

public class Lab {

    private ArrayList<LabEquipment> labEquipments;

    public Lab () {
        this.labEquipments = new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index) {
        return this.labEquipments.get(index).clone();
    }

    public void setLabEquipment(int index, LabEquipment o) {
        this.labEquipments.set(index, o.clone());
    }

    public void addLabEquipment(LabEquipment o) {
        this.labEquipments.add(o.clone());
    }

}
