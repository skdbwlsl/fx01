package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception { //stage :기본틀
		Label lb = new Label("Hello World!!"); //fx로 떠있다면 무조건 fx를 써야한다
		lb.setFont(new Font(20));
		
		//장판올리기 scene
		Scene scene = new Scene(lb, 200,100); //200,100가로 세로 사이즈
		
		
		arg0.setScene(scene);
		//타이틀설정
		arg0.setTitle("연습중");
		//기본틀인 무대만들기
		arg0.show(); //기본틀을 보여줘라 (컨테이너랑 비슷하다, 뭔가를 만들기위한 장판이라고 보면됌)
		
	}

	public static void main(String[] args) {
		//이걸 해야지만 실행됨
		launch(args);
		

	}



}
