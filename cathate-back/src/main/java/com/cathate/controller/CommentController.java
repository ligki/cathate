package com.cathate.controller;

import com.cathate.model.entity.ReviewComment;
import com.cathate.model.requesttype.CommentReact;
import com.cathate.model.requesttype.ReviewCommentAdd;
import com.cathate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController extends BaseController {

    @Autowired
    CommentService commentService;

    @GetMapping("/newest")
    ResponseEntity<?> getNewestComments() {
        return handleResponse(commentService.getNewestComments());
    }

    @GetMapping("/detail/{reviewObjectId}")
    ResponseEntity<?> getDetailComment(@PathVariable(value = "reviewObjectId", required = true) String reviewObjectId) {
        return handleResponse(commentService.getDetailComment(reviewObjectId));
    }

    @PostMapping("/{reviewObjectId}")
    ResponseEntity<?> addCommentReview(@PathVariable(value = "reviewObjectId") String reviewObjectId,
                                       @RequestBody ReviewCommentAdd review) {
        ReviewComment rv = dozerBeanMapper.map(review, ReviewComment.class);
        rv.setReviewObjectId(reviewObjectId);
        return handleResponse(commentService.addComment(rv));
    }

    @PostMapping("/react-comment/{commentId}")
    ResponseEntity<?> reactComment(@PathVariable(value = "commentId") String commentId,
                                   @RequestBody CommentReact comment) {
        ReviewComment rv = dozerBeanMapper.map(comment, ReviewComment.class);
        rv.setReviewCommentParent(commentId);
        return handleResponse(commentService.addCommentReact(rv, comment.getType()));
    }
}
