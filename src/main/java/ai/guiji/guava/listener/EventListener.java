package ai.guiji.guava.listener;

import ai.guiji.guava.model.Borrow;
import ai.guiji.guava.model.User;
import ai.guiji.guava.service.BorrowService;
import ai.guiji.guava.service.UserService;
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
    public void userListener(User user) {
        try {
            UserService userService = (UserService) applicationContext.getBean("userService");
            userService.process(user);
        } catch (Exception e) {
            logger.error("test fail", e);
        }
    }

    @Subscribe
    public void borrowListener(Borrow borrow) {
        try {
            BorrowService borrowService = (BorrowService) applicationContext.getBean("borrowService");
            borrowService.process(borrow);
        } catch (Exception e) {
            logger.error("borrow fail", e);
        }
    }
}
