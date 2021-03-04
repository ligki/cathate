package com.cathate.service;

import com.cathate.model.responsetype.LatestNews;
import com.cathate.model.responsetype.NewsDetail;

import java.util.List;

public interface NewsShareService {
    List<LatestNews> getLatestNews(String page);

    NewsDetail getNewsDetail(String newsId);
}
