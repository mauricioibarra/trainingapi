package hrbl.net.Entities.Request;

import hrbl.net.Entities.TrackingStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data

public class SaveAwardCompletionRequest {
    public String dsId;

    public UUID uniqueId;
    public String awardTier;

    public String awardType;

    public LocalDateTime timestamp;

    public String awardKey;

    public LocalDateTime awardDateEarned;

    public String awardLocale;

    public TrackingStatus status;

    public String awardName;

}
