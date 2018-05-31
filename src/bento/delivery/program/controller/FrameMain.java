package bento.delivery.program.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bento.delivery.program.view.DeletePeopleDialog;
import bento.delivery.program.view.ModifyPeopleDialog;
import bento.delivery.program.view.NewPeopleDialog;

public class FrameMain extends JFrame {
	private JMenuBar jMenuBar;
	private JMenu menuFile, menuEdit, menuView, menuHelp;
	private JMenuItem menuItemNewFile, menuItemOpen, menuItemSave, menuItemExit;
	private JMenuItem menuItemNewOrder, menuItemModifyOrder,menuItemDeleteOrder;
	private JMenuItem menuItemNewPeople, menuItemModifyPeople,menuItemDeletePeople;
	private JMenuItem menuItemPeopleView, menuItemOrderView, menuItemPeopleSearch, menuItemOrderSearch;

	public FrameMain() {
		this.setTitle("BentoAtsume");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getJMenuBar());
		this.setSize(1000, 500);
	}

	public JMenuBar getJMenuBar() {
		if (jMenuBar == null) {
			jMenuBar = new JMenuBar();
			jMenuBar.add(getMenuFile());
			jMenuBar.add(getMenuEdit());
			jMenuBar.add(getMenuView());
			jMenuBar.add(getMenuHelp());
		}
		return jMenuBar;
	}

	
	private JMenu getMenuFile() {
		if (menuFile == null) {
			menuFile = new JMenu("����");
			menuFile.add(getMenuItemNewFile());
			menuFile.add(getMenuItemOpen());
			menuFile.add(getMenuItemSave());
			menuFile.add(getMenuItemExit());
		}
		return menuFile;
	}	

	private JMenuItem getMenuItemNewFile() {
		if (menuItemNewFile == null) {
			menuItemNewFile = new JMenuItem("�� ����");
		}
		return menuItemNewFile;
	}	

	private JMenuItem getMenuItemOpen() {
		if (menuItemOpen == null) {
			menuItemOpen = new JMenuItem("���� ����");
		}
		return menuItemOpen;
	}

	private JMenuItem getMenuItemSave() {
		if (menuItemSave == null) {
			menuItemSave = new JMenuItem("���� ����");
		}
		return menuItemSave;
	}

	private JMenuItem getMenuItemExit() {
		if (menuItemExit == null) {
			menuItemExit = new JMenuItem("����");
		}
		return menuItemExit;
	}		

	private JMenu getMenuEdit() {
		if (menuEdit == null) {
			menuEdit = new JMenu("����");
			menuEdit.add(getMenuItemNewOrder());
			menuEdit.add(getMenuItemModifyOrder());
			menuEdit.add(getMenuItemDeleteOrder());
			menuEdit.add(getMenuItemNewPeople());
			menuEdit.add(getMenuItemModifyPeople());
			menuEdit.add(getMenuItemDeletePeople());
		}
		return menuEdit;
	}	

	private JMenuItem getMenuItemNewOrder() {
		if (menuItemNewOrder == null) {
			menuItemNewOrder = new JMenuItem("�ֹ� �߰�");
			menuItemNewOrder.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {					
					NewPeopleDialog jDialog = new NewPeopleDialog();
					jDialog.setVisible(true);					
				}
			});
		}
		return menuItemNewOrder;
	}

	private JMenuItem getMenuItemModifyOrder() {
		if (menuItemModifyOrder == null) {
			menuItemModifyOrder = new JMenuItem("�ֹ� ����");
			menuItemModifyOrder.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {					
					NewPeopleDialog jDialog = new NewPeopleDialog();
					jDialog.setVisible(true);					
				}
			});
		}
		return menuItemModifyOrder;
	}

	private JMenuItem getMenuItemDeleteOrder() {
		if (menuItemDeleteOrder == null) {
			menuItemDeleteOrder = new JMenuItem("�ֹ� ����");
			menuItemDeleteOrder.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {					
					NewPeopleDialog jDialog = new NewPeopleDialog();
					jDialog.setVisible(true);					
				}
			});
		}
		return menuItemDeleteOrder;
	}

	private JMenuItem getMenuItemNewPeople() {
		if (menuItemNewPeople == null) {
			menuItemNewPeople = new JMenuItem("��� �߰�");
			menuItemNewPeople.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {					
					NewPeopleDialog jDialog = new NewPeopleDialog();
					jDialog.setVisible(true);					
				}
			});
		}
		return menuItemNewPeople;
	}

	private JMenuItem getMenuItemModifyPeople() {
		if (menuItemModifyPeople == null) {
			menuItemModifyPeople = new JMenuItem("��� ����");
			menuItemModifyPeople.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {					
					ModifyPeopleDialog jDialog = new ModifyPeopleDialog();
					jDialog.setVisible(true);					
				}
			});
		}
		return menuItemModifyPeople;
	}

	private JMenuItem getMenuItemDeletePeople() {
		if (menuItemDeletePeople == null) {
			menuItemDeletePeople = new JMenuItem("��� ����");
			menuItemDeletePeople.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {					
					DeletePeopleDialog jDialog = new DeletePeopleDialog();
					jDialog.setVisible(true);					
				}
			});
		}
		return menuItemDeletePeople;
	}

	private JMenu getMenuView() {
		if (menuView == null) {
			menuView = new JMenu("����");
			menuView.add(getMenuItemPeopleView());
			menuView.add(getMenuItemOrderView());
			menuView.add(getMenuItemPeopleSearch());
			menuView.add(getMenuItemOrderSearch());
		}
		return menuView;
	}
	
	private JMenuItem getMenuItemPeopleView() {
		if (menuItemPeopleView == null) {
			menuItemPeopleView = new JMenuItem("��� ����");
		}
		return menuItemPeopleView;
	}

	private JMenuItem getMenuItemOrderView() {
		if (menuItemOrderView == null) {
			menuItemOrderView = new JMenuItem("�ֹ��� ����");
		}
		return menuItemOrderView;
	}
	
	private JMenuItem getMenuItemPeopleSearch() {
		if (menuItemPeopleSearch == null) {
			menuItemPeopleSearch = new JMenuItem("����̸����� �˻�");
		}
		return menuItemPeopleSearch;
	}
	
	private JMenuItem getMenuItemOrderSearch() {
		if (menuItemOrderSearch == null) {
			menuItemOrderSearch = new JMenuItem("�޴��̸����� �˻�");
		}
		return menuItemOrderSearch;
	}

	private JMenu getMenuHelp() {
		if (menuHelp == null) {
			menuHelp = new JMenu("����");
		}
		return menuHelp;
	}	
}
