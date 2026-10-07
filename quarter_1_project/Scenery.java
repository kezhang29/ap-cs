// The following 4 imports allow you to draw on a JPanel
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Scenery extends JPanel {  
    // Instance variables that store time of day and season
    private String timeOfDay;
    private String season;

    // All colors used in the scenery
    private Color springBlue1;
    private Color springBlue2;
    private Color roadGrey; 
    private Color roadOutline;
    private Color roadLinesGrey;
    private Color sideWalkWhite;
    private Color sideWalkLinesWhite;
    private Color lakeBlue, lakeOutlineBlue;
    private Color sidewalkOutlineGrey;
    private Color railingGrey1, railingGrey2, railingGrey3, railingGrey4, railingGrey5;
    private Color cityGroundGrey;
    private Color towerBeige;
    private Color towerPurple1, towerPurple2, towerPurple3, towerPurple4;
    private Color towerGrey;
    private Color towerBottomGrey;
    private Color towerTopGrey;
    private Color towerTopDarkerGrey;
    private Color buildingBlue1, buildingBlue2, buildingBlue3;
    private Color financialCenterBlue1, financialCenterBlue2, financialCenterBlue3, financialCenterBlue4;
    private Color bushGreen1, bushGreen2, bushGreen3;
    private Color sunYellow;
    private Color branchBrown;
    private Color cherryBlossomPink1, cherryBlossomPink2;
    private Color jinMaoBlue1, jinMaoBlue2, jinMaoBlue3;
    private Color towerBlue, towerDarkBlue, towerLightBlue, towerStripe;
    private Color nightBlue1, nightBlue2;
    private Color lakeNightBlue, lakeNightOutlineBlue;
    private Color fallLeavesOrange1, fallLeavesOrange2;
    private Color fallBushesOrange;
    private Color flowerStemGreen, flowerMiddleOrange, flowerPetals;

    public Scenery(String timeOfDay, String season) {
        setFocusable(true); // make sure focus is in this JPanel. This will become more important when we
                            // start using buttons.
        setLayout(null); // setting to null allows you to control the layout of the JPanel.

        // Set time of day and season to values passed in the initialization constructor
        this.timeOfDay = timeOfDay;
        this.season = season;

        // Srt colors to specific rgb values
        springBlue1 = new Color(101, 197, 254);
        springBlue2 = new Color(148, 217, 253);
        roadGrey = new Color(68, 72, 89);
        roadOutline = new Color(95, 100, 125);
        roadLinesGrey = new Color(140, 142, 157);
        sideWalkWhite = new Color(215, 207, 206);
        sideWalkLinesWhite = new Color(200, 193, 193);
        lakeBlue = new Color(93, 191, 252);
        sidewalkOutlineGrey = new Color(176, 170, 177);
        railingGrey1 = new Color(191, 184, 186);
        railingGrey2 = new Color(144, 144, 162);
        railingGrey3 = new Color(215, 205, 205);
        railingGrey4 = new Color(194, 186, 187);
        railingGrey5 = new Color(42, 60, 93);
        lakeOutlineBlue = new Color(79, 171, 217);
        cityGroundGrey = new Color(201, 199, 203);
        towerBeige = new Color(244, 221, 195);
        towerPurple1 = new Color(249, 140, 199);
        towerPurple2 = new Color(166, 64, 151);
        towerPurple3 = new Color(236, 88, 162);
        towerPurple4 = new Color(219, 86, 157);
        towerGrey = new Color(132, 132, 169);
        towerBottomGrey = new Color(115, 128, 171);
        towerTopGrey = new Color(129, 132, 160);
        towerTopDarkerGrey = new Color(130, 136, 165);
        buildingBlue1 = new Color(122, 187, 240);
        buildingBlue2 = new Color(89, 163, 226);
        buildingBlue3 = new Color(120, 201, 251);
        financialCenterBlue1 = new Color(95, 167, 231);
        financialCenterBlue2 = new Color(59, 132, 207);
        financialCenterBlue3 = new Color(66, 140, 212);
        financialCenterBlue4 = new Color(97, 184, 255);
        bushGreen1 = new Color(59, 141, 123);
        bushGreen2 = new Color(90, 165, 104);
        bushGreen3 = new Color(69, 148, 114);
        sunYellow = new Color(254, 241, 182);
        branchBrown = new Color(108, 63, 60);
        cherryBlossomPink1 = new Color(253, 213, 231);
        cherryBlossomPink2 = new Color(254, 166, 198);
        jinMaoBlue1 = new Color(123, 174, 228);
        jinMaoBlue2 = new Color(67, 139, 210);
        jinMaoBlue3 = new Color(66, 140, 212);
        towerBlue = new Color(73, 151, 219);
        towerDarkBlue = new Color(54, 132, 202);
        towerLightBlue = new Color(122, 190, 238);
        towerStripe = new Color(190, 225, 250);
        nightBlue1 = new Color(19, 72, 153);
        nightBlue2 = new Color(9, 49, 114);
        lakeNightBlue = new Color(22, 88, 176);
        lakeNightOutlineBlue = new Color(21, 81, 158);
        fallLeavesOrange1 = new Color(253, 82, 41);
        fallLeavesOrange2 = new Color(253, 108, 35);
        fallBushesOrange = new Color(218, 107, 57);
        flowerStemGreen = new Color(0, 153, 0);
        flowerMiddleOrange = new Color(204, 102, 0);
        flowerPetals = new Color(255,255,0);
    }

    @Override
    public Dimension getPreferredSize() {
        // Sets the size of the panel 
        return new Dimension(1200, 800); 
    }

    /*
     * Call all of your drawing methods from paintComponent(Graphics). You must pass
     * the Graphics reference variable, g, to your
     * draw methods.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // DO NOT REMOVE THIS LINE
        // Create a method for each item that you draw
        drawCityScape(g);
    }

    // Method to draw the entire scenery, calls methods to draw each individual component inside
    private void drawCityScape(Graphics g) {
        // Draw Sky
        drawSky(g);
        // Draw city
        drawCity(g);
        // Draw bushes
        drawBushes(g);
        // Draw lake
        drawLake(g);
        // Draw Road
        drawRoad(g);
        // Draw trees
        drawTrees(g);
        // Draw animals
        drawBird(g, 400, 120);
        drawBird(g, 430, 160);
        drawBird(g, 480, 100);

        drawFish(g, 550, 510);
        drawFish(g, 850, 540);
    }

    // Method that draws the sky/main-background of the scenery based on time of day
    private void drawSky(Graphics g) {
        /**
         * If time of day input is "day" then draw sky as light blue, if not
         * then draw sky in a darker blue
         *  */ 
        if (timeOfDay.equalsIgnoreCase("day")) {
            // Set color to light blue
            g.setColor(springBlue2);
            g.fillRect(0,400,1200,200);
            // Draws a gradient from a lighter blue to a darker blue as you go up
            drawGradient(g, springBlue2, springBlue1, 400);
            // Draw sun during day
            g.setColor(sunYellow);
            g.fillOval(70,70,80,80);
        } else if (timeOfDay.equalsIgnoreCase("night")) {
            // Set color to darker blue
            g.setColor(nightBlue1);
            g.fillRect(0,400,1200,200);
            // Draw a gradient froma lighter dark blue to darker dark blue as you go up
            drawGradient(g, nightBlue1, nightBlue2, 400);
        }
    }

    // Method that draws the lake of the scenery based on time of day
    private void drawLake(Graphics g) {
        /**
         * If time of day is day, then draw lake with lighter blue, if it's not
         * then draw lake with a darker blue
         */
        if (timeOfDay.equalsIgnoreCase("day")) {
            g.setColor(lakeBlue);
            g.fillRect(0, 485, 1200, 170);
            g.setColor(lakeOutlineBlue);
            g.fillRect(0, 475, 1200, 10);
        } else if (timeOfDay.equalsIgnoreCase("night")){
            g.setColor(lakeNightBlue);
            g.fillRect(0, 485, 1200, 170);
            g.setColor(lakeNightOutlineBlue);
            g.fillRect(0, 475, 1200, 10);
        }
        // Draw city ground
        g.setColor(cityGroundGrey);
        g.fillRect(0, 465, 1200, 10);
    }

    // Method that draws the road of the scenery
    private void drawRoad(Graphics g) {
        // Draw road body and outline
        g.setColor(roadGrey);
        g.fillRect(0, 725, 1200, 200);
        g.setColor(roadOutline);
        g.fillRect(0, 715, 1200, 10);
        // Draw Road Lines
        g.setColor(roadLinesGrey);
        drawParallelogram(g, 70, 760, 140, 5, 5, roadLinesGrey, false);
        g.fillRect(525, 760, 130, 5);
        drawParallelogram(g, 990, 760, 140, 5, -5, roadLinesGrey, false);

        // Draw sidewalk
        g.setColor(sideWalkWhite);
        g.fillRect(0, 650, 1200, 65);
        // Draws side walk lines with decreasing slope until it hits middle and then increases slope to give an angled effect
        for (int i = 0; i < 13; i++) {
            drawParallelogram(g, 45 + 90 * i, 715, 3, 50, 30 - 5 * i, sideWalkLinesWhite, false);
        }

        // Draw railings
        g.setColor(railingGrey5);
        g.fillRect(0, 600, 275, 10);
        g.fillRect(60, 600, 10, 57);
        g.fillRect(0, 618, 275, 5);
        g.fillRect(0, 632, 275, 5);
        for (int i = 0; i < 4; i++) {
            g.fillRect(145 + 275 * i, 600, 65, 58);
        }
        // Draws the 4 posts
        for (int i = 0; i < 4; i++) {
            g.setColor(railingGrey1);
            // Draws base of post
            g.fillRect(150 + 275 * i, 645, 50, 15);
            // Draws depth for the post
            drawParallelogram(g, 200 + 275 * i, 660, 5, 15, 5, railingGrey2, true);
            drawParallelogram(g, 150 + 275 * i, 645, 50, 5, 5, railingGrey3, false);
            g.setColor(railingGrey4);
            g.fillRect(154 + 275 * i, 590, 47, 52);

            // Draws railings
            g.setColor(railingGrey5);
            g.fillRect(200 + 275 * i, 600, 275, 10);
            g.fillRect(315 + 275 * i, 600, 10, 57);
            g.fillRect(205 + 275 * i, 618, 275, 5);
            g.fillRect(205 + 275 * i, 632, 275, 5);
        }
        // Draws sidewalk outlines
        g.setColor(sidewalkOutlineGrey);
        g.fillRect(0,660,1200,7);
    }

    // Methods that draws the entire city
    private void drawCity(Graphics g) {
        // Draws mutliple generic buildings
        drawBuilding(g,535,390,75,15,1);
        drawBuilding(g, 470, 305, 160, 35, 1);
        drawBuilding(g, 383, 390, 75, 55, 3);
        drawBuilding(g, 438, 425, 40, 33, 4);
        drawBuilding(g,225,400,60,20,1);
        drawBuilding(g,160,340,120,28,1);

        // Draw the four most important buildings in the cityscape
        drawOrientalPearlTower(g);
        drawWorldFinancialCenter(g);
        drawJinMaoTower(g);
        drawShanghaiTower(g);
    }

    // Draws the oriental pearl tower
    private void drawOrientalPearlTower(Graphics g) {
        // Draws the tower middle section before the anttena
        g.setColor(towerTopDarkerGrey);
        g.fillRect(316,35,7,40);
        // Drws the connection protion between the top sphere and the anttena
        g.setColor(towerBeige);
        g.fillRect(310, 130,20,30);
        // Draw connections btween bottom sphere and top sphere 
        g.setColor(towerBeige);
        g.fillRect(300,190,15,160);
        g.fillRect(325,190,15,160);
        // Draw bottom bases of tower
        drawParallelogram(g, 255, 465, 15, 60, 30, towerBeige, false);
        drawParallelogram(g, 370, 465, 15, 60, -30, towerBeige, false);
        // Draw bottom sphere
        g.setColor(towerPurple1);
        g.fillOval(280,340,80,80);
        // Fill shadow in bottom sphere
        g.setColor(towerGrey);
        g.fillArc(280,360,80,60,180,180);
        // Draw purple shadow in bottom sphere
        g.setColor(towerPurple2);
        g.fillRoundRect(280,375,80,20,10,10);
        // Draw tower top
        g.setColor(towerBeige);
        g.fillRoundRect(300, 415, 15, 52, 10, 10);
        g.fillRoundRect(325, 415, 15, 52, 10, 10);
        // Draw purple spheres between top and bottom sphere
        g.setColor(towerPurple3); 
        for (int i = 0; i < 4; i++) {
            g.fillOval(312,310- 30 * i,15,15);
        }
        // Draw top shere
        g.setColor(towerPurple1);
        g.fillOval(285,150,70,70);
        // Draw top sphere grey shadow
        g.setColor(towerGrey);
        g.fillArc(285,155,70,65,180,180);
        // Draw top sphere purple shadow
        g.setColor(towerPurple2);
        g.fillRoundRect(285,180,68,20,10,10);
        // Draw shadow between two bases 
        g.setColor(towerBottomGrey);
        g.fillRect(312,415,15,50);
        // Draw top attenna base pruple shadow
        g.setColor(towerPurple2);
        g.fillRoundRect(310, 128, 20, 7, 5, 5);
        // Draw top attenna base 
        g.setColor(towerTopGrey);
        g.fillRect(313,90,13,38);
        g.setColor(towerPurple4);
        g.fillOval(308,70,22,22);
        g.setColor(towerPurple4);
        g.fillOval(314,30,10,10);
        // Draw attena
        g.setColor(towerPurple4);
        g.fillRect(317, 0,5,31);
    }

    // Method to draw the world financial center, the building with hole on top
    private void drawWorldFinancialCenter(Graphics g) {
        // Draw left side
        int[] xPoints1 = {595,640,640,595};
        int[] yPoints1 = {140,340,466,466};
        g.setColor(financialCenterBlue1);
        g.fillPolygon(xPoints1,yPoints1,4);
        // Draw right side 
        int[] xPoints2 = {640,685,685,640};
        int[] yPoints2 = {340,140,466,466};
        g.setColor(financialCenterBlue2);
        g.fillPolygon(xPoints2,yPoints2,4);
        // Draw top
        int[] xPoints3 = {595,595,685,685,640};
        int[] yPoints3 = {140,125,120,140,340};
        g.setColor(financialCenterBlue3);
        g.fillPolygon(xPoints3,yPoints3,5);
        // Fill same color as background, draw hole
        int[] xPoints4 = {608,673,658,628};
        int[] yPoints4 = {140,136,180,180};
        g.setColor(financialCenterBlue4);
        g.fillPolygon(xPoints4, yPoints4, 4);
    }

    // Method to draw different types of generic buildings used in the cityscape 
    private void drawBuilding(Graphics g, int x, int y, int height, int width, int version) {
        if (version == 1) {
            // Draw a building with two colors, one lighter blue and one darker blue
            g.setColor(buildingBlue1);
            g.fillRect(x, y, width, height);
            g.setColor(buildingBlue2);
            g.fillRect(x + width, y, width, height);
        } else if (version == 2) {
            // Draw a building with one color, lighter blue
            g.setColor(buildingBlue1);
            g.fillRect(x, y, width, height);
        } else if (version == 3) {
            // Draw a building with one color darker blue
            g.setColor(buildingBlue2);
            g.fillRect(x, y, width, height);
        } else if (version == 4) {
            // Draw a building with one color, really light blue
            g.setColor(buildingBlue3);
            g.fillRect(x, y, width, height);
        }
    }

    // Draws the bushes which are overlayed on top of the buildings
    private void drawBushes(Graphics g) {
        for (int i = 0; i < 20; i++) {
            if (season.equals("winter")) {
                // If the season is winter, bushes are white
                g.setColor(Color.WHITE);
                // Draws bushes at different intervals
                g.fillOval(30 + 60 * i, 440, 45, 30);
                g.fillOval(20 + 60 * i, 450, 20, 15);
                g.fillOval(0 + 60 * i, 450, 20, 20);
                g.fillOval(10 + 60 * i, 450, 15, 15);
                g.fillOval(30 + 60 * i, 445, 40, 40);
                //*This bush is drawn at intervals every 50, which causes different overlap with the ones drawn at 60, 
                // which causes a more random formation, done below also*/
                 g.fillOval(50 + 50 * i, 445, 30, 30); 
            } else {
                // If season is not winter, most bushes are green
                g.setColor(bushGreen2);
                g.fillOval(30 + 60 * i, 440, 45, 30);
                g.fillOval(20 + 60 * i, 450, 20, 15);
                g.setColor(bushGreen1);
                g.fillOval(0 + 60 * i, 450, 20, 20);
                g.fillOval(10 + 60 * i, 450, 15, 15);
                g.fillOval(30 + 60 * i, 445, 40, 40);
                g.setColor(bushGreen3);
                g.fillOval(50 + 50 * i, 445, 30, 30);
                // Draw flowers
                for (int j = 0; j < 3; j++) {
                    drawFlowers(g, 800 + 60 * j, 450);
                }
                for (int k = 0; k < 8; k++) {
                    drawFlowers(g, 100 + 75 * k, 450);
                }
            } 
            // Sprinkle in some orange bushes if the season is fall 
            if (season.equals("fall")) {
                g.setColor(fallBushesOrange); 
                g.fillOval(15 + 60 * i, 440, 30, 35);
            }
        }
        // If the season is fall, draw more bushes that are overlayed on top of the green bushes     
        if (season.equals("fall")) {
            for (int i = 0; i < 15; i ++) {
                g.setColor(fallLeavesOrange2);
                g.fillOval(35 + 100 * i, 450, 30, 20);
                
            }
        }
    }

    // Method that draws a flower at position x,y
    private void drawFlowers(Graphics g, int x, int y) {
        // Draws stem
        g.setColor(flowerStemGreen);
        g.fillRect(x,y,10,20);
        // Draw petals of flower
        g.setColor(flowerPetals);
        g.fillOval(x+7,y-10,8,8);
        g.fillOval(x-7,y-10,8,8);
        g.fillOval(x,y-15,8,8);
        g.fillOval(x,y-4,8,8);
        g.setColor(flowerMiddleOrange);
        g.fillOval(x-1,y-10,10,10);

    }

    // Method that draws the two trees on the left and right of the cityscape
    private void drawTrees(Graphics g) {
        // If the season is not winter, draw the leaves/blossoms of the tree
        if (!season.equals("winter")) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (season.equals("spring")) {
                        drawBlossom(g, 30 + 60 * i, 320 + 30 * j, cherryBlossomPink1);
                        drawBlossom(g, 15 + 35 * j - 20 * i, 330 + 35 * i, cherryBlossomPink2);
                        drawBlossom(g, 50 + 35 * j - 20 * i, 370 + 35 * i, cherryBlossomPink2);
                        drawBlossom(g, 75 + 35 * j - 20 * i, 390 + 35 * i, cherryBlossomPink1);
                    } else if (season.equals("fall")) {
                        drawBlossom(g, 30 + 60 * i, 320 + 30 * j, fallLeavesOrange1);
                        drawBlossom(g, 15 + 35 * j - 20 * i, 330 + 35 * i, fallLeavesOrange2);
                        drawBlossom(g, 50 + 35 * j - 20 * i, 370 + 35 * i, fallLeavesOrange2);
                        drawBlossom(g, 75 + 35 * j - 20 * i, 390 + 35 * i, fallLeavesOrange1);
                    }

                }
            }
        }
        // Draw branches of the tree
        g.setColor(branchBrown);
        int[] xMain1 = { 0, 0, 135, 150, 140, 20 };
        int[] yMain1 = { 460, 495, 365, 355, 345, 455 };
        g.fillPolygon(xMain1, yMain1, 6);
        int[] xBranch1 = { 35, 48, 30, 22 };
        int[] yBranch1 = { 445, 435, 375, 370 };
        g.fillPolygon(xBranch1, yBranch1, 4);
        int[] xBranch2 = { 70, 82, 95, 88 };
        int[] yBranch2 = { 415, 408, 355, 350 };
        g.fillPolygon(xBranch2, yBranch2, 4);
        int[] xBranch3 = { 95, 105, 155, 160 };
        int[] yBranch3 = { 395, 385, 355, 365 };
        g.fillPolygon(xBranch3, yBranch3, 4);
        // Draws the one overlayed leaf/blossom if not in winter
        if (!season.equals("winter")) {
            if (season.equals("spring")) {
                drawBlossom(g, 120, 330, cherryBlossomPink2);
            } else if (season.equals("fall")) {
                drawBlossom(g, 120, 330, fallLeavesOrange1);
            }
        } 
        // This is a reflection over the line x=600, so apply the transformation x = 1200 - x to draw the second tree
        if (!season.equals("winter")) {
            for (int i = 0; i < 3; i ++) {
                for (int j = 0; j < 3; j++) {
                    if (season.equals("spring")) {
                        drawBlossom(g,1200-(30+60*i), 320 + 30 * j, cherryBlossomPink1);
                        drawBlossom(g,1200-(15 + 35 * j - 20 * i), 330 + 35* i, cherryBlossomPink2);
                        drawBlossom(g,1200-(50 + 35 * j - 20 * i), 370 + 35* i, cherryBlossomPink2);
                        drawBlossom(g,1200-(75 + 35 * j - 20 * i), 390 + 35* i, cherryBlossomPink1);
                    } else if (season.equals("fall")) {
                        drawBlossom(g,1200-(30+60*i), 320 + 30 * j, fallLeavesOrange1);
                        drawBlossom(g,1200-(15 + 35 * j - 20 * i), 330 + 35* i, fallLeavesOrange2);
                        drawBlossom(g,1200-(50 + 35 * j - 20 * i), 370 + 35* i, fallLeavesOrange2);
                        drawBlossom(g,1200-(75 + 35 * j - 20 * i), 390 + 35* i, fallLeavesOrange1);
                    }
                }
            } 

        }
        g.setColor(branchBrown);
        int[] xMain2 = { 1200, 1200, 1065, 1050, 1060, 1180 };
        int[] yMain2 = { 460, 495, 365, 355, 345, 455 };
        g.fillPolygon(xMain2, yMain2, 6);

        int[] xBranch4 = { 1165, 1152, 1170, 1178 };
        int[] yBranch4 = { 445, 435, 375, 370 };
        g.fillPolygon(xBranch4, yBranch4, 4);

        int[] xBranch5 = { 1130, 1118, 1105, 1112 };
        int[] yBranch5 = { 415, 408, 355, 350 };
        g.fillPolygon(xBranch5, yBranch5, 4);

        int[] xBranch6 = { 1105, 1095, 1045, 1040 };
        int[] yBranch6 = { 395, 385, 355, 365 };
        g.fillPolygon(xBranch6, yBranch6, 4);
        if (!season.equals("winter")) {
            if (season.equals("spring")) {
                drawBlossom(g, 1070, 330, cherryBlossomPink2);
            } else if (season.equals("fall")) {
                drawBlossom(g, 1070, 330, fallLeavesOrange1);
            }
        }
       
    }

    // Draws a cherry blossom in the spring at position x,y with a specified color
    private void drawBlossom(Graphics g, int x, int y, Color color) {
        g.setColor(color);
        g.fillOval(x, y, 25, 25);
        g.fillOval(x + 15, y + 5, 25, 25);
        g.fillOval(x + 8, y + 15, 25, 25);
        g.fillOval(x - 7, y + 10, 25, 25);
    }

    // Method to draw a gradient specifying starting color and ending color 
    private void drawGradient(Graphics g, Color startColor, Color endColor, int height) {
        // Takes difference of each r,g,b value from start and end
        int redDiff = endColor.getRed() - startColor.getRed();
        int blueDiff = endColor.getBlue() - startColor.getBlue();
        int greenDiff = endColor.getGreen() - startColor.getGreen();
        // Loops every 1 unit of y from 0 to height 
        for (int i = 0; i < height; i++) {
            // As y increases, color should also scale, so divide i/height (this scalar should always be <=1)
            double ratio = (double) i / height;
            int newRed = (int) (startColor.getRed() + ratio * redDiff);
            int newBlue = (int) (startColor.getBlue() + ratio * blueDiff);
            int newGreen = (int) (startColor.getGreen() + ratio * greenDiff);
            g.setColor(new Color(newRed, newGreen, newBlue));
            // Draw the rectangle with the color with height 1
            g.fillRect(0, height - i, 1200, 1);
        }
    }

    // Method that draws a bird at position x,y
    private void drawBird(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawArc(x, y, 20, 12, 0, 180);
        g.drawArc(x + 18, y, 20, 12, 0, 180);
    }

    // Method that draws a fish a position x,y
    private void drawFish(Graphics g, int x, int y) {
        Color fishOrange = new Color(255, 170, 80);
        // body
        g.setColor(fishOrange);
        g.fillOval(x, y, 40, 20);
        // tail
        int[] xTail = { x + 35, x + 50, x + 50 };
        int[] yTail = { y + 10, y, y + 20 };
        g.fillPolygon(xTail, yTail, 3);
        // eye
        g.setColor(Color.BLACK);
        g.fillOval(x + 8, y + 6, 4, 4);
    }

    // Method that draws the jin Mao Tower
    private void drawJinMaoTower(Graphics g) {
        // Draws top part of jinMao tower
        g.setColor(jinMaoBlue1);
        g.fillRect(740, 410, 80, 80);
        g.setColor(jinMaoBlue1);
        g.fillRect(760,150,40,20);
        g.fillRect(770,140,20,10);
        g.fillRect(775,115,10,25);
        g.setColor(jinMaoBlue2);
        g.fillRect(777,90,5,25);
        // This loop makes the stacking effect of the tower by increasing x and decreasing the width of the rectangle drawn
        for (int i = 0; i < 8; i++) {
            g.setColor(jinMaoBlue1);
            g.fillRect(740+ 2*i, 410 - 35 * i, 80 - 4 *i, 40);
            g.setColor(Color.WHITE);
            g.fillRect(750+2*i, 410 - 35 *i, 2, 40);
            g.setColor(jinMaoBlue2);
            g.fillRect(752+2*i, 410 - 35 *i, 15, 40);
            g.setColor(new Color(156, 195, 238));
            g.fillRect(775, 410 - 35 *i, 5, 40);
            g.setColor(jinMaoBlue3);
            g.fillRect(780+i,410-35 * i, 40 - 4 * i, 40);
        }
    }

    // Method that draws the shanghai tower
    private void drawShanghaiTower(Graphics g) {
        g.setColor(towerBlue);
        // Draws main body of the tower
        int[] xBody = { 895, 935, 960, 860 };
        int[] yBody = { 55, 55, 465, 465 };
        g.fillPolygon(xBody, yBody, 4);
        // Draws the side shading of tower
        g.fillOval(895, 40, 40, 30);
        g.setColor(towerDarkBlue);
        int[] xSide = { 925, 935, 960, 942 };
        int[] ySide = { 55, 55, 465, 465 };
        g.fillPolygon(xSide, ySide, 4);
        // Draws first band of the tower on the top
        g.setColor(towerLightBlue);
        int[] xBand1 = { 880, 940, 943, 877 };
        int[] yBand1 = { 145, 150, 157, 152 };
        g.fillPolygon(xBand1, yBand1, 4);
        // Draws second band of tower
        int[] xBand2 = { 872, 946, 959, 869 };
        int[] yBand2 = { 245, 252, 259, 252 };
        g.fillPolygon(xBand2, yBand2, 4);
        // Draws third band of tower
        int[] xBand3 = { 866, 952, 955, 863 };
        int[] yBand3 = { 350, 360, 367, 357 };
        g.fillPolygon(xBand3, yBand3, 4);
        // Draws the stripe coming down from top of the tower
        g.setColor(towerStripe);
        int[] xStripe1 = { 900, 905, 910, 905 };
        int[] yStripe1 = { 55, 55, 180, 180 };
        g.fillPolygon(xStripe1, yStripe1, 4);
        int[] xStripe2 = { 905, 910, 925, 920 };
        int[] yStripe2 = { 175, 175, 310, 310 };
        g.fillPolygon(xStripe2, yStripe2, 4);
        int[] xStripe3 = { 920, 925, 945, 940 };
        int[] yStripe3 = { 305, 305, 465, 465 };
        g.fillPolygon(xStripe3, yStripe3, 4);
    }
        

    /**
     * Helper method that draws a grid every 15 units in the x direction and 
     * evry 10 units in the y direction to help with drawing */ 
    private void drawGrid(Graphics g) {
        for (int i = 0; i <= 80; i ++) {
            g.setColor(Color.BLACK);
            g.drawLine(0,0 + 10 * i,1200,0 + 10 * i);
            g.drawString(String.valueOf(10 * i), 20, 10 * i);
            g.drawLine(i * 15,0,i * 15,800);
            g.drawString(String.valueOf(15 * i), 15 * i, 10); 
        }
    }

    // Helper method that makes drawing a paralleogram easier
    private void drawParallelogram(Graphics g, int x1, int y1, int width, int height, int slope, Color color, boolean flipped) {
        g.setColor(color);
        // Flipped decides whether to draw base of parallegram parallel to x axis or y aixs
        if (flipped) {
            int[] xPoints = { x1, x1 + width, x1 + width, x1 };
            int[] yPoints = { y1, y1-slope, y1 - slope - height, y1 - height };
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        } else {
            int [] xPoints = { x1, x1 + width, x1 + width + slope, x1 + slope };
            int [] yPoints = { y1, y1, y1 - height, y1 - height };
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        }
    }
}
