package Entities.Request;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data

public class PurgeUserRequest {
    public String dsId;
    public String requestedId;
    public String requestedUTCDate;

}
