package Entities;

import org.wildfly.common.annotation.Nullable;

import java.time.LocalDateTime;

public class DistributorCourseTracking {

    public String courseKey;


    public String dsId;

    public TrackingStatus status;

    public float score;

    public @Nullable LocalDateTime completionDateUtc;

    public String localeHist ;


    public int totalTime;


    public Interface interfaceValue;

    public LocalDateTime firstStudyDate;


    public @Nullable LocalDateTime sessionCompletedDate;

    public int totalAttempts;

    public String courseCategory;

    public String courseType;
    public boolean mandatory;

}
