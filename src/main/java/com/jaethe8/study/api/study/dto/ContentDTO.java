package com.jaethe8.study.api.study.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentDTO {
    private int location;
    private String header;
    private String content;
    private String code;
    private List<LinkDTO> links = new ArrayList<>();
    private List<ImageDTO> images = new ArrayList<>();
}
