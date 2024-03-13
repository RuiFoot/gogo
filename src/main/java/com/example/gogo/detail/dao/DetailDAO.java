package com.example.gogo.detail.dao;

import com.example.gogo.index.vo.FestivalListVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DetailDAO {
    FestivalListVO getDetail(@Param("event_no") String event_no);
}