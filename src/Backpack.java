import java.util.*;

public class Backpack {
    int maxWeight;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public static void main(String[] args) {
        result();
    }

    static void result() {

        Backpack bag = new Backpack(151);

        Baggage cat = new Baggage("cat", 10, 100);
        Baggage dog = new Baggage("dog", 20, 95);
        Baggage qwe = new Baggage("qwe", 20, 95000);
        Baggage container = new Baggage("container", 3, 5);
        Baggage key = new Baggage("key", 51, 600);
        Baggage carKey = new Baggage("car key", 50, 5);

        System.out.print(putInBackpack(bag, cat, dog, container, key, qwe, carKey));
    }

    static List<Object> putInBackpack(Backpack backpack, Baggage... baggage) {
        List<Object> fullBackpack = new ArrayList<>();
        List<Baggage> sortByRatio = new ArrayList<>(baggage.length);
        int currentWeight = 0;

        for(Baggage item: baggage){
            sortByRatio.add(item);
            sortByRatio.sort(Comparator.comparingInt(o -> o.weight / o.cost));
        }

        for (Baggage item : sortByRatio) {
            currentWeight += item.weight;
            if(currentWeight <= backpack.maxWeight) {
                fullBackpack.add(item);
                System.out.println("You put " + item.name);
            }
        }

        System.out.println("Backpack is packed!");

        return fullBackpack;
    }
}

class Baggage {
    String name;
    int weight;
    int cost;

    public Baggage(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public static Object[] baggagePush(Baggage item, Object[] oldArray) {
        int len = oldArray.length;
        Object[] newArray = new Baggage[len+1];
        System.arraycopy(oldArray, 0, newArray, 0, len);
        newArray[len] = item;

        return newArray;
    }
}
