package structural.adapter;

public class WeatherAdapter {

    public int findTemperature(int zipCode){

        String city = "";
        if (zipCode == 19406){
            city = "king of prussia";
        }

        WeatherFinder finder = new WeatherFinderImpl();
        return finder.find(city);

    }
}
