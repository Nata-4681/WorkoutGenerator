package org.jbltd.wgn;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class Main extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = -6568124630941322162L;
    
    private HashMap<JRadioButton, WorkoutType> btnType = new HashMap<JRadioButton, WorkoutType>();
    private HashMap<JRadioButton, WorkoutDifficulty> btnDifficulty = new HashMap<JRadioButton, WorkoutDifficulty>();

    public Workout w;
    public WorkoutType wt;
    public WorkoutDifficulty wd;
    public int workoutNumber = 1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Main frame = new Main();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public Main() {

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 440, 300);
	setSize(440, 300);
	setResizable(false);
	SpringLayout springLayout = new SpringLayout();
	getContentPane().setLayout(springLayout);

	final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 0, SpringLayout.NORTH, getContentPane());
	springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, getContentPane());
	springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, 0, SpringLayout.SOUTH, getContentPane());
	springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 434, SpringLayout.WEST, getContentPane());
	getContentPane().add(tabbedPane);
	
		JPanel panel = new JPanel();
		panel.setPreferredSize(getSize());
		tabbedPane.addTab("Instructions", null, panel, null);
		tabbedPane.setEnabledAt(0, true);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
			JLabel lblWelcomeToWorkout = new JLabel("Welcome to Workout Generator v1.0");
			sl_panel.putConstraint(SpringLayout.NORTH, lblWelcomeToWorkout, 10, SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.WEST, lblWelcomeToWorkout, 106, SpringLayout.WEST, panel);
			panel.add(lblWelcomeToWorkout);
			
				JLabel lblInstructions = new JLabel(
					"Instructions: Select a workout and difficulty from the drop down list below.");
				sl_panel.putConstraint(SpringLayout.WEST, lblInstructions, 10, SpringLayout.WEST, panel);
				sl_panel.putConstraint(SpringLayout.SOUTH, lblInstructions, -152, SpringLayout.SOUTH, panel);
				springLayout.putConstraint(SpringLayout.WEST, lblInstructions, 10, SpringLayout.WEST, getContentPane());
				panel.add(lblInstructions);
				
					JLabel lblTheWorkoutYou = new JLabel("The workout you select should be based on your skill level.");
					sl_panel.putConstraint(SpringLayout.NORTH, lblTheWorkoutYou, 6, SpringLayout.SOUTH, lblInstructions);
					sl_panel.putConstraint(SpringLayout.WEST, lblTheWorkoutYou, 0, SpringLayout.WEST, lblInstructions);
					springLayout.putConstraint(SpringLayout.WEST, lblTheWorkoutYou, 10, SpringLayout.WEST, getContentPane());
					springLayout.putConstraint(SpringLayout.SOUTH, lblInstructions, -6, SpringLayout.NORTH, lblTheWorkoutYou);
					panel.add(lblTheWorkoutYou);
					
						JLabel lblIfYouAre = new JLabel("If you are a more experienced lifter, select a harder workout. Enjoy!");
						sl_panel.putConstraint(SpringLayout.NORTH, lblIfYouAre, 6, SpringLayout.SOUTH, lblTheWorkoutYou);
						sl_panel.putConstraint(SpringLayout.WEST, lblIfYouAre, 0, SpringLayout.WEST, lblInstructions);
						springLayout.putConstraint(SpringLayout.SOUTH, lblTheWorkoutYou, -6, SpringLayout.NORTH, lblIfYouAre);
						springLayout.putConstraint(SpringLayout.NORTH, lblIfYouAre, 135, SpringLayout.NORTH, getContentPane());
						springLayout.putConstraint(SpringLayout.WEST, lblIfYouAre, 10, SpringLayout.WEST, getContentPane());
						panel.add(lblIfYouAre);
						
							JButton btnGenerateMyWorkout = new JButton("Generate My Workout");
							sl_panel.putConstraint(SpringLayout.SOUTH, btnGenerateMyWorkout, -10, SpringLayout.SOUTH, panel);
							sl_panel.putConstraint(SpringLayout.EAST, btnGenerateMyWorkout, -143, SpringLayout.EAST, panel);
							springLayout.putConstraint(SpringLayout.WEST, btnGenerateMyWorkout, 142, SpringLayout.WEST, getContentPane());
							springLayout.putConstraint(SpringLayout.SOUTH, btnGenerateMyWorkout, -25, SpringLayout.SOUTH, getContentPane());
							btnGenerateMyWorkout.addActionListener(new ActionListener() {
							    public void actionPerformed(ActionEvent e) {

								tabbedPane.setSelectedIndex(1);

							    }
							});
							panel.add(btnGenerateMyWorkout);

	JPanel panel_1 = new JPanel();
	tabbedPane.addTab("Generate", null, panel_1, null);
	panel_1.setLayout(null);

	ButtonGroup bg = new ButtonGroup();

	JLabel lblWorkoutType = new JLabel("Workout Type:");
	lblWorkoutType.setBounds(22, 4, 90, 14);
	panel_1.add(lblWorkoutType);

	JRadioButton rdbtnBench = new JRadioButton("Bench");
	rdbtnBench.setBounds(22, 25, 63, 23);
	panel_1.add(rdbtnBench);
	bg.add(rdbtnBench);
	btnType.put(rdbtnBench, WorkoutType.BENCH);

	JRadioButton rdbtnSquat = new JRadioButton("Squat");
	rdbtnSquat.setBounds(113, 25, 72, 23);
	panel_1.add(rdbtnSquat);
	bg.add(rdbtnSquat);
	btnType.put(rdbtnSquat, WorkoutType.SQUAT);

	JRadioButton rdbtnPowerclean = new JRadioButton("Powerclean");
	rdbtnPowerclean.setBounds(218, 25, 105, 23);
	panel_1.add(rdbtnPowerclean);
	bg.add(rdbtnPowerclean);
	btnType.put(rdbtnPowerclean, WorkoutType.POWERCLEAN);

	JRadioButton rdbtnSnatch = new JRadioButton("Snatch");
	rdbtnSnatch.setBounds(325, 25, 72, 23);
	panel_1.add(rdbtnSnatch);
	bg.add(rdbtnSnatch);
	btnType.put(rdbtnSnatch, WorkoutType.SNATCH);

	ButtonGroup bgd = new ButtonGroup();

	JLabel lblWorkoutDifficulty = new JLabel("Workout Difficulty:");
	lblWorkoutDifficulty.setHorizontalAlignment(SwingConstants.TRAILING);
	lblWorkoutDifficulty.setBounds(22, 55, 104, 35);
	panel_1.add(lblWorkoutDifficulty);

	JRadioButton rdbtnBeginner = new JRadioButton("Beginner");
	rdbtnBeginner.setBounds(22, 97, 90, 23);
	panel_1.add(rdbtnBeginner);
	bgd.add(rdbtnBeginner);
	btnDifficulty.put(rdbtnBeginner, WorkoutDifficulty.BEGINNER);

	JRadioButton rdbtnNovice = new JRadioButton("Novice");
	rdbtnNovice.setBounds(113, 97, 109, 23);
	panel_1.add(rdbtnNovice);
	bgd.add(rdbtnNovice);
	btnDifficulty.put(rdbtnNovice, WorkoutDifficulty.NOVICE);

	JRadioButton rdbtnExperienced = new JRadioButton("Experienced");
	rdbtnExperienced.setBounds(218, 97, 109, 23);
	panel_1.add(rdbtnExperienced);
	bgd.add(rdbtnExperienced);
	btnDifficulty.put(rdbtnExperienced, WorkoutDifficulty.EXPERIENCED);

	JRadioButton rdbtnCrossfit = new JRadioButton("Crossfit");
	rdbtnCrossfit.setBounds(325, 97, 109, 23);
	panel_1.add(rdbtnCrossfit);
	bgd.add(rdbtnCrossfit);
	btnDifficulty.put(rdbtnCrossfit, WorkoutDifficulty.CROSSFIT);

	JButton btnGenerateMyWorkout_1 = new JButton("Generate My Workout");
	btnGenerateMyWorkout_1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {

		for (JRadioButton j : btnType.keySet()) {
		    if (j.isSelected()) {
			wt = btnType.get(j);
		    }
		}

		for (JRadioButton j : btnDifficulty.keySet()) {
		    if (j.isSelected()) {
			wd = btnDifficulty.get(j);
		    }
		}

		w = new Workout(wt, wd, WorkoutData.generateMain(wt, wd), WorkoutData.generateCircuit(wt),
			(wd.compareTo(WorkoutDifficulty.EXPERIENCED) >= 1 ? WorkoutData.generateCircuit(wt) : null));



		JOptionPane.showMessageDialog(panel_1, new JLabel("<html>"+w.getMainWorkout()+" | "+w.getCircuit1()+(w.getCircuit2() != null ? w.getCircuit1() : "")+"</html>"));
		
//		JLabel main = new JLabel("<html>"+w.getMainWorkout()+"</html>");
//		panel_2.add(main);
//
//		JLabel c1 = new JLabel("<html>"+w.getCircuit1()+"</html>");
//		panel_2.add(c1);
//
//		if (w.getCircuit2() != null) {
//		    JLabel c2 = new JLabel("<html>"+w.getCircuit2()+"</html>");
//		    panel_2.add(c2);
//		}
	    }
	});
	btnGenerateMyWorkout_1.setBounds(130, 199, 153, 23);
	panel_1.add(btnGenerateMyWorkout_1);
    }
}
