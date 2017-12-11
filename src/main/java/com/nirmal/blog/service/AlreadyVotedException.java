package com.nirmal.blog.service;

/**
 * 
 * @author muthu_m
 *
 */
public class AlreadyVotedException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public AlreadyVotedException(String message) 
	{
        super(message);
    }
}
