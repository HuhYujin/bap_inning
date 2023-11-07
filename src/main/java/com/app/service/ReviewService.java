package com.app.service;

import java.util.HashMap;

import com.app.dto.LodReviewDTO;
import com.app.dto.ReviewDTO;
import com.app.dto.ReviewPageDTO;

public interface ReviewService {

	public ReviewPageDTO r_reviewList(int curPage, int res_id);
	public ReviewPageDTO l_reviewList(int curPage, int lodging_id);
	public int reviewWrite(ReviewDTO reviewDTO);
	public int lodReviewWrite(LodReviewDTO dto);
	public ReviewDTO reviewRetrieve(String review_id);
	public LodReviewDTO lodReviewRetrieve(String review_id);
	public int reviewUpdate(ReviewDTO reviewDTO);
	public int lodReviewUpdate(LodReviewDTO dto);
	public int reviewDelete(int review_id);
	public int lodReviewDelete(int review_id);
	public int find_seq();
	public int lod_find_seq();
	public int save_url(HashMap<String, Object> map);
	public int lod_save_url(HashMap<String, Object> map);
}
