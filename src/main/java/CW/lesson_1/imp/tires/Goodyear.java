package CW.lesson_1.imp.tires;

import CW.lesson_1.interf.Tires;

public class Goodyear implements Tires {
    @Override
    public boolean CarTires() {
        System.out.println("Установлены шины Goodyear");
        return false;
    }
}
