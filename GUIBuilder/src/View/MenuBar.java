package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar{
	public MenuBar(){
		JMenu file= new JMenu("file");
		this.add(file);
		
		 JMenuItem newMake=new JMenuItem("new");
		 lis(newMake);
		 file.add(newMake);
		 JMenuItem open=new JMenuItem("open");
		 lis(open);
		 file.add(open);
		 JMenuItem save=new JMenuItem("save");
		 lis(save);
		 file.add(save);
		 JMenuItem saveAs= new JMenuItem("save as...");
		 lis(saveAs);
		 file.add(saveAs);
		 JMenuItem exit= new JMenuItem("exit");
		 lis(exit);
		 file.add(exit);
	}
	
	void lis(JMenuItem item){
		item.addActionListener(new ActionListener(){
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO judge(item.getText());
				System.out.println(item.getText());
			}
		});
	}
}
