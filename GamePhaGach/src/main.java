import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
	
		JFrame obj = new JFrame();
		GamePlay gamePlay = new GamePlay();
		obj.setBounds(10, 10, 700, 600);//trục x , y , width, height
		obj.setTitle("Pha Gach");// Tieu De game
		obj.setResizable(false);//Đặt JFrame có được thay đổi kích thước hay không
		obj.setVisible(true);//Đặt JFrame ẩn/hiện
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Đặt hành động mặc định sẽ xảy ra khi người dùng “close” Frame
		obj.add(gamePlay);
	}

}
