package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class Cars {
    static List<Car> cars = List.of(
            new Car("Toyota camry", 2016, 18500),
            new Car("Mercedes amg 50", 2020, 850000),
            new Car("Chevrolet spark II", 2017, 5500),
            new Car("Toyota avensis", 2010, 6500),
            new Car("Lexus 570", 2009, 450000)
    );


    @GetMapping("/cars")
    public String helloPage(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("cars", cars);
        return "cars";
    }


    @GetMapping
    public  String getCars(@RequestParam(value = "count",required = false)int count,Model model ) {
        List<Car> carList = new ArrayList<>();
        if (count > 5) {
            model.addAttribute("cars", cars);
        } else {
            for (int i = 0; i < count; i++) {
                carList.add(cars.get(i));
            }
            model.addAttribute("cars",carList);
        }
        return "cars";
    }
}
