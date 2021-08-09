package com.linyi.server;

import com.linyi.dao.GetMusicUrlDao;

public class GetMusicUrlServer {
	private GetMusicUrlDao gmud;
	public GetMusicUrlServer(GetMusicUrlDao gmud) {
		super();
		this.gmud = gmud;
	}
	public String GetUrl(String input_url) {
		return gmud.GetUrl(input_url);
	}
}
