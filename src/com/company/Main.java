package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	/**Car деген класс тузунуз (Id, номер авто)
     Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
     HashMap тузунуз ключ - машина, маани - машинанын данныйлары
     HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/

        Map<Car, Data> map=new HashMap<>();
        map.put(new Car("TS",777),new Data(2021,"Tesla",5000,"Black"));
        map.put(new Car("PS", 888),new Data(2020,"Porsche",3000,"Blue"));
        map.put(new Car("BIS",312),new Data(2019,"Range Rover",8000,"Silver"));

        for (Map.Entry iterate:map.entrySet()){
            System.out.println(iterate.getKey()+" "+iterate.getValue());

        }
    }
}
