public class App {
    public static void main(String[] args) throws Exception {
        Tennis tennisPlayer = new Tennis("OJ", 4, 1000000000);
        tennisPlayer.forehand();
        tennisPlayer.backhand();
        tennisPlayer.runToNet();
        tennisPlayer.smash();
        tennisPlayer.score();
        Soccer soccerPlayer = new Soccer("Purvit", 16, 10000);
        soccerPlayer.block();
        soccerPlayer.dribble();
        soccerPlayer.passBall();
        soccerPlayer.tackle();
        soccerPlayer.shoot();
        Football footballPlayer = new Football("Karthik", 23, 1000);
        footballPlayer.punt();
        footballPlayer.Throw();
        footballPlayer.runsToTheSide();
        footballPlayer.Catch();
        footballPlayer.touchdown();
        IceHockey iceHockeyPlayer = new IceHockey("Sachin", 14, 100);
        iceHockeyPlayer.stickHandle();
        iceHockeyPlayer.skateForward();
        iceHockeyPlayer.pass();
        iceHockeyPlayer.defend();
        iceHockeyPlayer.shoot();
        iceHockeyPlayer.goal();
        FieldHockey fieldHockeyPlayer = new FieldHockey("Sai", 10, 10);
        fieldHockeyPlayer.runForward();
        fieldHockeyPlayer.pass();
        fieldHockeyPlayer.defend();
        fieldHockeyPlayer.shoot();
        fieldHockeyPlayer.goal();
    }
}
