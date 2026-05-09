package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

class SubCoponent {
    int num1;
    int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}

class MulComponent {
    int num1;
    int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

}

@RestController
public class Newcontroller {

    @PutMapping("/mul")
    public String getMul(@RequestBody MulComponent mc) {
        return "multiplication" + (mc.num1 * mc.num2);

    }

    @PostMapping("/sub")
    public String getAdd(@RequestBody Map<String, Integer> body) {

        return "Subtraction: " + (body.get("num1") - body.get("num2"));
    }

    @GetMapping("/hi")
    public String getMethodName(@RequestParam String param) {
        return "hello" + param;
    }

    @GetMapping("/sqr")
    public String getsqr(@RequestParam int num) {
        return "Square of" + num + " is " + num * num;
    }

    @GetMapping("/addition")
    public String getadd(@RequestParam int num1, @RequestParam int num2) {
        return "Addition is " + num1 + num2;
    }

}
