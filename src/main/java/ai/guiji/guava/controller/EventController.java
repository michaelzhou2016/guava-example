package ai.guiji.guava.controller;

import ai.guiji.guava.model.Borrow;
import ai.guiji.guava.model.User;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.eventbus.AsyncEventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("event")
public class EventController {

    @Autowired
    private AsyncEventBus asyncEventBus;


    @PostMapping(path = "/user")
    public void testEventBus(@RequestBody User user) {
        asyncEventBus.post(user);
    }

    @GetMapping(path = "/borrow")
    public void testEventBus2() {
        List<String> amounts = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .splitToList(CharMatcher.anyOf("[]\"").removeFrom("[500,1000,1500]"));
        amounts.parallelStream().forEach(n -> IntStream.rangeClosed(1, 1000).forEach(i -> asyncEventBus.post(new Borrow(Double.valueOf(n)))));
    }
}
