package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import model.Student;

@Controller
public class StudentController {

	@PostMapping("addStudent")
	public void showStudent(Student student) {
		System.out.println(student.toString());
	}

}
