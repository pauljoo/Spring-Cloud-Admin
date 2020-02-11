package info.xpanda.labs.admin.service.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/system")
public class SystemController {
    @Value("${spring.cloud.client.ipAddress}")
    private String ip;

    @GetMapping("/info")
    public String info(HttpServletRequest request){
        log.info("I'm System Service!");
        return "I'm System Service!" + ip;
    }
}
