package bento.delivery.program.view;

import java.awt.*;
import javax.swing.*;

public class NewPeopleDialog extends JDialog {
	// :: ���ο� ����� ����� ���̾�α�
	// ���ο� �̸��� ������ �Է�
	// �߰��� ������ �����ͺ��̽��� �߰�
	private JPanel panelCenter, panelSounth;
	private JTextField txtName;
	private JComboBox listPosion;

	public NewPeopleDialog() {
		this.setTitle("��� �߰�");
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
			panelSounth.add(new JButton("�߰�"));
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
	
	public JTextField getPeopleName() {
		if(txtName==null){
			txtName = new JTextField();
		}
		return txtName;
	}

	public  JComboBox getPeoplePosition() {
		if(listPosion==null){
			String[] arrPosition = {
				"����","����","����","�븮","����","���"
			};
			listPosion = new JComboBox(arrPosition);			
		}		
		return listPosion;
	}

}
