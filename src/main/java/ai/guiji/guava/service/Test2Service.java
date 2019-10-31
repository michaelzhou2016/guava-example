package ai.guiji.guava.service;

import ai.guiji.guava.model.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service("test2Service")
public class Test2Service {
    private static final Logger logger = LoggerFactory.getLogger(Test2Service.class);

    public void process(Test test) {
        logger.info("event bus:{}", test);
    }
}
