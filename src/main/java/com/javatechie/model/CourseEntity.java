package com.javatechie.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COURSE_TABLE")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Builder
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String name;
    private String trainerName;
    private String courseType;//LIVE OR RECORDING
    private double courseFees;
    private String duration;// in month
    private Date startDate;
    private boolean isCertificationAvailable;
}
