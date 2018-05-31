package bento.delivery.program.view;

import javax.swing.*;

public class TableMain {
	// 메인에 테이블 출력
	// 테이블 주문별 보기, 사원별보기
	
	private JTable peopleTable, orderTable;
	
	public TableMain() {
		getTableMain();
	}
	
	public void getTableMain(){
		

	}
	
	public JTable getTablePeople(){
		if(orderTable==null){
			// JTable peopleTable = new JTable( rowData, columnNames );
		}
		return peopleTable;
	}
	
	public JTable getTableOrder(){
		if(orderTable==null){
			// JTable orderTable = new JTable( rowData, columnNames );
		}
		return orderTable;
	}

}
