//import java.util.Objects;

//class City implements Comparable<City> {
//
//    private String name;
//    private int population;
//
//    public City(String name, int population) {
//        this.name = name;
//        this.population = population;
//    }
//
//    @Override
//    public int compareTo(City other) {
//        // сортировка по населению (по возрастанию)
//        return Integer.compare(this.population, other.population);
//    }
//
//    @Override
//    public String toString() {
//        return name + " | population: " + population;
//    }
//}
//record City(String name, int population) {}
//class City {
//    private String cityName;
//    private int cityPopulation;
//
//    public City(String cityName, int cityPopulation) {
//        this.cityName = cityName;
//        this.cityPopulation = cityPopulation;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof City)) return false;
//
//        City city = (City) o;
//
//        return cityPopulation == city.cityPopulation
//                && Objects.equals(cityName, city.cityName);
//    }

//import java.util.Objects;

//    @Override
//    public int hashCode() {
//        return Objects.hash(cityName, cityPopulation);
//    }
//}
//class City implements Comparable<City> {
//    private String cityName;
//    private int cityPopulation;
//
//    public City(String cityName, int cityPopulation) {
//        this.cityName = cityName;
//        this.cityPopulation = cityPopulation;
//    }
//
//    @Override
//    public int compareTo(City other) {
//        return Integer.compare(this.cityPopulation, other.cityPopulation);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof City)) return false;
//
//        City city = (City) o;
//
//        return cityPopulation == city.cityPopulation
//                && Objects.equals(cityName, city.cityName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(cityName, cityPopulation);
//    }
//}