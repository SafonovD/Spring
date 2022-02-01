package CW.lesson_3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarProcessorsController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String CarProcessorsController(){
        return "index";
    }

    @GetMapping(value = "/car")
    public ModelAndView car() {
        return new ModelAndView("car", "command", new Car());
    }
    @PostMapping(value = "/addCar")
    public String addCar(@ModelAttribute("SpringWeb")Car car, ModelMap model) {
        model.addAttribute("name", car.getName());
        model.addAttribute("color", car.getColor());
        model.addAttribute("engine",car.getEngine());
        model.addAttribute("id", car.getId());

        return "result";
    }
    @GetMapping(value = "/path/{carName}?{carColor}")
    public String getNameCarAndColor(@PathVariable String carName,@PathVariable String carColor, Model model){
        model.addAttribute("carName", carName);
        model.addAttribute("carColor",carColor);
        return "view-car";
    }

}
