package com.cathate.service;

import com.cathate.model.entity.ReviewComment;
import com.cathate.model.httpentity.SuccessResponse;
import com.cathate.model.responsetype.DetailReviewComment;
import com.cathate.model.responsetype.NewestComment;

import java.util.List;

public interface CommentService {
    List<NewestComment> getNewestComments();

    List<DetailReviewComment> getDetailComment(String reviewObjectId);

    SuccessResponse addComment(ReviewComment review);

    SuccessResponse addCommentReact(ReviewComment review, String type);
}
