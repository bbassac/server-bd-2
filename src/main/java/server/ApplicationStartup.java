package server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import server.repository.CollectionRepositoryCustom;


/**
 * Created by b.bassac on 23/06/2017.
 */
@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    CollectionRepositoryCustom customRepo;


    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        LogUtils.warn("######################################");
        LogUtils.warn("#              LOADER                #");
        LogUtils.warn("######################################");
    }
}
