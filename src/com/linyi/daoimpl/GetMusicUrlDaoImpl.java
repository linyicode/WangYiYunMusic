package com.linyi.daoimpl;

import com.linyi.dao.GetMusicUrlDao;

public class GetMusicUrlDaoImpl implements GetMusicUrlDao{

	@Override
	public String GetUrl(String id) {
		String ReturnUrl = "https://music.163.com/song/media/outer/url?id="+id+".mp3";
		return ReturnUrl;
	}
	
}
