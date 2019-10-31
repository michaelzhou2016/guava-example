package ai.guiji.guava.controller;

import ai.guiji.guava.service.RetryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retry")
public class RetryController {
    private static final Logger logger = LoggerFactory.getLogger(RetryController.class);

    @Autowired
    private RetryService retryService;

    @GetMapping(path = "/test1/{num}")
    public void test(@PathVariable("num") Integer num) {
        try {
            retryService.retry(num);
        } catch (Exception e) {
            logger.error("test error:", e);
        }
    }
}
