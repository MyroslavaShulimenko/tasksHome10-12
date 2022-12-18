import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       /* Дана Map<String,String> ab. Написать метод который вернёт мапуБ такую что если в
        исходной мапе есть ключи "а" и "в", то нужно создать новый ключ под название "ав",
                где значение будет суммой значений от ключей а и в. Если такого значения нет,
        ничего менять не нужно.
        Примеры:
        mapAB {a : Hi , b : There} -> {a:Hi , ab:HiThere, b:There}
        mapAB {a:Hi} -> {a:Hi}
        public Map<String,String> ab (Map<String,String> mapAB)*/
Map<String,String>mapAB=new HashMap<>();
mapAB.put("a","hi");
mapAB.put("b","There");
        System.out.println(mapAB);
        System.out.println(ab(mapAB));


       // System.out.println("Hello world!");
    }
    public  static Map <String,String>ab(Map<String,String>mapAB){
        if (mapAB.containsKey("a")&&mapAB.containsKey("b"))
            mapAB.put("ab",mapAB.get("a").concat(mapAB.get("b")));
        return mapAB;
    }}