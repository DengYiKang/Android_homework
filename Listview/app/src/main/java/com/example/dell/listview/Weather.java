package com.example.dell.listview;

public class Weather{
    private String day;
    private int imageId;
    private String describ;
    private String temp1;
    private String temp2;
    public Weather(String d, String des, String t1, String  t2, int imag){
        day = d;
        describ = des;
        temp1 = t1;
        temp2 = t2;
        imageId = imag;
    }
    public String getDay(){
        return day;
    }
    public String getDescrib(){
        return describ;
    }
    public String getTemp1(){
        return temp1;
    }
    public String getTemp2(){
        return temp2;
    }
    public int getImageId(){
        return  imageId;
    }
}
