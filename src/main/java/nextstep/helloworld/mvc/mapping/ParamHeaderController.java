package nextstep.helloworld.mvc.mapping;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/param-header")
public class ParamHeaderController {

    @GetMapping(value = "/message1",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> message() {

        return ResponseEntity.ok().body("message");
    }

    @GetMapping(value = "/message2", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> messageForParam(@RequestParam(name = "name") String name) {
        return ResponseEntity.ok().body(name);
    }

    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> messageForHeader(@RequestHeader(name = "HEADER") String headerValue) {
        return ResponseEntity.ok().body(headerValue);
    }

}