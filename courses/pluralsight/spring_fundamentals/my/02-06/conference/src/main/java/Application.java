import org.dragan.service.SpeakerService;
import org.dragan.service.SpeakerServiceImpl;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Application {
    public static void main(String args[]) {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
