package bento.delivery.program.view;

import java.awt.*;
import javax.swing.*;

public class NewPeopleDialog extends JDialog {
	// :: 새로운 사람을 만드는 다이얼로그
	// 새로운 이름과 직위를 입력
	// 추가를 누르면 데이터베이스에 추가
	private JPanel panelCenter, panelSounth;
	private JTextField txtName;
	private JComboBox listPosion;

	public NewPeopleDialog() {
		this.setTitle("사원 추가");
		this.setSize(300, 150);
		
		this.getContentPane().add(getPanelCenter(),BorderLayout.NORTH);
		this.getContentPane().add(getPanelSouth(),BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setModal(true);		
	}	
	
	public JPanel getPanelSouth() {
		if (panelSounth == null) {			
			panelSounth = new JPanel();
			panelSounth.add(new JButton("추가"));
			panelSounth.add(new JButton("취소"));
		}
		return panelSounth;
	}
	
	public JPanel getPanelCenter() {
		if (panelCenter == null) {			
			panelCenter = new JPanel();
			panelCenter.setLayout(new GridLayout(2,2));
			panelCenter.add(new JLabel("이름"));
			panelCenter.add(getPeopleName());
			panelCenter.add(new JLabel("직위"));
			panelCenter.add(getPeoplePosition());
		}
		return panelCenter;
	
	}	
	
	public JTextField getPeopleName() {
		if(txtName==null){
			txtName = new JTextField();
		}
		return txtName;
	}

	public  JComboBox getPeoplePosition() {
		if(listPosion==null){
			String[] arrPosition = {
				"부장","차장","과장","대리","주임","사원"
			};
			listPosion = new JComboBox(arrPosition);			
		}		
		return listPosion;
	}

}
