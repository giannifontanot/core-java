package com.UD_Object_construction;

public class NewDog {

    private String dogColor;
    private String dogName;
    private String dogType;

    public NewDog(String dogName, String dogType, String dogColor ){
        super();
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogType = dogType;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }



    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    @Override
    public String toString(){
        return "name: " + this.dogName + ", type: " + this.dogType + ", color: " + this.dogColor;
    }

    public static void main(String[] args) {
        NewDog myDog = new NewDog("Frail", "German Shepard", "Brown");
        System.out.println(myDog.toString());
    }
}

