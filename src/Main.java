import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Car,Mashina>map=new HashMap<>();
        map.put(new Car(1,2354,"BMV"),new Mashina(2010,"Lexsus",200000,"blak"));
        map.put(new Car(2,6789,"Nisan"),new Mashina(2015,"Lexsus",300000,"white"));
        map.put(new Car(3,2401,"Mersedes"),new Mashina(2018,"Lexsus",400000,"red"));
        map.put(new Car(4,7895,"matis"),new Mashina(2000,"Lexsus",600000,"blue"));
        map.put(new Car(5,1902,"Niva"),new Mashina(2012,"Lexsus",800000,"blak"));

        for (Map.Entry<Car,Mashina>map2:map.entrySet()){
            System.out.println(map2.getKey() + " -" + map2.getValue());
        }


    }
}