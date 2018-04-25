package com.faw.poc.iotclientmock.model;

import java.sql.Timestamp;

public class IotMsg {
    private Double acce;
    private Double temp;
    private Double rms;
    private Double motion;

    public Double getAcce() {
        return acce;
    }

    public void setAcce(Double acce) {
        this.acce = acce;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getRms() {
        return rms;
    }

    public void setRms(Double rms) {
        this.rms = rms;
    }

    public Double getMotion() {
        return motion;
    }

    public void setMotion(Double motion) {
        this.motion = motion;
    }

    @Override
    public String toString() {
        return "IotMsg{" +
                "acce=" + acce +
                ", temp=" + temp +
                ", rms=" + rms +
                ", motion=" + motion +
                '}';
    }
}
