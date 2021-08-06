package com.linyi.server;

import com.linyi.dao.GetMusicUrlDao;

public class GetMusicUrlServer {
	private GetMusicUrlDao gmud;
	public GetMusicUrlServer(GetMusicUrlDao gmud) {
		super();
		this.gmud = gmud;
	}
	public String GetUrl(String id) {
		return gmud.GetUrl(id);
	}
}
