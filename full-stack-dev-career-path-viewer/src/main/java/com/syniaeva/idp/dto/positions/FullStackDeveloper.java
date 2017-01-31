package com.syniaeva.idp.dto.positions;

import java.util.HashMap;

import com.syniaeva.idp.dto.skills.SkillsGroup;
import com.syniaeva.idp.dto.utils.Areas;
import com.syniaeva.idp.dto.utils.Level;

/**
 * Created by osyniaeva on 1/31/17.
 */
public class FullStackDeveloper implements Position {

	private String positionName;
	private Level level;
	private HashMap<Areas, SkillsGroup> requiredSkills;

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public HashMap<Areas, SkillsGroup> getRequiredSkills() {
		return requiredSkills;
	}

	public void setRequiredSkills(HashMap<Areas, SkillsGroup> requiredSkills) {
		this.requiredSkills = requiredSkills;
	}
}
