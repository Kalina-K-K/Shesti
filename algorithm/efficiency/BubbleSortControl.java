package algorithm.efficiency;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BubbleSortControl extends JPanel {
	private BubbleSortPanel sortingPanel = new BubbleSortPanel();

	private JButton nextStepBtn = new JButton("NextStep");

	public BubbleSortControl() {

		setLayout(new BorderLayout());
		add(sortingPanel, BorderLayout.CENTER);
		add(nextStepBtn, BorderLayout.SOUTH);
		
		nextStepBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				sortingPanel.nextStepInSorting();
			}
		});

	}

}
