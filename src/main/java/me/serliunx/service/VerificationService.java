package me.serliunx.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface VerificationService {
	//产生一个图片验证码
	public void verificateImgToken(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public boolean checkImgToken(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
