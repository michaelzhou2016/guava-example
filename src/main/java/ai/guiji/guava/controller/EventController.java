package ai.guiji.guava.controller;

import ai.guiji.guava.model.Test;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.eventbus.AsyncEventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("event")
public class EventController {

    @Autowired
    private AsyncEventBus asyncEventBus;


    @GetMapping(path = "/test1/{name}")
    public void testEventBus(@PathVariable("name") String name) {
        asyncEventBus.post(name);
    }

    @GetMapping(path = "/test2")
    public void testEventBus2() {
        List<String> names = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .splitToList(CharMatcher.anyOf("[]\"").removeFrom("[zll,charlie,liliang]"));
        names.parallelStream().forEach(n -> IntStream.rangeClosed(1, 1000).forEach(i -> asyncEventBus.post(new Test(i, n + "_" + i))));
    }
}
