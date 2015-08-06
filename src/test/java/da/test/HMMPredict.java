package da.test;

import be.ac.ulg.montefiore.run.jahmm.apps.cli.Cli;

public class HMMPredict {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Cli.main("generate -opdf integer -r 3 -i datas/test.hmm -os datas/kmeans.seq".split(" "));

	}

}
