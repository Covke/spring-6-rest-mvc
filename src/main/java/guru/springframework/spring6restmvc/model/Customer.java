package guru.springframework.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class Customer {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String adress;

}
