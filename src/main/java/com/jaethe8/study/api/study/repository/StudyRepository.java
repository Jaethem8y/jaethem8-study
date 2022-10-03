package com.jaethe8.study.api.study.repository;

import com.jaethe8.study.api.study.model.StudyPost;

import java.util.List;

public interface StudyRepository {
    public List<StudyPost> getAllStudyPost();
    public StudyPost getStudyPostByTitle(String title) throws Exception;
}
