package com.example.test3;

public class SpbHappyTicket {
    public SpbHappyTicket(){};

    public boolean isHappyTicket (String input){
        int ticket=Integer.parseInt(input);
        int digital1=ticket/100000;
        int digital2=ticket/10000-digital1*10;
        int digital3=ticket/1000-digital1*100-digital2*10;
        int digital4=ticket/100-digital1*1000-digital2*100-digital3*10;
        int digital5=ticket/10-digital1*10000-digital2*1000-digital3*100-digital4*10;
        int digital6=ticket-digital1*100000-digital2*10000-digital3*1000-digital4*100-digital5*10;

        if ((digital1+digital3+digital5)==(digital2+digital4+digital6))
        {return true;}
        else {return false;}




    }
    public int nextHappyTicket(String input){
        int inputInt=Integer.parseInt(input);
        if (!isHappyTicket(Integer.toString(inputInt))){
            while (!isHappyTicket(Integer.toString(inputInt))){
                inputInt=inputInt+1;
            }
            return inputInt;
        }
        else {
            return inputInt;
        }
    }



    }


