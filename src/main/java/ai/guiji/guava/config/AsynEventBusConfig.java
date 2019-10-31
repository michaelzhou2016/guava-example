package ai.guiji.guava.config;

import com.google.common.eventbus.AsyncEventBus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class AsynEventBusConfig {

    @Value(value = "${task.pool.core-pool-size:4}")
    private Integer corePoolSize;

    @Value(value = "${task.pool.max-pool-size:12}")
    private Integer maxPoolSize;

    @Value(value = "${task.pool.keep-alive-seconds:60}")
    private Integer keepAliveSeconds;

    @Value(value = "${task.pool.queue-capacity:10000}")
    private Integer queueCapacity;

    @Bean
    public AsyncEventBus asyncEventBus() {
        final ThreadPoolTaskExecutor executor = executor();
        return new AsyncEventBus(executor);
    }

    @Bean
    public ThreadPoolTaskExecutor executor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);//当前线程数
        executor.setMaxPoolSize(maxPoolSize);// 最大线程数
        executor.setQueueCapacity(queueCapacity);//这个值的设定应该稍微大于请求高峰值
        executor.setKeepAliveSeconds(keepAliveSeconds);
        executor.setWaitForTasksToCompleteOnShutdown(true);//等待任务在关机时完成--表明等待所有线程执行完
        executor.setAwaitTerminationSeconds(60 * 15);// 等待时间 （默认为0，此时立即停止），并没等待xx秒后强制停止
        executor.setThreadNamePrefix("asyncThread-");//  线程名称前缀
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize(); // 初始化
        return executor;
    }
}
