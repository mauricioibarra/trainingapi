package hrbl.net.Entities.Response;

import lombok.Data;

@Data
public class SaveCourseCompletionResponse {
public  Response response;

public SaveCourseCompletionResponse(){
    response = new Response();
}

}
