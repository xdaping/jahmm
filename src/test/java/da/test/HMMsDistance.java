package da.test;

import be.ac.ulg.montefiore.run.jahmm.apps.cli.Cli;

public class HMMsDistance {

	public static void main(String[] args)   throws Exception {
		// TODO Auto-generated method stub
		Cli.main("distance-kl -opdf integer -r 3 -i datas/test_bw.hmm -ikl datas/initial.hmm".split(" "));

	}

}
