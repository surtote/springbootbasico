package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Student;

@Controller
public class StudentController {

	@PostMapping(path = "/addStudentForm")
	public void showStudent(Student student) {
		System.out.println(student.toString());
	}

	@GetMapping(path = "/addStudentPage")
	public ModelAndView studentPage() {
		ModelAndView mc = new ModelAndView();
		mc.setViewName("addStudentPage");
		mc.addObject(new Student());
		return mc;
	}

}
