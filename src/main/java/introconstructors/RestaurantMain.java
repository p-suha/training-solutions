package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Kistücsök a hófehér bájtgyilkoshoz", 5);

        System.out.println(restaurant.getName()+ " | Kapacitás: " + restaurant.getCapacity() + " | Mai ajánlat: " + restaurant.getMenu());
    }
}
