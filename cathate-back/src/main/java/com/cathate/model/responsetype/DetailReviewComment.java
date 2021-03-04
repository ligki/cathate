package com.cathate.model.responsetype;

import lombok.Data;

import java.util.List;

@Data
public class DetailReviewComment {
    String id;
    String author;
    String reviewObjectId;
    String point;
    String context;
    String lastTime;
    List<DetailReviewCommentChild> comments;
}
