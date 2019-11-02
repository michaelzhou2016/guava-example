package ai.guiji.guava.service;

import ai.guiji.guava.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * author: zhouliliang
 * Date: 2019/11/2 18:09
 * Description:
 */
@Service("userService")
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public void process(User user) {
        user.setCreateTime(LocalDateTime.now());
        logger.info("user:{}", user);
    }
}
