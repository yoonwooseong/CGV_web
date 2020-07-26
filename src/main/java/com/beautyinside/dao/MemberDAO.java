package com.beautyinside.dao;

import java.util.List;

import com.beautyinside.vo.MemberVO;

public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
}