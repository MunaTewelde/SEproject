package edu.miu.cs.cs425.project.miushcduler.controller;

import edu.miu.cs.cs425.project.miushcduler.model.Course;
import edu.miu.cs.cs425.project.miushcduler.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/course/list")
    public String displayCourse(){
        return "course/list";
    }

    @GetMapping(value = "/new")
    public String newCourseForm(Model model) {
        model.addAttribute("course", new Course());
        return "course/new";
    }

    @PostMapping(value = "/new")
    public String addNewCourse(@Valid @ModelAttribute("course") Course course,
                                 BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "course/new";
        }
        course = courseService.addNewCourse(course);
        return "redirect:/course/list";
    }


}
