package com.Example9;

public class Wand {
    private String name;
    private double power;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        } else if (name.length() >= 3) {
            throw new IllegalArgumentException("이름은 반드시 3이상이어야 함");
        } else {
            this.name = name;
        }
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        if (power <= 0.5 && power >= 100.0) {
            throw new IllegalArgumentException("지팡이 마력은 0.5이상 100.0이하여야 한다.");
        } else {
            this.power = power;
        }
    }

}
