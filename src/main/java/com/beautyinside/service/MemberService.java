package com.beautyinside.service;

import java.util.List;

import com.beautyinside.vo.MemberVO;

public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
}

