package hrbl.net.Entities.Request;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data

public class UpdateCourseCatalogRequest {

    public int courseId;
    public String name;
    public String courseKey;
    public String displayName;
    public String description;

    public String locale;

    public boolean active;

    public LocalDateTime lastModifiedDate;

    public String courseVersion;

    public String courseType;

    public String hdmsFlagCode;

    public String courseCategory;

    public String Mandatory;

    public List<String> courseChild;

}
