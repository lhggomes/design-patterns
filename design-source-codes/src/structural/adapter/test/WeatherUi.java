package structural.adapter.test;

import structural.adapter.methods.WeatherAdapter;

public class WeatherUi {

    public static void showTemperature(int zipCode){
        WeatherAdapter finder = new WeatherAdapter();
        int temperature  = finder.findTemperature(zipCode);
        System.out.printf("Weather: %s", temperature);
;    }

    public static void main(String[] args) {
        showTemperature(19406);
    }

}
