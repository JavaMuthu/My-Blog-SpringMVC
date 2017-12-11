package com.nirmal.blog.service;

/**
 * 
 * @author muthu_m
 *
 */
public class AuthException extends Exception
{
	private static final long serialVersionUID = 1L;

	public AuthException(String message) 
	{
        super(message);
    }
}
