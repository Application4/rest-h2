package com.javatechie.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequestDTO {
    private String name;
    private String trainerName;
    private String courseType;//LIVE OR RECORDING
    private double courseFees;
    private String duration;// in month
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date startDate;
    private boolean isCertificationAvailable;


}
