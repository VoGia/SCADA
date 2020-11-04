package example.web.SCADA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
public class App 
{
	@GetMapping("/hello")
    public String helloWorld() {
    	return "Hello world";
    }
}