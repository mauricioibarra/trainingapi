package Entities.Response;

import Entities.Status;
import lombok.Data;

@Data
public class SaveCourseCompletionResponse {
public  Response response;

public SaveCourseCompletionResponse(){
    response = new Response();
}

}
