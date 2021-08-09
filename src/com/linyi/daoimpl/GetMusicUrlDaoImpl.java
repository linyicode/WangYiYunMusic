package com.linyi.daoimpl;

import com.linyi.dao.GetMusicUrlDao;

public class GetMusicUrlDaoImpl implements GetMusicUrlDao{

	@Override
	public String GetUrl(String input_url) {
		String Music_Icon = "";
		if(input_url.split("=").length>1) {
			String Id = input_url.split("=")[1];
			StringBuffer sb = new StringBuffer();
			if(Id.length()>10 || Id.length()==10) {
				if(Id.length()>10){
					for(int i = 0;i<10;i++) {
						sb.append(Id.charAt(i));
					}
					Id = sb.toString();
				}
				String Music_Url = "https://music.163.com/song/media/outer/url?id="+Id+".mp3";
				Music_Icon = "<audio src="+Music_Url+" controls='controls' class='mt-2'><p>当前浏览器不支持audio</p></audio><p class='mt-3'>音乐地址: "+Music_Url+"</p>";
			}else{
				Music_Icon = "Url未复制完全,请检查";
			}
		}else {
			Music_Icon = "Url输入错误,请检查";
		}
		
		return Music_Icon;
	}
	
}
