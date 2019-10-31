package ai.guiji.guava.service;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("testService")
public class TestService {
    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private AsyncEventBus asyncEventBus;

    @PostConstruct // 注册该类
    public void register() {
        asyncEventBus.register(this);
    }

    @AllowConcurrentEvents//线程安全
    @Subscribe // 异步执行的方法标识:需要传入String类型参数
    public void async01(String str) {
        logger.info("event bus:" + str);
    }
}
