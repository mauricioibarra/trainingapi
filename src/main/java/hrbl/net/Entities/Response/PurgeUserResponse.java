package hrbl.net.Entities.Response;

import lombok.Data;

@Data
public class PurgeUserResponse {
public  Response response;

public PurgeUserResponse(){
    response = new Response();
}

}
