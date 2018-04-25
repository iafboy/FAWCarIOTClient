package com.faw.poc.iotclientmock.model;

public class IotMsg {
    private Double temp;
    private Double acce_x;
    private Double rms_x;
    private Double motion_x;
    private Double acce_y;
    private Double rms_y;
    private Double motion_y;
    private Double acce_z;
    private Double rms_z;
    private Double motion_z;

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getAcce_x() {
        return acce_x;
    }

    public void setAcce_x(Double acce_x) {
        this.acce_x = acce_x;
    }

    public Double getRms_x() {
        return rms_x;
    }

    public void setRms_x(Double rms_x) {
        this.rms_x = rms_x;
    }

    public Double getMotion_x() {
        return motion_x;
    }

    public void setMotion_x(Double motion_x) {
        this.motion_x = motion_x;
    }

    public Double getAcce_y() {
        return acce_y;
    }

    public void setAcce_y(Double acce_y) {
        this.acce_y = acce_y;
    }

    public Double getRms_y() {
        return rms_y;
    }

    public void setRms_y(Double rms_y) {
        this.rms_y = rms_y;
    }

    public Double getMotion_y() {
        return motion_y;
    }

    public void setMotion_y(Double motion_y) {
        this.motion_y = motion_y;
    }

    public Double getAcce_z() {
        return acce_z;
    }

    public void setAcce_z(Double acce_z) {
        this.acce_z = acce_z;
    }

    public Double getRms_z() {
        return rms_z;
    }

    public void setRms_z(Double rms_z) {
        this.rms_z = rms_z;
    }

    public Double getMotion_z() {
        return motion_z;
    }

    public void setMotion_z(Double motion_z) {
        this.motion_z = motion_z;
    }

    @Override
    public String toString() {
        return "IotMsg{" +
                "temp=" + temp +
                ", acce_x=" + acce_x +
                ", rms_x=" + rms_x +
                ", motion_x=" + motion_x +
                ", acce_y=" + acce_y +
                ", rms_y=" + rms_y +
                ", motion_y=" + motion_y +
                ", acce_z=" + acce_z +
                ", rms_z=" + rms_z +
                ", motion_z=" + motion_z +
                '}';
    }
}
