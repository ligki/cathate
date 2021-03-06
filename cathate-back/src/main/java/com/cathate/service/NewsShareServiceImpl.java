package com.cathate.service;

import com.cathate.model.entity.NewsShare;
import com.cathate.model.responsetype.LatestNews;
import com.cathate.model.responsetype.NewsDetail;
import com.cathate.reposiroty.NewsShareRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NewsShareServiceImpl extends BaseService implements NewsShareService {

    @Autowired
    NewsShareRepository newsShareRepository;

    @Override
    public List<LatestNews> getLatestNews(String page) {
        int offset = mapPageToOffset(page);
        return newsShareRepository.findAll(offset)
                .stream()
                .map(newsShare -> dozerBeanMapper.map(newsShare, LatestNews.class))
                .collect(Collectors.toList());
    }

    @Override
    public NewsDetail getNewsDetail(String newsId) {
        String errorMsg = validateParameterThenReturnMsg(newsId, (str) -> StringUtils.isNumeric(str) && str.length() == 8, "newsId is not valid");
        validateErrorMsg(errorMsg);
        Optional<NewsShare> newsShareOpt = newsShareRepository.findById(newsId);
        if (newsShareOpt.isEmpty()) {
            LOGGER.info("Cannot find news_share {}", newsId);
            return null;
        }
        return dozerBeanMapper.map(newsShareOpt.get(), NewsDetail.class);
    }
}
