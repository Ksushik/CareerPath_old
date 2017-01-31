package com.syniaeva.idp.dto.skills;

import com.syniaeva.idp.dto.utils.Areas;


/**
 * Created by osyniaeva on 1/31/17.
 */


public class Topic {

	private Areas area;
	private String topic;

	public Areas getArea() {
		return area;
	}

	public void setArea(Areas area) {
		this.area = area;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}
