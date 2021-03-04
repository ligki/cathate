package com.cathate.model.responsetype;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.cathate.constant.DateTime;
import lombok.Data;

@Data
public class LatestNews {
    private String  id;
    private String  title;
    private String  titleImage;
    @JsonFormat(pattern = DateTime.FORMAT_GENERAL)
    private String  created;
}
