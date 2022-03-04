package com.company;

public class BMI {

    float height;
    float weight;

    public BMI(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public float getBMI() {
        float BMI = weight / (height * height);
        return BMI;
    }


}
