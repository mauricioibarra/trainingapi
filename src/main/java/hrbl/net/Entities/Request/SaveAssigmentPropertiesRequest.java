package hrbl.net.Entities.Request;

import lombok.Data;
import org.wildfly.common.annotation.Nullable;

@Data

public class SaveAssigmentPropertiesRequest {
    public @Nullable String dsId;
    public String flagCode;
    public String flagName;
    public boolean active;

}
