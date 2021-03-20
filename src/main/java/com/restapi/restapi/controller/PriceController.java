package com.restapi.restapi.controller;

import com.restapi.restapi.entities.Course;
import com.restapi.restapi.entities.CourseRequest;
import com.restapi.restapi.entities.CourseResponse;
import com.restapi.restapi.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PriceController {
    @Autowired
    private PriceService priceService;

    @PostMapping("/pricing")
    public CourseResponse getPricing(@RequestBody CourseRequest courseRequest){
           return this.priceService.getPricing(courseRequest);
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.priceService.getCourses();
    }

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course){
          return this.priceService.addCourse(course);
    }

}
