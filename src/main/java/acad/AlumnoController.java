package acad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

	@RequestMapping("/")
	public Alumno index() {
		return new Alumno("Juan", "Perez");
	}

}
