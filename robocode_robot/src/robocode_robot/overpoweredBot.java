package ohas_robot;

import robocode.AdvancedRobot;
import robocode.DeathEvent;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;
import robocode.util.Utils;

import java.awt.Color;

public class overpoweredBot extends AdvancedRobot {
    int dir = 1; // -1 = left, 1 = right
    double energy; // energy of the robot
    int enemyFireCount = 0;

    public void run() {
        // Set body colors
        setBodyColor(Color.pink);
        setGunColor(Color.pink);
        setRadarColor(Color.pink);
        setBulletColor(Color.blue);
        setScanColor(Color.pink);

        // Makes sure that robot or gun turning does not affect radar
        setAdjustRadarForRobotTurn(true);
        setAdjustRadarForGunTurn(true);

        setTurnRadarRight(360); // Scans entire board for robot

        turnRight(getHeading() % 90);

        while (true) { //EXPLAIN
            if (Utils.isNear(getHeadingRadians(), 0D) || Utils.isNear(getHeadingRadians(), Math.PI)) {
                ahead((Math.max(getBattleFieldHeight() - getY(), getY()) - 28) * dir);
            } else {
                ahead((Math.max(getBattleFieldWidth() - getX(), getX()) - 28) * dir);
            }
            turnRight(90 * dir);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double absBearing = e.getBearingRadians() + getHeadingRadians(); // Get bearing of enemy robot
        double latVel = e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing); // Get lateral velocity of enemy robot
        double radarTurn = absBearing - getRadarHeadingRadians(); // Get radar turn needed to face enemy robot

        if (energy > (energy = e.getEnergy())) {
            enemyFireCount++;
            if (enemyFireCount % 5 == 0) {
                dir = -dir;
                if (Utils.isNear(getHeadingRadians(), 0D) || Utils.isNear(getHeadingRadians(), Math.PI)) {
                    setAhead((Math.max(getBattleFieldHeight() - getY(), getY()) - 28) * dir);
                } else {
                    setAhead((Math.max(getBattleFieldWidth() - getX(), getX()) - 28) * dir);
                }
            }
        }

        setMaxVelocity(Math.random() * 10 + 50); // Sets random velocity to decrease chance of other robots hitting me
        double bulletPower = Math.min(3, e.getEnergy() / 4); // Calculate bullet power to just enough to kill the other robot
        setFire(bulletPower); // Set bullet power to fire at the other robot
        setTurnGunRightRadians(Utils.normalRelativeAngle(
                absBearing - getGunHeadingRadians() + Math.asin(latVel / (20 - 3 * bulletPower)))); // Turn gun to face enemy
        setTurnRadarRightRadians(Utils.normalRelativeAngle(radarTurn) * 2); // Turn radar to face enemy
    }

    public void onWin(WinEvent e) {
        setAllColors(Color.green); // Victory color!
        System.out.println("I won master! :) Sloths are the best!"); // Telling me it won the game!
        while (true) {
            turnRadarRight(360); // Victory dance!
        }
    }

    public void onDeath(DeathEvent e) {
        System.out.println(
                "I died. I'm so sorry to bring you down master! :( The next sloth shall take my mantle now..."); // Apology
                                                                                                                 // statement
                                                                                                                 // for
                                                                                                                 // death...
    }
}