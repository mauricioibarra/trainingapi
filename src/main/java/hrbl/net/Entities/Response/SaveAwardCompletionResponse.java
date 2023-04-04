package hrbl.net.Entities.Response;

import lombok.Data;

@Data
public class SaveAwardCompletionResponse {
public  Response response;

public SaveAwardCompletionResponse(){
    response = new Response();
}

}
