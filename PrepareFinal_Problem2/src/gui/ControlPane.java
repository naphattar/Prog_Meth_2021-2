package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

//You might need to do something to the following line
public class ControlPane extends VBox{
	
	private Text drawnNumberText;
	private Text drawCountText;
	private Text bingoText;
	private Button drawButton;
	private Button newRoundButton;
	private NumberGrid numberGrid;

	
	public ControlPane(NumberGrid numberGrid) {
		// TODO
		this.setNumberGrid(numberGrid);
		this.setAlignment(Pos.CENTER);
		this.setPrefWidth(300);
		this.setSpacing(20);
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY,BorderStrokeStyle.SOLID ,CornerRadii.EMPTY,BorderWidths.DEFAULT)));
		Text drawnNumberText = new Text();
		drawnNumberText.setFont(new Font(20));
		this.setDrawnNumberText(drawnNumberText);
		Text drawnCountText = new Text();
		this.setDrawCountText(drawnCountText);
		this.initializeBingoText();
		this.initializeDrawButton();
		this.initializeNewRoundButton();
		this.getChildren().addAll(this.getDrawnNumberText(),this.getDrawButton(),this.getNewRoundButton(),this.getBingoText(),this.getDrawCountText());
		BingoUtil.setTextsBeginning(drawnNumberText, drawnCountText);
	}
	
	private void initializeBingoText() {
		// TODO
		Text bingoText = new Text("Bingo!!");
		bingoText.setFont(new Font(40));
		bingoText.setVisible(false);
		this.setBingoText(bingoText);

	}

	private void initializeDrawButton() {
		// TODO
		Button drawButton = new Button("Draw a number");
		drawButton.setPrefWidth(100);
		drawButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				drawButtonHandler();
				
			}
			
		});
		this.setDrawButton(drawButton);

	}

	private void initializeNewRoundButton() {
		// TODO
		Button newRoundText = new Button("New Round");
		newRoundText.setPrefWidth(100);
		newRoundText.setVisible(true);
		newRoundText.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				newRoundButtonHandler();
			}
			
			
		});
		this.setNewRoundButton(newRoundText);
	}
	
	private void drawButtonHandler() {
		// TODO
		int newdrawn =  BingoUtil.drawNumber();
		boolean checkbingo = this.getNumberGrid().highlightNumber(newdrawn);
		if(checkbingo) {
			this.getBingoText().setVisible(true);
			this.getDrawButton().setDisable(true);
			this.getNewRoundButton().setDisable(false);
			
		}
		BingoUtil.updateTextsAfterDrawn(newdrawn, this.getDrawnNumberText(), this.getDrawCountText());
		
		
	}
	
	private void newRoundButtonHandler() {
		// TODO
		BingoUtil.assignRandomNumbers(this.getNumberGrid().getNumberSquares());
		this.getBingoText().setVisible(false);
		this.getDrawButton().setDisable(false);
		this.getNewRoundButton().setDisable(true);
		BingoUtil.setTextsBeginning(this.getDrawnNumberText(), this.getDrawCountText());
	}

	public Text getDrawnNumberText() {
		return drawnNumberText;
	}

	public void setDrawnNumberText(Text drawnNumberText) {
		this.drawnNumberText = drawnNumberText;
	}

	public Text getDrawCountText() {
		return drawCountText;
	}

	public void setDrawCountText(Text drawCountText) {
		this.drawCountText = drawCountText;
	}

	public Text getBingoText() {
		return bingoText;
	}

	public void setBingoText(Text bingoText) {
		this.bingoText = bingoText;
	}

	public Button getDrawButton() {
		return drawButton;
	}

	public void setDrawButton(Button drawButton) {
		this.drawButton = drawButton;
	}

	public Button getNewRoundButton() {
		return newRoundButton;
	}

	public void setNewRoundButton(Button newRoundButton) {
		this.newRoundButton = newRoundButton;
	}

	public NumberGrid getNumberGrid() {
		return numberGrid;
	}

	public void setNumberGrid(NumberGrid numberGrid) {
		this.numberGrid = numberGrid;
	}
	
	

}
