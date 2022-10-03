package com.jaethe8.study.api.study.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "study_post")
public class StudyPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "title", unique = true)
    private String title;
    @Column(name = "pub_date")
    private Timestamp date;
    @Lob
    @Column(name = "description", columnDefinition = "BLOB")
    private String description;
    @JsonManagedReference
    @OneToMany(mappedBy = "studyPost", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<StudyContent> studyContents = new ArrayList<>();
}
