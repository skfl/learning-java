package com.company;

public class Coin {
    public double diameter;
    private double weight;
    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double value){
        if (value>0) {
            diameter = value;
        }else{
                diameter= 0.01; // Значение по умолчанию
            }
        }
        public double takeWeight(){
            return weight;
        }

        public void setWeight(double value) {
        weight = value;
        }

    }

