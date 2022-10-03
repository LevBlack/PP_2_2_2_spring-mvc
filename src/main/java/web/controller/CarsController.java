package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private final CarServiceImp carService = new CarServiceImp();

    @RequestMapping(value ="/cars")
    public String showAllCars(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {

        List<Car>  allCars = carService.getAllCars(count);
        model.addAttribute("allCars", allCars);

        return "cars";
    }
}
