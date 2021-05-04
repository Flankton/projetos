package william.apiwill.Util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class Dateutil {
    public String formaLocalDateTimeToDatabaseStyle(LocalDateTime localdDateTime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd:mm:ss").format(localdDateTime);
    }
}
