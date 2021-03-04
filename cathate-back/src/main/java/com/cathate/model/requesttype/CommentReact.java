package com.cathate.model.requesttype;

import com.cathate.annotation.validation.MemberOf;
import lombok.Data;

@Data
public class CommentReact {
    String author;
    String context;
    @MemberOf(accepted = {"like", "dislike", "comment", "report"})
    String type;
}
