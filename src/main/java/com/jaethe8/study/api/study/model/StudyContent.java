package com.jaethe8.study.api.study.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "study_content")
public class StudyContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "location")
    private int location;
    @Column(name = "header")
    private String header;
    @Lob
    @Column(name = "content", columnDefinition = "BLOB")
    private String content;
    @Lob
    @Column(name = "code", columnDefinition = "BLOB")
    private String code;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonBackReference
    @JoinColumn(name = "study_post_id")
    private StudyPost studyPost;
    @JsonManagedReference
    @OneToMany(mappedBy = "studyContent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<StudyImage> studyImages = new ArrayList<>();
    @JsonManagedReference
    @OneToMany(mappedBy = "studyContent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<StudyLink> studyLinks = new HashSet<>();
}
