import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;

/** 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public Picture() {
    /*
     * not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor
     */
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture
   * 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName) {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * 
   * @param height the height of the desired picture
   * @param width  the width of the desired picture
   */
  public Picture(int height, int width) {
    // let the parent class handle this width and height
    super(width, height);
  }

  /**
   * Constructor that takes a picture and creates a
   * copy of that picture
   * 
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture) {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * 
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image) {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * 
   * @return a string with information about the picture such as fileName,
   *         height and width.
   */
  public String toString() {
    String output = "Picture, filename " + getFileName() +
        " height " + getHeight()
        + " width " + getWidth();
    return output;

  }

  /** Method to set the blue to 0 */
  public void zeroBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setBlue(0);
      }
    }
  }

  /** Method to keep only the blue in an image */
  public void keepOnlyBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
  }

  /** Method to negate all the colors */
  public void negate() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }

  /** Method to turn the picture into grayscale */
  public void grayscale() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
        pixelObj.setRed(average);
        pixelObj.setGreen(average);
        pixelObj.setBlue(average);
      }
    }
  }

  /** Method to make the fish in water.jpg easier to see */
  public void fixUnderwater() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(pixelObj.getRed() * 5);
        pixelObj.setGreen(pixelObj.getGreen() - 50);
      }
    }
  }

  /**
   * Method that mirrors the picture around a
   * vertical mirror in the center of the picture
   * from left to right
   */
  public void mirrorVertical() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /**
   * Method to mirror a picture around a mirror placed vertically from right to
   * left
   */
  public void mirrorVerticalRightToLeft() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }

  /**
   * Method to mirror a picture around a mirror placed horizontally at the middle
   * of the height of the picture
   */
  public void mirrorHorizontal() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }

  /**
   * Method to mirror a picture around a mirror placed horizontally from bottom to
   * top
   */
  public void mirrorHorizontalBotToTop() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    }
  }

  /**
   * Method to mirror just a square part of a picture from bottom left to top
   * right around a mirror placed on a diagonal line
   */
  public void mirrorDiagonal() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    for (int row = 0; row < pixels[0].length && row < pixels.length; row++)
    {
      for (int col = row + 1; col < pixels[0].length
              && col < pixels.length; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[col][row];
        topPixel.setColor(botPixel.getColor());
      }
    }
  }

  /** Mirror just part of a picture of a temple */
  public void mirrorTemple() {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = 27; row < 97; row++) {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++) {
        count++;
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }

  /** Method to mirror the arms of snowman.jpg to make a snowman with 4 arms */
  public void mirrorArms() {
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = 158; row < mirrorPoint; row++) {
      // loop from 13 to just before the mirror point
      for (int col = 103; col < 170; col++) {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }

    mirrorPoint = 200;
    // loop through the rows
    for (int row = 170; row < mirrorPoint; row++) {
      // loop from 13 to just before the mirror point
      for (int col = 240; col < 295; col++) {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }

  }

  /**
   * Method to mirror the seagull (“seagull.jpg”) to the right so that there are
   * two seagulls on the beach near each other
   */
  public void mirrorGull() {
    int mirrorPoint = 345;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = 235; row < 323; row++) {
      // loop from 0 to just before the mirror point
      for (int col = 238; col < mirrorPoint; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint - 300];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /**
   * copy from the passed fromPic to the
   * specified startRow and startCol in the
   * current picture
   * 
   * @param fromPic  the picture to copy from
   * @param startRow the start row to copy to
   * @param startCol the start col to copy to
   */
  public void copy(Picture fromPic,
      int startRow, int startCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length &&
        toRow < toPixels.length; fromRow++, toRow++) {
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length &&
          toCol < toPixels[0].length; fromCol++, toCol++) {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  public void copyPartOfPicture(Picture fromPic,
      int startRow, int startCol, int endRow, int endCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++) {
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < endCol; fromCol++, toCol++) {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  /** Method to create a collage of several pictures */
  public void createCollage() {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    // Normal copy
    // this.copy(flower1, 0, 0);
    // this.copy(flower2, 100, 0);
    // this.copy(flower1, 200, 0);
    this.copyPartOfPicture(flower1, 0, 0, 75, 75);
    // Picture flowerNoBlue = new Picture(flower2);
    // flowerNoBlue.zeroBlue();
    // Normal copy
    // this.copy(flowerNoBlue, 300, 0);
    // this.copy(flower1, 400, 0);
    // this.copy(flower2, 500, 0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }

  public void myCollage() {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flowerNoBlue = new Picture("flower1.jpg");
    flowerNoBlue.zeroBlue();
    Picture flowerGrayScale = new Picture("flower1.jpg");
    flowerGrayScale.grayscale();
    Picture flowerNegate = new Picture("flower1.jpg");
    flowerNegate.negate();
    this.copy(flower1, 0, 0);
    this.copy(flowerNoBlue, 100, 0);
    this.copy(flowerGrayScale, 200, 0);
    this.copy(flowerNegate, 300, 0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }

  /**
   * Method to show large changes in color
   * 
   * @param edgeDist the distance for finding edges
   */
  public void edgeDetection(int edgeDist) {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color bottomColor = null;
    for (int row = 0; row < pixels.length-1; row++) {
      for (int col = 0; col < pixels[0].length - 1; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col + 1];
        rightColor = rightPixel.getColor();
        topPixel = pixels[row][col];
        bottomPixel = pixels[row+1][col];
        bottomColor = bottomPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist || topPixel.colorDistance(bottomColor) > edgeDist) {
          leftPixel.setColor(Color.BLACK);
        }
        else {
          leftPixel.setColor(Color.WHITE);
        }
      }
    }
  }

  public void edgeDetection2(int edgeDist) {
    Pixel TopLeftPixel = null;
    Pixel TopMiddlePixel = null;
    Pixel TopRightPixel = null;
    Pixel MiddleLeftPixel = null;
    Pixel MiddleRightPixel = null;
    Pixel BottomLeftPixel = null;
    Pixel BottomMiddlePixel = null;
    Pixel BottomRightPixel = null;
    Pixel MiddlePixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color TopLeftColor = null;
    Color TopMiddleColor = null;
    Color TopRightColor = null;
    Color MiddleLeftColor = null;
    Color MiddleRightColor = null;
    Color BottomLeftColor = null;
    Color BottomMiddleColor = null;
    Color BottomRightColor = null;
    for (int row = 0; row < pixels.length-1; row++) {
      for (int col = 0; col < pixels[0].length - 1; col++) {
        if (row == 0 || col == 0 || row == 1 || col == 1 || row == pixels.length-2 || col == pixels[0].length-2) {
          MiddlePixel = pixels[row][col];
          MiddleRightPixel = pixels[row][col + 1];
          MiddleRightColor = MiddleRightPixel.getColor();
          BottomMiddlePixel = pixels[row+1][col];
          BottomMiddleColor = BottomMiddlePixel.getColor();
          if (MiddlePixel.colorDistance(MiddleRightColor) > edgeDist || MiddlePixel.colorDistance(BottomMiddleColor) > edgeDist) {
            MiddlePixel.setColor(Color.BLACK);
          }
          else {
            MiddlePixel.setColor(Color.WHITE);
        }
        } else {
          MiddlePixel = pixels[row][col];
          MiddleRightPixel = pixels[row][col + 1];
          MiddleRightColor = MiddleRightPixel.getColor();
          MiddleLeftPixel = pixels[row][col - 1];
          MiddleLeftColor = MiddleLeftPixel.getColor();

          TopLeftPixel = pixels[row - 1][col - 1];
          TopLeftColor = TopLeftPixel.getColor();
          TopMiddlePixel = pixels[row - 1][col];
          TopMiddleColor = TopMiddlePixel.getColor();
          TopRightPixel = pixels[row - 1][col + 1];
          TopRightColor = TopRightPixel.getColor();

          BottomLeftPixel = pixels[row + 1][col - 1];
          BottomLeftColor = BottomLeftPixel.getColor();
          BottomMiddlePixel = pixels[row + 1][col];
          BottomMiddleColor = BottomMiddlePixel.getColor();
          BottomRightPixel = pixels[row + 1][col + 1];
          BottomRightColor = BottomRightPixel.getColor();
          if (MiddlePixel.colorDistance(MiddleRightColor) > edgeDist && MiddlePixel.colorDistance(MiddleLeftColor) > edgeDist && MiddlePixel.colorDistance(TopLeftColor) > edgeDist && MiddlePixel.colorDistance(TopMiddleColor) > edgeDist && MiddlePixel.colorDistance(TopRightColor) > edgeDist && MiddlePixel.colorDistance(BottomLeftColor) > edgeDist && MiddlePixel.colorDistance(BottomMiddleColor) > edgeDist && MiddlePixel.colorDistance(BottomRightColor) > edgeDist) {
            MiddlePixel.setColor(Color.BLACK);
          }
          else {
            MiddlePixel.setColor(Color.WHITE);
          }
        }
      }
    }
  }

  /*
   * Main method for testing - each class in Java can have a main
   * method
   */
  public static void main(String[] args) {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

}
