package org.kit._12_SteroAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl {

	@Value("RCB , csk")
	private String teamNname;

	@Value("VK")
	private String teamCaptain;

	@Value("#{temp}")
	private List<String> playerName;

	@Override
	public String toString() {
		return "Ipl [teamNname=" + teamNname + ", teamCaptain=" + teamCaptain + ", playerName=" + playerName + "]";
	}

}
