package nextstep.helloworld.mvc.handler;

import java.util.List;
import nextstep.helloworld.mvc.domain.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/return-value")
public class ReturnValueController {

  @GetMapping(value = "/message",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> string() {
    return ResponseEntity.ok("message");
    }

    @GetMapping(value = "/users",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> responseBodyForUser() {
        return ResponseEntity.ok(new User("name", "email"));
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> responseEntity(@PathVariable Long id) {
        return ResponseEntity.ok(new User("name", "email"));
    }

    @GetMapping(value = "/members")
    public ResponseEntity<Object> responseEntityFor400() {
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/thymeleaf")
    public String thymeleaf() {
        return "sample";
    }
}