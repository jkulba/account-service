package us.kulba.accounts.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import us.kulba.accounts.model.serializer.DateIsoDeSerializer;
import us.kulba.accounts.model.serializer.DateIsoSerializer;

import java.util.Calendar;
import java.util.Date;

/**
 * Ping is a POJO
 */
public class Ping {
    private String application;
    private String version;
    private Date now;

    public Ping() {
        Calendar calendar = Calendar.getInstance();
        this.setNow(calendar.getTime());
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @JsonSerialize(using= DateIsoSerializer.class)
    public Date getNow() {
        return now;
    }

    @JsonDeserialize(using=DateIsoDeSerializer.class)
    public void setNow(Date now) {
        this.now = now;
    }

}
