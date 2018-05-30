package bento.delivery.program;

import java.awt.*;
import javax.swing.*;

public class DeletePeopleDialog extends JDialog {
	private JPanel panelCenter, panelSounth;
	private JLabel labelName, labelPosion;

	public DeletePeopleDialog() {
		this.setTitle("��� ����");
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
			panelSounth.add(new JButton("����"));
			panelSounth.add(new JButton("���"));
		}
		return panelSounth;
	}
	
	public JPanel getPanelCenter() {
		if (panelCenter == null) {			
			panelCenter = new JPanel();
			panelCenter.setLayout(new GridLayout(2,2));
			panelCenter.add(new JLabel("�̸�"));
			panelCenter.add(getPeopleName());
			panelCenter.add(new JLabel("����"));
			panelCenter.add(getPeoplePosition());
		}
		return panelCenter;
	
	}
	
	
	public JLabel getPeopleName() {
		if(labelName==null){
			labelName = new JLabel("ȫ�浿");
		}
		return labelName;
	}

	public  JLabel getPeoplePosition() {
		if(labelPosion==null){			
			labelPosion = new JLabel("���");
			
		}		
		return labelPosion;
	}
}
