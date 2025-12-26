package com.tushar.PG.Management.System.model;

//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Candidate {

  //  @Id
    private long cId;
    private String cFirstName;
    private String cLastName;
    private String cMobileNo;
    private int roomNo;
    private int bedNo;//1 or 2


}
