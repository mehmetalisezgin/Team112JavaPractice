package practice.week09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04b_Map_Hastane_MetodDepo {
    public static Map<Integer, String> ornekHastaneMapOlustur() {
        Map<Integer, String> hastaneMap = new HashMap<>();
        hastaneMap.put(20,"Asli-Candan-Hemsire-SecondFloor,10");
        hastaneMap.put(21,"Ebru-Han-Doktor-Acil,25");
        hastaneMap.put(22,"Cemal-Sunal-Doktor-FirstFloor,13");
        hastaneMap.put(23,"Emel-Bildik-Teknisyen-FirstFloor,9");
        hastaneMap.put(24,"Asim-Enes-Hemsire-GroundFloor,22");
        hastaneMap.put(25,"Ali-Vardar-Teknisyen-SecondFloor,17");
        hastaneMap.put(26,"Naim-Turkmen-Hemsire-GroundFloor,23");
        hastaneMap.put(27,"Veli-Kurt-Doktor-FistFloor,19");
        return hastaneMap;
    }

    public static Map<Integer, String> emeklilikMetodu(Map<Integer, String> hastaneMap) {
        Set<Integer> hastaneKeySet = hastaneMap.keySet();
        for (Integer eachKey : hastaneKeySet) {
            String value = hastaneMap.get(eachKey);
            String[] arr1 = value.split(",");
            int yearsOfExperience = Integer.parseInt(arr1[1]);
            if (yearsOfExperience == 22 || yearsOfExperience == 23 || yearsOfExperience == 25) {
                hastaneMap.put(eachKey, arr1[0] + ",Need to be retired");
            }
        }
        return hastaneMap;
    }

    public static void main(String[] args) {
        Map<Integer, String> updatedHastaneMap = emeklilikMetodu(ornekHastaneMapOlustur());
        System.out.println(updatedHastaneMap);
    }
}
