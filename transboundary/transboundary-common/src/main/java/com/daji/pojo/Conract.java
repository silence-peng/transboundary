package com.daji.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class Conract implements Serializable {
    @Id
    private String bejobid;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date birthdate;
    private String ethnic;
    private String nativeplace;
    private String entityCard;
    private String education;
    private String mgjor;
    private String payGrades;
    private String socialSeurityNumber;
    private String emergencycontact;
    private String contactRelation;
    private String emergencyContactPhone;
    private String homePhone;

}
