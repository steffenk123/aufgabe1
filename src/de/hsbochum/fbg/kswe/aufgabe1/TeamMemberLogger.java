package de.hsbochum.fbg.kswe.aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class TeamMemberLogger {
	
	public static void main(String[] args) {
		TeamMemberLogger tml = new TeamMemberLogger();
		tml.loadTeamMembers();
		tml.doLog();
	}

	private List<TeamMember> members;

	private void loadTeamMembers() {
		this.members = new ArrayList<>();
		
		addMemberA();
		addMemberB();
	}

	private void addMemberA() {
		this.members.add(new TeamMember("Steffen", "Kramer"));
	}

	private void addMemberB() {
		this.members.add(new TeamMember("Nathalie", "Pitz"));
	}

	private void doLog() {
		System.out.println(String.format("%s Mitglieder insgesamt:", this.members.size()));
		this.members.stream().forEach(m -> {
			System.out.println(m.toString());
		});
	}
	
}
