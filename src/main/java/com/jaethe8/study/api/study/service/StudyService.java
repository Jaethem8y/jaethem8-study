package com.jaethe8.study.api.study.service;

import com.jaethe8.study.api.study.dto.PostDTO;
import com.jaethe8.study.api.study.model.StudyPost;

import java.util.List;

public interface StudyService {
    public List<PostDTO> getAllStudyPost();
    public PostDTO getStudyPostByTitle(String title) throws Exception;
    public StudyPost mapStudyPost(PostDTO postDTO, StudyPost studyPost);
    public PostDTO studyPostToDTO(StudyPost studyPost);
}
