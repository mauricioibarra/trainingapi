package Entities.Response;

import Entities.DistributorCourseTracking;
import Entities.MemberAward;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GetDistributorTranscriptResponse {
public  Response response;

public List<DistributorCourseTracking> distributorCourseTrackings;

public GetDistributorTranscriptResponse(){

    response = new Response();
    distributorCourseTrackings = new ArrayList<DistributorCourseTracking>();

}

}
