import org.dragan.model.Speaker;
import org.dragan.service.SpeakerService;
import org.dragan.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.util.Date;

public class Application {
    public static void main(String args[]) {
        System.out.println(new Date());
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service);

        Speaker speaker = service.findAll().get(0);
        System.out.println(speaker.getFirstName());
        System.out.println(speaker.getSeedNum());
    }
}
