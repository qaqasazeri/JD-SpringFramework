package com.cybertek.controller;

import com.cybertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

        @GetMapping("/welcome")
        public String homePage(Model model){
            String name="FaganKS";

            model.addAttribute("name", name);
            model.addAttribute("course", "MVC");

            Random random=new Random();
            int studentID= random.nextInt(1000);
            model.addAttribute("studentID", studentID);

            List<Integer> numbers=new ArrayList<>();
            numbers.add(4);
            numbers.add(7);
            numbers.add(8);
            numbers.add(29);
            numbers.add(200);
            numbers.add(700);
            model.addAttribute("numbers", numbers);

            LocalDate birthday=LocalDate.now().minusYears(35);
            model.addAttribute("birthday", birthday);

            Student student=new Student(1,"Fagan","Safarov");

            model.addAttribute("student", student);

            return "student/welcome";
        }

        @GetMapping("/register")
        public String homePage2(Model model){
            return "student/register";
        }
}
