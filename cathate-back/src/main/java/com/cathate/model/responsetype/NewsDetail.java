package com.cathate.model.responsetype;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.cathate.constant.DateTime;
import lombok.Data;

@Data
public class NewsDetail {
    private String id;
    private String title;
    private String titleImage;
    private String htmlContent;
    private String source;
    @JsonFormat(pattern = DateTime.FORMAT_GENERAL)
    private String created;
}
