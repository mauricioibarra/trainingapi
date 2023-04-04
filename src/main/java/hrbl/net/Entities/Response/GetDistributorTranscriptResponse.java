package hrbl.net.Entities.Response;

import hrbl.net.Entities.DistributorCourseTracking;
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
