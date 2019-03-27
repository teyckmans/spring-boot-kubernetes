package spring.boot.kubernetes.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/basics")
public class BasicsRestController {

    private final BasicsService basicsService;

    @Autowired
    public BasicsRestController(BasicsService basicsService) {
        this.basicsService = basicsService;
    }

    @GetMapping("/time")
    public LocalDateTime time() {
        return this.basicsService.time();
    }
}
