package gui;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller implements Initializable {
	
	
	@FXML Canvas canvas;

	ArrayList<ArrayList<Integer>> board;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		board = new ArrayList<ArrayList<Integer>>();
		for(int i =0;i<9;i++) {
			board.add(new ArrayList<Integer>());
			for(int j =0 ;j<9;j++) {
				board.get(i).add(0);
			}
			//System.out.println();
		}
		//set graphiccontext
		GraphicsContext context = canvas.getGraphicsContext2D();
		drawOnCanvas(context);
	}
	
	public void drawOnCanvas(GraphicsContext context) {
		context.clearRect(0, 0, 450, 450);
		for(int row = 0; row<9; row++) {
			for(int col = 0; col<9; col++) {
				// finds the y position of the cell, by multiplying the row number by 50, which is the height of a row 					// in pixels
				// then adds 2, to add some offset
				int position_y = row * 50 + 2;
				
				// finds the x position of the cell, by multiplying the column number by 50, which is the width of a 					// column in pixels
				// then add 2, to add some offset
				int position_x = col * 50 + 2;
				
				// defines the width of the square as 46 instead of 50, to account for the 4px total of blank space 					// caused by the offset
				// as we are drawing squares, the height is going to be the same
				int width = 46;
				
				// set the fill color to white (you could set it to whatever you want)
				context.setFill(Color.BLUE);
				
				// draw a rounded rectangle with the calculated position and width. The last two arguments specify the 					// rounded corner arcs width and height.
				// Play around with those if you want.
				context.fillRoundRect(position_x, position_y, width, width, 10, 10);
			}
		}
		
	}
	

}
