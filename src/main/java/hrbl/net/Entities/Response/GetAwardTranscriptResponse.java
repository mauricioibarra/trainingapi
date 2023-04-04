package hrbl.net.Entities.Response;

import hrbl.net.Entities.MemberAward;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GetAwardTranscriptResponse {
public  Response response;

public List<MemberAward> memberAwards;

public GetAwardTranscriptResponse(){

    response = new Response();
    memberAwards = new ArrayList<MemberAward>();

}

}
