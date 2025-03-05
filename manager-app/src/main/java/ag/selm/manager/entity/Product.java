package ag.selm.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public record Product (int id,
                       String title,
                       String details){

}
