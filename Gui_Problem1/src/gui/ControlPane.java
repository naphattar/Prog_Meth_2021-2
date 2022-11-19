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
import logic.GameLogic;

public class ControlPane extends VBox{
	
	private Text gameText;
	private Button newGameButton;
	private TicTacToePane ticTacToePane;
	
	public ControlPane(TicTacToePane ticTacToePane) {
		super();
		this.ticTacToePane = ticTacToePane;
		//To be implemented
		this.setAlignment(Pos.CENTER);
		this.setPrefWidth(300);
		this.setSpacing(20);
		initializeGameText();
		initializeNewGameButton();
		//to be added
		this.getChildren().addAll(this.gameText,this.newGameButton);
		
		
	}
	
	private void initializeGameText() {
		//To be implemented
		Text text = new Text("O Turn");
		text.setFont(new Font(35));
		this.gameText = text;
		
	}
	
	public void updateGameText(String text) {
		//To be implemented
		this.gameText.setText(text);
		
	}
	
	private void initializeNewGameButton() {
		//To be implemented
		Button newgameButton = new Button("New Game");
	    newgameButton.setPrefWidth(100);
	    newgameButton.setOnAction(new EventHandler <ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				newGameButtonHandler();
			}
	    	
	    });
	    this.newGameButton = newgameButton;
		
	}
	
	private void newGameButtonHandler() {
		//To be implemented
		GameLogic.getInstance().newGame();
		this.updateGameText("O Turn");
		TicTacToePane ttp = this.ticTacToePane;
		for(TicTacToeCell ttc : ttp.getAllCells()) {
			ttc.initializeCellColor();
		}
		
	}
}
