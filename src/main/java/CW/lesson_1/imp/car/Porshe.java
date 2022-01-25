package CW.lesson_1.imp.car;

import CW.lesson_1.interf.Cars;
import CW.lesson_1.interf.Engines;
import CW.lesson_1.interf.Tires;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Porshe implements Cars {
    private Engines engine;
    private Tires tires;

    @Override
    public void move() {
        System.out.println("машина поехала");
    }
}
