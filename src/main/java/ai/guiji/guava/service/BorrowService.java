package ai.guiji.guava.service;

import ai.guiji.guava.model.Borrow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * author: zhouliliang
 * Date: 2019/11/2 18:09
 * Description:
 */
@Service("borrowService")
public class BorrowService {
    private static final Logger logger = LoggerFactory.getLogger(BorrowService.class);

    public void process(Borrow borrow) {
        logger.info("borrow:{}", borrow);
    }
}
