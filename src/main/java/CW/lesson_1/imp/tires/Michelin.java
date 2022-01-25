package CW.lesson_1.imp.tires;

import CW.lesson_1.interf.Tires;

public class Michelin implements Tires {
    public boolean CarTires() {
        System.out.println("Установлены шины Michelin");
        return false;
    }
}
