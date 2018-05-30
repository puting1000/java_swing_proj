package bento.delivery.program;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.*;

public class ModifyPeopleDialog extends JDialog{
	
	private JPanel panelCenter, panelSounth, panelRadio;
	private JTextField txtName;
	private JComboBox listPosion;
	private ButtonGroup stateNow;
	private JRadioButton stateIn, stateOut;
	
	public ModifyPeopleDialog() {
		this.setTitle("��� �߰�");
		this.setSize(300, 200);
		
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
			panelCenter.setLayout(new GridLayout(3,2));
			panelCenter.add(new JLabel("�̸�"));
			panelCenter.add(getPeopleName());
			panelCenter.add(new JLabel("����"));
			panelCenter.add(getPeoplePosition());
			panelCenter.add(new JLabel("����"));
			panelCenter.add(getPeopleState());
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
	
	public JPanel getPeopleState(){
		if(panelRadio==null){
			panelRadio = new JPanel();
			panelRadio.setLayout(new GridLayout(1, 2));
			panelRadio.add(getStateIn());
			panelRadio.add(getStateOut());
			
			ButtonGroup stateNow = new ButtonGroup();
			stateNow.add(getStateIn());
			stateNow.add(getStateOut());			
		};
		return panelRadio;
	}
	
	public JRadioButton getStateIn(){
		if(stateIn==null){
			stateIn = new JRadioButton();
			stateIn.add(new JRadioButton("�缮��"));	
			stateIn.setSelected(true);
		};
		return stateIn;
	}
	
	public JRadioButton getStateOut(){
		if(stateOut==null){
			stateOut = new JRadioButton();
			stateOut.add(new JRadioButton("������"));		
		};
		return stateOut;
	}
	
	
}
