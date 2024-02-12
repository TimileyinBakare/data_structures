package org.mojo;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private HashMap<String, String> capitalCities;

    public void setCapitalCities(HashMap<String, String> capitalCities) {
        this.capitalCities = capitalCities;
    }

    public HashMap<String, String> getCapitalCities() {
        return capitalCities;
    }

    public static void main(String[] args) {
        Main mainApp = new Main();
        HashMap<String,String> capital = new HashMap<>();
        HashMap<String,String> capital2;

        capital.put("London","egbo efon");

        capital2 = capital;
        mainApp.setCapitalCities(capital);
        System.out.println(capital);
        System.out.println(capital2);

        capital.put("Uk","Eleko");
        System.out.println(capital);
        System.out.println(mainApp.getCapitalCities());
    }

}