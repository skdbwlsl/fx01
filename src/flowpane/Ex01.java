package flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	

	@Override
	public void start(Stage arg0) throws Exception {
		//flowpane :여러개를 한번에 묶어주는 용도, 컨테이너를 의미, 순차적으로 나열되는 방식
		FlowPane flowPane = new FlowPane();
		//버튼만들기
		/*
		Button btn01 = new Button("버튼01");
		Button btn02 = new Button("버튼02");
		Button btn03 = new Button("버튼03");
		
		//get을 써서 add를 쓴다
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);
		flowPane.getChildren().add(btn03);
		*/
		
		
		//반복문으로 표현하기
		for(int i =1;i<=3;i++) {
			flowPane.getChildren().add(new Button("버튼0"+i));
		}
		
		Scene sc = new Scene(flowPane, 200,100);
		
		arg0.setScene(sc);
	
		arg0.show();
	}
		public static void main(String[] args) {
			launch(args);
			/*
			그냥 여기까지만 입력하고 실행하면 오류가 난다 메인작성시 무조건 프로퍼티스에 가서 
			argument에 가서 문구작성으로 잡아줘야오류가 안남
			*/
		}
	}




