package repository;
import java.util.Scanner;

import entity.Team;

public class TeamRepository {
	public static Team getMITeamDetails() {
		Scanner s = new Scanner(System.in);
		Team team = new Team();
		System.out.println("Enter Team id : ");
		int id = s.nextInt();
		team.setId(id);
		s.nextLine();
		
		System.out.println("Enter Team name : ");
		String teamName = s.nextLine();
		team.setTeamName(teamName);
		
		System.out.println("Enter Team Captain Name : ");
		String captainName = s.nextLine();
		team.setCaptainName(captainName);
		
		System.out.println("Enter Team Coach Name : ");
		String coachName = s.nextLine();
		team.setCoachName(coachName);
		
		System.out.println("Enter Team qualification true / false : ");
		Boolean qualification = s.nextBoolean();
		team.setQualified(qualification);
		
		System.out.println("Enter Team nRR : ");
		float nrr = s.nextFloat();
		team.setnRR(nrr);
		
		return team;
	}
}
