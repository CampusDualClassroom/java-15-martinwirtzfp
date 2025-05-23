package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    //Añadimos el nuevo atributo
    private Date expirationDate;

    //Añadimos el nuevo constructor
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name,uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getSpecificData() {

        String textInfo=  "Location -> " + this.getLocation() + "\n" +
                "Expiration Date -> " + this.getFormattedDate(this.getExpirationDate());
        return textInfo;
    }

    public void printSpecificData(){
        System.out.println(this.getSpecificData());
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getFormattedDate(Date fechaConFormato){
        //Creamos un objeto SimpleDateFormat
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //Formateamos y guardamos la fecha en un String
        String formattedDate = formatter.format(fechaConFormato);
        return formattedDate;
    }
}

