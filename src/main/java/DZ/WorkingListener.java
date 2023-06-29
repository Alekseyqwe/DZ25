package DZ;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkingListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent servre) {
        String p = ("HH:mm:ss");
        SimpleDateFormat sd = new SimpleDateFormat(p);
        Date d = new Date();
        String time = sd.format(d);
        System.out.println("Start time" + time);
    }
}