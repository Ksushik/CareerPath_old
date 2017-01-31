package com.syniaeva.idp.dto.skills;

import java.util.HashMap;
import java.util.List;

import com.syniaeva.idp.dto.positions.Position;
import com.syniaeva.idp.dto.utils.Areas;

/**
 * Created by osyniaeva on 1/31/17.
 */
public class SkillsGroup {

    private Areas area;
	private HashMap<Topic, List<Skill>> areaSkills;
	private Position correspondingPosition;

	public Areas getArea() {
		return area;
	}

	public void setArea(Areas area) {
		this.area = area;
	}

	public HashMap<Topic, List<Skill>> getAreaSkills() {
		return areaSkills;
	}

	public void setAreaSkills(HashMap<Topic, List<Skill>> areaSkills) {
		this.areaSkills = areaSkills;
	}

	public Position getCorrespondingPosition() {
		return correspondingPosition;
	}

	public void setCorrespondingPosition(Position correspondingPosition) {
		this.correspondingPosition = correspondingPosition;
	}
}
