package da.test;

import be.ac.ulg.montefiore.run.jahmm.apps.cli.Cli;

public class KmeansHMM {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Cli.main("learn-kmeans -opdf integer -r 3 -n 3 -is datas/testInteger.seq -o datas/test.hmm".split(" "));
		
		Cli.main("print -i datas/test.hmm".split(" "));
	}

}
