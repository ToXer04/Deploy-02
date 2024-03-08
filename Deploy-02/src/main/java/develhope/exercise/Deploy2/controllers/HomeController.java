package develhope.exercise.Deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping
public class HomeController {
    @GetMapping("/sum")
    public int calcSum() {
        Random r = new Random();
        return r.nextInt() + r.nextInt();
    }
}
