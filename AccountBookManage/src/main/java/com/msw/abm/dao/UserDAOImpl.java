package com.msw.abm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.msw.abm.mapper.UserMapper;
import com.msw.abm.vo.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SqlSession sqlSession;

	/**
	 * 일반 로그인
	 * @param UserVO
	 * @return List<UserVO>
	 */
	@Override
	public List<UserVO> sessionLogin(UserVO uv) {
		List<UserVO> result;
		UserMapper resultMapper = sqlSession.getMapper(UserMapper.class);

		result = resultMapper.sessionLogin(uv);

		return result;
	}

}
