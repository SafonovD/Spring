package CW.lesson_1;

import CW.lesson_1.imp.car.Audi;
import CW.lesson_1.imp.engine.G4fc;
import CW.lesson_1.imp.tires.Goodyear;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Audi audi = ctx.getBean("audi", Audi.class);
        audi.move();


        audi.setEngine(ctx.getBean("g4fc", G4fc.class));
        audi.setTires(ctx.getBean("goodyear", Goodyear.class));
        audi.getEngine().carEngine();
        audi.getTires().CarTires();

    }

}
