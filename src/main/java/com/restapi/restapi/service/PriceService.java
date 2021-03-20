package com.restapi.restapi.service;

import com.restapi.restapi.entities.Course;
import com.restapi.restapi.entities.CourseRequest;
import com.restapi.restapi.entities.CourseResponse;

import java.util.List;

public interface PriceService {

    public CourseResponse getPricing(CourseRequest courseRequest);

    public List<Course> getCourses();

    public Course addCourse(Course course);

}
