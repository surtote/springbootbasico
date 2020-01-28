package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Student;

@Controller
public class StudentController {

	@PostMapping("addStudentForm")
	public String showStudent(Student student) {
		System.out.println(student.toString());
		return "index";
	}

	@GetMapping("callControler")
	public String showStudent() {
		return "formWithParams";
	}

	@PostMapping("showparam")
	public String showparam(@RequestParam String msg) {
		System.out.println(msg);
		return "";
	}

	@GetMapping("addStudent")
	public ModelAndView addStudentPage() {
		ModelAndView mc = new ModelAndView();
		mc.setViewName("addStudentPage");
		Student student = new Student();
		student.setName("Alumno");
		mc.addObject(student);
		return mc;
	}


}
