import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("E:\\Java\\Reader.txt");
        Scanner scanner = new Scanner(file);
        Map<String, Integer> map = new HashMap<>();
        String s = "";


        while (scanner.hasNextLine()){
            s = s + scanner.nextLine()+" ";
        }

        String[] mass = s.split(" ");
        for (String x:mass){
            if (map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        ArrayList<Integer> values = new ArrayList<>(map.values());
        int max = Collections.max(values);

        for (String key:map.keySet()){
            if (map.get(key).equals(max)){
                System.out.println("Slovo " + key +" Vstrechaetsa "+ max +" paz");
            }
        }

        scanner.close();

    }
}