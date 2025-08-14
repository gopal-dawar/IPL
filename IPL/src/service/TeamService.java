package service;
import entity.Team;
import repository.TeamRepository;

public class TeamService {
	public void printTeamDetails() {
		Team team = TeamRepository.getMITeamDetails();
		
		System.out.println("Team Id : " + team.getId());
		System.out.println("Team Name : " + team.getTeamName());
		System.out.println("Team Captain Name : " + team.getCaptainName());
		System.out.println("Team Coach Name : " + team.getCoachName());
		System.out.println("Team Qualification : " + team.isQualified());
		System.out.println("Team nRR : " + team.getnRR());
 	}
}
