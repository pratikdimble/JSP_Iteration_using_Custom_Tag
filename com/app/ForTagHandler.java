package com.app;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class ForTagHandler extends TagSupport {
	
	int count=1;
	private int times;

	public void setTimes(int times) {
		this.times = times;
	}

	@Override
	public int doStartTag() throws JspException {
		
			return EVAL_BODY_INCLUDE;
	}//doStartTag()
	
	@Override
	public int doAfterBody() throws JspException {
		if(count<times)
		{
			count++;
			return EVAL_BODY_AGAIN;
		}
		else
		return SKIP_BODY;
	}//doAfterBody()

}//class
