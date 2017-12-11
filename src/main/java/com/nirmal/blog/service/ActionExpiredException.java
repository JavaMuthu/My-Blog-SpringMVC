package com.nirmal.blog.service;

/**
 * 
 * @author muthu_m
 *
 */
public class ActionExpiredException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public ActionExpiredException(String message) 
	{
        super(message);
    }
}
