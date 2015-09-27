package demo.controllers;

import demo.model.DemoModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-demo")
public class ApiController {
    @RequestMapping(value = "/test/{message}", method = RequestMethod.GET)
    public String test(@PathVariable("message") String message) {
        return String.format("Hi There, you sent %s", message);
    }

    @RequestMapping(value = "/newmodel", method = RequestMethod.GET)
    public DemoModel newModel() {
        return new DemoModel(123, "new modelName");
    }
}
