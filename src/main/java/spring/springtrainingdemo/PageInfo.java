package spring.springtrainingdemo;

import lombok.Data;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ConfigurationProperties(prefix = "page-info")
@Data
public class PageInfo {

    private String author;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationDate;

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println(getAuthor() + "\n" + getCreationDate().toString());
    }
}
