package com.restapi.restapi.service;

import com.restapi.restapi.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {
    List<Course> list = new ArrayList<>();

    public PriceServiceImpl(){
        list.add(new Course(1, "Intro to Java", 280, 0));
        list.add(new Course(2, "Intro to Kotlin", 450, 1));
        list.add(new Course(3, "Intro to React", 1020, 2));
        list.add(new Course(4, "Intro to C", 150, 0));
        list.add(new Course(5, "Intro to Angular", 830, 1));
        list.add(new Course(6, "Intro to NodeJS", 1150, 2));

        list.add(new Course(7, "Intro to coding", 2280, 0));
        list.add(new Course(8, "Intro to programs", 1450, 1));
        list.add(new Course(9, "Intro to practice", 1220, 2));
        list.add(new Course(10, "Intro to C++", 1510, 0));
        list.add(new Course(11, "Intro to spring", 230, 1));
        list.add(new Course(12, "Intro to springboot", 1450, 2));

        list.add(new Course(13, "Intro to restapi", 2800, 0));
        list.add(new Course(14, "Intro to algorithms", 4250, 1));
        list.add(new Course(15, "Intro to data structures", 2520, 2));
    }


    @Override
    public CourseResponse getPricing(CourseRequest courseRequest) {
        int reqId = courseRequest.getId();
        int payMode = courseRequest.getPaymentMode();
        double price =0;
        int priceStrategy =-1;
        for(Course course: list){
            if(course.getId() == reqId) {
                price = course.getPrice();
                priceStrategy = course.getPriceStrategy();
            }
        }

        if(priceStrategy == -1){
            CourseResponse courseResponse = new CourseResponse(0, "Course not found");
            return courseResponse;
        }

        ConversionFee conversionFee = new ConversionFee();
        TaxStructure taxStructure = new TaxStructure();
        double conversionRate = conversionFee.getConversionRate(payMode);
        double taxRate = taxStructure.getTaxRate(payMode);

        price = price + price*conversionRate + price*taxRate;

        if(priceStrategy == 0){
            CourseResponse courseResponse = new CourseResponse(0, "Free");
            return courseResponse;
        }
        else if(priceStrategy == 1){
            CourseResponse courseResponse = new CourseResponse(price, "1 year subscription");
            return courseResponse;
        }
        else {
            CourseResponse courseResponse = new CourseResponse(price, "One time payment");
            return courseResponse;
        }
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

}

