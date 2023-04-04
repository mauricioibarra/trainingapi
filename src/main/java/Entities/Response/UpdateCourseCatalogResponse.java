package Entities.Response;

import lombok.Data;

@Data
public class UpdateCourseCatalogResponse {
public  Response response;

public UpdateCourseCatalogResponse(){
    response = new Response();
}

}
