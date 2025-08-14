package repository;

import entity.Team;

public class TeamRepository {

	public static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Mahela Jayawardene");
		team.setQualified(false);
		team.setnRR(2.2f);
		team.setShortName("MI");
		return team;
	}

	public static Team getRCBTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Royal Challengers Bangalore");
		team.setCaptainName("Virat Kohli");
		team.setCoachName("Andy Flower");
		team.setQualified(false);
		team.setnRR(5.3f);
		team.setShortName("RCB");
		return team;
	}

	public static Team getCSKTeamDetails() {
		Team team = new Team();
		team.setId(103);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("MS Dhoni");
		team.setCoachName("Stephen Fleming");
		team.setQualified(true);
		team.setnRR(4.5f);
		team.setShortName("CSK");
		return team;
	}

	public static Team getKKRTeamDetails() {
		Team team = new Team();
		team.setId(104);
		team.setTeamName("Kolkata Knight Riders");
		team.setCaptainName("Shreyas Iyer");
		team.setCoachName("Chandrakant Pandit");
		team.setQualified(true);
		team.setnRR(3.9f);
		team.setShortName("KKR");
		return team;
	}

	public static Team getSRHTeamDetails() {
		Team team = new Team();
		team.setId(105);
		team.setTeamName("Sunrisers Hyderabad");
		team.setCaptainName("Aiden Markram");
		team.setCoachName("Daniel Vettori");
		team.setQualified(false);
		team.setnRR(1.8f);
		team.setShortName("SRH");
		return team;
	}

	public static Team getDCteamDetails() {
		Team team = new Team();
		team.setId(106);
		team.setTeamName("Delhi Capitals");
		team.setCaptainName("Rishabh Pant");
		team.setCoachName("Ricky Ponting");
		team.setQualified(false);
		team.setnRR(1.2f);
		team.setShortName("DC");
		return team;
	}

	public static Team getPBKSTeamDetails() {
		Team team = new Team();
		team.setId(107);
		team.setTeamName("Punjab Kings");
		team.setCaptainName("Shikhar Dhawan");
		team.setCoachName("Trevor Bayliss");
		team.setQualified(false);
		team.setnRR(0.9f);
		team.setShortName("PBKS");
		return team;
	}

	public static Team getGTTeamDetails() {
		Team team = new Team();
		team.setId(108);
		team.setTeamName("Gujarat Titans");
		team.setCaptainName("Shubman Gill");
		team.setCoachName("Ashish Nehra");
		team.setQualified(true);
		team.setnRR(4.1f);
		team.setShortName("GT");
		return team;
	}

	public static Team getLSGTeamDetails() {
		Team team = new Team();
		team.setId(109);
		team.setTeamName("Lucknow Super Giants");
		team.setCaptainName("KL Rahul");
		team.setCoachName("Justin Langer");
		team.setQualified(false);
		team.setnRR(2.7f);
		team.setShortName("LSG");
		return team;
	}

	public static Team getRRTeamDetails() {
		Team team = new Team();
		team.setId(110);
		team.setTeamName("Rajasthan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Kumar Sangakkara");
		team.setQualified(true);
		team.setnRR(3.2f);
		team.setShortName("RR");
		return team;
	}
}
