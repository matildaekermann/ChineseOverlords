package country;

public class City {

    private String name;


public City (String name) {
    this.name = name;

}


public String toString () {

    String print= "Cities: " +this.name +"\n";

    return print;
}


public String getName () {
    return name;
}


}