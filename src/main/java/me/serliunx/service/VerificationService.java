package me.serliunx.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface VerificationService {
	void verificateImgToken(HttpServletRequest request, HttpServletResponse response) throws Exception;
	boolean checkImgToken(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
