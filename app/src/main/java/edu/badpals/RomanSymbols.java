package edu.badpals;

public enum RomanSymbols{

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000), IV(4), IX(9), XL(40), XC(90), CD(400), CM(900);



    public int decimalValue;

    RomanSymbols(int decimalValue){
        this.decimalValue = decimalValue;
    }

    public int getdecimalValue(){
        return this.decimalValue;
    }




}