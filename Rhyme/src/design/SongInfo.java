package design;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class SongInfo {
	JPanel songinfo = new JPanel();
	private void load(boolean b) {
		if (b) {
			songinfo.setLayout(new GridLayout(3,1));
			String singer="������ũ";
			String song="So Long";
			JLabel showsinger = new JLabel(singer);
			JLabel showsong = new JLabel(song);
			showsong.setHorizontalAlignment(JLabel.RIGHT);
			showsinger.setFont(new Font("Nanum", Font.PLAIN, 14));
			showsong.setFont(new Font("Nanum", Font.PLAIN, 14));
			songinfo.add(showsinger);
			songinfo.add(showsong);
			songinfo.add(new JSeparator(JSeparator.HORIZONTAL)); // ���м� 
			songinfo.setPreferredSize(new Dimension(230,70));
			MainFrame.main.add(songinfo);
		}
	}
	public void loadSongInfo(boolean b) {
		load(b);
	}
}