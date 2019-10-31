package ai.guiji.guava.listener;

import ai.guiji.guava.model.Test;
import ai.guiji.guava.service.Test2Service;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("eventListener")
public class EventListener {
    private static final Logger logger = LoggerFactory.getLogger(EventListener.class);

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private AsyncEventBus asyncEventBus;

    @PostConstruct // 注册该类
    public void register() {
        asyncEventBus.register(this);
    }

    @Subscribe
    public void testListener(Test test) {
        try {
            Test2Service test2Service = (Test2Service) applicationContext.getBean("test2Service");
            test2Service.process(test);
        } catch (Exception e) {
            logger.error("test fail", e);
        }
    }
}
