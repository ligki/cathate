package com.cathate.service;

import com.cathate.model.responsetype.AllPages;
import com.cathate.model.responsetype.DetailReviewObject;
import com.cathate.model.responsetype.NewestReviewObject;
import com.cathate.model.responsetype.SearchReview;

import java.util.List;

public interface ReviewService {
    /**
     * Get 10 newest review object by type
     * Refer type by ReviewType
     *
     * @param type ReviewType
     * @param page page to search, minimum is 1
     * @return
     */
    List<NewestReviewObject> getNewestReviewObject(String type, String page);

    /**
     * Get 10 best review object by type
     * Refer type by ReviewType
     *
     * @param type ReviewType
     * @param page page to search, minimum is 1
     * @return
     */
    List<NewestReviewObject> getBestReviewObject(String type, String page);

    /**
     * Get 10 worst review object by type
     * Refer type by ReviewType
     *
     * @param type ReviewType
     * @param page page to search, minimum is 1
     * @return
     */
    List<NewestReviewObject> getWorstReviewObject(String type, String page);

    DetailReviewObject getDetail(String id);

    List<SearchReview> searchReviews(String query);

    AllPages getAllPage(String type);

}
