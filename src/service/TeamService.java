package service;

import java.util.Scanner;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	public void printTeamDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal");
		System.out.println("Please select following options");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get tam details by short name");

		Team team1 = TeamRepository.getMITeamDetails();
		Team team2 = TeamRepository.getRCBTeamDetails();
		Team team3 = TeamRepository.getCSKTeamDetails();
		Team team4 = TeamRepository.getKKRTeamDetails();
		Team team5 = TeamRepository.getSRHTeamDetails();
		Team team6 = TeamRepository.getDCteamDetails();
		Team team7 = TeamRepository.getPBKSTeamDetails();
		Team team8 = TeamRepository.getGTTeamDetails();
		Team team9 = TeamRepository.getLSGTeamDetails();
		Team team10 = TeamRepository.getRRTeamDetails();

		int input = sc.nextInt();
		sc.nextLine();

		String shortName = "";
		int code = 0;

		switch (input) {
		case 1: {
			System.out.println(team1);
			System.out.println(team2);
			System.out.println(team3);
			System.out.println(team4);
			System.out.println(team5);
			System.out.println(team6);
			System.out.println(team7);
			System.out.println(team8);
			System.out.println(team9);
			System.out.println(team10);
			break;
		}
		case 2: {
			System.out.println("Find team using code or short name : ");
			shortName = sc.nextLine();

			if (shortName.matches("\\d+")) {
				code = Integer.parseInt(shortName);
			}
			if (shortName.equalsIgnoreCase("mi") || code == 101) {
				System.out.println(team1);
			} else if (shortName.equalsIgnoreCase("rcb") || code == 102) {
				System.out.println(team2);
			} else if (shortName.equalsIgnoreCase("csk") || code == 103) {
				System.out.println(team3);
			} else if (shortName.equalsIgnoreCase("kkr") || code == 104) {
				System.out.println(team4);
			} else if (shortName.equalsIgnoreCase("srh") || code == 105) {
				System.out.println(team5);
			} else if (shortName.equalsIgnoreCase("dc") || code == 106) {
				System.out.println(team6);
			} else if (shortName.equalsIgnoreCase("pbks") || code == 107) {
				System.out.println(team7);
			} else if (shortName.equalsIgnoreCase("gt") || code == 108) {
				System.out.println(team8);
			} else if (shortName.equalsIgnoreCase("lsg") || code == 109) {
				System.out.println(team9);
			} else if (shortName.equalsIgnoreCase("rr") || code == 110) {
				System.out.println(team10);
			} else {
				System.out.println("Invalid team short name or code.");
			}
			break;
		}
		default:
			System.out.println("Invalid input");
		}
	}
}
