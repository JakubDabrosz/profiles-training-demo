package spring.springtrainingdemo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdProfileTestShop {

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("Shop only for Prod Env.");
    }
}
