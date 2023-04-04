package hrbl.net.Entities.Request;

import hrbl.net.Entities.TrackingStatus;
import hrbl.net.Entities.Interface;
import lombok.Data;
import org.wildfly.common.annotation.NotNull;
import org.wildfly.common.annotation.Nullable;

import java.time.LocalDateTime;

@Data

public class SaveCourseCompletionRequest {
    @NotNull
    public String courseKey;

    @NotNull
    public String dsId;


    public String courseVersion;


    public float score;

    @NotNull
    public TrackingStatus status;

    @NotNull
    public @Nullable LocalDateTime updatedDateUTC;

    public int totalTime;

    @NotNull
    public Interface interfaceValue;

    public String bookmark;

    public LocalDateTime firstStudyDate;
    //public String hDMSCourseId;
    public int points;
    public LocalDateTime registrationDate;
    public @Nullable LocalDateTime sessionCompletedDate;
    public int timesCompleted;
    public int totalAttempts;
}
